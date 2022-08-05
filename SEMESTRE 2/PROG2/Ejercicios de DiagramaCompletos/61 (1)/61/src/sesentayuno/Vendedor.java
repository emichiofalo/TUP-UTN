package sesentayuno;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Vendedor extends Empleado {
    
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public Vendedor(int idEmpleado, String nombre, String apellido, String direccion, String tel, String DNI, boolean estado) {
        super(idEmpleado, nombre, apellido, direccion, tel, DNI, estado);
    }
    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void setPedidos(Pedido pedidos) {
        this.pedidos.add(pedidos);
    }
    
    @Override
    public String toString() {
        return "Vendedor{" + "pedidos=" + pedidos + '}';
    }
    
}
