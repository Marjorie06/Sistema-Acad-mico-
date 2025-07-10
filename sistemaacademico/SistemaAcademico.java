/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistemaacademico;

import com.mycompany.sistemaacademico.vista.VentanaSeleccion;
import javax.swing.SwingUtilities;

/**
 *
 * @author IDC
 */
public class SistemaAcademico {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaSeleccion().setVisible(true);
        });
    }
}
