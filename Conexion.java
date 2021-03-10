package Almacen;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    Connection Conexion;
    public Statement sentencia;
    public ResultSet rs;
    Connection conn;
    private static String driver = "com.mysql.jdbc.Driver";
    public String user = "root",
            pass = "",
            DB = "almacen",
            ip = "localhost",
            server = "jdbc:mysql://" + ip + "/" + DB + "",
            port = "3306";

    public Conexion() {
   /*     this.conn = null;
        this.user = user;
        this.pass = pass;
        this.DB = DB;
        this.ip = ip;
        this.server = server;
        this.port = port;
*/
    }

    public Connection Conectar() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(server, user, pass);
           /* if (conn != null) {
                System.out.println("Sape");
            }*/
        } catch (Exception e) {
        }
        return conn;
    }

    public void disconnect() {
        try {
            conn.close();
           // System.out.println("No Sape");
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
