import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import Instrumento from './Instrumento';
//import { getInstrumentosJSON } from './FuncionesApi';
import { getInstrumentoById } from "./FuncionesApi";

export const DetalleInstrumento = () => {

    const {idinstrumento} = useParams();
    const [instrumento, setInstrumento] = useState<Instrumento>();
    
    // const getInstrumento = async () => {
    //     let datos: Instrumento[] = await getInstrumentos();
    //     const producto = datos.filter((dato) => {
    //         return dato.id === parseInt(idinstrumento!)
    //     });
    //     setInstrumento(producto[0])
    // };

    const getInstrumento = async () => {
        let dato : Instrumento = await getInstrumentoById(parseInt(idinstrumento!));
        setInstrumento(dato);
    }

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