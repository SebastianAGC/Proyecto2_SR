/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class discoDuro {
    
    private String marca;
    private int rpm;
    private int capacidad;
    private int consumo;
    private double precio;
    private String link;

    public discoDuro(String marca, int rpm, int capacidad, int consumo, double precio, String link) {
        this.marca = marca;
        this.rpm = rpm;
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.precio = precio;
        this.link = link;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
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
        String cadena = "" + marca + " " + rpm + "rpm " + capacidad + "GB";
        String nuevaCadena = cadena.replaceAll("\"", "");
        return nuevaCadena;
    }
    
    public String detalles(){
        return "Detalles de la Memoria RAM"
                +"\nMarca: "+marca
                +"\nRevoluciones por minuto: " +rpm
                +"\nCapacidad: "+capacidad+"GB"
                +"\nPrecio: "+precio+" USD";
    }
}
