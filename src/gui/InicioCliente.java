/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import control.ControlCampos;
import control.ControlInicioSesion;
import control.ControlTiempo;
import archivos.Datos;
import java.io.File;
import javax.swing.JFileChooser;
import org.apache.commons.validator.routines.InetAddressValidator;

/**
 *
 * @author emgl_
 */
public class InicioCliente extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public InicioCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conexion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoIP = new javax.swing.JTextField();
        labelErrorIP = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonEstablecerConexion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoPuerto = new javax.swing.JTextField();
        campoClave = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        enviarArchivo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campoRutaArchivo = new javax.swing.JTextField();
        campoNombreArchivo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        verArchivos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonDescargarArchivo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        botonDescargarArchivo1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        botonDescargarArchivo2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cuenta = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoUsuarioCuenta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoEspacioAsignado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoEspacioUtilizado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoClaveRepetidaCuenta = new javax.swing.JPasswordField();
        campoClaveCuenta = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ladoSuperior = new javax.swing.JPanel();
        labelServidor = new javax.swing.JLabel();
        labelPuerto = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        barraNavegacion = new javax.swing.JPanel();
        botonCerrarSesion = new javax.swing.JButton();
        botonVerArchivos = new javax.swing.JButton();
        botonCuenta = new javax.swing.JButton();
        botonEnviarArchivo = new javax.swing.JButton();
        botonConexion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cloud Network");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        conexion.setBackground(new java.awt.Color(255, 255, 255));
        conexion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Clave:");
        conexion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Indique la configuración para establecer la conexión con el servidor");
        conexion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 540, 30));

        campoIP.setText("192.168.1.21");
        campoIP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoIPFocusLost(evt);
            }
        });
        campoIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIPActionPerformed(evt);
            }
        });
        conexion.add(campoIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 270, 30));
        conexion.add(labelErrorIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 270, 20));

        jLabel4.setText("Dirección IP del servidor:");
        conexion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        botonEstablecerConexion.setText("Establecer Conexión");
        botonEstablecerConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstablecerConexionActionPerformed(evt);
            }
        });
        conexion.add(botonEstablecerConexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 170, 30));

        jLabel5.setText("Puerto a utilizar:");
        conexion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        campoPuerto.setText("7896");
        campoPuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPuertoActionPerformed(evt);
            }
        });
        conexion.add(campoPuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 270, 30));

        campoClave.setText("123456");
        campoClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoClaveActionPerformed(evt);
            }
        });
        conexion.add(campoClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 270, 30));

        jLabel6.setText("Usuario:");
        conexion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        campoUsuario.setText("bcante");
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        conexion.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 270, 30));

        getContentPane().add(conexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 620, 500));

        enviarArchivo.setBackground(new java.awt.Color(255, 255, 255));
        enviarArchivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Enviar archivo");
        enviarArchivo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        campoRutaArchivo.setEnabled(false);
        campoRutaArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRutaArchivoActionPerformed(evt);
            }
        });
        enviarArchivo.add(campoRutaArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 390, 30));

        campoNombreArchivo.setText("jTextField1");
        campoNombreArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreArchivoActionPerformed(evt);
            }
        });
        enviarArchivo.add(campoNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 390, 30));

        jLabel8.setText("Seleccione el archivo:");
        enviarArchivo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel9.setText("Indique el nombre con el cual se guardará el archivo:");
        enviarArchivo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jButton1.setText("Subir archivo");
        enviarArchivo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 160, 30));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        enviarArchivo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 240, 80, 30));

        getContentPane().add(enviarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 620, 500));

        verArchivos.setBackground(new java.awt.Color(255, 255, 255));
        verArchivos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tamaño", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        verArchivos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 590, 320));

        botonDescargarArchivo.setText("Descargar");
        verArchivos.add(botonDescargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 130, 30));

        jButton3.setText("Abrir");
        verArchivos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 70, 20));

        jButton5.setText("Volver");
        verArchivos.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        botonDescargarArchivo1.setText("Compartir");
        botonDescargarArchivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDescargarArchivo1ActionPerformed(evt);
            }
        });
        verArchivos.add(botonDescargarArchivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 130, 30));

        jButton8.setText("Ver Propios");
        verArchivos.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 120, 20));

        jButton9.setText("Ver Compartidos");
        verArchivos.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, 20));

        botonDescargarArchivo2.setText("Eliminar");
        verArchivos.add(botonDescargarArchivo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 130, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("MI UNIDAD");
        verArchivos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 430, 30));

        jLabel18.setText("Ruta en servidor: ");
        verArchivos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        getContentPane().add(verArchivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 620, 500));

        cuenta.setBackground(new java.awt.Color(255, 255, 255));
        cuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Nombre");
        cuenta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        campoNombre.setText("jTextField1");
        cuenta.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 540, -1));

        campoUsuarioCuenta.setText("jTextField1");
        cuenta.add(campoUsuarioCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 540, -1));

        jLabel11.setText("Usuario:");
        cuenta.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        campoEspacioAsignado.setText("jTextField1");
        cuenta.add(campoEspacioAsignado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 540, -1));

        jLabel12.setText("Espacio Asignado:");
        cuenta.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        campoEspacioUtilizado.setText("jTextField1");
        cuenta.add(campoEspacioUtilizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 540, -1));

        jLabel13.setText("Espacio Utilizado:");
        cuenta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        campoClaveRepetidaCuenta.setText("jPasswordField1");
        cuenta.add(campoClaveRepetidaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 250, -1));

        campoClaveCuenta.setText("jPasswordField1");
        cuenta.add(campoClaveCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 250, -1));

        jButton4.setText("Guardar");
        cuenta.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 150, 30));

        jLabel14.setText("Confirme su clave:");
        cuenta.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jLabel15.setText("Clave:");
        cuenta.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel16.setText("Información de cuenta y cambio de clave");
        cuenta.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        getContentPane().add(cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 620, 500));

        ladoSuperior.setBackground(new java.awt.Color(44, 90, 122));
        ladoSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelServidor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelServidor.setForeground(new java.awt.Color(255, 255, 255));
        labelServidor.setText("Usuario: ");
        ladoSuperior.add(labelServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 220, 30));

        labelPuerto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPuerto.setForeground(new java.awt.Color(255, 255, 255));
        labelPuerto.setText("Servidor:");
        ladoSuperior.add(labelPuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 220, 30));

        labelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Puerto:");
        ladoSuperior.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 220, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cloud Network");
        ladoSuperior.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 50));

        getContentPane().add(ladoSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        barraNavegacion.setBackground(new java.awt.Color(44, 90, 122));
        barraNavegacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCerrarSesion.setText("Cerrar Sesión");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });
        barraNavegacion.add(botonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 140, 30));

        botonVerArchivos.setText("Ver Archivos");
        botonVerArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerArchivosActionPerformed(evt);
            }
        });
        barraNavegacion.add(botonVerArchivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 30));

        botonCuenta.setText("Cuenta");
        botonCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuentaActionPerformed(evt);
            }
        });
        barraNavegacion.add(botonCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 140, 30));

        botonEnviarArchivo.setText("Enviar Archivo");
        botonEnviarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarArchivoActionPerformed(evt);
            }
        });
        barraNavegacion.add(botonEnviarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));

        botonConexion.setText("Conexion");
        botonConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConexionActionPerformed(evt);
            }
        });
        barraNavegacion.add(botonConexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 140, 30));

        getContentPane().add(barraNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void botonEnviarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarArchivoActionPerformed
        enviarArchivo.setVisible(true);
        verArchivos.setVisible(false);
        cuenta.setVisible(false);
        conexion.setVisible(false);
    }//GEN-LAST:event_botonEnviarArchivoActionPerformed

    private void botonVerArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerArchivosActionPerformed
        enviarArchivo.setVisible(false);
        verArchivos.setVisible(true);
        cuenta.setVisible(false);
        conexion.setVisible(false);
    }//GEN-LAST:event_botonVerArchivosActionPerformed

    private void botonCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuentaActionPerformed
        enviarArchivo.setVisible(false);
        verArchivos.setVisible(false);
        cuenta.setVisible(true);
        conexion.setVisible(false);
    }//GEN-LAST:event_botonCuentaActionPerformed

    private void campoIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIPActionPerformed

    private void campoIPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoIPFocusLost
        InetAddressValidator validar = InetAddressValidator.getInstance();
        if(validar.isValidInet4Address(campoIP.getText())){
            labelErrorIP.setText("");
        }else{
            labelErrorIP.setText("*La direccion IP no es valida (debe ser IPv4)");
        }
    }//GEN-LAST:event_campoIPFocusLost

    private void botonEstablecerConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstablecerConexionActionPerformed
        if("".equals(labelErrorIP.getText())&&ControlCampos.esEntero(campoPuerto.getText())
            &&!ControlCampos.estaVacio(campoIP.getText())&&!ControlCampos.estaVacio(campoPuerto.getText())
            &&!ControlCampos.estaVacio(campoUsuario.getText())&&!ControlCampos.estaVacio(campoClave.getText())){
            Thread iniciarSesion = new Thread(new ControlInicioSesion(campoUsuario.getText(), campoClave.getText(), campoIP.getText(), ControlCampos.convertirAEntero(campoPuerto.getText())));
            Thread tiempo = new Thread(new ControlTiempo());
            iniciarSesion.start();
            tiempo.run();
            iniciarSesion.stop();
            
            if(Datos.isSesionIniciada()){
                System.out.println("Se inicio");
            }else{
                switch(Datos.getUltimoError()){
                    case "///den":{
                        System.out.println("Autenticacion Fallida");
                        break;
                    }
                    case "///con":{
                        System.out.println("No se logro establecer la conexion");
                    }
            }
            }
            
            
        }else{
            System.out.println("Nenei");
        }
    }//GEN-LAST:event_botonEstablecerConexionActionPerformed
    
    private void campoPuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPuertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPuertoActionPerformed

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void campoClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoClaveActionPerformed

    private void campoRutaArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRutaArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRutaArchivoActionPerformed

    private void campoNombreArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreArchivoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser selectorCarpeta = new JFileChooser();
        selectorCarpeta.setDialogTitle("Seleccione el archivo a subir...");
        selectorCarpeta.setFileSelectionMode(JFileChooser.FILES_ONLY);
        selectorCarpeta.setAcceptAllFileFilterUsed(false);
        if(JFileChooser.APPROVE_OPTION==selectorCarpeta.showOpenDialog(this)){
            File carpetaSeleccionada = selectorCarpeta.getSelectedFile();
            campoRutaArchivo.setText(carpetaSeleccionada.getAbsolutePath());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConexionActionPerformed
        enviarArchivo.setVisible(false);
        verArchivos.setVisible(false);
        cuenta.setVisible(false);
        conexion.setVisible(true);
    }//GEN-LAST:event_botonConexionActionPerformed

    private void botonDescargarArchivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDescargarArchivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonDescargarArchivo1ActionPerformed

    /**
     * @param args the command line arguments
     */



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraNavegacion;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonConexion;
    private javax.swing.JButton botonCuenta;
    private javax.swing.JButton botonDescargarArchivo;
    private javax.swing.JButton botonDescargarArchivo1;
    private javax.swing.JButton botonDescargarArchivo2;
    private javax.swing.JButton botonEnviarArchivo;
    private javax.swing.JButton botonEstablecerConexion;
    private javax.swing.JButton botonVerArchivos;
    private javax.swing.JPasswordField campoClave;
    private javax.swing.JPasswordField campoClaveCuenta;
    private javax.swing.JPasswordField campoClaveRepetidaCuenta;
    private javax.swing.JTextField campoEspacioAsignado;
    private javax.swing.JTextField campoEspacioUtilizado;
    private javax.swing.JTextField campoIP;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNombreArchivo;
    private javax.swing.JTextField campoPuerto;
    private javax.swing.JTextField campoRutaArchivo;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JTextField campoUsuarioCuenta;
    private javax.swing.JPanel conexion;
    private javax.swing.JPanel cuenta;
    private javax.swing.JPanel enviarArchivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelErrorIP;
    private javax.swing.JLabel labelPuerto;
    private javax.swing.JLabel labelServidor;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel ladoSuperior;
    private javax.swing.JPanel verArchivos;
    // End of variables declaration//GEN-END:variables
}