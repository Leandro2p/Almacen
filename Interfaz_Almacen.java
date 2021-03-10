package Almacen;

import java.awt.BorderLayout;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Interfaz_Almacen extends javax.swing.JFrame {

    boolean c = false;

    Conexion Connect = new Conexion();
    CargarBox crbox = new CargarBox();
    PreparedStatement ps;
    ResultSet rs;
    ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Almacen.png"));
    public Interfaz_Almacen() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
        setLocationRelativeTo(null);
        txtID_provider.setVisible(true);
        txtID_almacen.setVisible(false);
        txtState.setVisible(false);
        crbox.consultarProveedores(cbxProvider);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_nameProd = new javax.swing.JLabel();
        JL_descrip = new javax.swing.JLabel();
        JL_provider = new javax.swing.JLabel();
        JL_stock = new javax.swing.JLabel();
        JL_costPrice = new javax.swing.JLabel();
        JL_salePrice = new javax.swing.JLabel();
        txtNombreProd = new javax.swing.JTextField();
        txtDescrip = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtPrecioC = new javax.swing.JTextField();
        txtPrecioV = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        txtID_provider = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        cbxProvider = new javax.swing.JComboBox<>();
        txtID_almacen = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        btnViewRegister = new javax.swing.JButton();
        jlCodigo = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        labelAlamcen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALMACEN VALVE");
        setResizable(false);

        JL_nameProd.setText("Nombre de Producto");

        JL_descrip.setText("Descripción");

        JL_provider.setText("Proveedor");

        JL_stock.setText("Stock");

        JL_costPrice.setText("Precio Coste");

        JL_salePrice.setText("Precio Venta");

        txtNombreProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProdKeyTyped(evt);
            }
        });

        txtDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripKeyTyped(evt);
            }
        });

        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });

        txtPrecioC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCKeyTyped(evt);
            }
        });

        txtPrecioV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioVKeyTyped(evt);
            }
        });

        btnSave.setText("Guardar");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnModify.setText("Modificar");
        btnModify.setEnabled(false);
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClean.setText("Limpiar");
        btnClean.setEnabled(false);
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        txtID_provider.setEditable(false);
        txtID_provider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_providerActionPerformed(evt);
            }
        });

        btnSearch.setText("Buscar");
        btnSearch.setEnabled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cbxProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProviderActionPerformed(evt);
            }
        });

        txtID_almacen.setEditable(false);

        txtState.setEditable(false);

        btnViewRegister.setText("Ver Registros");
        btnViewRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRegisterActionPerformed(evt);
            }
        });

        jlCodigo.setText("Codigo");

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodeKeyTyped(evt);
            }
        });

        labelAlamcen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Almacen.png"))); // NOI18N
        labelAlamcen.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_nameProd)
                    .addComponent(JL_provider)
                    .addComponent(JL_stock)
                    .addComponent(JL_costPrice)
                    .addComponent(JL_salePrice)
                    .addComponent(JL_descrip)
                    .addComponent(btnSave)
                    .addComponent(jlCodigo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModify)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnClean))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxProvider, 0, 90, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                        .addComponent(txtPrecioV, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrecioC, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtStock, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID_provider, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtNombreProd)
                            .addComponent(txtDescrip))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewRegister))
                            .addComponent(txtID_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(labelAlamcen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelAlamcen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtID_provider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JL_nameProd)
                                    .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JL_descrip)
                                    .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JL_provider)
                                    .addComponent(cbxProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JL_stock)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(JL_costPrice))
                            .addComponent(txtPrecioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JL_salePrice)
                            .addComponent(txtPrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch)
                        .addComponent(btnViewRegister)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnModify)
                    .addComponent(btnDelete)
                    .addComponent(btnClean))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//------------------------------------------------------------------------------
    public void Clean() {
        txtID_almacen.setText("");
        txtID_provider.setText("");
        txtCode.setText("");
        txtNombreProd.setText("");
        cbxProvider.setSelectedIndex(0);
        txtDescrip.setText("");
        txtStock.setText("");
        txtPrecioC.setText("");
        txtPrecioV.setText("");
        txtState.setText("");
        btnSave.setEnabled(false);
        btnSearch.setEnabled(false);
        btnClean.setEnabled(false);
        btnModify.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    public void verifEnable() {
        if (!"".equals(txtCode.getText())
                || !"".equals(txtNombreProd.getText())
                || !"".equals(txtDescrip.getText())
                || !"".equals(txtStock.getText())
                || !"".equals(txtPrecioC.getText())
                || !"".equals(txtPrecioV.getText())) {
            btnSave.setEnabled(true);
            btnClean.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
            btnClean.setEnabled(false);
        }

    }
//------------------------------------------------------------------------------
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Connection con = null;
        String State = "1";
        try {
            if (txtCode.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Codigo del Producto");
                return;
            } else {
                if (txtCode.getText().length() < 2) {
                    JOptionPane.showMessageDialog(null, "Por favor Ingrese el Codigo del Producto con mas de 2 caracteres");
                    return;
                }
            }
            if (txtNombreProd.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Nombre del Producto");
                return;
            }
            if (txtDescrip.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese la Descripcion del Producto");
                return;
            }
            if (txtID_provider.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Proveedor");
                return;
            }
            if (txtStock.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Stock");
                return;
            }
            if (txtPrecioC.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Precio Coste");
                return;
            }
            if (txtPrecioV.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Precio de Venta");
                return;
            }
            con = Connect.Conectar();
            ps = con.prepareStatement("INSERT INTO productos (Codigo_Prod, Name_prod, descripcion_prod,id_proveedorProd , Stock_prod, precio_coste_prod, precio_venta_prod, State_Prod) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, txtCode.getText());
            ps.setString(2, txtNombreProd.getText());
            ps.setString(3, txtDescrip.getText());
            ps.setString(4, txtID_provider.getText());
            ps.setInt(5, Integer.valueOf(txtStock.getText()));
            ps.setFloat(6, Float.valueOf(txtPrecioC.getText()));
            ps.setFloat(7, Float.valueOf(txtPrecioV.getText()));
            ps.setString(8, State);
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se Guardo Exitosamente");
                Clean();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                Clean();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbxProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProviderActionPerformed

        try {

            Connection con = null;
            con = Connect.Conectar();
            Statement Set1 = con.createStatement();
            ResultSet rs1 = Set1.executeQuery("SELECT * FROM proveedores WHERE NombreProveedor= '" + this.cbxProvider.getSelectedItem() + "'");
            rs1.next();
            this.txtID_provider.setText(String.valueOf(rs1.getInt("IdProveedor")));

        } catch (Exception e) {
        }

    }//GEN-LAST:event_cbxProviderActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        Connection con = null;

        try {
            cbxProvider.removeAllItems();
            crbox.ConBuscar(cbxProvider);
            con = Connect.Conectar();
            ps = con.prepareStatement("SELECT * FROM productos WHERE Codigo_Prod= ? AND State_Prod = 1");
            ps.setString(1, txtCode.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                txtID_almacen.setText(rs.getString("id_prod"));
                txtID_provider.setText(rs.getString("id_proveedorProd"));

                System.out.println(txtID_provider.getText());
                txtCode.setText(rs.getString("Codigo_Prod"));
                txtNombreProd.setText(rs.getString("Name_prod"));
                txtDescrip.setText(rs.getString("descripcion_prod"));
                cbxProvider.setSelectedIndex(Integer.valueOf(txtID_provider.getText()));
                txtStock.setText(rs.getString("Stock_prod"));
                txtPrecioC.setText(rs.getString("precio_coste_prod"));
                txtPrecioV.setText(rs.getString("precio_venta_prod"));
                txtState.setText(rs.getString("State_Prod"));
                btnSave.setEnabled(false);
                btnModify.setEnabled(true);
                btnDelete.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "No se econtró el producto");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz_Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        cbxProvider.removeAllItems();
        crbox.consultarProveedores(cbxProvider);
        Clean();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        Connection con = null;
        try {
            if (txtCode.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Codigo del Producto");
                return;
            } else {
                if (txtCode.getText().length() < 2) {
                    JOptionPane.showMessageDialog(null, "Por favor Ingrese el Codigo del Producto con mas de 2 caracteres");
                    return;
                }
            }
            if (txtNombreProd.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Nombre del Producto");
                return;
            }
            if (txtDescrip.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese la Descripcion del Producto");
                return;
            }
            if (txtID_provider.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Proveedor");
                return;
            }
            if (txtStock.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Stock");
                return;
            }
            if (txtPrecioC.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Precio Coste");
                return;
            }
            if (txtPrecioV.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Precio de Venta");
                return;
            }
            con = Connect.Conectar();
            ps = con.prepareStatement("UPDATE productos SET Codigo_Prod =?, Name_prod= ?, descripcion_prod= ?,id_proveedorProd = ?, Stock_prod= ?, precio_coste_prod= ?, precio_venta_prod= ? WHERE id_prod= ?");
            ps.setString(1, txtCode.getText());
            ps.setString(2, txtNombreProd.getText());
            ps.setString(3, txtDescrip.getText());
            ps.setString(4, txtID_provider.getText());
            ps.setInt(5, Integer.valueOf(txtStock.getText()));
            ps.setFloat(6, Float.valueOf(txtPrecioC.getText()));
            ps.setFloat(7, Float.valueOf(txtPrecioV.getText()));
            ps.setString(8, txtID_almacen.getText());
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se Modificó Exitosamente");
                Clean();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                Clean();
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Connection con = null;
        String State = "2";
        try {
            if (txtCode.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Codigo del Producto");
                return;
            } else {
                if (txtCode.getText().length() < 2) {
                    JOptionPane.showMessageDialog(null, "Por favor Ingrese el Codigo del Producto con mas de 2 caracteres");
                    return;
                }
            }
            if (txtNombreProd.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Nombre del Producto");
                return;
            }
            if (txtDescrip.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese la Descripcion del Producto");
                return;
            }
            if (txtID_provider.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Proveedor");
                return;
            }
            if (txtStock.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Stock");
                return;
            }
            if (txtPrecioC.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Precio Coste");
                return;
            }
            if (txtPrecioV.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese el Precio de Venta");
                return;
            }
            con = Connect.Conectar();
            ps = con.prepareStatement("UPDATE productos SET State_Prod= ? WHERE id_prod= ?");
            ps.setString(1, State);
            ps.setString(2, txtID_almacen.getText());
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se Eliminó Exitosamente");
                Clean();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                Clean();
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNombreProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProdKeyTyped
        verifEnable();
    }//GEN-LAST:event_txtNombreProdKeyTyped

    private void txtDescripKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripKeyTyped
        verifEnable();
    }//GEN-LAST:event_txtDescripKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        verifEnable();
    }//GEN-LAST:event_txtStockKeyTyped

    private void txtPrecioCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCKeyTyped
        verifEnable();
    }//GEN-LAST:event_txtPrecioCKeyTyped

    private void txtPrecioVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioVKeyTyped
        verifEnable();
    }//GEN-LAST:event_txtPrecioVKeyTyped

    private void btnViewRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRegisterActionPerformed
        Mostrar_Registros MR = new Mostrar_Registros();
        MR.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnViewRegisterActionPerformed

    private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyTyped
        verifEnable();
        if (!"".equals(txtCode.getText())) {
            btnSearch.setEnabled(true);
        } else {
            btnSearch.setEnabled(false);
        }
    }//GEN-LAST:event_txtCodeKeyTyped

    private void txtID_providerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_providerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_providerActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Almacen().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_costPrice;
    private javax.swing.JLabel JL_descrip;
    private javax.swing.JLabel JL_nameProd;
    private javax.swing.JLabel JL_provider;
    private javax.swing.JLabel JL_salePrice;
    private javax.swing.JLabel JL_stock;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewRegister;
    private javax.swing.JComboBox<String> cbxProvider;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel labelAlamcen;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtID_almacen;
    private javax.swing.JTextField txtID_provider;
    private javax.swing.JTextField txtNombreProd;
    private javax.swing.JTextField txtPrecioC;
    private javax.swing.JTextField txtPrecioV;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
