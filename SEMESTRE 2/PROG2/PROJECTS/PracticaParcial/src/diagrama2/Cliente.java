package diagrama2;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Cliente {

    private String nombre; 
    private String direccion; 
    private String telefono; 
    private String email; 
    public ArrayList<Pedido> pedidos = new ArrayList();
    public ArrayList<Cuenta> cuentas = new ArrayList();

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido pedido) {
        pedidos.add(pedido);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
    
    public void editar_cuenta(){                                                //metodos incompletos
        
    }
    
    public void realizar_pedido(){
        
    }
    
    public void estado_pedidos(){
        
    }
    
    public void rechazar_pedido(Pedido p){
        
    }
    
}
