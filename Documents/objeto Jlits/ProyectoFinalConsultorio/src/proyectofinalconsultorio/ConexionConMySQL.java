package proyectofinalconsultorio;

import com.mysql.jdbc.Connection;
import java.awt.Component;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ConexionConMySQL {
    
//Propiedades
    private Connection objConexion = null;
    private String bd = "bd_citas";
    private String usuario = "root";
    private String clave = "";
    private String server = "jdbc:mysql://localhost/" + bd;
    

    
     public Connection conectar() throws SQLException,
            ClassNotFoundException,
            Exception {
//Cargamos el Driver MySQL
        Class.forName("com.mysql.jdbc.Driver");
//Obtenemos el objeto Conexión

        this.objConexion = (Connection) DriverManager.getConnection(server, usuario, clave);
        return this.objConexion;
    }

    public ResultSet cargarResulset(String sql) throws SQLException, Exception {
        Connection objConexion = this.conectar();
        ResultSet rs = null;
// Preparamos la consulta
        Statement s = objConexion.createStatement();
        rs = s.executeQuery(sql);
        return rs;
    }

    public int ejecutarSql(String sql) throws SQLException, Exception {
        Connection objConexion = this.conectar();
        int respuesta = 0;
        Statement stmt = (Statement)objConexion.createStatement();
        respuesta = stmt.executeUpdate(sql);
        return respuesta;
    }

    public void desconectar() throws SQLException {
        this.objConexion.close();
    }

    void habilitarComponentes(JPanel panel, Boolean habilitar) {
        if (habilitar == true) {
            for (Component componente : panel.getComponents()) {
                if (componente instanceof JTextField) {
                    componente.setEnabled(true);
                } else if (componente instanceof JComboBox) {
                    componente.setEnabled(true);
                } else if (componente instanceof JRadioButton) {
                    componente.setEnabled(true);
                }
            }
        } else if (habilitar == false) {
            for (Component componente : panel.getComponents()) {
                if (componente instanceof JTextField) {
                    componente.setEnabled(false);
                } else if (componente instanceof JComboBox) {
                    componente.setEnabled(false);
                } else if (componente instanceof JRadioButton) {
                    componente.setEnabled(false);
                }
            }
        }
    }

    public boolean verificarCajasVacias(JPanel panel) {
       
            for (Component componente : panel.getComponents()) {
                if (componente instanceof JTextField && ((JTextField)componente).getText().equals("")) {
                    return false;
                } /*else if (componente instanceof JComboBox) {
                    componente.setEnabled(true);
                } else if (componente instanceof JRadioButton) {
                    componente.setEnabled(true);
                } */
            }
        
        
        return true;
    }
    
      public void cargarTabla(JTable tabla, String sql) throws SQLException, Exception {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);

        ResultSet rs = this.cargarResulset(sql);
        ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();

        //La cantidad de columnas que tiene la consulta
        int cantidadColumnas = rsMd.getColumnCount();

        //Establecer como cabezeras el nombre de las colimnas
        for (int i = 1; i <= cantidadColumnas; i++) {
            modelo.addColumn(rsMd.getColumnLabel(i).toUpperCase());
        }

        while (rs.next()) {
            Object[] fila = new Object[cantidadColumnas];
            for (int i = 0; i < cantidadColumnas; i++) {
                fila[i] = rs.getObject(i + 1);
            }
            modelo.addRow(fila);
        }
        rs.close();
    }
}
