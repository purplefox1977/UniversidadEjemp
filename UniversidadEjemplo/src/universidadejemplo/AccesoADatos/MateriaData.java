/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadejemplo.AccesoADatos;

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
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author Loboplateado77
 */
public class MateriaData {
    private Connection con = null;
    
    public MateriaData(){
      
      con = Conexion.getConexion();
}
    public void guardarMateria(Materia materia){
      
        String sql = "INSERT INTO materia ( nombre, anio, estado) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            //ejecutar la sentencia
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
               // materia.setIdMatreia(rs.getInt("idMateria"));    
                materia.setIdMatreia(rs.getInt(1));    
            JOptionPane.showMessageDialog(null, "Materia añadida con exito .");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla materia ");
        }
}

    public  Materia buscarMateria(int id){
      
        Materia materia =null;
        String sql = "SELECT  nombre, anio FROM materia WHERE idMateria = ? AND estado = 1";
        PreparedStatement ps = null;
          
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){ 
                materia = new Materia();
                materia.setIdMatreia(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(true);
            } else{
                JOptionPane.showMessageDialog(null, "No existe la materia");
                ps.close();
                    }     
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Se enconto la materia");
        }
        return materia;
  }
    
    public void modificarMateria(Materia materia){
        try {
            String sql ="UPDATE materia SET nombre = ?,anio = ?,estado = ? WHERE idMateria = ?";
            PreparedStatement ps =null;
            
            ps= con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, true);
            
            int exito =ps.executeUpdate();
            
            if( exito == 1){
                 JOptionPane.showMessageDialog(null,"Modificado exitosamente ");
            }else {
                 JOptionPane.showMessageDialog(null," La materia ya existe ");
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null," Error al acceder a la tabla materia "+ex.getMessage());
        }
        
    }
    
    public void eliminarMateria(int id){
        try {
            String sql =" UPDATE materia SET estado = 0 WHERE idMateria = ? ";
            PreparedStatement  ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null," Se elimino la materia");
            }
                ps.close();   
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null," Error al acceder a la tabla materia");
        }
    }
    
    public List<Materia> listarMateria(){
      
        return null;
      
    }
}
