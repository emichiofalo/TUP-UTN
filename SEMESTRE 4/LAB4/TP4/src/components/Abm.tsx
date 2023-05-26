import { Table, Container } from "react-bootstrap";
import { NavBar } from "./NavBar";
import "./Abm.scss";
import Instrumento from "./Instrumento";
import { deleteInstrument, getInstrumentos } from "./FuncionesApi";
import { useEffect, useState } from "react";
import { BsPencilSquare } from "react-icons/bs";
import { MdDelete } from "react-icons/md";
import { Link } from "react-router-dom";

export default function Abm() {

    const [instrumentos, setInstrumentos] = useState<Instrumento[]>([]);
    const getInstruments = async () => {
        let datos: Instrumento[] = await getInstrumentos();
        if (searchValue === "") {
            setInstrumentos(datos);
        } else {
            const instrumentos = datos.filter((i: Instrumento) => {
                return (
                    i.instrumento.toLowerCase().includes(searchValue.toLowerCase()) ||
                    i.marca.toLowerCase().includes(searchValue.toLowerCase()) ||
                    i.modelo.toLowerCase().includes(searchValue.toLowerCase()) ||
                    i.descripcion.toLowerCase().includes(searchValue.toLowerCase())
                );
            });
            setInstrumentos(instrumentos);
        }
    }
    useEffect(() => {
        getInstruments();
    }, []);

    const [searchValue, setSearchValue] = useState<string>("");
    const handleSearch = (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();
        getInstruments();
    };

    const deleteInstrumento = async (id: number) => {
        await deleteInstrument(id);
        window.location.reload();
    }

    return (
        <>
            <NavBar />
            <div className="input-button-container">
                <form className="searchValue-form" onSubmit={handleSearch}>
                    <input
                        type="text"
                        name="searchInstrument"
                        placeholder="Buscar"
                        value={searchValue}
                        onChange={(e) => setSearchValue(e.target.value)}
                    />
                    <button type="submit">Buscar</button>
                </form>
                <Link to="/InstrumentForm/0"><button className="button-nuevo">Nuevo</button ></Link>
            </div>
            <div className="d-flex justify-content-center align-items-center">
                <Table striped bordered table-container className="instrument-table-abm" >
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Instrumento</th>
                            <th>Marca</th>
                            <th>Modelo</th>
                            <th>Imagen</th>
                            <th>Precio</th>
                            <th>Costo de envío</th>
                            <th>Cant. vendida</th>
                            <th>Descripción</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {instrumentos.map((i: Instrumento) => (
                            <tr key={i.id}>
                                <td>{i.id}</td>
                                <td>{i.instrumento}</td>
                                <td>{i.marca}</td>
                                <td>{i.modelo}</td>
                                <td><img src={`../images/${i.imagen}`} /></td>
                                <td>${i.precio}</td>
                                <td>{i.costoEnvio === "G" ? "Gratis" : `$${i.costoEnvio}`}</td>
                                <td>{i.cantidadVendida}</td>
                                <td>{i.descripcion}</td>
                                <td><Link to={`/InstrumentForm/${i.id}`}><BsPencilSquare size={26} /></Link></td>
                                <td><MdDelete size={26} onClick={(e) => deleteInstrumento(i.id)} style={{ cursor: "pointer", color: "black" }} /></td>
                            </tr>
                        ))}
                    </tbody>
                </Table >
            </div>
        </>
    )

}