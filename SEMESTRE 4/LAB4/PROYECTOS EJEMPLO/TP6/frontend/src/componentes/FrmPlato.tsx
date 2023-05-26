import { useEffect, useState } from 'react';
import { Alert, Button, Col, Form, Modal, Row } from 'react-bootstrap';
import { useNavigate, useParams } from 'react-router-dom';
import { deletePlatoXId, getIngredienteXIdFetch, getIngredientesDataBaseJSON, getPlatoXIdFecth, savePlato } from './FuncionesApi';
import Ingrediente from './Ingrediente';
import { Navigation } from './Navigation';
import Plato from './Plato';
import PlatoIngrediente from './PlatoIngrediente';


export const FrmPlato = () => {

    const navigate = useNavigate();

    const {idplato} = useParams();
    const [plato, setPlato] = useState<Plato>(new Plato());
    let [cantidad, setCantidad] = useState<number>(0);
    const [ingredientes, setIngredientes] = useState<Ingrediente[]>([]);
    let [selectedIngrediente, setIngrediente] = useState<Ingrediente>();
    

    const [show, setShow] = useState(false);
    const [showAlert, setShowAlert] = useState(false);
    const [showValidate, setShowValidate] = useState(false);
    const [txtValidacion, setTxtValidacion] = useState("");
    
   

    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);
    const handleSave = () => addIngrediente();

    const handleChange = (selectedOption: React.FormEvent<HTMLSelectElement>) => {
        getIngredienteXId(parseInt(selectedOption.currentTarget.value));
    }

    const getIngredienteXId = async (id:number) => {
        if(id){
            let ingrediente:Ingrediente = await getIngredienteXIdFetch(id);
            setIngrediente(ingrediente);
        }else{
            setIngrediente(undefined);
        }
    }
    
    const addIngrediente = async () => {
        if(!selectedIngrediente){
            setShowAlert(true); 
        }else{
            let platoIng:PlatoIngrediente = new PlatoIngrediente();
            platoIng.cantidad = cantidad;
            platoIng.ingrediente = selectedIngrediente;
            if(!plato.ingredientesPlato)
                plato.ingredientesPlato = [];
            plato.ingredientesPlato.push(platoIng);
            setShow(false);
        }   
    }
   
    const getPlatoResto = async () => {
        if(Number(idplato) !== 0){
            let platoSelect:Plato = await getPlatoXIdFecth(Number(idplato));
            setPlato(platoSelect);
        }else{
            let platoSelect:Plato = new Plato();
            setPlato(platoSelect);
        }
    }

    const getIngredientesPlato = async () => {
        let ingredientes:Ingrediente[] = await getIngredientesDataBaseJSON();
        setIngredientes(ingredientes);
    }

    useEffect(() => {
        getPlatoResto();
        getIngredientesPlato();
    }, []);

    const save = async () => {
        if(plato.nombre == undefined || plato.nombre === ""){
            setTxtValidacion("Ingrese el nombre del plato");
            setShowValidate(true);
            return;
        }
        if(plato.precio == undefined || plato.precio === 0){
            setTxtValidacion("El precio debe ser distinto de cero");
            setShowValidate(true);
            return;
        }
        if(plato.ingredientesPlato == undefined || plato.ingredientesPlato.length === 0){
            setTxtValidacion("Debe agregar al menos un ingrediente al plato");
            setShowValidate(true);
            return;
        }
        
        console.log(plato.nombre);
        await savePlato(plato);
        navigate('/grilla'); 
    }

    const eliminar = async () => {
        await deletePlatoXId(plato.id);
        navigate('/grilla'); 
    }

    const deleteIngrediente = async (ingrediente:PlatoIngrediente) => {
        if(showValidate){
            setShowValidate(false);
        }
        const index:number | undefined = await plato.ingredientesPlato?.indexOf(ingrediente, 0);
        if (index !== undefined && index > -1) {
            plato.ingredientesPlato?.splice(index, 1);
        }
        setTxtValidacion("Ingrediente Eliminado");
        setShowValidate(true);
      }
    
    return (
        <>
        <Navigation></Navigation>
        <div className="center">
        <Form className="form-control">
            <Form.Group className="mb-3" controlId="formBasicNombre">
                <Form.Label>Nombre</Form.Label>
                <Form.Control type="Text" placeholder="Ingrese el nombre" defaultValue={plato?.nombre} onChange={e => plato.nombre = String(e.target.value)}/>
            </Form.Group>
            <Form.Group className="mb-3" controlId="formBasicPrecio">
                <Form.Label>Precio</Form.Label>
                <Form.Control type="Text" placeholder="Ingrese el precio" defaultValue={plato?.strPrecio} onChange={e => plato.precio = Number(e.target.value)}/>
            </Form.Group>
            <Form.Group className="mb-3" controlId="formBasicRubro">
                <Form.Label>Rubro</Form.Label>
                <Form.Control type="Text" placeholder="Ingrese el rubro" defaultValue={plato?.rubro} onChange={e => plato.rubro = String(e.target.value)}/>
            </Form.Group>
            <Form.Group className="mb-3" controlId="formBasicImagenPath">
                <Form.Label>Imagen</Form.Label>
                <Form.Control type="Text" placeholder="Ingrese el path de la imagen" defaultValue={plato?.imagenPath} onChange={e => plato.imagenPath = String(e.target.value)}/>
            </Form.Group>
            <Button variant="primary" onClick={handleShow}>
            Agregar Ingrediente
            </Button>
            < Row>
                <Col md={1}>
                <b>Id</b>
                </Col>
                <Col md={5}>
                <b>Ingrediente</b>
                </Col>
                <Col md={2}>
                <b>Cantidad </b>
                </Col>
                <Col md={2}>
                <b>Unidad de Medida </b>
                </Col>
                <Col md={2}>
                <b>X</b>
                </Col>
            </Row>
          {plato.ingredientesPlato?.map((ingredienteAux:PlatoIngrediente, index:number) => 
            <Row key={index}>
                <Col md={1}>
                {ingredienteAux.idplatoingrediente}
                </Col>
                <Col md={5}>
                {ingredienteAux.ingrediente?.nombre}
                </Col>
                <Col md={2}>
                {ingredienteAux.cantidad}
                </Col>
                <Col md={2}>
                {ingredienteAux.ingrediente?.unidadMedida}
                </Col>
                <Col md={2}>
                <Button variant="outline-danger" onClick={(e) => deleteIngrediente(ingredienteAux)}>Eliminar</Button>
                </Col>
            </Row>
               )}
            <Modal show={show} onHide={handleClose}>
                <Modal.Header closeButton>
                <Modal.Title>Ingrediente</Modal.Title>
                </Modal.Header>
                <Modal.Body>
                <Form>
                    <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
                    <Form.Label>Ingrediente</Form.Label>
                    <Form.Select aria-label="Seleccione el ingrediente" 
                    onChange={handleChange}>
                        <option key="0" value="">Seleccione el ingrediente</option>
                        {ingredientes.map((ingredienteItem:Ingrediente) => 
                        <option key={ingredienteItem.id} value={ingredienteItem.id}>{ingredienteItem.strNombreUnidadMedida}</option>
                        )}
                    </Form.Select>
                    </Form.Group>
                    <Alert variant="danger" show={showAlert} onClose={() => setShowAlert(false)} dismissible>
                        <Alert.Heading>Ingrediente</Alert.Heading>
                        <p>Seleccione el Ingrediente</p>
                    </Alert>
                    <Form.Group
                    className="mb-3"
                    controlId="exampleForm.ControlTextarea1"
                    >
                    <Form.Label>Cantidad</Form.Label>
                    <Form.Control defaultValue={cantidad} onChange={e => cantidad = Number(e.target.value)}
                        type="text"
                        placeholder="Cantidad"
                        autoFocus
                    />
                    </Form.Group>
                </Form>
                </Modal.Body>
                <Modal.Footer>
                <Button variant="secondary" onClick={handleClose}>
                    Cerrar
                </Button>
                <Button variant="success" onClick={handleSave}>
                    Guardar Ingrediente
                </Button>
                </Modal.Footer>
            </Modal>
            <Alert variant="danger" show={showValidate} onClose={() => setShowValidate(false)} dismissible>
                <p>{txtValidacion}</p>
            </Alert>
            <br/><br/>
            <Button onClick={save}  variant="primary" type="button">
                Guardar
            </Button>
            
        </Form>
        </div>
        </>
    )
}