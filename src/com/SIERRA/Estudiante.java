package com.SIERRA;

public class Estudiante extends  Persona {
    private String curso;
    public Estudiante(String _no,String _ape, String _ci, String _ec,String curso){
        super(_no,_ape,_ci,_ec);
        this.curso=curso;
    }
}
