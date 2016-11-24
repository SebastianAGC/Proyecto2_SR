/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class CPU {
    
    private String marca;
    private String modelo;
    private String generacion;
    private String socket;
    private String tipoRam;
    private double frecuencia;
    private int consumo;
    private double precio;
    private String link;

    public CPU(String marca, String modelo, String generacion, String socket, String tipoRam, double frecuencia, int consumo, double precio, String link) {
        this.marca = marca;
        this.modelo = modelo;
        this.generacion = generacion;
        this.socket = socket;
        this.tipoRam = tipoRam;
        this.frecuencia = frecuencia;
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

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getTipoRam() {
        return tipoRam;
    }

    public void setTipoRam(String tipoRam) {
        this.tipoRam = tipoRam;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
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
        String cadena="" + marca + " " + modelo + " " + socket + " " + frecuencia+"Ghz";
        String nuevaCadena = cadena.replaceAll("\"", "");
        return nuevaCadena;
    }

    public String detalles(){
        return "Detalles del CPU"
                +"\nMarca: "+marca
                +"\nModelo: " +modelo
                +"\nGeneracion: "+generacion
                +"\nSocket: "+socket
                +"\nCompatible con Ram: "+tipoRam
                +"\nFrecuencia: "+frecuencia+ "Ghz"
                +"\nPrecio: "+precio +" USD";
    }
    
    
}
