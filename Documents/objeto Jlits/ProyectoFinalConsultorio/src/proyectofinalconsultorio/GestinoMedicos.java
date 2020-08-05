package proyectofinalconsultorio;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class GestinoMedicos extends javax.swing.JFrame {

    ConexionConMySQL conMySql = new ConexionConMySQL();
    PreparedStatement ps;
    ResultSet rs;
    Statement stmt;

    public GestinoMedicos() {

        initComponents();

        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCerrar.setEnabled(true);
        desabilitar();

        try {
            //Instancia de la clase ConexionConMySQL
            ConexionConMySQL conMySQL = new ConexionConMySQL();
            //Invocación del método conexión para conectar con MySQL
            conMySQL.conectar();
            System.out.println("Conexión exitosa");

            //Cargar tablas
            this.conMySql.cargarTabla(tblMedicos, "select * from medicos");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void habilitar() {

        txtTipoIdentificacion.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtFechaNacimiento.setEnabled(true);
        txtTarjetaProfesional.setEnabled(true);
        txtEspecialidad.setEnabled(true);
        txtSexo.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtEmail.setEnabled(true);
    }

    public void desabilitar() {
        txtTipoIdentificacion.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtFechaNacimiento.setEnabled(false);
        txtTarjetaProfesional.setEnabled(false);
        txtEspecialidad.setEnabled(false);
        txtSexo.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtEmail.setEnabled(false);
    }

    public void limpiar() {
        txtTipoIdentificacion.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtFechaNacimiento.setText("");
        txtTarjetaProfesional.setText("");
        txtEspecialidad.setText("");
        txtSexo.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTipoIdentificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTarjetaProfesional = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Tipo de Identificación");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Identificación");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nombres");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Fecha de Nacimientos");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Tarjeta Profesional");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Especialidad");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Sexo");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Direccion");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Telefono");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Correo electronico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTarjetaProfesional))
                    .addComponent(txtEspecialidad)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion)
                    .addComponent(txtTelefono)
                    .addComponent(txtEmail))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTarjetaProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addGap(33, 33, 33))
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
                    .addComponent(btnCerrar)
                    .addComponent(btnNuevo))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setText("Gestión Medicos");

        tblMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificación", "Tipo de Identificación", "Nombres", "Apellidos", "Fecha de Nacimiento", "Tarjeta Profesional", "Especialidad", "Sexo", "Dirección", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMedicos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtIdentificacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA IDENTIFICACIÓN", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtIdentificacion.requestFocus();
        } else if (txtTipoIdentificacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL TIPO DE IDENTIFICACIÓN", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtTipoIdentificacion.requestFocus();
        } else if (txtNombres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR El NOMBRE ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtNombres.requestFocus();
        } else if (txtApellidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL APELLIDO ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtApellidos.requestFocus();
        } else if (txtFechaNacimiento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA FECHA DE NACIMIENTO ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtFechaNacimiento.requestFocus();
        } else if (txtTarjetaProfesional.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA TARJETA PROFESIONAL ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtTarjetaProfesional.requestFocus();
        } else if (txtEspecialidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA ESPECIALIDAD ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtEspecialidad.requestFocus();
        } else if (txtSexo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL SEXO ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtSexo.requestFocus();
        } else if (txtDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA DIRECCION ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtDireccion.requestFocus();
        } else if (txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL TELEFONO ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtTelefono.requestFocus();
        } else if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL CORREO ELECTRONICO ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtEmail.requestFocus();
        } else {

// Instrucción SQL
            String sql = "INSERT INTO medicos (MedId, MedTipoIdentificacion, MedNombres, MedApellidos, MedFechaNacimiento, MedTarjetaProfesional, MedEspecialidad, MedSexo,MedDireccion, MedTelefono, MedCorreo) "
                    + "VALUES('" + Integer.parseInt(txtIdentificacion.getText().trim()) + "'," // se realiza parseo
                    + "'" + txtTipoIdentificacion.getText().trim() + "',"
                    + "'" + txtNombres.getText().trim() + "',"
                    + "'" + txtApellidos.getText().trim() + "',"
                    + "'" + txtFechaNacimiento.getText().trim() + "',"
                    + "'" + txtTarjetaProfesional.getText().trim() + "',"
                    + "'" + txtEspecialidad.getText().trim() + "',"
                    + "'" + txtSexo.getText().trim() + "',"
                    + "'" + txtDireccion.getText().trim() + "',"
                    + "'" + Integer.parseInt(txtTelefono.getText().trim()) + "'," // se realiza parseo
                    + "'" + txtEmail.getText().trim() + "'"
                    + ")";

            System.out.println("" + sql);

            try {
                //La función ejecutarSql sirve para ejecutar
                //instrucciones INSERT, UPDATE Y DELETE
                //Retorna un valor entero (int) que representa
                //el número de filas ejecutadas o afectadas
                if (conMySql.ejecutarSql(sql) == 1) {
                    JOptionPane.showMessageDialog(this, "Registro insertado ");
                    this.conMySql.cargarTabla(tblMedicos, "select * from medicos");
                    limpiar();
                    desabilitar();
                    txtIdentificacion.setText("");
                    txtIdentificacion.setEnabled(true);
                    btnGuardar.setEnabled(false);
                    btnBuscar.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Registro no insertado ");
                }
            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
                Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (this.conMySql.verificarCajasVacias(jPanel1) == false) {
            JOptionPane.showMessageDialog(this, "Primero de buscar ");
            desabilitar();
            txtIdentificacion.setText("");
            txtIdentificacion.setEnabled(true);
            btnEliminar.setEnabled(false);
            btnEditar.setEnabled(false);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta segugo?");
        // 0=yes, 1=no, 2=cancel
        //  System.out.println(input);

        String sql = "UPDATE  medicos SET ";
        sql += "MedTipoIdentificacion='" + txtTipoIdentificacion.getText().trim() + "',";
        sql += "MedNombres='" + txtNombres.getText().trim() + "',";
        sql += "MedApellidos='" + txtApellidos.getText().trim() + "',";
        sql += "MedFechaNacimiento='" + txtFechaNacimiento.getText().trim() + "',";
        sql += "MedTarjetaProfesional='" + txtTarjetaProfesional.getText().trim() + "',";
        sql += "MedEspecialidad='" + txtEspecialidad.getText().trim() + "',";
        sql += "MedSexo='" + txtSexo.getText().trim() + "',";
        sql += "MedDireccion='" + txtDireccion.getText().trim() + "',";
        sql += "MedTelefono='" + Integer.parseInt(txtTelefono.getText().trim()) + "',";
        sql += "MedCorreo='" + txtEmail.getText().trim() + "'";
        sql += " WHERE MedId='" + txtIdentificacion.getText().trim() + "'";

        System.out.println("" + sql);

        try {

            if (confirmacion == 0) {
                //La función ejecutarSql sirve para ejecutar
                //instrucciones INSERT, UPDATE Y DELETE
                //Retorna un valor entero (int) que representa
                //el número de filas ejecutadas o afectadas
                if (conMySql.ejecutarSql(sql) == 1) {
                    JOptionPane.showMessageDialog(this, "Registro editado ");
                    limpiar();
                    desabilitar();
                    txtIdentificacion.setText("");
                    txtIdentificacion.setEnabled(true);
                    btnBuscar.setEnabled(true);
                    btnEliminar.setEnabled(false);
                    btnEditar.setEnabled(false);
                    btnNuevo.setEnabled(true);
                    btnCerrar.setEnabled(true);
                    this.conMySql.cargarTabla(tblMedicos, "select * from medicos");
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        txtIdentificacion.setEnabled(false);
        habilitar();
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnCerrar.setEnabled(true);
        String sql = "SELECT * FROM medicos WHERE MedId=" + txtIdentificacion.getText();

        System.out.println("" + sql);
        try {

            ResultSet fila = this.conMySql.cargarResulset(sql);
            if (fila.next()) {

                txtIdentificacion.setText("" + fila.getInt("MedId"));
                txtTipoIdentificacion.setText(fila.getString("MedTipoIdentificacion"));
                txtNombres.setText(fila.getString("MedNombres"));
                txtApellidos.setText(fila.getString("MedApellidos"));
                txtFechaNacimiento.setText(fila.getString("MedFechaNacimiento"));
                txtTarjetaProfesional.setText(fila.getString("MedTarjetaProfesional"));
                txtEspecialidad.setText(fila.getString("MedEspecialidad"));
                txtSexo.setText(fila.getString("MedSexo"));
                txtDireccion.setText(fila.getString("MedDireccion"));
                txtTelefono.setText(fila.getString("MedTelefono"));
                txtEmail.setText(fila.getString("MedCorreo"));

                fila.close();
                this.conMySql.cargarTabla(tblMedicos, "select * from medicos");
                this.conMySql.desconectar();
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese numero de identificación");
                this.conMySql.cargarTabla(tblMedicos, "select * from medicos");
                txtIdentificacion.setText("");
                txtIdentificacion.setEnabled(true);
                desabilitar();
                btnEditar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnNuevo.setEnabled(true);
                btnBuscar.setEnabled(true);
            }

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GestionPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (this.conMySql.verificarCajasVacias(jPanel1) == false) {
            JOptionPane.showMessageDialog(this, "Primero de buscar ");
            desabilitar();
            txtIdentificacion.setText("");
            txtIdentificacion.setEnabled(true);
            btnEliminar.setEnabled(false);
            btnEditar.setEnabled(false);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta segugo?");
        // 0=yes, 1=no, 2=cancel
        //  System.out.println(input);

        String sql = "DELETE FROM  medicos WHERE MedId='" + txtIdentificacion.getText().trim() + "'";

        System.out.println("" + sql);

        try {

            if (confirmacion == 0) {
                //La función ejecutarSql sirve para ejecutar
                //instrucciones INSERT, UPDATE Y DELETE
                //Retorna un valor entero (int) que representa
                //el número de filas ejecutadas o afectadas
                if (conMySql.ejecutarSql(sql) == 1) {
                    JOptionPane.showMessageDialog(this, "Registro eliminado ");

                    /* txtIdentificacion.setText("");
                    txtTipoIdentificacion.setText("");
                    txtNombres.setText("");
                    txtApellidos.setText("");
                    txtFechaNacimiento.setText("");
                    txtTarjetaProfesional.setText("");
                    txtEspecialidad.setText("");
                    txtSexo.setText("");
                    txtDireccion.setText("");
                    txtTelefono.setText("");
                    txtEmail.setText(""); */
                    limpiar(); // esto reeempla el codigo de arriba 
                    this.conMySql.cargarTabla(tblMedicos, "select * from medicos");
                    this.conMySql.desconectar();

                    desabilitar();
                    txtIdentificacion.setText("");
                    txtIdentificacion.setEnabled(true);
                    btnEliminar.setEnabled(false);
                    btnEditar.setEnabled(false);
                    btnBuscar.setEnabled(true);
                    btnGuardar.setEnabled(false);
                    btnNuevo.setEnabled(true);
                    btnCerrar.setEnabled(true);

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
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        habilitar();
        txtIdentificacion.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnCerrar.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(GestinoMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestinoMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestinoMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestinoMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestinoMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMedicos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTarjetaProfesional;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoIdentificacion;
    // End of variables declaration//GEN-END:variables
}
