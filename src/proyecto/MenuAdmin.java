package proyecto;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

public class MenuAdmin extends javax.swing.JFrame {

    private Connection connection = null;
    private ResultSet rs = null;
    private Statement s = null;
    
    public MenuAdmin() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        reporte1 = new javax.swing.JMenuItem();
        reporte2 = new javax.swing.JMenuItem();
        reporte3 = new javax.swing.JMenuItem();
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
        ediVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ediVehiculosActionPerformed(evt);
            }
        });
        jmnEditar.add(ediVehiculos);

        ediMarcas.setText("Marcas");
        ediMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ediMarcasActionPerformed(evt);
            }
        });
        jmnEditar.add(ediMarcas);

        ediModelo.setText("Modelo");
        ediModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ediModeloActionPerformed(evt);
            }
        });
        jmnEditar.add(ediModelo);

        ediEstilo.setText("Estilo");
        ediEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ediEstiloActionPerformed(evt);
            }
        });
        jmnEditar.add(ediEstilo);

        ediOficina.setText("Oficina");
        ediOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ediOficinaActionPerformed(evt);
            }
        });
        jmnEditar.add(ediOficina);

        jMenuBar1.add(jmnEditar);

        jmnEliminar.setText("Eliminar");

        eliVehiculos.setText("Vehículos");
        eliVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliVehiculosActionPerformed(evt);
            }
        });
        jmnEliminar.add(eliVehiculos);

        eliMarcas.setText("Marcas");
        eliMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliMarcasActionPerformed(evt);
            }
        });
        jmnEliminar.add(eliMarcas);

        eliModelo.setText("Modelo");
        eliModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliModeloActionPerformed(evt);
            }
        });
        jmnEliminar.add(eliModelo);

        eliEstilo.setText("Estilo");
        eliEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliEstiloActionPerformed(evt);
            }
        });
        jmnEliminar.add(eliEstilo);

        eliOficinas.setText("Oficina");
        eliOficinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliOficinasActionPerformed(evt);
            }
        });
        jmnEliminar.add(eliOficinas);

        jMenuBar1.add(jmnEliminar);

        jmnReportes.setText("Reportes");

        reporte1.setText("Reporte 1");
        reporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte1ActionPerformed(evt);
            }
        });
        jmnReportes.add(reporte1);

        reporte2.setText("Reporte 2");
        reporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte2ActionPerformed(evt);
            }
        });
        jmnReportes.add(reporte2);

        reporte3.setText("Reporte 3");
        reporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte3ActionPerformed(evt);
            }
        });
        jmnReportes.add(reporte3);

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
        MenuAdminEditarEstilo v = new MenuAdminEditarEstilo();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_ediEstiloActionPerformed

    private void eliEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliEstiloActionPerformed
        // TODO add your handling code here:
        MenuAdminEliminarEstilo v = new MenuAdminEliminarEstilo();
        jDesktopPane1.add(v);
        v.setVisible(true);
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

    private void ediVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ediVehiculosActionPerformed
        // TODO add your handling code here:
        MenuAdminEditarVehiculos v = new MenuAdminEditarVehiculos();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_ediVehiculosActionPerformed

    private void ediMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ediMarcasActionPerformed
        // TODO add your handling code here:
        MenuAdminEditarMarcas v = new MenuAdminEditarMarcas();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_ediMarcasActionPerformed

    private void ediModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ediModeloActionPerformed
        // TODO add your handling code here:
        MenuAdminEditarModelo v = new MenuAdminEditarModelo();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_ediModeloActionPerformed

    private void ediOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ediOficinaActionPerformed
        // TODO add your handling code here:
        MenuAdminEditarOficina v = new MenuAdminEditarOficina();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_ediOficinaActionPerformed

    private void eliVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliVehiculosActionPerformed
        // TODO add your handling code here:
        MenuAdminEliminarVehiculo v = new MenuAdminEliminarVehiculo();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_eliVehiculosActionPerformed

    private void eliMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliMarcasActionPerformed
        // TODO add your handling code here:
        MenuAdminEliminarMarcas v = new MenuAdminEliminarMarcas();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_eliMarcasActionPerformed

    private void eliModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliModeloActionPerformed
        // TODO add your handling code here:
        MenuAdminEliminarModelo v = new MenuAdminEliminarModelo();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_eliModeloActionPerformed

    private void eliOficinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliOficinasActionPerformed
        // TODO add your handling code here:
        MenuAdminEliminarOficina v = new MenuAdminEliminarOficina();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_eliOficinasActionPerformed

    private void reporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte2ActionPerformed
        // TODO add your handling code here:
        MenuAdminReporte2 v = new MenuAdminReporte2();
        jDesktopPane1.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_reporte2ActionPerformed

    private void reporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte1ActionPerformed
        // TODO add your handling code here:
        
        String fecha = JOptionPane.showInputDialog("Digite el rango de fecha (00-0000/00-0000)").replaceAll("/", "_");
        
        if (fecha != null ) {
            Document documento = new Document();
            FileOutputStream fichero;

            try { // crear el archivo
                fichero = new FileOutputStream("PDF\\Reporte1(" + fecha + ").PDF");
                PdfWriter.getInstance(documento, fichero).setInitialLeading(20);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }

            try {
                documento.open();
                //agregar
                Conexion();
                String fecha1 = fecha.split("_")[0].split("-")[1] + "-" + fecha.split("_")[0].split("-")[0] + "-1";
                String fecha2 = fecha.split("_")[1].split("-")[1] + "-" + fecha.split("_")[1].split("-")[0] + "-31";
                
                s = connection.createStatement();
                rs = s.executeQuery("SELECT * FROM alquiler_vehiculos WHERE \"fecha_retiro\" BETWEEN '"+fecha1+"' and '"+fecha2+"' ");
                Paragraph texto = new Paragraph();
                while(rs.next()){
                    texto.add("Placa: " +rs.getString("placa_vehiculo") + "\n");
                    texto.add("Cédula: " + rs.getString("id_usuario") + "\n");
                    texto.add("User: " + rs.getString("nombre_usuario") + "\n");
                    texto.add("Fecha Retiro: " + rs.getString("fecha_retiro") + "\n");
                    texto.add("Fecha Devolucion: " + rs.getString("fecha_devolucion") + "\n");
                    texto.add("-----------------------------------------------------------------------------------------------" + "\n");     
                }
                Font fuente = new Font();
                fuente.setStyle(Font.BOLD);
                documento.add(new Paragraph("Reporte #1", fuente));
                documento.add(texto);
                //cerrar
                documento.close();

                File ruta = new File("PDF\\Reporte1(" + fecha + ").PDF");
                Desktop.getDesktop().open(ruta);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_reporte1ActionPerformed

    private void reporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte3ActionPerformed
        // TODO add your handling code here:
        Document documento = new Document();
        FileOutputStream fichero;

        try { // crear el archivo
            fichero = new FileOutputStream("PDF\\Reporte3(Usuarios).PDF");
            PdfWriter.getInstance(documento, fichero).setInitialLeading(20);
        
            documento.open();
            Paragraph texto = new Paragraph();
            
            Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT * FROM usuarios INNER JOIN alquiler_vehiculos ON usuarios.id_usuario = alquiler_vehiculos.id_usuario");
            
            while(rs.next()){
                texto.add("//--------------------Info User--------------------//" + "\n");
                texto.add("ID User: " + rs.getString("id_usuario") + "\n");
                texto.add("User: " + rs.getString("nombre") + "\n");
                texto.add("Telefono: " + rs.getString("telefono") + "\n");
                texto.add("Dirección: " + rs.getString("direccion")+ "\n");
                texto.add("//--------------------Info Vehiculo--------------------//" + "\n");
                texto.add("Placa: " + rs.getString("placa_vehiculo") + "\n");
                texto.add("Oficina Retiro: " + rs.getString("oficina_retiro") + "\n");
                texto.add("Oficina Devolución: " + rs.getString("oficina_devolucion") + "\n");
                texto.add("Fecha Retiro: " + rs.getString("fecha_retiro") + "\n");
                texto.add("Hora de Retiro: " + rs.getString("hora_retiro") + "\n");
                texto.add("Fecha Devolución" + rs.getString("fecha_devolucion") + "\n");
                texto.add("Hora de Devolución" + rs.getString("hora_devolucion") + "\n");
                texto.add("Precion de alquiler por día($): " + rs.getString("precio_alquiler") + "\n");
                texto.add("----------------------------------------------------------------------------------------------------------------------------------" + "\n");
            }       
            Font fuente = new Font();
            fuente.setStyle(Font.BOLD);
            documento.add(new Paragraph("Reporte #3", fuente));
            documento.add(texto);
            documento.close();
            
            File ruta = new File("PDF\\Reporte3(Usuarios).PDF");
            Desktop.getDesktop().open(ruta);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_reporte3ActionPerformed

    private boolean alquila(String idUser){
        Conexion();
        boolean bandera = false;
        try {
            s = connection.createStatement();
            rs = s.executeQuery("SELECT * FROM alquiler_vehiculos WHERE \"id_usuario\" = '" + idUser + "'");

            while (rs.next()) {
                bandera = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return bandera;
    }
    
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
    private javax.swing.JMenuItem reporte1;
    private javax.swing.JMenuItem reporte2;
    private javax.swing.JMenuItem reporte3;
    // End of variables declaration//GEN-END:variables
}
