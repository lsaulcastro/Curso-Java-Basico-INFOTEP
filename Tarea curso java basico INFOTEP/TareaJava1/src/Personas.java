/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sauld
 */
public class Personas {
    String  nombre,apellido,DocumentoID;
    int edad;
    boolean casado;
    //Constructor para entrada de datos
    Personas( String nom, String apelli, String docu, int edad, boolean ECivil){
    this.nombre = nom;
    this.apellido = apelli;
    this.DocumentoID = docu;
    this.edad = edad;
    this.casado = ECivil;
        
    }
    // Metodo para mostrar datos
    void MostrarDatos(){
      //  Personas PersonaObj1 = new Personas();
      //Mostrar datos
      System.out.println("Datos Personales: \n");
       System.out.println("Nombre: " +  nombre + " \n" + "Apellido: " +  apellido + " \n" + "Edad: " + edad + "\n" + "Documento de identidad: " + DocumentoID + " \n" + "Estado Civil: " +  casado);
       System.out.println("------------------------------");
    
    }
    
    
}
