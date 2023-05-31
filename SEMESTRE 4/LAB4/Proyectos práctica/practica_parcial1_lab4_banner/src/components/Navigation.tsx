import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';

export default function Navigation() {
    return (
        <>
            <Navbar bg="dark" variant="dark">
                <Container>
                    <Navbar.Brand href="/">Imágenes</Navbar.Brand>
                    <Nav className="me-auto">
                        <Nav.Link href="/">Slider</Nav.Link>
                        <Nav.Link href="/tabla">Tabla imágenes</Nav.Link>
                        <Nav.Link href="/form/0">Nuevo slider</Nav.Link>
                    </Nav>
                </Container>
            </Navbar>
        </>
    )
}