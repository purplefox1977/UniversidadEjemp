
package universidadejemplo.AccesoADatos;

    import universidadejemplo.Entidades.Alumno;
    import java.sql.Connection;
    import java.sql.Date;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

public class InscripcionData {
    private Connection con = null;
    
    public InscripcionData(){
      
      con = Conexion.getConexion();
    }
  public List<Inscripcion> optenerIscripciones(){
      
        return null;
      
  } 
  public List<Inscripcion> optenerInscripcionesPorAlumno(int id){
      
        return null;
      
  }
  public List<Materia> optenerMateriasCursadas(int id){
      
        return null;
      
  }
  public List<Materia> optenerMateriaNoCursada(int id){
      
        return null;
      
  }
  public void borrarInscripcionMateriaAlumno(int  idAlumno,int idMateria){
      
  }
  public void actualizarNota(int idAlumno, int idMateria,double nota){
      
  }
  public List<Alumno>obtenerAlumnosXMateria(int  idMateria){
      
        return null;
      
  }
}
