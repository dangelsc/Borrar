package com.SIERRA;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private ArrayList<Docente> docentes;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Seccion> secciones;
    private ArrayList<Despacho> despachos;
    public Facultad(){
        docentes=new ArrayList<>();
        estudiantes=new ArrayList<>();
        secciones=new ArrayList<>();
        despachos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(ArrayList<Seccion> secciones) {
        this.secciones = secciones;
    }

    public ArrayList<Despacho> getDespachos() {
        return despachos;
    }

    public void setDespachos(ArrayList<Despacho> despachos) {
        this.despachos = despachos;
    }
}
