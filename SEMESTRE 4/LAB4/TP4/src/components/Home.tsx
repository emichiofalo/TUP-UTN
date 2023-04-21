import { NavBar } from "./NavBar"

export const Home = () => {

    return(
        <>
        <NavBar></NavBar>
        <section style={{position: 'absolute', top: '5%'}} className="home">
            <h3>Home</h3>
            <h4 className="articlePrice2">Musical Hendrix es una tienda de instrumentos musicales con ya más de 15 años de experiencia. Tenemos el
            conocimiento y la capacidad como para informarte acerca de las mejores elecciones para tu compra musical.</h4>
        </section>
        
        </>
    )

}