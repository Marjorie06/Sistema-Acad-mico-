/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemaacademico.decanos;

/**
 *
 * @author Marjorie
 */
public interface IDecanos {

    public boolean AgregarDecanos(Decano decano);

    public void imprimirDatos();

    public boolean actualizarDecano(int iD, Decano decano);

    public boolean eliminarDecano(int iD);

    public boolean buscarProfesor(int id);
}
