package com.SIERRA;

public class Empleado  extends Persona{
    private int anioIncorporacion;
    private Despacho despacho;
    public Empleado(String _no,String _ape, String _ci, String _ec,int anioInco,Despacho de){
        super(_no,_ape,_ci,_ec);
        this.anioIncorporacion=anioInco;
        this.despacho=de;
    }
}
