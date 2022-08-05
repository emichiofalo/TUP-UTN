package sesentayuno;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Cliente {

    private int idCliente;
    private String direccion;
    private String tel;
    private String email;
    private boolean estado;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int idCliente, String direccion, String tel, String email, boolean estado) {
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.tel = tel;
        this.email = email;
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido pedidos) {
        this.pedidos.add(pedidos);
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", direccion=" + direccion + ", tel=" + tel + ", email=" + email + ", estado=" + estado + ", pedidos=" + pedidos + '}';
    }

    

}
