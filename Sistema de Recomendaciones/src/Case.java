/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class Case {
    
    private String marca;
    private String tamaño;
    private String tipoMobo;
    private double precio;
    private String link;

    public Case(String marca, String tamaño, String tipoMobo, double precio, String link) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.tipoMobo = tipoMobo;
        this.precio = precio;
        this.link = link;
    }
    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipoMobo() {
        return tipoMobo;
    }

    public void setTipoMobo(String tipoMobo) {
        this.tipoMobo = tipoMobo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        String cadena="" + marca + " " + tamaño + " " + tipoMobo;
        String nuevaCadena = cadena.replaceAll("\"", "");
        return nuevaCadena;
    }
    
    public String detalles(){
        return "Detalles del case"
                +"\nMarca: "+marca
                +"\nTamaño: " +tamaño
                +"\nTipo de Motherboard: "+tipoMobo
                +"\nPrecio: "+precio+" USD";
    }
    
}
