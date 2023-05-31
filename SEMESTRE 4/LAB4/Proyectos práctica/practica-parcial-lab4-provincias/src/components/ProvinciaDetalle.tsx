import { Container, Table, Button, Row } from "react-bootstrap";
import { useParams } from "react-router-dom";
import Provincia from "./Provincia";
import { useState, useEffect } from "react";
import { getProvinceById } from "./FuncionesAPI";
import { useNavigate } from "react-router-dom";

export default function ProvinciaDetalle() {

    const { idprovincia } = useParams();

    const [provincia, setProvincia] = useState<Provincia>();

    const getProvincia = async (id: number) => {
        const prov = await getProvinceById(id);
        setProvincia(prov);
    }

    useEffect(() => {
        getProvincia(Number(idprovincia));
    }, []);

    const navigate = useNavigate();

    const handleGoBack = () => {
        navigate(-1);
    };

    return (
        <>
            <Container className="detalle-provincia">
                <Table>
                    <tr>
                        <th>Provincia:</th>
                        <td>{provincia?.nombre}</td>
                    </tr>
                    <tr>
                        <th>Abreviatura:</th>
                        <td>{provincia?.abreviatura}</td>
                    </tr>
                    <tr>
                        <th>Bandera:</th>
                        <td><img src={`../images/${provincia?.bandera}`} /></td>
                    </tr>
                    <tr>
                        <th>Población:</th>
                        <td>{provincia?.poblacion}</td>
                    </tr>
                    <tr>
                        <th>Superficie:</th>
                        <td>{provincia?.superficie}</td>
                    </tr>
                    <tr>
                        <th>Nº Departamentos:</th>
                        <td>{provincia?.nroDepartamentos}</td>
                    </tr>
                </Table>
                <Button className="button-volver d-block" onClick={() => handleGoBack()} variant="secondary" type="button">
                    Volver
                </Button>
            </Container>


        </>
    )
}
