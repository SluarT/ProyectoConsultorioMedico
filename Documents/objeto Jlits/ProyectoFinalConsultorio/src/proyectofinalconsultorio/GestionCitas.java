
package proyectofinalconsultorio;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class GestionCitas extends javax.swing.JFrame {
    
    ConexionConMySQL conMySql = new ConexionConMySQL();
    PreparedStatement ps;
    ResultSet rs;
    Statement stmt;
    
    public GestionCitas() {
        initComponents();
         try {
            //Instancia de la clase ConexionConMySQL
            ConexionConMySQL conMySQL = new ConexionConMySQL();
            //Invocación del método conexión para conectar con MySQL
            conMySQL.conectar();    
            System.out.println("Conexión exitosa");
            
            //Cargar tablas
            this.conMySql.cargarTabla(tblCitas, "select * from citas");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdMedico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdConsultorio = new javax.swing.JTextField();
        txtIdPaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCitas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Identificación Medico");

        jLabel2.setText("Numero de Consultorio");

        jLabel3.setText("Identificación Paciente");

        jLabel4.setText("Fecha de la consulta");

        jLabel5.setText("Hora de la Consulta");

        jLabel6.setText("Codigo cita");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdMedico)
                    .addComponent(txtIdPaciente)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdConsultorio)
                    .addComponent(txtHora)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tblCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Cita", "Id Medico", "Id Consultorio", "Id Paciente", "Fecha", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCitas);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addGap(33, 33, 33)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(43, 43, 43)
                .addComponent(btnEliminar)
                .addGap(27, 27, 27)
                .addComponent(btnCerrar)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnBuscar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    // Instrucción SQL
        String sql = "INSERT INTO citas (CitId, CitMedId, CitConId, CitPacId, CitFecha, CitHora ) "
                + "VALUES('" + txtIdMedico.getText().trim() + "',"
                + "'" + txtIdConsultorio.getText().trim() + "',"
                + "'" + txtIdPaciente.getText().trim() + "',"
                + "'" + txtFecha.getText().trim() + "',"
                + "'" + txtHora.getText().trim() + "',"
                + "'" + txtId.getText().trim() + "',"
                + ")";

        System.out.println("" + sql);

        try {
            //La función ejecutarSql sirve para ejecutar
            //instrucciones INSERT, UPDATE Y DELETE
            //Retorna un valor entero (int) que representa
            //el número de filas ejecutadas o afectadas
            if (conMySql.ejecutarSql(sql) == 1) {
                JOptionPane.showMessageDialog(this, "Registro insertado ");
            } else {
                JOptionPane.showMessageDialog(this, "Registro no insertado ");
            }
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
   String sql = "SELECT * FROM citas WHERE CitId=" + txtId.getText();

        /*        "VALUES ('"+txtIdentificacion.getText().trim()+"',"+
                     "'"+txtTipoIdentificacion.getText().trim()+"',"+
                     "'"+txtNombres.getText().trim()+"',"+
                     "'"+txtApellidos.getText().trim()+"',"+
                     "'"+txtSexo.getText().trim()+"',"+
                     "'"+txtFechaNacimiento.getText().trim()+"',"+
                     "'"+txtDireccion.getText().trim()+"',"+
                     "'"+txtTelefono.getText().trim()+"',"+
                     "'"+txtEmail.getText().trim()+"'"+
                      ")";   */
        System.out.println("" + sql);
        try {

            ResultSet fila = this.conMySql.cargarResulset(sql);
            if (fila.next()) {

                txtId.setText("" + fila.getInt("CitId"));
                txtIdConsultorio.setText(fila.getString("CitConId"));
                txtIdPaciente.setText(fila.getString("CitPacId"));
                txtIdMedico.setText(fila.getString("CitMedId"));
                txtHora.setText(fila.getString("CitHora"));
                txtFecha.setText(fila.getString("CitFecha"));
             

                fila.close();
                this.conMySql.desconectar();
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese numero de identificación");
            }

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

            if (this.conMySql.verificarCajasVacias(jPanel1) == false) {
            JOptionPane.showMessageDialog(this, "Primero de buscar ");
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta segugo?");
        // 0=yes, 1=no, 2=cancel
        //  System.out.println(input);

        String sql = "UPDATE  citas SET ";
        sql += "CitId='" + txtId.getText().trim() + "',";
        sql += "CitMedId='" + txtIdMedico.getText().trim() + "',";
        sql += "CitConId='" + txtIdConsultorio.getText().trim() + "',";
        sql += "CitPacId='" + txtIdPaciente.getText().trim() + "',";
        sql += "CitFecha='" + txtFecha.getText().trim() + "',";
        sql += "CitHora='" + txtHora.getText().trim() + "',";
 

        System.out.println("" + sql);

        try {

            if (confirmacion == 0) {
                //La función ejecutarSql sirve para ejecutar
                //instrucciones INSERT, UPDATE Y DELETE
                //Retorna un valor entero (int) que representa
                //el número de filas ejecutadas o afectadas
                if (conMySql.ejecutarSql(sql) == 1) {
                    JOptionPane.showMessageDialog(this, "Registro editado ");
                    this.conMySql.desconectar();
                } else {
                    JOptionPane.showMessageDialog(this, "Registro no editado ");
                }
            }
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       // TODO add your handling code here:
        if (this.conMySql.verificarCajasVacias(jPanel1) == false) {
            JOptionPane.showMessageDialog(this, "Primero de buscar ");
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta segugo?");
        // 0=yes, 1=no, 2=cancel
        //  System.out.println(input);

        String sql = "DELETE FROM  citas WHERE CitId='" + txtId.getText().trim() + "'";
 
        System.out.println("" + sql);

        try {

            if (confirmacion == 0) {
                //La función ejecutarSql sirve para ejecutar
                //instrucciones INSERT, UPDATE Y DELETE
                //Retorna un valor entero (int) que representa
                //el número de filas ejecutadas o afectadas
                if (conMySql.ejecutarSql(sql) == 1) {
                    JOptionPane.showMessageDialog(this, "Registro eliminado ");

                    txtId.setText("");
                    txtIdMedico.setText("");
                    txtIdConsultorio.setText("");
                    txtIdPaciente.setText("");
                    txtFecha.setText("");
                    txtHora.setText("");
                   

          
                    this.conMySql.desconectar();

                } else {
                    JOptionPane.showMessageDialog(this, "Registro no eliminado ");
                }
            }
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
System.exit (0);
    
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCitas;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdConsultorio;
    private javax.swing.JTextField txtIdMedico;
    private javax.swing.JTextField txtIdPaciente;
    // End of variables declaration//GEN-END:variables
}