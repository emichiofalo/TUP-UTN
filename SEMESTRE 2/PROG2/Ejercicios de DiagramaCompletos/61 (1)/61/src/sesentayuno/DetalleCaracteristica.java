package sesentayuno;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class DetalleCaracteristica {

    private char valorCaracteristica;
    private  Caracteristica caracteristica;
    private  Equipo equipo;

    public DetalleCaracteristica() {
    }
            
    public DetalleCaracteristica(char valorCaracteristica, Caracteristica caracteristica, Equipo equipo) {
        this.valorCaracteristica = valorCaracteristica;
        this.caracteristica = caracteristica;
        this.equipo = equipo;
    }

    public char getValorCaracteristica() {
        return valorCaracteristica;
    }

    public void setValorCaracteristica(char valorCaracteristica) {
        this.valorCaracteristica = valorCaracteristica;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }    

    @Override
    public String toString() {
        return "DetalleCaracteristica{" + "valorCaracteristica=" + valorCaracteristica + "\n"+", caracteristica=" + caracteristica + "\n"+", equipo=" + equipo + '}';
    }    
}
