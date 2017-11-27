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
public class EstudanteInternacional extends Persoas {

    private String nomeCole;
    private int nivel;
    private String pais;

    public EstudanteInternacional(String nome, String direccion, String nomeCole, int nivel, String pais) {
        super(nome, direccion);
        this.nomeCole = nomeCole;
        this.nivel = nivel;
        this.pais = pais;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNome colexio: " + nomeCole + "\nNivel: " + nivel + "\nPaís: " + pais;
    }
     
    }
    
    


