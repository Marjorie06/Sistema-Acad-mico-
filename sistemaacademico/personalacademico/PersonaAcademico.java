/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.personalacademico;

import com.mycompany.sistemaacademico.empleado.Empleado;

/**
 *
 * @author Marjorie
 */
public class PersonaAcademico extends Empleado {

    //Constructor 
    public PersonaAcademico(double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
    }

    @Override
    public String toString() {
        return "personalAcademico{" + super.toString() + '}';
    }

}
