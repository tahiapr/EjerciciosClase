/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author tperezrodriguez
 */
public class Producto {

    
private String codigo;
private String precio;

public Producto (){
    
}

public Producto (String codigo, String precio){
this.codigo=codigo;
this.precio=precio;
}

public void setCodigo (String codigo){
this.codigo=codigo;    
}

public String getCodigo (){
return codigo;
}

public void setPrecio (String precio){
this.precio=precio;    
}

public String getPrecio (){
return precio;    
}

@Override
public String toString (){
return codigo+"\n"+precio+"\n"+"\n";  
}

}
