package ClubesDeportivos;

/**
 *
 * @author Emi Chiófalo
 */
public class ClubDeportivo {
    protected int cantSocios; 
    protected int cantEntrenadores; 
    protected String presidente;

    public ClubDeportivo(int cantSocios, int cantEntrenadores, String presidente) {
        this.cantSocios = cantSocios;
        this.cantEntrenadores = cantEntrenadores;
        this.presidente = presidente;
    }

    public int getCantSocios() {
        return cantSocios;
    }

    public void setCantSocios(int cantSocios) {
        this.cantSocios = cantSocios;
    }

    public int getCantEntrenadores() {
        return cantEntrenadores;
    }

    public void setCantEntrenadores(int cantEntrenadores) {
        this.cantEntrenadores = cantEntrenadores;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
    
}
