import { useNavigate } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Link } from 'react-router-dom';

type InstrumentoParams = {
    id: string; 
    instrumento: string; 
    marca: string;
    modelo: string; 
    imagen: string; 
    precio: string; 
    costoEnvio: string;
    cantidadVendida: string;
    descripcion: string; 
}

export const ItemInstrumento = (args : InstrumentoParams) => {
    
    return (
        
        <>     
        <div className="container">
        <Link to= {`/detalle/${args.id}`}><img className="productImage" src={"../images/"+args.imagen.toLowerCase()} alt="" /></Link>
            <div className="card border-white">
            <div className="card-body">
                <p className='card-title'>{args.instrumento}</p>
                <p className='card-text'>
                <label className='articlePrice'> ${args.precio}</label>
                <div className={args.costoEnvio == "G" ? "EnvioGratis" : "EnvioPago"}>
                    {args.costoEnvio === "G" ? <img src="../images/camion.png" alt=""></img> : ""}
                    {args.costoEnvio === "G" ?  "Envío gratis a todo el país" : `Costo de Envío Interior de Argentina $${args.costoEnvio}`}
                </div>
                {args.cantidadVendida} vendidos
                </p>
            </div>
            </div>
        </div>
    
        </>
        
    )

}