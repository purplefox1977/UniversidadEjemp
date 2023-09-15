
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
    private AlumnoData aluData;
    private MateriaData mateDate;
    
  public InscripcionData(){
      
      con = Conexion.getConexion();
    }
  
  public void guardarInscripcion(Inscripcion insc){
      String sql = "INSERT INTO inscripciones (nota,idMateria,idAlumno)VALUES(?,?,?) ";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
                if (rs.next()){  
                    insc.setIdInscripcion(rs.getInt(1));
                    JOptionPane.showMessageDialog(null,"Inscripcion realizada");
                }
                ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la inscripcion");
        }

  }
  public List<Inscripcion> obtenerIscripciones(){
      
        return null;
      
  } 
  public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
      
        return null;
      
  }
  public List<Materia> obtenerMateriasCursadas(int id){
      
        return null;
      
  }
  public List<Materia> obtenerMateriaNoCursada(int id){
      
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
