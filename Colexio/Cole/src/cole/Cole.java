/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cole;

/**
 *
 * @author tperezrodriguez
 */
public class Cole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Ensinante ensinante1 = new Ensinante("Pablo","Rúa Cococha, Nº2","Bioloxía");
      Estudante estudante1 = new Estudante ("Paco", "Rúa Blabla, Nº3","Peicoco",2);
      EstudanteInternacional estudanteInternacional1 = new EstudanteInternacional("Sheer","Wedwedns, Nº4", "Piscasco", 6, "Italia");
 
       System.out.println(ensinante1.toString());
        System.out.println("\n"+estudante1.toString());
        System.out.println("\n"+estudanteInternacional1.toString());
        
      estudante1.setNivel(12);
        System.out.println(estudante1.toString());
        
      ensinante1.setMateria("Matemáticas");
        System.out.println("\n"+ensinante1.toString());
    }
    
}
