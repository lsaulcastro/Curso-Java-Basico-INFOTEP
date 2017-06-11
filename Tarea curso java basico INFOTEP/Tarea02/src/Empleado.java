/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sauld
 */
public class Empleado {
    //Creamos los atributos que tendran todos como si fuera un ISA
    public String nombre,apellido,estado;
    public int edad;
    //Constructos para ingresar Datos
    Empleado (String nom, String ape,String es,int ed){
        this.nombre = nom;
        this.apellido = ape;
        this.estado = es;
        this.edad = ed;
    }

    Empleado(String saul, String castro, String laborando, int i, int sueldo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    public void MostrarDatos(){
        System.out.println("Datos de los empleados: \n");
        System.out.println("Nombre: " +  nombre + " \n" + "Apellido: " +  apellido + " \n" + "Edad: " + edad+ "\nEstado: " + estado);
        System.out.println("_______________________");
    
    }
   
    
    }

