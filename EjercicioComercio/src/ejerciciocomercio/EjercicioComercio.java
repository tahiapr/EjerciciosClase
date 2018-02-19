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
public class EjercicioComercio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Ventas[] listaVentas = {new Ventas("1", "ref01", 12), new Ventas("2", "ref02", 8),
            new Ventas("3", "ref03", 24), new Ventas("4", "ref04", 45)};

        Producto[] listaProductos = {new Producto("ref04", "Mandarinas", "rp1"), new Producto("ref01", "Cerezas", "rp3"),
            new Producto("ref02", "Sandías", "rp4"), new Producto("ref03", "Fresas", "rp2")};
        
        Precio[] listaPrecios = {new Precio("rp2", 4), new Precio("rp1", 9),
            new Precio("rep4", 7), new Precio("rp3",5)};
        
        Metodos met = new Metodos();
//        met.amosarPrecio(listaPrecios);
//        met.amosarProductos(listaProductos);
//        met.amosarVentas(listaVentas);
        met.buscarReferenciaProducto(listaVentas, "ref04");
     
    }

}
