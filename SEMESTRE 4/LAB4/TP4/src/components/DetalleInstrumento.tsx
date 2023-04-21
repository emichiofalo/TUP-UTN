import { useEffect, useState } from 'react';
import { Col, Container, ListGroup, Nav, Row } from 'react-bootstrap';
import { useParams } from 'react-router-dom';
import Instrumento from './Instrumento';
import { getInstrumentosJSON } from './FuncionesApi';


export const DetalleInstrumento = () => {

    const {idinstrumento} = useParams();
    const [instrumento, setInstrumento] = useState<Instrumento>();
    
    const getInstrumento = () => {
        let datos: Instrumento[] = getInstrumentosJSON();
        const producto = datos.filter((dato) => {
            return (dato.id === idinstrumento)
        });
        setInstrumento(producto[0])
    };

    useEffect(() => {
        getInstrumento();
    }, []);

    
    return (
        <>
        <div className="productDetailContainer">
            <div className='col'>
                <div className='imageDetail'><img className="productImage" src={"../images/"+instrumento?.imagen.toLowerCase()} /></div>
                <p>Descripción:<br/>
                    {instrumento?.descripcion};
                </p>
            </div>
            <div className="card">
            <div className="card-body">
                <p className='card-text'>
                    <p className='cantVendidos'>{instrumento?.cantidadVendida} vendidos </p>
                    <p className='tituloArticulo'>{instrumento?.instrumento}</p>
                    <label className='articlePrice2'> ${instrumento?.precio}</label><br/><br/>
                    <p className='marcaModelo'>
                        Marca: {instrumento?.marca}<br/>
                        Modelo: {instrumento?.modelo}<br/><br/>
                        Costo envío: {instrumento?.costoEnvio !== "G" ? "$"+instrumento?.costoEnvio : ""}
                        <p className='EnvioGratis'>
                        {instrumento?.costoEnvio === "G" ? <img src="../images/camion.png" alt=""></img> : ""}
                        {instrumento?.costoEnvio === "G" ?  "Envío gratis" : ""}</p>
                    </p><br/>
                    <button type="button" className="btn btn-outline-primary">Agregar al carrito</button>             
                </p>
            </div>
            </div>
        </div>
        </>
    )
}