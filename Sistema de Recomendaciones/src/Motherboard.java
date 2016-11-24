/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class Motherboard {
    
    private String marca;
    private String modelo;
    private String tipo;
    private String socket;
    private double precio;
    private String tipoRam;
    private String puertoPCI;
    private int consumo;
    private String link;

    public Motherboard(String marca, String modelo, String tipo, String socket, double precio, String tipoRam, String puertoPCI, int consumo, String link) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.socket = socket;
        this.precio = precio;
        this.tipoRam = tipoRam;
        this.puertoPCI = puertoPCI;
        this.consumo = consumo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoRam() {
        return tipoRam;
    }

    public void setTipoRam(String tipoRam) {
        this.tipoRam = tipoRam;
    }

    public String getPuertoPCI() {
        return puertoPCI;
    }

    public void setPuertoPCI(String puertoPCI) {
        this.puertoPCI = puertoPCI;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        String cadena = "" + marca + " " + modelo + " " + tipo + " " + socket + " " + tipoRam ;
        String nuevaCadena = cadena.replaceAll("\"", "");
        return nuevaCadena;
    }
    
    public String detalles(){
        return "Detalles de la Motherboard"
                +"\nMarca: "+marca
                +"\nModelo: " +modelo
                +"\nTipo: "+tipo
                +"\nRam Compatible: "+tipoRam
                +"\nPuertos PCI:"+puertoPCI+".0 "
                +"\nSocket: "+socket
                +"\nPrecio: "+precio +" USD";
    }
        
}
