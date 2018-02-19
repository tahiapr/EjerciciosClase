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

     Ventas[] listaVentas = {new Ventas("1", "ref01", 12), new Ventas("2", "ref02", 8),
            new Ventas("3", "ref03", 24), new Ventas("4", "ref04", 45)};

        Producto[] listaProductos = {new Producto("ref04", "Mandarinas", "rp1"), new Producto("ref01", "Cerezas", "rp3"),
            new Producto("ref02", "Sandías", "rp4"), new Producto("ref03", "Fresas", "rp2")};
        
        Precio[] listaPrecios = {new Precio("rp2", 4), new Precio("rp1", 9),
            new Precio("rp4", 7), new Precio("rp3",5)};
        
        
    public void amosarVentas() {
        for (Ventas elemento : listaVentas) {
            System.out.println(elemento);
        }
    }

    public void amosarProductos() {
        for (Producto elemento : listaProductos) {
            System.out.println(elemento);
        }
    }

    public void amosarPrecio() {
        for (Precio elemento : listaPrecios) {
            System.out.println(elemento);
        }
    }
    
    public void buscarReferencias(){
  for(int i=0; i<listaVentas.length;i++){
      for(int j=0; j<listaProductos.length;j++){
          for(int k=0; k<listaPrecios.length;k++){
              if(listaVentas[i].getRefProducto().equalsIgnoreCase(listaProductos[j].getRefProducto())) {
                  if(listaProductos[j].getRePrecio().equalsIgnoreCase(listaPrecios[k].getrPrecio())) {
                      System.out.println("Número Ventas: "+listaVentas[i].getNv()+" || Nombre Producto: "+listaProductos[j].getNombre()+" || Precio Total: "+ listaVentas[j].getCantidade()*listaPrecios[k].getPrecio());  
                  }
              }
          }
      }
          
  }
    
    }
    
    
}
