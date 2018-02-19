/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocomercio;

/**
 *
 * @author tperezrodriguez
 */
public class Factura {
    String nv;
    String nombre;
    String precioTotal;

    public Factura() {
    }

    public Factura(String nv, String nombre, String precioTotal) {
        this.nv = nv;
        this.nombre = nombre;
        this.precioTotal = precioTotal;
    }

    public String getNv() {
        return nv;
    }

    public void setNv(String nv) {
        this.nv = nv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
}
