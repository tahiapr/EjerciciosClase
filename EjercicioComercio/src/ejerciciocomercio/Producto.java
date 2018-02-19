/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocomercio;

import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class Producto {
    String refProducto;
    String nombre;
    String rePrecio;

    public Producto() {
    }

    public Producto(String refProducto, String nombre, String rePrecio) {
        this.refProducto = refProducto;
        this.nombre = nombre;
        this.rePrecio = rePrecio;
    }

    public String getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(String refProducto) {
        this.refProducto = refProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRePrecio() {
        return rePrecio;
    }

    public void setRePrecio(String rePrecio) {
        this.rePrecio = rePrecio;
    }

    @Override
    public String toString() {
        return "Referencia Producto: " + refProducto + " || Nombre: " + nombre + " || Referencia Precio: " + rePrecio;
    }
     
}
