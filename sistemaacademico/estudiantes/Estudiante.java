/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.estudiantes;

import com.mycompany.sistemaacademico.personalinstitucional.PersonaInstitucional;

/**
 *
 * @author Daniela
 */
public class Estudiante extends PersonaInstitucional {

    //Atributos
    private int codigo;

    //Constructor
    public Estudiante(int codigo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(correoInstitucional, nombre, id, correo, cedula);
        this.codigo = codigo;
    }

    //set y get
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //toString
    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + super.toString() + '}';
    }

}
