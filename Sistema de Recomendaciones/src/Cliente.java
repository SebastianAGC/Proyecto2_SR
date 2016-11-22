/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastián
 */
public class Cliente {
    
    private boolean viaja; //variable para asber si le gusta viajar frecuentemente
    private boolean apariencia; //variable para saber si le importa la apariencia del producto
    private boolean compras_online; //variable para saber si le gustan las compras en linea
    private String actividades; //string de las actividades que prefiere hacer con su tiempo
    private boolean experiencia; //variable para guardar la informacion sobre si le gustan cosas nuevas

    public Cliente() {
    }

    public Cliente(boolean viaja, boolean apariencia, boolean compras_online, String actividades, boolean experiencia) {
        this.viaja = viaja;
        this.apariencia = apariencia;
        this.compras_online = compras_online;
        this.actividades = actividades;
        this.experiencia = experiencia;
    }
    

    
    
    public void setViaja(boolean viaja) {
        this.viaja = viaja;
    }

    public void setApariencia(boolean apariencia) {
        this.apariencia = apariencia;
    }

    public void setCompras_online(boolean compras_online) {
        this.compras_online = compras_online;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public boolean isViaja() {
        return viaja;
    }

    public boolean isApariencia() {
        return apariencia;
    }

    public boolean isCompras_online() {
        return compras_online;
    }

    public String getActividades() {
        return actividades;
    }

    public boolean isExperiencia() {
        return experiencia;
    }

    @Override
    public String toString() {
        return "Cliente{" + "viaja=" + viaja + ", apariencia=" + apariencia + ", compras_online=" + compras_online + ", actividades=" + actividades + ", experiencia=" + experiencia + '}';
    }

    




}

