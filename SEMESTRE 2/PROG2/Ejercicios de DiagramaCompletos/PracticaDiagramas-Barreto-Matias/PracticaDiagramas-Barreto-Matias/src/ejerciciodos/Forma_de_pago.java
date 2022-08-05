package ejerciciodos;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 */
public class Forma_de_pago {

    private int codigo;
    private int valor;

    public Forma_de_pago() {
    }        
    
    public Forma_de_pago(int codigo, int valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String elejir(String formaPago){
        return formaPago;
    }
}
