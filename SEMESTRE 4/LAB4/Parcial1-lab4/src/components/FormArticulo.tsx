import Form from 'react-bootstrap/Form';
import { Alert, Button } from "react-bootstrap";
import { useParams, useNavigate } from "react-router-dom";
import { useState, useEffect } from "react";
import "./styles.css";
import { getCategories, getProductByCode, getProductById, saveProduct } from "./FuncionesAPI";
import { Rubro } from "./Modelo/Rubro";
import { Articulo } from "./Modelo/Articulo";

export default function FormArticulo() {

    const navigate = useNavigate();

    const { idarticulo } = useParams();
    const [articulo, setArticulo] = useState<Articulo>(new Articulo());
    const [rubros, setRubros] = useState<Rubro[]>([]);

    const [showValidate, setShowValidate] = useState(false);
    const [txtValidacion, setTxtValidacion] = useState("");

    const getRubros = async () => {
        const rubros = await getCategories();
        setRubros(rubros);
    }

    const getArticulo = async () => {
        if (idarticulo !== "0") {
            const articulo: Articulo = await getProductById(Number(idarticulo));
            setArticulo(articulo);
        }
    }
    useEffect(() => {
        getArticulo();
        getRubros();
    }, []);

    const handleGoBack = () => {
        navigate("/");
    };

    const handleSelection = (event: any) => {
        setArticulo({
            ...articulo,
            idrubro: Number(event.target.value),
        });
    };

    const save = async () => {
        if (articulo.codigo == undefined || articulo.codigo === "") {
            setTxtValidacion("Ingrese el codigo del articulo");
            setShowValidate(true);
            return;
        }
        if (articulo.denominacion == undefined || articulo.denominacion === "") {
            setTxtValidacion("Ingrese la denominación del articulo");
            setShowValidate(true);
            return;
        }
        if (articulo.precio == undefined || articulo.precio === 0) {
            setTxtValidacion("Ingrese el precio del artículo");
            setShowValidate(true);
            return;
        }
        if (articulo.idrubro == undefined || articulo.idrubro === 0) {
            setTxtValidacion("Seleccione el rubro del articulo");
            setShowValidate(true);
            return;
        }
        if (await checkIfExists(articulo)) {
            alert("El código ingresado ya existe.");
        } else {
            await saveProduct(articulo);
            handleGoBack();
        }
    }

    const checkIfExists = async (newart: Articulo): Promise<boolean> => {
        const articulo: Articulo[] = await getProductByCode(newart.codigo);
        if (articulo.length === 0) {
            return false;
        } else if (articulo[0].id === newart.id) {
            return false;
        } else {
            return true;
        }
    }

    return (
        <>
            <div className="center">
                <Form className="form-control">
                    <Form.Label className="form-title">{idarticulo === "0" ? "Crear nuevo articulo" : `Modificar ${articulo.denominacion}`}</Form.Label>
                    {idarticulo === "0" ? "" :
                        <Form.Group className="mb-3" controlId="formBasicId">
                            <Form.Label>ID</Form.Label>
                            <Form.Control
                                type="Text"
                                value={articulo.id}
                                disabled />
                        </Form.Group>}
                    <Form.Group className="mb-3" controlId="formBasicCodigo">
                        <Form.Label>Código</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese la denominación"
                            defaultValue={articulo.codigo}
                            onChange={e => articulo.codigo = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicDenominación">
                        <Form.Label>Denominación</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese la denominación"
                            defaultValue={articulo.denominacion}
                            onChange={e => articulo.denominacion = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicPrecio">
                        <Form.Label>Precio</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el precio"
                            defaultValue={articulo && articulo.precio !== undefined && articulo.precio !== 0 ? String(articulo.precio) : ''}
                            onChange={e => articulo.precio = Number(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicRubros">
                        <Form.Label>Rubro</Form.Label>
                        <Form.Control
                            as="select"
                            onChange={handleSelection}
                            name="rubros"
                        >
                            {rubros &&
                                rubros.map(rubro => (
                                    <option key={rubro.id} value={rubro.id}>
                                        {rubro.denominacion}
                                    </option>
                                ))}
                        </Form.Control>
                    </Form.Group>
                    <Alert variant="danger" show={showValidate} onClose={() => setShowValidate(false)} dismissible>
                        <p>{txtValidacion}</p>
                    </Alert>
                    <div className="form-buttons">
                        <Button onClick={() => handleGoBack()} variant="secondary" type="button">
                            Volver
                        </Button>
                        <Button onClick={save} variant="primary" type="button">
                            Guardar
                        </Button>
                    </div>
                </Form>
            </div>
        </>
    )
}
