import { useEffect, useState } from "react";
import Instrumento from "./Instrumento";
import { Alert, Button } from "react-bootstrap";
import { getInstrumentoById, insertInstrument, updateInstrument } from "./FuncionesApi";
import { useNavigate, useParams } from "react-router-dom";
import "./InstrumentForm.scss";
import Form from 'react-bootstrap/Form';

const InstrumentForm = () => {

    const navigate = useNavigate();
    const { idinstrumento } = useParams();
    const [instrumento, setInstrumento] = useState<Instrumento>();
    const [showValidate, setShowValidate] = useState(false);
    const [txtValidacion, setTxtValidacion] = useState("");

    const getInstrumento = async () => {
        if (idinstrumento !== "0") {
            let dato: Instrumento = await getInstrumentoById(parseInt(idinstrumento!));
            setInstrumento(dato);
        } else {
            let dato: Instrumento = new Instrumento();
            setInstrumento(dato);
        }
    }
    useEffect(() => {
        getInstrumento();
    }, []);

    const save = async () => {
        if (instrumento?.instrumento == undefined || instrumento?.instrumento === "") {
            setTxtValidacion("Ingrese el nombre del instrumento");
            setShowValidate(true);
            return;
        }
        if (instrumento.marca == undefined || instrumento.marca === "") {
            setTxtValidacion("Ingrese la marca del instrumento");
            setShowValidate(true);
            return;
        }
        if (instrumento.modelo == undefined || instrumento.modelo === "") {
            setTxtValidacion("Ingrese el modelo del instrumento");
            setShowValidate(true);
            return;
        }
        if (instrumento.precio == undefined || instrumento.precio === 0) {
            setTxtValidacion("El precio del instrumento debe ser mayor a 0");
            setShowValidate(true);
            return;
        }
        if (instrumento.costoEnvio == undefined || Number(instrumento.costoEnvio) <= 0) {
            setTxtValidacion("El costo de envio debe ser un número mayor a 0");
            setShowValidate(true);
            return;
        } else if ((Number(instrumento.costoEnvio) <= 0) && instrumento.costoEnvio !== "G") {
            setTxtValidacion("El costo de envio debe ser 'G' si es gratis, o número mayor a 0");
            setShowValidate(true);
            return;
        }
        if (instrumento.cantidadVendida == undefined || instrumento.cantidadVendida < 0) {
            setTxtValidacion("La cantidad vendida debe ser mayor o igual a 0");
            setShowValidate(true);
            return;
        }
        if (instrumento.descripcion == undefined || instrumento.descripcion === "") {
            setTxtValidacion("Ingrese la descripción del instrumento");
            setShowValidate(true);
            return;
        }
        if (instrumento.imagen == undefined || instrumento.imagen === "") {
            setTxtValidacion("Ingrese la imagen del instrumento");
            setShowValidate(true);
            return;
        }

        await insertInstrument(instrumento);
        navigate('/abm');
    }

    return (
        <>
            <div className="center">
                <Form className="form-control">
                    <Form.Label className="form-title">{idinstrumento === "0" ? "Cargar nuevo instrumento" : `Modificar ${instrumento?.instrumento}`}</Form.Label>
                    <Form.Group className="mb-3" controlId="formBasicInstrumento">
                        <Form.Label>Instrumento</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el nombre del instrumento"
                            defaultValue={instrumento?.instrumento}
                            onChange={e => instrumento!.instrumento = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicMarca">
                        <Form.Label>Marca</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese la marca"
                            defaultValue={instrumento?.marca}
                            onChange={e => instrumento!.marca = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicModelo">
                        <Form.Label>Modelo</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el modelo"
                            defaultValue={instrumento?.modelo}
                            onChange={e => instrumento!.modelo = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicImagenPath">
                        <Form.Label>Imagen</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el path de la imagen"
                            defaultValue={instrumento?.imagen}
                            onChange={e => instrumento!.imagen = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicPrecio">
                        <Form.Label>Precio</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder={'Ingrese el precio'}
                            defaultValue={instrumento && instrumento.precio !== undefined && instrumento.precio !== 0 ? String(instrumento.precio) : ''}
                            onChange={e => instrumento!.precio = Number(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicCostoEnvio">
                        <Form.Label>Costo de envío</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el costo de envío"
                            defaultValue={instrumento?.costoEnvio === "G" ? "Gratis" : instrumento?.costoEnvio}
                            onChange={e => instrumento!.costoEnvio = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicCantVendida">
                        <Form.Label>Cantidad vendida</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder={'Ingrese la cantidad vendida'}
                            defaultValue={instrumento && instrumento.cantidadVendida !== undefined && instrumento.cantidadVendida !== 0 ? String(instrumento.cantidadVendida) : ''}
                            onChange={e => instrumento!.cantidadVendida = Number(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicDescripcion">
                        <Form.Label>Descripción</Form.Label>
                        <Form.Control
                            as="textarea"
                            rows={5}
                            type="Text"
                            placeholder="Ingrese la descripción del instrumento"
                            defaultValue={instrumento?.descripcion}
                            onChange={e => instrumento!.descripcion = String(e.target.value)}
                            style={{ width: "100%", textAlign: "justify" }} />
                    </Form.Group>
                    <Alert variant="danger" show={showValidate} onClose={() => setShowValidate(false)} dismissible>
                        <p>{txtValidacion}</p>
                    </Alert>
                    <div className="form-buttons">
                        <Button onClick={save} variant="primary" type="button">
                            Guardar
                        </Button>
                        <Button onClick={(e) => navigate('/abm')} variant="secondary" type="button">
                            Volver
                        </Button>
                    </div>
                </Form>
            </div>
        </>
    )
}

export default InstrumentForm;