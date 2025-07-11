/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.decanos;

import com.mycompany.sistemaacademico.personalacademico.PersonaAcademico;

/**
 *
 * @author Marjorie
 */
public class Decano extends PersonaAcademico {

    //Atributos
    private String nivelJerarquico;
    //Constructor

    public Decano(String nivelJerarquico, double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
        this.nivelJerarquico = nivelJerarquico;
    }

    //Set y get
    public String getNivelJerarquico() {
        return nivelJerarquico;
    }

    public void setNivelJerarquico(String nivelJerarquico) {
        this.nivelJerarquico = nivelJerarquico;
    }

    //toString
    @Override
    public String toString() {
        return "Decanos{"
                + "nivelJerarquico= " + nivelJerarquico + " " + super.toString()
                + '}';
    }
}
