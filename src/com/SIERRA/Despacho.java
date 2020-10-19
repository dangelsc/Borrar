package com.SIERRA;

public class Despacho {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    public Despacho(){}
    public Despacho(String nombre){
        this.nombre=nombre;
    }
}
