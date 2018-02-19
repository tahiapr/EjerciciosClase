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
public class Precio {
    private float precio;
    private String rPrecio;

    public Precio() {
    }

    public Precio(String rPrecio, float precio) {
        this.rPrecio = rPrecio;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getrPrecio() {
        return rPrecio;
    }

    public void setrPrecio(String rPrecio) {
        this.rPrecio = rPrecio;
    }

    @Override
    public String toString() {
        return "Referencia Precio: " + rPrecio + " || Precio: " + precio;
    }
    

}
