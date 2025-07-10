/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.personasinvitadas;

import com.mycompany.sistemaacademico.personas.Persona;

/**
 *
 * @author IDC
 */
public class PersonaInvitada extends Persona {

    //Atributo 
    private String descripcion;

    //Constructor
    public PersonaInvitada(String nombre, int id, String correo, String cedula, String descripcion) {
        super(nombre, id, correo, cedula);
        this.descripcion = descripcion;
        super.toString();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Metodos
    @Override
    public String toString() {
        return "Persona Invitada {" + super.toString() + '}';
    }

}
