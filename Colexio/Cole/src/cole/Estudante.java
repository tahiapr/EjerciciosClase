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
public class Estudante extends Persoas {
    
    private String nomeCole;
    private int nivel;

    public Estudante(String nome, String direccion, String nomeCole, int nivel) {
        super(nome, direccion);
        this.nomeCole = nomeCole;
        this.nivel = nivel;
    }

    public String getNomeCole() {
        return nomeCole;
    }

    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNome colexio: " + nomeCole + "\nNivel: " + nivel;
    }
    
    
    
    
}
