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

public class AlumnoData {
    private Connection con = null;
    
    public AlumnoData(){ 
      con = Conexion.getConexion();
    } 
    
    public void guardarAlumno(Alumno alumno){
      
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, true);
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt("idAlumno"));    
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno .");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Alumno añadido con exito .");
        }
  }
    
    public Alumno buscarAlumno(int id){
      
        Alumno alumno =null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;
          
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){ 
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setAcctivo(true);
            } else{
                JOptionPane.showMessageDialog(null, "No existe el alumno");
                ps.close();
                    }     
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error alacceder a la tabla alumno");
        }
        return alumno;
    }
    
    public Alumno buscarAlumnoPorDni(int dni){

            Alumno alumno =null;
            String sql = "SELECT* FROM alumno WHERE dni = ? AND estado =1 " ;
            PreparedStatement ps=null;
        try {    
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs =ps.executeQuery();
            
            if(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(dni);
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setAcctivo(rs.getBoolean("activo"));
           } else{
                JOptionPane.showMessageDialog(null, "No existe el alumno");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se encontro el alumno");
        }
      return alumno;
  }
    
    public void modificarAlumno(Alumno alumno){
        
        String sql= "UPDATE alumno SET dni=?, apellido=?,nombre=? ,fechaNacimiento=? WHERE idAlumno =?  AND estado=1 ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            int respuesta = ps.executeUpdate();
            if(respuesta==1){
                JOptionPane.showMessageDialog(null, "Alumno modificado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error no se pudo modificar el alumno");
        }
        
    }
    
    public List<Alumno> listarAlummnos(){
      List<Alumno> alumnos =new ArrayList<>();
      
      
        return alumnos;
      
    }
    public void eliminarAlumno(int id){
        String sql =" UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
        PreparedStatement ps = null;
        try {
            ps =con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            
            if (fila ==1){
                 JOptionPane.showMessageDialog(null,"Se elimino el alumno");
            }
                ps.close(); 
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al eliminar alumno");
        }      
    }  
}
