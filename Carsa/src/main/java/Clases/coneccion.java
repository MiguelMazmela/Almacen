/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Miguel
 */
public final class coneccion {
    
    private String sSistemaOperativo;
    private String CaminoCompletoBD;
    private boolean conectado = false;
    private String usuario;
    private Boolean UsuarioValido;
    private boolean edicion = false;
    
    String  base="Carsa.db";
    String jdbcUrl = "jdbc:h2:./data/testdb"; // Base de datos en disco en la carpeta ./data
    
    public coneccion() {

        this.conectar();

    }
    
    
    public Connection conectar() {
        Connection con = null;
        this.sSistemaOperativo = System.getProperty("os.name");
        String sFichero = "mi_base.db";
        String sDirectorio = "db";

        String sPath = getCurrentDir() + File.separator + sDirectorio + File.separator + sFichero;
        CaminoCompletoBD = sPath;

        try {
            Class.forName("org.sqlite.JDBC");
//            String url = "/home/miguel/Mio/Java/barf/src/db/mi_base.db";
            con = DriverManager.getConnection("jdbc:sqlite:" + sPath);
            System.out.print("conecto");
        } catch (SQLException ex) {
            System.out.print(ex);
            JOptionPane.showMessageDialog(null, "No se conecto");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conecta.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
}
