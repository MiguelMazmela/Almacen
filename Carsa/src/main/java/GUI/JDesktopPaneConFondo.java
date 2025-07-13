/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Miguel
 */
public class JDesktopPaneConFondo extends JDesktopPane {
       private Image imagenFondo;

    public JDesktopPaneConFondo(String rutaImagen) {
        try {
            imagenFondo = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
        } catch (Exception e) {
            System.out.println("No se pudo cargar la imagen: " + rutaImagen);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagenFondo != null) {
            g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
