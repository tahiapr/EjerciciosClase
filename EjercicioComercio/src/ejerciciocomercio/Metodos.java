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
public class Metodos {

    public void amosarVentas(Ventas[] listaVentas) {
        for (Ventas elemento : listaVentas) {
            System.out.println(elemento);
        }
    }

    public void amosarProductos(Producto[] listaProductos) {
        for (Producto elemento : listaProductos) {
            System.out.println(elemento);
        }
    }

    public void amosarPrecio(Precio[] listaPrecios) {
        for (Precio elemento : listaPrecios) {
            System.out.println(elemento);
        }
    }
    
    public Ventas buscarReferenciaProducto (Ventas[] listaVentas, String refProducto){
  
        return null;
    }
}
