/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.personas;

/**
 *
 * @author Daniela
 */
public class Persona {

    //Atributo
    private String nombre;
    private int id;
    private String correo;
    private String cedula;

    //Constructor
    public Persona(String nombre, int id, String correo, String cedula) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
        this.cedula = cedula;
    }

    //set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    //Metodo
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    //toString
    @Override
    public String toString() {
        return "Persona {" + "nombre=" + nombre + ", id=" + id + ", correo=" + correo + ", cedula=" + cedula + '}';
    }
}
