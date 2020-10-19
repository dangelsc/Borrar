package com.SIERRA;

public class Persona {
    private String nombre;
    private String apellidos;
    private String ci;
    private String estadoCivil;
    public Persona(String _no,String _ape, String _ci, String _ec){
        this.ci=_ci;
        this.apellidos=_ape;
        this.nombre=_no;
        this.estadoCivil=_ec;
    }
    public Persona(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
