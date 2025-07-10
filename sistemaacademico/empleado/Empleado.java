/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.empleado;

import com.mycompany.sistemaacademico.personalinstitucional.PersonaInstitucional;

/**
 *
 * @author IDC
 */
public class Empleado extends PersonaInstitucional {
    //Atributos

    private double sueldo;

    //Constructor
    public Empleado(double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(correoInstitucional, nombre, id, correo, cedula);
        this.sueldo = sueldo;
    }

    //Set y get 
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //toString
    @Override
    public String toString() {
        return "empleado{" + "sueldo=" + sueldo + super.toString() + '}';
    }

}
