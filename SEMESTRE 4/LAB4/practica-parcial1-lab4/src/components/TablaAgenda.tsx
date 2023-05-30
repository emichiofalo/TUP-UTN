import Contacto from "./Contacto";
import { deleteContact, getContacts } from "./FuncionesAPI";
import Navigation from "./Navigation";
import { Table, Container } from "react-bootstrap";
import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { BsPencilSquare } from "react-icons/bs";
import { MdDelete } from "react-icons/md";
import "./AgendaContacto.scss"

export default function TablaAgenda() {

    const [contacts, setContacts] = useState<Contacto[]>([]);

    const getContactos = async () => {
        const contactos = await getContacts();
        setContacts(contactos);
    }

    useEffect(() => {
        getContactos();
    }, [])

    const deleteContacto = async (id: number) => {
        await deleteContact(id);
        window.location.reload();
    }

    return (
        <div>
            <Navigation />
            <Container>
                <Table striped bordered className="contacts-table-abm" >
                    <thead>
                        <tr>
                            <th>Foto</th>
                            <th>Apellido</th>
                            <th>Nombre</th>
                            <th>Telefono</th>
                            <th>Email</th>
                            <th>Editar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        {contacts.map((i: Contacto) => (
                            <tr key={i.id}>
                                <td><img src={i.fotourl} style={{ maxWidth: "5rem" }} /></td>
                                <td>{i.apellido}</td>
                                <td>{i.nombre}</td>
                                <td>{i.telefono}</td>
                                <td>{i.email}</td>
                                <td><Link to={`/form/${i.id}`}><BsPencilSquare size={26} style={{ cursor: "pointer", color: "black" }} /></Link></td>
                                <td><MdDelete size={26} onClick={() => { deleteContacto(i.id) }} style={{ cursor: "pointer", color: "black" }} /></td>
                            </tr>
                        ))}
                    </tbody>
                </Table >
            </Container>
        </div>
    )
}
