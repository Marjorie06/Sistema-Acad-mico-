/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author IDC
 */
public class NotificadorMensaje {

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "   INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);

    }


}
