import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';

export default function Navigation() {
    return (
        <>
            <Navbar bg="dark" variant="dark">
                <Container>
                    <Navbar.Brand href="/">Provincias</Navbar.Brand>
                    <Nav className="me-auto">
                        <Nav.Link href="/">Provincias</Nav.Link>
                        <Nav.Link href="/nueva/0">Nueva Provincia</Nav.Link>
                    </Nav>
                </Container>
            </Navbar>
        </>
    )
}