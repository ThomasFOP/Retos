package Interfaces;

import Clases.ClsVotante;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroVotante extends javax.swing.JFrame {

    private LinkedList<ClsVotante> ListaVotantes;

    public RegistroVotante() {
        initComponents();

        this.ListaVotantes = new LinkedList<>();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CasillaNombreRV = new javax.swing.JTextField();
        CasillaCorreoRV = new javax.swing.JTextField();
        CasillaTipoDocumentoRV = new javax.swing.JTextField();
        CasillaNumDocumentoRV = new javax.swing.JTextField();
        CasillaTelefonoRV = new javax.swing.JTextField();
        CasillaCiudadRV = new javax.swing.JTextField();
        BotonRegistrarVotante = new javax.swing.JButton();
        BotonRegresarMenuV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaListaVotantes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre");

        jLabel3.setText("Tipo de documento ");

        jLabel4.setText("Numero de documento");

        jLabel5.setText("Telefono");

        jLabel6.setText("Correo");

        jLabel7.setText("Ciudad de residencia");

        CasillaNombreRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaNombreRVActionPerformed(evt);
            }
        });

        CasillaCorreoRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaCorreoRVActionPerformed(evt);
            }
        });

        CasillaTipoDocumentoRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaTipoDocumentoRVActionPerformed(evt);
            }
        });

        CasillaNumDocumentoRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaNumDocumentoRVActionPerformed(evt);
            }
        });

        CasillaTelefonoRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaTelefonoRVActionPerformed(evt);
            }
        });

        CasillaCiudadRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaCiudadRVActionPerformed(evt);
            }
        });

        BotonRegistrarVotante.setBackground(new java.awt.Color(0, 153, 153));
        BotonRegistrarVotante.setText("Registrar votante");
        BotonRegistrarVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarVotanteActionPerformed(evt);
            }
        });

        BotonRegresarMenuV.setBackground(new java.awt.Color(0, 204, 51));
        BotonRegresarMenuV.setText("Regresar al menu de inicio");
        BotonRegresarMenuV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarMenuVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(CasillaNombreRV, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(CasillaTipoDocumentoRV)
                            .addComponent(CasillaNumDocumentoRV))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(CasillaCorreoRV, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(CasillaTelefonoRV)
                            .addComponent(CasillaCiudadRV, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonRegresarMenuV)
                .addGap(29, 29, 29)
                .addComponent(BotonRegistrarVotante)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CasillaNombreRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CasillaCorreoRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CasillaTipoDocumentoRV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CasillaTelefonoRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CasillaNumDocumentoRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CasillaCiudadRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistrarVotante)
                    .addComponent(BotonRegresarMenuV))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registro de votante", jPanel1);

        TablaListaVotantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Telefono", "Tipo de documento", "Numero de documento", "Correo", "Ciudad de residencia", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(TablaListaVotantes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lista de votantes", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("SECCION DE VOTANTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CasillaNombreRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaNombreRVActionPerformed

    }//GEN-LAST:event_CasillaNombreRVActionPerformed

    private void CasillaCorreoRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaCorreoRVActionPerformed

    }//GEN-LAST:event_CasillaCorreoRVActionPerformed

    private void CasillaTipoDocumentoRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaTipoDocumentoRVActionPerformed

    }//GEN-LAST:event_CasillaTipoDocumentoRVActionPerformed

    private void CasillaNumDocumentoRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaNumDocumentoRVActionPerformed

    }//GEN-LAST:event_CasillaNumDocumentoRVActionPerformed

    private void CasillaTelefonoRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaTelefonoRVActionPerformed

    }//GEN-LAST:event_CasillaTelefonoRVActionPerformed

    private void CasillaCiudadRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaCiudadRVActionPerformed

    }//GEN-LAST:event_CasillaCiudadRVActionPerformed

    private void BotonRegistrarVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarVotanteActionPerformed

        String nombre = CasillaNombreRV.getText();
        String tipo_documento = CasillaTipoDocumentoRV.getText();
        String numero_documento = CasillaNumDocumentoRV.getText();
        String telefono = CasillaTelefonoRV.getText();
        String correo = CasillaCorreoRV.getText();
        String ciudad_residencia = CasillaCiudadRV.getText();

        
        
        ClsVotante Votante = new ClsVotante(nombre, tipo_documento, numero_documento,telefono, correo, ciudad_residencia);
        this.ListaVotantes.add(Votante);
        this.ActualizarLista();


    }//GEN-LAST:event_BotonRegistrarVotanteActionPerformed

    private void BotonRegresarMenuVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarMenuVActionPerformed
        // TODO add your handling code here:
        new MenuInicio().setVisible(true);
    }//GEN-LAST:event_BotonRegresarMenuVActionPerformed

    // Creacion de metodo 
    private void ActualizarLista() {

        DefaultTableModel modelo = (DefaultTableModel) TablaListaVotantes.getModel();

        for (ClsVotante Votante : ListaVotantes) {

            //Creacion de filas en tabla
            Object[] fila = {Votante.getNombre(), Votante.getTipo_documento(), Votante.getNumero_documento(),
                Votante.getTelefono(), Votante.getCorreo_electronico(), Votante.getCiudad_de_residencia()};

            modelo.addRow(fila);

        }

    }

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
            java.util.logging.Logger.getLogger(RegistroVotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroVotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroVotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroVotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroVotante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrarVotante;
    private javax.swing.JButton BotonRegresarMenuV;
    private javax.swing.JTextField CasillaCiudadRV;
    private javax.swing.JTextField CasillaCorreoRV;
    private javax.swing.JTextField CasillaNombreRV;
    private javax.swing.JTextField CasillaNumDocumentoRV;
    private javax.swing.JTextField CasillaTelefonoRV;
    private javax.swing.JTextField CasillaTipoDocumentoRV;
    private javax.swing.JTable TablaListaVotantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
