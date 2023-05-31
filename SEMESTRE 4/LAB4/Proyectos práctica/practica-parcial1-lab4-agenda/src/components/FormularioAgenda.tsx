import NavBar from "./Navigation";
import Form from 'react-bootstrap/Form';
import { Alert, Button } from "react-bootstrap";
import { useParams, useNavigate } from "react-router-dom";
import Contacto from "./Contacto";
import { useState, useEffect } from "react";
import { getContacts, saveContact } from "./FuncionesAPI";
import "./AgendaContacto.scss";

export default function FormularioAgenda() {

    const navigate = useNavigate();

    const handleGoBack = () => {
        navigate(-1);
    };
    const { idcontacto } = useParams();
    const [contacto, setContacto] = useState<Contacto>(new Contacto());
    const [showValidate, setShowValidate] = useState(false);
    const [txtValidacion, setTxtValidacion] = useState("");

    const getContacto = async () => {
        if (idcontacto !== "0") {
            const contactos: Contacto[] = await getContacts();
            const contact: Contacto = contactos.filter((c) => c.id == Number(idcontacto))[0];
            setContacto(contact);
        }
    }
    useEffect(() => {
        getContacto();
    }, []);

    const save = async () => {
        if (contacto.apellido == undefined || contacto.apellido === "") {
            setTxtValidacion("Ingrese el apellido del contacto");
            setShowValidate(true);
            return;
        }
        if (contacto.nombre == undefined || contacto.nombre === "") {
            setTxtValidacion("Ingrese el nombre del contacto");
            setShowValidate(true);
            return;
        }
        if (contacto.telefono == undefined || contacto.telefono === 0) {
            setTxtValidacion("Ingrese el telefono del contacto");
            setShowValidate(true);
            return;
        }
        if (contacto.email == undefined || contacto.email === "") {
            setTxtValidacion("Ingrese el email del contacto");
            setShowValidate(true);
            return;
        }
        if (contacto?.fotourl == undefined || contacto?.fotourl === "") {
            setTxtValidacion("Cargue la foto del contacto");
            setShowValidate(true);
            return;
        }
        await saveContact(contacto);
        handleGoBack();
    }

    return (
        <>
            <NavBar />
            <div className="center">
                <Form className="form-control">
                    <Form.Label className="form-title">{idcontacto === "0" ? "Crear nuevo contacto" : `Modificar ${contacto.nombre} ${contacto.apellido}`}</Form.Label>
                    <Form.Group className="mb-3" controlId="formBasicApellido">
                        <Form.Label>Apellido</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el apellido"
                            defaultValue={contacto.apellido}
                            onChange={e => contacto.apellido = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicNombre">
                        <Form.Label>Nombre</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el nombre"
                            defaultValue={contacto.nombre}
                            onChange={e => contacto.nombre = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicTelefono">
                        <Form.Label>Telefono</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el telefono"
                            defaultValue={contacto && contacto.telefono !== undefined && contacto.telefono !== 0 ? String(contacto.telefono) : ''}
                            onChange={e => contacto.telefono = Number(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicEmail">
                        <Form.Label>Email</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el email"
                            defaultValue={contacto.email}
                            onChange={e => contacto.email = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicImagen">
                        <Form.Label>URL imagen</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder={'Ingrese el url de la imagen'}
                            defaultValue={contacto.fotourl}
                            onChange={e => contacto.fotourl = String(e.target.value)} />
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
