/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.profesores;

import com.mycompany.sistemaacademico.personalacademico.PersonaAcademico;

/**
 *
 * @author IDC
 */
public class Profesor extends PersonaAcademico {

    //Atributos
    private Escalafon escalafon;
    //Constructor    

    public Profesor(Escalafon escalafon, double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
        this.escalafon = escalafon;
        super.toString();
    }

    //Set y get
    public void setEscalafon(Escalafon escalafon) {
        this.escalafon = escalafon;
    }

    public Escalafon getEscalafon() {
        return escalafon;
    }

    public void setCorreoInstitucional() {

        //supser.toString() = correoInstitucional;
    }

    public String getCorreoInstitucional() {

        return " ";
    }

    //toString
    @Override
    public String toString() {
        return "Profesores{" + "escalafon=" + " " + super.toString() + '}';
    }
}
