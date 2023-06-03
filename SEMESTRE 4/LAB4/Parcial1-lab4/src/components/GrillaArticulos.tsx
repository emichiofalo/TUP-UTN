import { Table, Container } from "react-bootstrap";
import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { BsPencilSquare } from "react-icons/bs";
import { MdDelete } from "react-icons/md";
import "./styles.css"
import { Articulo } from "./Modelo/Articulo";
import { deleteProduct, getCategories, getProductsByCategory } from "./FuncionesAPI";
import { Rubro } from "./Modelo/Rubro";

export default function GrillaArticulos() {

    const [articulos, setArticulos] = useState<Articulo[]>([]);
    const [rubros, setRubros] = useState<Rubro[]>([]);
    const [rubro, setRubro] = useState(2);

    const getArticulos = async () => {
        const articulos = await getProductsByCategory(rubro);
        setArticulos(articulos);
    }

    const getRubros = async () => {
        const rubros = await getCategories();
        setRubros(rubros);
    }

    const handleSelection = (e: React.ChangeEvent<HTMLSelectElement>) => {
        setRubro(Number(e.target.value));
    };

    useEffect(() => {
        getArticulos();
        getRubros();
    }, [rubro])

    const borrarArticulo = async (id: number) => {
        await deleteProduct(id);
        window.location.reload();
    }

    return (
        <div>
            <Container className="container-grilla">
                <Container>
                    Rubros: <select
                        onChange={handleSelection}
                        name="rubros">
                        {
                            rubros &&
                            rubros.map(rubro => (
                                <option key={rubro.id} value={rubro.id}>{rubro.denominacion}</option>
                            ))}
                    </select>
                </Container>
                <Table striped bordered className="contacts-table-abm" >
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Código</th>
                            <th>Denominación</th>
                            <th>Precio</th>
                            <th>Editar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        {articulos.map((i: Articulo) => (
                            <tr key={i.id}>
                                <td>{i.id}</td>
                                <td>{i.codigo}</td>
                                <td>{i.denominacion}</td>
                                <td>{i.precio}</td>
                                <td><Link to={`/form/${i.id}`}><BsPencilSquare size={26} style={{ cursor: "pointer", color: "black" }} /></Link></td>
                                <td><MdDelete size={26} onClick={() => { borrarArticulo(i.id) }} style={{ cursor: "pointer", color: "black" }} /></td>
                            </tr>
                        ))}
                    </tbody>
                </Table >
            </Container>
        </div>
    )
}
