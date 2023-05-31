import { useEffect, useState } from "react";
import Banner from "./Banner";
import "./stylesBanner.css";
import { getBanners } from "./FuncionesAPI";

export default function DemoBanner() {

    const [banners, setBanners] = useState<Banner[]>([]);

    const getAllBanners = async () => {
        const data = await getBanners();
        setBanners(data);
    };

    useEffect(() => {
        getAllBanners();
    })

    return (
        <>
            <div id="kiko-slider">
                <ul className="slider">
                    {banners.map((b: Banner) => (
                        <li id={`slide${b.ordenSlider}`} key={b.id}>
                            <h1>{b.textCaption}</h1>
                            <h3>{b.descripcionImagen}</h3>
                            <img src={b.urlImageBanner} />
                        </li>
                    ))}
                </ul>
                <ul className="menu">
                    {banners.map((b: Banner) => (
                        <li key={b.id}>
                            <a href={`#slide${b.ordenSlider}`}>{b.ordenSlider}</a>
                        </li>
                    ))}
                </ul>
            </div>
        </>
    )
}
