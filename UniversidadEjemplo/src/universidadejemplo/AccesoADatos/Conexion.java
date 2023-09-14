package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL ="jdbc:mariadb://localhost/";
    private static final String DB = "universidad";
    private static final String USUARIO ="root";
    private static final String PASSWORD ="" ;
    private static Connection connection;
    
    //Metodo constructor, alser privado nopuedo instanciar objetos de el
    private Conexion(){    
    }
    // objet tipo Connection
    public static Connection getConexion(){
        if(connection == null){// tipo bander , sies la primera ves
            try{
               //carga los drivers
               Class.forName("org.mariadb.jdbc.Driver");//me lansa la exception
               //conexion con la base de datos
               connection = DriverManager.getConnection(URL + DB , USUARIO ,PASSWORD);
                JOptionPane.showMessageDialog(null, " conectado ");       
            }catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers "+ex);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, " Error de conexion "+ex);         
            }
        }
        return connection;
    } 
}
