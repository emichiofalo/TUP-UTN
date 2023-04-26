import { useEffect, useState } from 'react';
import { Alert, Button, Card, Container, Row } from 'react-bootstrap';
import { getInstrumentosJSON} from './FuncionesApi';
import { ItemInstrumento } from './ItemInstrumento';
import Instrumento from './Instrumento';
import 'bootstrap/dist/css/bootstrap.min.css';
import {NavBar} from './NavBar';


export const Productos = () => {
    
  const [instrumentos, setInstrumentos] = useState<Instrumento[]>([]);
    
    const getInstrumentos = () => {
      let datos:Instrumento[] = getInstrumentosJSON();
      setInstrumentos(datos);
    }

    useEffect(() => {
      getInstrumentos();
    }, []);

    
    return (
        <> 
        <NavBar></NavBar>       
        <div className='productContainer'>
            <Container fluid="md">
                <Row>  
                {instrumentos.map((instrumento:Instrumento, index:number) => (
                    <ItemInstrumento key={index} args={instrumento} />
                ))}
                </Row>
            </Container>
        </div>
        </>
    )
}


