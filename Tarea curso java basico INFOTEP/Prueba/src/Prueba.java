/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class Prueba {
   
    String nombre,apellido;
    
  public Prueba(String nom,String ape){
      this.nombre = nom;
      this.apellido = ape;  
  }
  public void mostrar(){
  System.out.println("Nombre: " + nombre  + "\nApellido: " + apellido );
  
  }
  
 
    public static void main(String[] args) {
        String n,ap;
        int b =0;
         Scanner Leer = new Scanner (System.in);
        Prueba a[] = new Prueba[10];
           
             for (int i = 0; i <= 2; i++) {
            n = Leer.nextLine();
            ap = Leer.nextLine();
            a[i] = new Prueba (n,ap);
        
             }
        for (int i = 0; i <a.length; i++) {
            try {
                 a[i].mostrar();
            } catch (Exception e) {
            }
           
        }
        
        
        
    }
    
}
