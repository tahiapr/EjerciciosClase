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
public class Tutoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    datosAcademicos dA = new datosAcademicos("A3478", 5);
    datosPersonales dP = new datosPersonales("Rúa Figueiró, Nº9", "986270521");
    datosAlumno dAlum = new datosAlumno("Tahía", dA, dP);
    
        System.out.println(dAlum.toString());
    }
    
}
