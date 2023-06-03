import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';

export default function Navigation() {
    return (
        <>
            <Navbar bg="dark" variant="dark">
                <Container>
                    <Navbar.Brand href="/">Parcial 1</Navbar.Brand>
                    <Nav className="me-auto">
                        <Nav.Link href="/">Grilla Artículos</Nav.Link>
                        <Nav.Link href="/form/0">Nuevo artículo</Nav.Link>
                    </Nav>
                </Container>
            </Navbar>
        </>
    )
}