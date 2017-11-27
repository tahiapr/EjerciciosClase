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
public class Ensinante extends Persoas {
    private String materia;

    public Ensinante(String nome, String direccion, String materia) {
        super(nome, direccion);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMateria: " + materia;
    }
    
    
}
