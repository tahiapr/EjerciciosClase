/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoria;

/**
 *
 * @author tperezrodriguez
 */
public class datosPersonales {
private String direccion;
private String telefono;

public datosPersonales (String direccion, String telefono){
this.direccion=direccion;
this.telefono=telefono;
}

datosPersonales() {
      
}

public void setDireccion (String direccion){
this.direccion=direccion;
}

public String getDireccion (){
return direccion;
}

public void setTelefono (String telefono){
this.telefono=telefono;   
}

public String getTelefono(){
return telefono;
}

 @Override
 public String toString (){
 return "Su dirección es " + direccion + ". Y su teléfono es " + telefono;
 }
 
}
