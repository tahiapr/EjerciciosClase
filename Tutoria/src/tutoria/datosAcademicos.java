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
public class datosAcademicos {
   private String referencia;
   private int nota;
   
   public datosAcademicos (){
       
   }
   
   public datosAcademicos (String referencia, int nota){
   this.referencia=referencia;
   this.nota=nota;
   }
   
   public void setReferencia (String referencia){
   this.referencia=referencia; 
   }
   
   public String getReferencia (){
   return referencia;
   }
   
   public void setNota (int nota){
   this.nota=nota;
   }
   
   public int getNota (){
   return nota;
   }
   
    @Override
 public String toString (){
 return "Su número de matrícula es " + referencia + ". Y su nota es " + nota;
 }
}

