
package tienda.dto;

import java.io.Serializable;

public class Vendedor implements Serializable{
    
    private int idVendedor;
    private String nombreVendedor;

    public Vendedor(int idVendedor, String nombreVendedor) {
        this.idVendedor = idVendedor;
        this.nombreVendedor = nombreVendedor;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }
    
}
