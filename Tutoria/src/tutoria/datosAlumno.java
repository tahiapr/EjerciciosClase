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
public class datosAlumno {
 private String nombre;
 private datosAcademicos dAcademicos;
 private datosPersonales dPersonales;
 
 public datosAlumno (){
     
 }
 
 public datosAlumno (String nombre, datosAcademicos dAcademicos, datosPersonales dPersonales){
 this.nombre=nombre;
 this.dAcademicos=dAcademicos;
 this.dPersonales=dPersonales;
 }
 
 public void setNombre (String nombre){
 this.nombre=nombre;
 }
 
 public String getNombre (){
 return nombre;
 }
 
 public void setDAcademicos (datosAcademicos dAcademicos){
  this.dAcademicos=dAcademicos;   
 }
 
 public datosAcademicos getdAcademicos (){
 return dAcademicos;    
 }
 
 public void setDPersonales (datosPersonales dPersonales){
 this.dPersonales=dPersonales;
 }
 
 public datosPersonales getDPersonales (){
 return dPersonales;    
 }
 
 @Override
 public String toString (){
 return "El nombre del alumno es " + nombre + "\n" + dPersonales + "\n" + dAcademicos;
 }
}
