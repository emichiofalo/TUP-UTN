import Contacto from "./Contacto";
import { getContactByLetter } from "./FuncionesAPI";
import Navigation from "./Navigation";
import { useEffect, useState } from "react";
import "./AgendaContacto.scss";
import { Container, Table } from "react-bootstrap";

export default function AgendaContacto() {

    const [search, setSearch] = useState("A");
    const [contactsByLetter, setContactsByLetter] = useState<Contacto[]>([]);

    const getContactosXLetras = async () => {
        const contactos = await getContactByLetter(search);
        setContactsByLetter(contactos);
    }

    useEffect(() => {
        getContactosXLetras();
    }, [search])

    return (
        <>
            <Navigation />
            <Container className="index-container">
                <h1 style={{ textAlign: "center" }}>Agenda de Contactos</h1>
                <h3>Búsqueda por índice</h3>
                <Container className="grid-container">
                    <button
                        onClick={() => {
                            setSearch("A");
                        }}
                    >
                        A
                    </button>
                    <button
                        onClick={() => {
                            setSearch("B");
                        }}
                    >
                        B
                    </button>
                    <button
                        onClick={() => {
                            setSearch("C");
                        }}
                    >
                        C
                    </button>
                    <button
                        onClick={() => {
                            setSearch("D");
                        }}
                    >
                        D
                    </button>
                    <button
                        onClick={() => {
                            setSearch("E");
                        }}
                    >
                        E
                    </button>
                    <button
                        onClick={() => {
                            setSearch("F");
                        }}
                    >
                        F
                    </button>
                    <button
                        onClick={() => {
                            setSearch("G");
                        }}
                    >
                        G
                    </button>
                    <button
                        onClick={() => {
                            setSearch("H");
                        }}
                    >
                        H
                    </button>
                    <button
                        onClick={() => {
                            setSearch("I");
                        }}
                    >
                        I
                    </button>
                    <button
                        onClick={() => {
                            setSearch("J");
                        }}
                    >
                        J
                    </button>
                    <button
                        onClick={() => {
                            setSearch("K");
                        }}
                    >
                        K
                    </button>
                    <button
                        onClick={() => {
                            setSearch("L");
                        }}
                    >
                        L
                    </button>
                    <button
                        onClick={() => {
                            setSearch("M");
                        }}
                    >
                        M
                    </button>
                    <button
                        onClick={() => {
                            setSearch("N");
                        }}
                    >
                        N
                    </button>
                    <button
                        onClick={() => {
                            setSearch("Ñ");
                        }}
                    >
                        Ñ
                    </button>
                    <button
                        onClick={() => {
                            setSearch("O");
                        }}
                    >
                        O
                    </button>
                    <button
                        onClick={() => {
                            setSearch("P");
                        }}
                    >
                        P
                    </button>
                    <button
                        onClick={() => {
                            setSearch("Q");
                        }}
                    >
                        Q
                    </button>
                    <button
                        onClick={() => {
                            setSearch("R");
                        }}
                    >
                        R
                    </button>
                    <button
                        onClick={() => {
                            setSearch("S");
                        }}
                    >
                        S
                    </button>
                    <button
                        onClick={() => {
                            setSearch("T");
                        }}
                    >
                        T
                    </button>
                    <button
                        onClick={() => {
                            setSearch("U");
                        }}
                    >
                        U
                    </button>
                    <button
                        onClick={() => {
                            setSearch("V");
                        }}
                    >
                        V
                    </button>
                    <button
                        onClick={() => {
                            setSearch("W");
                        }}
                    >
                        W
                    </button>
                    <button
                        onClick={() => {
                            setSearch("X");
                        }}
                    >
                        X
                    </button>
                    <button
                        onClick={() => {
                            setSearch("Y");
                        }}
                    >
                        Y
                    </button>
                    <button
                        onClick={() => {
                            setSearch("Z");
                        }}
                    >
                        Z
                    </button>
                </Container>
                <Container className="grid-container-agenda">
                    <Table striped bordered hover>
                        <thead>
                            <tr style={{ fontWeight: "600" }}>
                                <th>Foto</th>
                                <th>Apellido</th>
                                <th>Nombre</th>
                                <th>Telefono</th>
                                <th>Email</th>
                            </tr>
                        </thead>
                        <tbody>
                            {contactsByLetter.map((contact: Contacto) => (
                                <tr key={contact.id}>
                                    <td><img src={contact.fotourl} style={{ maxWidth: "5rem" }} /></td>
                                    <td>{contact.apellido}</td>
                                    <td>{contact.nombre}</td>
                                    <td>{contact.telefono}</td>
                                    <td>{contact.email}</td>
                                </tr>
                            ))}
                        </tbody>
                    </Table>
                </Container>
            </Container >
        </>
    )
}
