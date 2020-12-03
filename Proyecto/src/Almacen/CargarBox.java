/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author acer
 */
public class CargarBox {

    public void consultarProveedores(JComboBox cbox_paises) {

//Creamos objeto tipo Connection    
        Conexion conn = new Conexion();
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet result = null;

//Creamos la Consulta SQL
        String SSQL = "SELECT NombreProveedor FROM proveedores ORDER BY NombreProveedor ASC";

//Establecemos bloque try-catch-finally
        try {

            //Establecemos conexión con la BD 
            con = conn.Conectar();
            //Preparamos la consulta SQL
            pst = con.prepareStatement(SSQL);
            //Ejecutamos la consulta
            result = pst.executeQuery();

            //LLenamos nuestro ComboBox
            cbox_paises.addItem("Seleccione una opción");

            while (result.next()) {

                cbox_paises.addItem(result.getString("NombreProveedor"));

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

        } finally {

            if (con != null) {

                try {

                    con.close();
                    result.close();

                    con = null;
                    result = null;

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, ex);

                }

            }

        }

    }
    public void ConBuscar(JComboBox cbox_paises) {

//Creamos objeto tipo Connection    
        Conexion conn = new Conexion();
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet result = null;

//Creamos la Consulta SQL
        String SSQL = "SELECT NombreProveedor FROM proveedores";

//Establecemos bloque try-catch-finally
        try {

            //Establecemos conexión con la BD 
            con = conn.Conectar();
            //Preparamos la consulta SQL
            pst = con.prepareStatement(SSQL);
            //Ejecutamos la consulta
            result = pst.executeQuery();

            //LLenamos nuestro ComboBox
            cbox_paises.addItem("Seleccione una opción");

            while (result.next()) {

                cbox_paises.addItem(result.getString("NombreProveedor"));

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

        } finally {

            if (con != null) {

                try {

                    con.close();
                    result.close();

                    con = null;
                    result = null;

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, ex);

                }

            }

        }

    }
}
