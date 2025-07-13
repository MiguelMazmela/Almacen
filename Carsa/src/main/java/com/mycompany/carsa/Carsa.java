/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carsa;

import GUI.principal;
import javax.swing.JFrame;

/**
 *
 * @author Miguel
 */
public class Carsa {

    public static void main(String[] args) {
      //  System.out.println("Hello World!");
      principal vn;
        vn=new principal();
        vn.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        vn.setTitle("Principal");
        vn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vn.setLocationRelativeTo(null);
        vn.setVisible(true);
    }
}
