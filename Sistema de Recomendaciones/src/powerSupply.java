/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class powerSupply {
    
    private String marca;
    private String certificacion;
    private String modularidad;
    private int capacidad;
    private double precio;
    private String link;

    public powerSupply(String marca, String certificacion, String modularidad, int capacidad, double precio, String link) {
        this.marca = marca;
        this.certificacion = certificacion;
        this.modularidad = modularidad;
        this.capacidad = capacidad;
        this.precio = precio;
        this.link = link;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public void setCertificacion(String certificacion) {
        this.certificacion = certificacion;
    }

    public String getModularidad() {
        return modularidad;
    }

    public void setModularidad(String modularidad) {
        this.modularidad = modularidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
        String cadena= "" + marca + " " + certificacion + " " + modularidad + " " + capacidad + "W";
        String nuevaCadena = cadena.replaceAll("\"", "");
        return nuevaCadena;
    }
    
    public String detalles(){
        return "Detalles de la fuente de poder"
                +"\nMarca: "+marca
                +"\nCertificacion: " +certificacion
                +"\nModularidad: "+modularidad
                +"\nCapacidad: "+capacidad+"W "
                +"\nPrecio: "+precio+" USD";
    }
}
