/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadejemplo;

import java.sql.Connection;
import universidadejemplo.AccesoADatos.Conexion;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;

public class UniversidadEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // pruebo la coneccion
         // Connection con = Conexion.getConexion();     
        
//        // Caga de alumnos
//        Alumno nuevoAlu = new Alumno(28565768,"Moreno","Mariano",LocalDate.of(1978, Month.MARCH, 24),true);
//        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(nuevoAlu);
//        //2 
//        nuevoAlu = new Alumno(43567345,"Martinez","Carlos",LocalDate.of(1999, Month.APRIL, 2),true);
//        alu = new AlumnoData();
//        alu.guardarAlumno(nuevoAlu);
//        //3
//        nuevoAlu = new Alumno(42345888,"Kirchuk","Ernesto",LocalDate.of(2000, Month.AUGUST, 15),true);
//        alu = new AlumnoData();
//        alu.guardarAlumno(nuevoAlu);
//        //4
//        nuevoAlu = new Alumno(40678435,"Groppa","Mariano",LocalDate.of(1998, Month.SEPTEMBER, 18),true);
//        alu = new AlumnoData();
//        alu.guardarAlumno(nuevoAlu);
//        //5
//        nuevoAlu = new Alumno(39123987,"Groisman","Bernardo",LocalDate.of(1997, Month.SEPTEMBER, 28),true);
//        alu = new AlumnoData();
//        alu.guardarAlumno(nuevoAlu);
//        //6
//        nuevoAlu = new Alumno(29875676,"Alonso","Pablo",LocalDate.of(1979, Month.DECEMBER, 12),true);
//        alu = new AlumnoData();
//        alu.guardarAlumno(nuevoAlu);
//        //7
//        nuevoAlu = new Alumno(30789789,"Pernia","Eric",LocalDate.of(1980, Month.JULY, 17),true);
//        alu = new AlumnoData();
//        alu.guardarAlumno(nuevoAlu);
//        //8
//        nuevoAlu = new Alumno(30454898,"Montero ","Maria",LocalDate.of(1980, Month.MAY, 30),true);
//        alu = new AlumnoData();
//        alu.guardarAlumno(nuevoAlu);
//        //9
//        nuevoAlu = new Alumno(29708123,"Alonso","Nicolas",LocalDate.of(1979, Month.FEBRUARY, 25),true);
//        alu = new AlumnoData();
//        alu.guardarAlumno(nuevoAlu);
//        //10
//        nuevoAlu = new Alumno(28778456,"Pillon","Ignacio",LocalDate.of(1978, Month.JUNE ,13),true);
//        alu = new AlumnoData();
//        alu.guardarAlumno(nuevoAlu);
        
        //carga de materias
        
//        Materia nuevaMat = new Materia("Matematicas",1,true);
//        MateriaData mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Algebra",1,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Ingles 1",1,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Programacion",1,true);
//        mat = new MateriaData(); 
//        mat.guardarMateria(nuevaMat);
//        
//        //**************
//        nuevaMat = new Materia("Redes",2,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Digitales",2,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Laboratorio 1",2,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Ingles 2",2,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        //******************
//        
//        nuevaMat = new Materia("Sistemas Operativos",3,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Base de datos",3,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Electronioca",3,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Estadistica",3,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//****************************************************************************

      //Guardar alumno
//      Alumno juan = new Alumno(34439685,"Gonzalez"," Martin ",LocalDate.of(2021, Month.MARCH, 3),true);
//      AlumnoData alu = new AlumnoData();
//      alu.guardarAlumno(juan);

       //Modificar alumno
//        Alumno juan = new Alumno(14,44439685,"Garcia"," Cristian",LocalDate.of(2000, Month.JULY, 23),true);
//        AlumnoData alu = new AlumnoData();
//        alu.modificarAlumno(juan);

        //Eliminar Alumno 
//        AlumnoData alu = new AlumnoData();
//        alu.eliminarAlumno(10);
//**************************************************
//        //Buscar alumno por dni
//        AlumnoData alu = new AlumnoData();
//        Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(40678435);
//        if(alumnoEncontrado!=null){
//                System.out.println(alumnoEncontrado.toString());
//            }
//            else{
//                JOptionPane.showMessageDialog(null,"alumno no encontrado");
//        }
//**************************************************
        //Buscar alumno por id
//        AlumnoData alu = new AlumnoData();
//        Alumno alumnoEncontrado = alu.buscarAlumno(5);
//        if(alumnoEncontrado!=null){
//                System.out.println(alumnoEncontrado.toString());
//            }
//            else{
//                JOptionPane.showMessageDialog(null,"alumno no encontrado");
//        }
//****************************************************
        //Ver listado alumnos 
//        AlumnoData alu =new AlumnoData();
//        for (Alumno alumno : alu.listarAlummnos()) {
//            System.out.println(alumno.toString());
//        }
    
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

        //Cargar materia
        
//        Materia mate= new Materia(" Logica ",2,true);
//        MateriaData mat=new MateriaData();
//        mat.guardarMateria(mate);
        
//        //Modificar Materia
//        Materia mate= new Materia(17," Proyecto Final ",2,true);
//        MateriaData mat=new MateriaData();
//        mat.modificarMateria(mate);

        //Eliminar Materia 
//        MateriaData mat=new MateriaData();
//        mat.eliminarMateria(17);

//****************************************************
        //Ver listado de Materias
//        MateriaData mate =new MateriaData();
//        for (Materia materia : mate.) {
//            System.out.println(materia.toString());
//        }
    
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    }
    
}
