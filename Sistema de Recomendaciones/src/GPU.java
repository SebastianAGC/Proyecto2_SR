/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class GPU {
    
    private String marca;
    private String modelo;
    private String tipoPCI;
    private int capacidad;
    private int consumo;
    private double precio;
    private String link;

    public GPU(String marca, String modelo, String tipoPCI, int capacidad, int consumo, double precio, String link) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoPCI = tipoPCI;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoPCI() {
        return tipoPCI;
    }

    public void setTipoPCI(String tipoPCI) {
        this.tipoPCI = tipoPCI;
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
        String cadena = "" + marca + " " + modelo +" " + capacidad + "GB";
        String nuevaCadena = cadena.replaceAll("\"", "");
        return nuevaCadena;
    }
    
    public String detalles(){
        return "Detalles del GPU"
                +"\nMarca: "+marca
                +"\nModelo: " +modelo
                +"\nPuerto PCI: "+tipoPCI+".0 "
                +"\nCapacidad: "+capacidad+" GB"
                +"\nPrecio: "+precio+" USD";
    }
    
}
