import { Nav } from "react-bootstrap"
import { Container } from "react-bootstrap"
import { Navbar } from "react-bootstrap"

export const NavBar = () => {

  return (
    <>
      <Navbar bg="light" variant="light" fixed="top">
        <Container>
          <Navbar.Brand href="/home">Musical Hendrix</Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="/">Home</Nav.Link>
            <Nav.Link href="/dondeEstamos">Dónde estamos</Nav.Link>
            <Nav.Link href="/productos">Productos</Nav.Link>
            <Nav.Link href="/abm">ABM</Nav.Link>
          </Nav>
        </Container>
      </Navbar>
    </>
  )

}