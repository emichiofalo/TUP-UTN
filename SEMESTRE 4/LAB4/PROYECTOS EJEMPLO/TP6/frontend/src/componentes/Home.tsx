import { useEffect, useState } from 'react';
import { Alert, Button, Card, Container, Row } from 'react-bootstrap';
import { useParams } from 'react-router-dom';
import { DetallePlato } from './DetallePlato';
import { getPlatosJSON, getPlatosJSONFetch, getPlatosXBusqueda, getPlatoXId } from './FuncionesApi';
import { ItemPlato } from './ItemPlato';
import { Navigation } from './Navigation';
import Plato from './Plato';


export const Home = () => {
    
  const {termino} = useParams();

  const [platos, setPlatos] = useState<Plato[]>([]);
    
    const getPlatosResto = async () => {
      console.log("TERMINO" + termino);
      if(termino && termino != ""){
        let datos:Plato[] = await getPlatosXBusqueda(termino);
        setPlatos(datos);
      }else{
        let datos:Plato[] = await getPlatosJSONFetch();
        setPlatos(datos);
      }
    }

    useEffect(() => {
      getPlatosResto();
    }, []);

    
    return (
        <>
        <Navigation></Navigation>
          <Container fluid="md">
              <Row>  
               {platos.map((plato:Plato) => 
                <ItemPlato key={plato.id} id={plato.id} nombre={plato.nombre} precio={plato.precio} rubro={plato.rubro} urlImagenPath={plato.urlImagenPath} imagen={plato.imagenPath}></ItemPlato>
               )}
              </Row>
          </Container>
        </>
    )
}

