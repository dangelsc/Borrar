package com.SIERRA;

public class Main {
    /*
    * 1. Se pretende realizar una aplicación para esta facultad que gestione la
información sobre las personas vinculadas con la misma, que se pueden
clasificar en tres tipos: estudiantes, profesores y personal de servicio.
A continuación, se detalla qué tipo de información debe gestionar esta
aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su
número de identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su
año de incorporación a la facultad y qué número de despacho tienen
asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que
están matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué
departamento pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están
asignados (biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta
aplicación. A continuación, debe programar las clases definidas en las que,
además de los constructores*/
    public static void main(String[] args) {
        Facultad ii=new Facultad();
        ii.getDespachos().add(new Despacho("a1"));
        ii.getDespachos().add(new Despacho("a2"));
        Despacho x=ii.getDespachos().get(0);
        ii.getDocentes().add(
                new Docente("juan","perez","1234","22",2,x,"Lenguaje"));
        ii.getEstudiantes().add(new Estudiante("paquita","trello","123","soltera","derecho"));


    }
}
