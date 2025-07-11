/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.personaservicios;

import com.mycompany.sistemaacademico.empleado.Empleado;

/**
 *
 * @author Daniela
 */
public class PersonalServicios extends Empleado {

    //Atributos 
    private String gremio;
    //Constructor

    public PersonalServicios(String gremio, double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
        this.gremio = gremio;
    }
    //set y get

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }

    public String getGremio() {
        return gremio;
    }

    //toString
    @Override
    public String toString() {
        return "personalServivcios{" + "gremio=" + gremio + super.toString() + '}';
    }

}
