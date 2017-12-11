package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class MenuAdminEliminarVehiculo extends javax.swing.JInternalFrame {

    private Connection connection = null;
    private ResultSet rs = null;
    private Statement s = null;

    public MenuAdminEliminarVehiculo() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        llenarCombos();
    }

    private void llenarCombos() {
        llenar("estilo", cmbEstilo, "nombre_estilo");
        llenar("marca", cmbMarca, "nombre_marca");
        llenar("modelo", cmbModelo, "nombre_modelo");
        llenar("vehiculo", cmbPlacas, "placa");
    }

    private void llenar(String nombreTabla, JComboBox combo, String idNombre) {
        Conexion();
        try {
            s = connection.createStatement();
            rs = s.executeQuery("SELECT * FROM \"" + nombreTabla + "\" ");

            while (rs.next()) {
                combo.addItem(rs.getString(idNombre));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        txtAnno.setText(null);
        txtAnno.setEditable(false);
        txtPrecio.setText(null);
        txtPrecio.setEditable(false);
        cmbEstado.setSelectedIndex(0);
        cmbEstado.setEnabled(false);
        cmbEstilo.setSelectedIndex(0);
        cmbEstilo.setEnabled(false);
        cmbMarca.setSelectedIndex(0);
        cmbMarca.setEnabled(false);
        cmbModelo.setSelectedIndex(0);
        cmbModelo.setEnabled(false);
        cmbTransmi.setSelectedIndex(0);
        cmbTransmi.setEnabled(false);
        txtAnno.requestFocus();
        btnEliminar.setEnabled(false);
    }
    
    public void Conexion() {
        if (connection != null) {
            return;
        }

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String password = "123";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, "postgres", password);
            if (connection != null) {
                System.out.println("Connecting to database...");
            }
        } catch (Exception e) {
            System.out.println("Problem when connecting to the database");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        cmbModelo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbEstilo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbTransmi = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtAnno = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cmbPlacas = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Eliminar [Vehículo]");

        jLabel1.setText("Placa: ");

        jLabel2.setText("Marca: ");

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Marcas>" }));

        cmbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Modelos>" }));

        jLabel3.setText("Modelo: ");

        jLabel4.setText("Estilo: ");

        cmbEstilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Estilos>" }));

        jLabel5.setText("Transmisión: ");

        cmbTransmi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automática", "Manual" }));

        jLabel6.setText("Año: ");

        txtAnno.setEditable(false);

        txtPrecio.setEditable(false);

        jLabel7.setText("Precio: ");

        jLabel8.setText("Estado: ");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado" }));

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cmbPlacas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Placas>" }));
        cmbPlacas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPlacasItemStateChanged(evt);
            }
        });
        cmbPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlacasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPlacas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbEstilo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addComponent(cmbTransmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnno)
                            .addComponent(txtPrecio)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(59, 59, 59)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbTransmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Conexion();
        try{
            String p = cmbPlacas.getSelectedItem().toString();
            s = connection.createStatement();
            int z = s.executeUpdate("DELETE FROM vehiculo WHERE \"placa\" = '"+p+"'");

            if(z==1){
                JOptionPane.showMessageDialog(null, "Vehículo Eliminado", "Eliminar", JOptionPane.DEFAULT_OPTION);
            }else{
                JOptionPane.showMessageDialog(null, "Vehículo no Eliminado", "Error", JOptionPane.DEFAULT_OPTION);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbPlacasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPlacasItemStateChanged
        // TODO add your handling code here:
        Conexion();
        if(cmbPlacas.getSelectedIndex() == 0){
            limpiar();
        } else {
            try {
                s = connection.createStatement();
                rs = s.executeQuery("SELECT * FROM vehiculo");

                while (rs.next()) {
                    if(cmbPlacas.getSelectedItem().toString().equalsIgnoreCase(rs.getString("placa").toString())){
                        cmbMarca.setSelectedItem(rs.getString("marca"));
                        cmbModelo.setSelectedItem(rs.getString("modelo"));
                        cmbEstilo.setSelectedItem(rs.getString("estilo"));
                        cmbTransmi.setSelectedItem(rs.getString("transmision"));
                        txtAnno.setText(rs.getString("año"));
                        txtPrecio.setText(rs.getString("precio"));

                        btnEliminar.setEnabled(true);
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cmbPlacasItemStateChanged

    private void cmbPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPlacasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbEstilo;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JComboBox<String> cmbPlacas;
    private javax.swing.JComboBox<String> cmbTransmi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAnno;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
