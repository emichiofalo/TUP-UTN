import { deleteBanner, getBanners } from "./FuncionesAPI";
import { Table, Container } from "react-bootstrap";
import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { BsPencilSquare } from "react-icons/bs";
import { MdDelete } from "react-icons/md";
import "./styles.scss"
import Banner from "./Banner";

export default function TablaBanners() {

    const [banners, setBanners] = useState<Banner[]>([]);

    const getAllBanners = async () => {
        const contactos = await getBanners();
        setBanners(contactos);
    }

    useEffect(() => {
        getAllBanners();
    }, [])

    const borrarBanner = async (id: number) => {
        await deleteBanner(id);
        window.location.reload();
    }

    return (
        <div>
            <Container>
                <Table striped bordered className="contacts-table-abm" >
                    <thead>
                        <tr>
                            <th>URL imagen</th>
                            <th>Título</th>
                            <th>Descripción</th>
                            <th>Orden Menú</th>
                            <th>Editar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        {banners.map((i: Banner) => (
                            <tr key={i.id}>
                                <td>{i.urlImageBanner}</td>
                                <td>{i.textCaption}</td>
                                <td>{i.descripcionImagen}</td>
                                <td>{i.ordenSlider}</td>
                                <td><Link to={`/form/${i.id}`}><BsPencilSquare size={26} style={{ cursor: "pointer", color: "black" }} /></Link></td>
                                <td><MdDelete size={26} onClick={() => { borrarBanner(i.id) }} style={{ cursor: "pointer", color: "black" }} /></td>
                            </tr>
                        ))}
                    </tbody>
                </Table >
            </Container>
        </div>
    )
}
