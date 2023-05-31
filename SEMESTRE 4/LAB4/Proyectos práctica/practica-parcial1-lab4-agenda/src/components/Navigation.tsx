import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';

export default function Navigation() {
    return (
        <>
            <Navbar bg="dark" variant="dark">
                <Container>
                    <Navbar.Brand href="/">Agenda</Navbar.Brand>
                    <Nav className="me-auto">
                        <Nav.Link href="/">Índice</Nav.Link>
                        <Nav.Link href="/tabla">Contactos</Nav.Link>
                        <Nav.Link href="/form/0">Nuevo Contacto</Nav.Link>
                    </Nav>
                </Container>
            </Navbar>
        </>
    )
}
