import Form from 'react-bootstrap/Form';
import { Alert, Button } from "react-bootstrap";
import { useParams, useNavigate } from "react-router-dom";
import { useState, useEffect } from "react";
import "./styles.scss";
import Banner from './Banner';
import { getBannerById, saveBanner } from './FuncionesAPI';

export default function FormularioBanner() {

    const navigate = useNavigate();

    const handleGoBack = () => {
        navigate(-1);
    };
    const { idbanner } = useParams();
    const [banner, setBanner] = useState<Banner>(new Banner());
    const [showValidate, setShowValidate] = useState(false);
    const [txtValidacion, setTxtValidacion] = useState("");

    const getBanner = async () => {
        if (idbanner !== "0") {
            const banner: Banner = await getBannerById(Number(idbanner));
            setBanner(banner);
        }
    }
    useEffect(() => {
        getBanner();
    }, []);
    const save = async () => {
        if (banner.urlImageBanner == undefined || banner.urlImageBanner === "") {
            setTxtValidacion("Ingrese el url de la imagen");
            setShowValidate(true);
            return;
        }
        if (banner.textCaption == undefined || banner.textCaption === "") {
            setTxtValidacion("Ingrese el título de la imagen");
            setShowValidate(true);
            return;
        }
        if (banner.descripcionImagen == undefined || banner.descripcionImagen === "") {
            setTxtValidacion("Ingrese la descripción de la imagen");
            setShowValidate(true);
            return;
        }
        if (banner.ordenSlider == undefined || banner.ordenSlider === 0) {
            setTxtValidacion("Ingrese el número de orden de la imagen");
            setShowValidate(true);
            return;
        }
        await saveBanner(banner);
        handleGoBack();
    }

    return (
        <>
            <div className="center">
                <Form className="form-control">
                    <Form.Label className="form-title">{idbanner === "0" ? "Cargar nueva imagen" : `Modificar imagen: ${banner.textCaption}`}</Form.Label>
                    <Form.Group className="mb-3" controlId="formBasicImagen">
                        <Form.Label>URL imagen</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el URL de la imagen"
                            defaultValue={banner.urlImageBanner}
                            onChange={e => banner.urlImageBanner = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicTítulo">
                        <Form.Label>Título</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el título"
                            defaultValue={banner.textCaption}
                            onChange={e => banner.textCaption = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicDescripcion">
                        <Form.Label>Descripción</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese la descripción"
                            defaultValue={banner.descripcionImagen}
                            onChange={e => banner.descripcionImagen = String(e.target.value)} />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicEmail">
                        <Form.Label>Orden para slider</Form.Label>
                        <Form.Control
                            type="Text"
                            placeholder="Ingrese el orden para el slider"
                            defaultValue={banner && banner.ordenSlider !== undefined && banner.ordenSlider !== 0 ? String(banner.ordenSlider) : ''}
                            onChange={e => banner.ordenSlider = Number(e.target.value)} />
                    </Form.Group>

                    <Alert variant="danger" show={showValidate} onClose={() => setShowValidate(false)} dismissible>
                        <p>{txtValidacion}</p>
                    </Alert>
                    <div className="form-buttons">
                        <Button onClick={() => handleGoBack()} variant="secondary" type="button">
                            Volver
                        </Button>
                        <Button onClick={save} variant="primary" type="button">
                            Guardar
                        </Button>
                    </div>
                </Form>
            </div>
        </>
    )
}