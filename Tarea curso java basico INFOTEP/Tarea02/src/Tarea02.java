

import java.util.Scanner;

public class Tarea02 {
   void limpiar(){
       for (int i = 1; i <= 7; i++) {
           System.out.println("\n");
       }
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tarea02 obt = new Tarea02();
        Vendedor ObVen;// Objeto de vendedor
        Empleado ObEm = new Empleado("Saul","Castro","Laborando",19); ;//Objeto de Empleado
      
        // Creando el menu 
        Scanner Leer = new Scanner(System.in);
        int A; 
        int B;
        do {
        System.out.println("Bienvenido! \n 1. Empleado \n 2. Visitante \n 3. Administrador \n 4. Salir \nPor Favor, Identifiquese: "); 
        A = Leer.nextInt();
                
        switch (A){
            case 1:
             //obt.limpiar();
             
            ObVen = new Vendedor(ObEm.nombre, ObEm.apellido,ObEm.estado,ObEm.edad);
            ObVen.setIDvendedor("SC-001");
            ObVen.MostrarDatosVende();
            ObVen.CalcularSueldo();;
            
           
            System.out.println("||Para Salir precione 0 || \n||Volver al menu precione un numero: ||");
             B = Leer.nextInt();
            break;
            
            case 2:
              
              System.out.println("Bienvenido visitante: \n(El visitante solo tiene acceso a ver algunos datos de los empleados)");
               
            
            ObEm.MostrarDatos();
             
            System.out.println("||Para Salir precione 0 || \n||Volver al menu precione un numero: ||");
            B = Leer.nextInt();
              break;
            default:
                System.out.println("Lo elegido no es una opcion, Intente de nuevo");
                System.out.println("||Para Salir precione 0 ||\n||Volver al menu precione un numero: ||");
                  B = Leer.nextInt();
                break;
        }              
        } while (B != 0);
        
        
//        Empleado ob = new Empleado("Saul","Castro",19);
//        ob.MostrarDatos();
    }
     
}
