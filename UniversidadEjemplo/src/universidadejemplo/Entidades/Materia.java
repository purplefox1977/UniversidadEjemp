/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadejemplo.Entidades;

/**
 *
 * @author Loboplateado77
 */
public class Materia {
   
    private int idMatreia;
    private String nombre;
    private int anio;
    private boolean activo;

    public Materia() {
    }

    public Materia(String nombre, int anio, boolean activo) {
        this.nombre = nombre;
        this.anio = anio;
        this.activo = activo;
    }

    public Materia(int idMatreia, String nombre, int anio, boolean activo) {
        this.idMatreia = idMatreia;
        this.nombre = nombre;
        this.anio = anio;
        this.activo = activo;
    }

    public int getIdMatreia() {
        return idMatreia;
    }

    public void setIdMatreia(int idMatreia) {
        this.idMatreia = idMatreia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMatreia=" + idMatreia + ", nombre=" + nombre + ", anio=" + anio + '}';
    }

    
    
}
