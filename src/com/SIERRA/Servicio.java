package com.SIERRA;

public class Servicio extends Empleado {
    private Seccion seccion;
    public Servicio(String _no,String _ape, String _ci, String _ec,int anioInco,Despacho de,Seccion secc){
        super( _no, _ape, _ci, _ec, anioInco, de);
        this.seccion=secc;
    }
}
