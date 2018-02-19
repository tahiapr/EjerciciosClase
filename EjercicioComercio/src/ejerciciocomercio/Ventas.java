/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocomercio;

/**
 *
 * @author tperezrodriguez
 */
public class Ventas {

    String nv;
    String refProducto;
    float cantidade;

    public Ventas() {

    }

    public Ventas(String nv, String refProducto, float cantidade) {
        this.nv = nv;
        this.refProducto = refProducto;
        this.cantidade = cantidade;
    }

    public String getNv() {
        return nv;
    }

    public void setNv(String nv) {
        this.nv = nv;
    }

    public String getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(String refProducto) {
        this.refProducto = refProducto;
    }

    public float getCantidade() {
        return cantidade;
    }

    public void setCantidade(float cantidade) {
        this.cantidade = cantidade;
    }

    @Override
    public String toString() {
        return "Número ventas: " + nv + " || Referencia Producto: " + refProducto + " || Cantidade: " + cantidade;
    }

   
}
