
package tienda;


public class Tienda {

    
    public static void main(String[] args) {
        
        //construir los productos que tiene la tienda 
        
        Producto producto1 = new Producto("C1", "24 euros");
     
        Producto producto2 = new Producto("H23", "234 euros");
        
        Producto producto3 = new Producto("M30", "109 euros");
        System.out.println(producto1.toString()+producto2.toString()+producto3.toString());
        
        //cambio producto
        System.out.println("Cambio de producto");
        
        producto2.setCodigo("K123");
        producto2.setPrecio("247 euros");
        System.out.println(producto1.toString()+producto2.toString()+producto3.toString());
    }

    }
    

