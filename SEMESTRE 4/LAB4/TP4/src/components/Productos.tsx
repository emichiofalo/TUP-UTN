import { useEffect, useState } from 'react';
import { Container, Row } from 'react-bootstrap';
import { getInstrumentos } from './FuncionesApi';
import { ItemInstrumento } from './ItemInstrumento';
import Instrumento from './Instrumento';
import 'bootstrap/dist/css/bootstrap.min.css';
import {NavBar} from './NavBar';


export const Productos = () => {
    
  const [instrumentos, setInstrumentos] = useState<Instrumento[]>([]);
    
    const getInstruments = async () => {
      let datos: Instrumento[] = await getInstrumentos();
      setInstrumentos(datos);
    }

    useEffect(() => {
      getInstruments();
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


