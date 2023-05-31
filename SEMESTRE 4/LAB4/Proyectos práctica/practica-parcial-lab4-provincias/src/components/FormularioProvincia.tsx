import NavBar from "./Navigation";
import Form from 'react-bootstrap/Form';
import { Alert, Button } from "react-bootstrap";
import { useParams, useNavigate } from "react-router-dom";
import { useState, useEffect } from "react";
import { getProvinceById, saveProvince } from "./FuncionesAPI";
import Provincia from "./Provincia";
import "./styles.scss";

export default function FormularioProvincia() {

    const navigate = useNavigate();

    const handleGoBack = () => {
        navigate("/");
    };

    const { idprovincia } = useParams();
    const [provincia, setProvincia] = useState<Provincia>(new Provincia());
    const [showValidate, setShowValidate] = useState(false);
    const [txtValidacion, setTxtValidacion] = useState("");

    const getProvincia = async (id: number) => {
        if (idprovincia !== "0") {
            const prov: Provincia = await getProvinceById(id);
            setProvincia(prov);
        }
    }
    useEffect(() => {
        getProvincia(Number(idprovincia));
    }, []);

    const save = async () => {
        if (provincia.nombre == undefined || provincia.nombre === "") {
            setTxtValidacion("Ingrese el nombre de la provincia");
            setShowValidate(true);
            return;
        }
        if (provincia.abreviatura == undefined || provincia.abreviatura === "") {
            setTxtValidacion("Ingrese la abreviatura de la provincia");
            setShowValidate(true);
            return;
        }
        if (provincia.capital == undefined || provincia.capital === "") {
            setTxtValidacion("Ingrese la capital de la provincia");
            setShowValidate(true);
            return;
        }
        if (provincia.bandera == undefined || provincia.bandera === "") {
            setTxtValidacion("Ingrese el url de la imagen");
            setShowValidate(true);
            return;
        }
        if (provincia.poblacion == undefined || provincia.poblacion === 0) {
            setTxtValidacion("Ingrese la población");
            setShowValidate(true);
            return;
        }
        if (provincia.superficie == undefined || provincia.superficie === 0) {
            setTxtValidacion("Ingrese la superficie");
            setShowValidate(true);
            return;
        }
        if (provincia.nroDepartamentos == undefined || provincia.nroDepartamentos === 0) {
            setTxtValidacion("Ingrese la cantidad de departamentos");
            setShowValidate(true);
            return;
        }
        console.log(provincia);
        await saveProvince(provincia);
        handleGoBack();
    }

    return (
        <>
            <div className="center">
                <Form className="form-control">
                    <Form.Label className="form-title">{idprovincia === "0" ? "Crear nueva provincia" : `Modificar ${provincia.nombre}`}</Form.Label>
                    <Form.Group className="mb-3" controlId="formBasicNombre">
                        <Form.Label>Nombre provincia</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el nombre"
                            defaultValue={provincia.nombre}
                            onChange={e => provincia.nombre = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicAbreviatura">
                        <Form.Label>Abreviatura</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese la abreviatura"
                            defaultValue={provincia.abreviatura}
                            onChange={e => provincia.abreviatura = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicCapital">
                        <Form.Label>Capital</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese la capital"
                            defaultValue={provincia.capital}
                            onChange={e => provincia.capital = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicBandera">
                        <Form.Label>URL imagen bandera</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el url de la imagen "
                            defaultValue={provincia.bandera}
                            onChange={e => provincia.bandera = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicPoblacion">
                        <Form.Label>Población</Form.Label>
                        <Form.Control
                            type="Number"
                            placeholder={'Ingrese la población'}
                            defaultValue={provincia && provincia.poblacion !== undefined && provincia.poblacion !== 0 ? String(provincia.poblacion) : ''}
                            onChange={e => provincia.poblacion = Number(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicSuperficie">
                        <Form.Label>Superficie</Form.Label>
                        <Form.Control
                            type="Number"
                            placeholder={'Ingrese la superficie'}
                            defaultValue={provincia && provincia.superficie !== undefined && provincia.superficie !== 0 ? String(provincia.superficie) : ''}
                            onChange={e => provincia.superficie = Number(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicDepartamentos">
                        <Form.Label>Nº Departamentos</Form.Label>
                        <Form.Control
                            type="Number"
                            placeholder={'Ingrese la cantidad de departamentos'}
                            defaultValue={provincia && provincia.nroDepartamentos !== undefined && provincia.nroDepartamentos !== 0 ? String(provincia.nroDepartamentos) : ''}
                            onChange={e => provincia.nroDepartamentos = Number(e.target.value)} />
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
