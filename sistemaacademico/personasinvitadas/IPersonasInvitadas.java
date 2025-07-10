/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemaacademico.personasinvitadas;

/**
 *
 * @author IDC
 */
public interface IPersonasInvitadas {

    public boolean agregarpersonaInvitada(PersonaInvitada personasInvitadas);

    public void imprimirDatos();

    public boolean actualizarPersonaInvitada(int id, PersonaInvitada personasInvitadas);

    public boolean eliminarPersonaInvitada(int id);

    public boolean buscarPersonaInvitada(int id);
}
