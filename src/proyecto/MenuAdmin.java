package proyecto;

import javax.swing.JFrame;

public class MenuAdmin extends javax.swing.JFrame {

    public MenuAdmin() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnAgregar = new javax.swing.JMenu();
        agreVehiculos = new javax.swing.JMenuItem();
        agreMarcas = new javax.swing.JMenuItem();
        agreModelo = new javax.swing.JMenuItem();
        agreEstilo = new javax.swing.JMenuItem();
        agreOficina = new javax.swing.JMenuItem();
        jmnEditar = new javax.swing.JMenu();
        ediVehiculos = new javax.swing.JMenuItem();
        ediMarcas = new javax.swing.JMenuItem();
        ediModelo = new javax.swing.JMenuItem();
        ediEstilo = new javax.swing.JMenuItem();
        ediOficina = new javax.swing.JMenuItem();
        jmnEliminar = new javax.swing.JMenu();
        eliVehiculos = new javax.swing.JMenuItem();
        eliMarcas = new javax.swing.JMenuItem();
        eliModelo = new javax.swing.JMenuItem();
        eliEstilo = new javax.swing.JMenuItem();
        eliOficinas = new javax.swing.JMenuItem();
        jmnReportes = new javax.swing.JMenu();
        Salir = new javax.swing.JMenu();
        jmnCerrarSesion = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu [Administrador]");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jmnAgregar.setText("Agregar");

        agreVehiculos.setText("Vehículos");
        agreVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreVehiculosActionPerformed(evt);
            }
        });
        jmnAgregar.add(agreVehiculos);

        agreMarcas.setText("Marcas");
        agreMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreMarcasActionPerformed(evt);
            }
        });
        jmnAgregar.add(agreMarcas);

        agreModelo.setText("Modelo");
        agreModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreModeloActionPerformed(evt);
            }
        });
        jmnAgregar.add(agreModelo);

        agreEstilo.setText("Estilo");
        agreEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreEstiloActionPerformed(evt);
            }
        });
        jmnAgregar.add(agreEstilo);

        agreOficina.setText("Oficina");
        agreOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreOficinaActionPerformed(evt);
            }
        });
        jmnAgregar.add(agreOficina);

        jMenuBar1.add(jmnAgregar);

        jmnEditar.setText("Editar");

        ediVehiculos.setText("Vehículos");
        jmnEditar.add(ediVehiculos);

        ediMarcas.setText("Marcas");
        jmnEditar.add(ediMarcas);

        ediModelo.setText("Modelo");
        jmnEditar.add(ediModelo);

        ediEstilo.setText("Estilo");
        ediEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ediEstiloActionPerformed(evt);
            }
        });
        jmnEditar.add(ediEstilo);

        ediOficina.setText("Oficina");
        jmnEditar.add(ediOficina);

        jMenuBar1.add(jmnEditar);

        jmnEliminar.setText("Eliminar");

        eliVehiculos.setText("Vehículos");
        jmnEliminar.add(eliVehiculos);

        eliMarcas.setText("Marcas");
        jmnEliminar.add(eliMarcas);

        eliModelo.setText("Modelo");
        jmnEliminar.add(eliModelo);

        eliEstilo.setText("Estilo");
        eliEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliEstiloActionPerformed(evt);
            }
        });
        jmnEliminar.add(eliEstilo);

        eliOficinas.setText("Oficina");
        jmnEliminar.add(eliOficinas);

        jMenuBar1.add(jmnEliminar);

        jmnReportes.setText("Reportes");
        jMenuBar1.add(jmnReportes);

        Salir.setText("Salir");

        jmnCerrarSesion.setText("Cerrar Sesión");
        jmnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnCerrarSesionActionPerformed(evt);
            }
        });
        Salir.add(jmnCerrarSesion);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Salir.add(jMenuItem2);

        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agreEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreEstiloActionPerformed
        // TODO add your handling code here:
        MenuAdminAgregarEstilo v = new MenuAdminAgregarEstilo();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_agreEstiloActionPerformed

    private void ediEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ediEstiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ediEstiloActionPerformed

    private void eliEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliEstiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliEstiloActionPerformed

    private void agreMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreMarcasActionPerformed
        // TODO add your handling code here:
        MenuAdminAgregarMarcas v = new MenuAdminAgregarMarcas();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_agreMarcasActionPerformed

    private void jmnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnCerrarSesionActionPerformed
        // TODO add your handling code here:
        Login v = new Login();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnCerrarSesionActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void agreModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreModeloActionPerformed
        // TODO add your handling code here:
        MenuAdminAgregarModelo v = new MenuAdminAgregarModelo();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_agreModeloActionPerformed

    private void agreOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreOficinaActionPerformed
        // TODO add your handling code here:
        MenuAdminAgregarOficina v = new MenuAdminAgregarOficina();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_agreOficinaActionPerformed

    private void agreVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreVehiculosActionPerformed
        // TODO add your handling code here:
        MenuAdminAgregarVehiculo v = new MenuAdminAgregarVehiculo();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_agreVehiculosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem agreEstilo;
    private javax.swing.JMenuItem agreMarcas;
    private javax.swing.JMenuItem agreModelo;
    private javax.swing.JMenuItem agreOficina;
    private javax.swing.JMenuItem agreVehiculos;
    private javax.swing.JMenuItem ediEstilo;
    private javax.swing.JMenuItem ediMarcas;
    private javax.swing.JMenuItem ediModelo;
    private javax.swing.JMenuItem ediOficina;
    private javax.swing.JMenuItem ediVehiculos;
    private javax.swing.JMenuItem eliEstilo;
    private javax.swing.JMenuItem eliMarcas;
    private javax.swing.JMenuItem eliModelo;
    private javax.swing.JMenuItem eliOficinas;
    private javax.swing.JMenuItem eliVehiculos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jmnAgregar;
    private javax.swing.JMenuItem jmnCerrarSesion;
    private javax.swing.JMenu jmnEditar;
    private javax.swing.JMenu jmnEliminar;
    private javax.swing.JMenu jmnReportes;
    // End of variables declaration//GEN-END:variables
}
