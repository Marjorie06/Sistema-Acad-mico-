/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.controlador;

import com.mycompany.sistemaacademico.personaservicios.IPersonasServicios;
import com.mycompany.sistemaacademico.personaservicios.PersonaServicios;
import com.mycompany.sistemaacademico.personaservicios.PersonalServicios;
import com.mycompany.sistemaacademico.vista.NotificadorMensaje;
import com.mycompany.sistemaacademico.vista.VPersonasServicios;

/**
 *
 * @author IDC
 */
public class ControladorPersonalServicios {
    //Atributos
    private VPersonasServicios vistaPersonalServicio;
    private NotificadorMensaje notificarMensaje;
    private IPersonasServicios iPersonasServicios;
    //Constructor
    public ControladorPersonalServicios(VPersonasServicios vistaPersonalServicio) {
        this.vistaPersonalServicio = vistaPersonalServicio;
        this.iPersonasServicios = new PersonaServicios(10);
        this.notificarMensaje = new NotificadorMensaje();
    }

    public void procesoControladorPersonalServicios() {
        try {
            String nombrePersonalServicios = vistaPersonalServicio.getNombre();
            String correoPersonaServicios = vistaPersonalServicio.getCorreo();
            String correoIPersonalServicios = vistaPersonalServicio.getCorreoInstitucional();
            String cedulaPersonalServicios = vistaPersonalServicio.getCedula();
            String gremioPersonalServicios = vistaPersonalServicio.getGremio();
            double sueldoPersonalServicios = Double.parseDouble(vistaPersonalServicio.getSueldo());
            int idPersonalServicio = Integer.parseInt(vistaPersonalServicio.getId());

            PersonalServicios nuevoPersonalServicios = new PersonalServicios(
                    gremioPersonalServicios,
                    sueldoPersonalServicios,
                    correoIPersonalServicios,
                    nombrePersonalServicios,
                    idPersonalServicio,
                    cedulaPersonalServicios,
                    correoPersonaServicios);

            boolean agregar = iPersonasServicios.agregarPersonalServicio(nuevoPersonalServicios);
            if (agregar == true) {
                notificarMensaje.mostrarMensaje("Personal Agregado exitosamente");
                iPersonasServicios.imprimirDatos();
            }
        } catch (Exception e) {
            e.printStackTrace();
            notificarMensaje.mostrarMensaje("Error al agregar al personal de servicio");
        }
    }

    public void procesoBuscarPersonaS() {
        try {
            int idPersonalServicio = Integer.parseInt(vistaPersonalServicio.getBuscar());
            boolean PersonaBuscada = iPersonasServicios.buscarPersonasServicio(idPersonalServicio);
            if (PersonaBuscada == true) {
                notificarMensaje.mostrarMensaje("Personal encontrado");
            } else {
                notificarMensaje.mostrarMensaje("Personal no encontrado");
            }
        } catch (Exception e) {
            notificarMensaje.mostrarMensaje("Error en el codigo de identificacion");
        }
    }

    public void procesoEliminarPersonaS() {
        try {
            int idPersonalServicio = Integer.parseInt(vistaPersonalServicio.getBuscar());
            boolean PersonaBuscada = iPersonasServicios.buscarPersonasServicio(idPersonalServicio);
         
            if (PersonaBuscada == true) {
                iPersonasServicios.eliminarPersonasServicio(idPersonalServicio);
                notificarMensaje.mostrarMensaje("Personal Eliminado");
            }
        } catch (Exception e) {
            notificarMensaje.mostrarMensaje("Error al eliminar al personal de servicio");
        }
    }

    public void procesoActualizarPersonaS() {
        try {
            int idPersonalServicio = Integer.parseInt(vistaPersonalServicio.getBuscar());

            boolean x = iPersonasServicios.buscarPersonasServicio(idPersonalServicio);
            if (x) {
                String nombrePersonalServicios = vistaPersonalServicio.getNombre();
                String correoPersonaServicios = vistaPersonalServicio.getCorreo();
                String correoIPersonalServicios = vistaPersonalServicio.getCorreoInstitucional();
                String cedulaPersonalServicios = vistaPersonalServicio.getCedula();
                String gremioPersonalServicios = vistaPersonalServicio.getGremio();
                double sueldoPersonalServicios = Double.parseDouble(vistaPersonalServicio.getSueldo());

                PersonalServicios personal = new PersonalServicios(gremioPersonalServicios,
                        sueldoPersonalServicios,
                        correoPersonaServicios,
                        nombrePersonalServicios,
                        idPersonalServicio,
                        correoPersonaServicios,
                        cedulaPersonalServicios);

                iPersonasServicios.actualizarPersonalServicio(idPersonalServicio, personal);
                notificarMensaje.mostrarMensaje("Informacion actualizada correctamente");

            } else {
                notificarMensaje.mostrarMensaje("No se encontró profesor con ID: " + idPersonalServicio);
            }
        } catch (NumberFormatException ex) {
            notificarMensaje.mostrarMensaje("ID invalido. Verifica los datos numéricos.");
        } catch (Exception e) {
            e.printStackTrace();
            notificarMensaje.mostrarMensaje("Error al actualizar a la persona invitada");
        }
    }

}
