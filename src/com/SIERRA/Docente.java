package com.SIERRA;

public class Docente extends Empleado {
    private String Departamento;
    public Docente(String _no,String _ape, String _ci, String _ec,
                   int anioInco,Despacho de,String departamento){
        super( _no, _ape, _ci, _ec, anioInco, de);
        this.Departamento=departamento;
    }
}
