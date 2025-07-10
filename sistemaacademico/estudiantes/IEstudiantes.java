/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemaacademico.estudiantes;

/**
 *
 * @author IDC
 */
public interface IEstudiantes {

    public boolean agregarEstudiantes(Estudiante estudiante);

    public void imprimirDato();

    public boolean eliminarEstudiante(int id);

    public boolean buscarEstudiante(int id);

    public boolean actualizarEstudiante(int id, Estudiante estudiante);
}
