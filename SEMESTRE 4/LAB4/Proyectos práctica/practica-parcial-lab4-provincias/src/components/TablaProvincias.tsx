import { Table } from "react-bootstrap";
import "./styles.scss";
import { useEffect, useState } from "react";
import { BsPencilSquare } from "react-icons/bs";
import { Link } from "react-router-dom";
import Provincia from "./Provincia";
import { getProvinces } from "./FuncionesAPI";
import "./styles.scss";
import { Container } from "react-bootstrap";

export default function TablaProvincias() {

    const [provincias, setProvincias] = useState<Provincia[]>([]);

    const getProvincias = async () => {
        const datos: Provincia[] = await getProvinces();
        if (searchValue === "") {
            setProvincias(datos);
        } else {
            const provincias = datos.filter((i: Provincia) => {
                return (
                    i.nombre.toLowerCase().includes(searchValue.toLowerCase())
                );
            });
            setProvincias(provincias);
        }
    }
    useEffect(() => {
        getProvincias();
    }, []);

    const [searchValue, setSearchValue] = useState<string>("");
    const handleSearch = (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();
        getProvincias();
    };

    return (
        <>
            <Container className="input-button-container">
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
            </Container>
            <Container className="d-flex justify-content-center align-items-center">
                <Table striped bordered className="instrument-table-abm" >
                    <thead>
                        <tr>
                            <th>Provincia</th>
                            <th>Abreviatura</th>
                            <th>Bandera</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {provincias.map((i: Provincia) => (
                            <tr key={i.id}>
                                <td>{i.nombre}</td>
                                <td>{i.abreviatura}</td>
                                <td><img src={`../images/${i.bandera}`} /></td>
                                <td><Link to={`/detalle/${i.id}`} >Detalle</Link></td>
                                <td><Link to={`/nueva/${i.id}`}><BsPencilSquare size={26} style={{ color: "black" }} /></Link></td>
                            </tr>
                        ))}
                    </tbody>
                </Table >
            </Container>
        </>
    )

}