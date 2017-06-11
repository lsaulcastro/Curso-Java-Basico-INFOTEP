import java.util.Scanner;

public class Tarea2_Ejer02 {

   
    public static void main(String[] args) {
         int b = 1;
        Scanner Leer = new Scanner(System.in);
        Empleado ObEmpleado[] = new Empleado[10]; 
        Administrativo ObAdmin[] = new Administrativo[10];
         boolean A = false;
         boolean Comfir = false;
        String[] nomb= new String[10];String []apelli = new String[10];
        int [] IDEmpleado = new int[10];
        int []edad = new int [10];
        int []sueldo = new int[10];
        int i = 1;
          // Creando el menu 
        //Scanner Leer = new Scanner(System.in);
        int a; 
        int B = 0;
        do {
        System.out.println("Bienvenido! \n 1. Empleado \n 2. Visitante \n 3. Administrador \n 4. Salir \nPor Favor, Identifiquese: "); 
        a = Leer.nextInt();
                
        switch (a){
            case 1:
           

            System.out.println("||Para Salir precione 0 || \n||Volver al menu precione un numero: ||");
             B = Leer.nextInt();
            break;
            
            case 2:
              
              System.out.println("Bienvenido visitante: \n(El visitante solo tiene acceso a ver algunos datos de los empleados)");
               
              for (int p = 0; p<= 10; p++) {
                  try {
                       ObEmpleado[p].MostrarDatos();
                  } catch (Exception e) {
                  }
                    
                }
           
           
             
            System.out.println("||Para Salir precione 0 || \n||Volver al menu precione un numero: ||");
            B = Leer.nextInt();
              break;
            default:
                System.out.println("Lo elegido no es una opcion, Intente de nuevo");
                System.out.println("||Para Salir precione 0 ||\n||Volver al menu precione un numero: ||");
                  B = Leer.nextInt();
                break;
                
            case 3:
                  do {            
            
       // Esta es la vista de administrador
      System.out.println("___________________________\n"+"Menu del Admin\n1.Agregar Empleado \n2.Mostrar Todos los empleados \n3.Calcular Sueldo \n4.Aumentar Sueldo\n0.Salir"+"\n___________________________");
       i = Leer.nextInt();

   switch(i){
   //case 1 Agregar empleado case 2 aumentar sueldo
       
       case 1:
            do {
           
                System.out.println("Ingrese los datos \n");
                Leer.nextLine();
                System.out.println("Nombre: "); nomb[i] = Leer.nextLine();
                System.out.println("Apellido: ");apelli[i] = Leer.nextLine();
                System.out.println("Edad: "); edad[i] = Leer.nextInt();
                System.out.println("ID del Empleado: "); IDEmpleado[i] = Leer.nextInt();
                System.out.println("Sueldo: "); sueldo[i] = Leer.nextInt();  
                ObEmpleado[i] = new Empleado(nomb[i],apelli[i],edad[i]);
                ObAdmin[i] = new Administrativo(nomb[i],apelli[i],edad[i],IDEmpleado[i],sueldo[i]);
                i++;

                System.out.println("Desea Continuar agregando empleado: Si(1), No(2)");
                int Conf = Leer.nextInt();
                if (Conf == 1) {
                    Comfir = false;
                    
                } else {
                    
                    Comfir = true;
                  
                }
  
        } while (Comfir != true);
            
            break;
       case 2:
   System.out.println("Datos de los Empleados: \n(Acontinuacion, solo vera Los datos permitidos para el publico)\n");
   for (int j = 0; j <=10; j++) {
            try {
               ObAdmin[j].MostrarDatos();
            } catch (Exception e) {
            }
        }
   
   break;
   
       case 3:
           Administrativo ob = new Administrativo(" "," ",0,0,0);
           ob.CalcularSueldo();
           break;
           
       case 4:
           System.out.println("Ingese el ID el empleado: ");
           int c = Leer.nextInt();
           for (int j = 0; j <= c; j++) {
               if (sueldo[j] != c) {
                   System.out.println("Por ingrese cual sera el sueldo actual del empleado: ");
                   int s = Leer.nextInt();
                   sueldo[c] = s;
                   ObAdmin[c] = new Administrativo(nomb[c],apelli[c],edad[c],IDEmpleado[c],sueldo[c]);
                   break;
               } else {
                   System.out.println("Tarea2_Ejer02.main()");
               }
               
           }
           break;
       case 0:
           A = true;
   break;
       default:
           
           break;
   }
        
         } while (A != true);
                break;
        }              
        } while (B != 0);
        
        
//        do {            
//            
//       // Esta es la vista de administrador
//      System.out.println("___________________________\n"+"Menu del Admin\n1.Agregar Empleado \n2.Mostrar Todos los empleados \n3.Calcular Sueldo \n4.Aumentar Sueldo\n0.Salir"+"\n___________________________");
//       i = Leer.nextInt();
//
//   switch(i){
//   //case 1 Agregar empleado case 2 aumentar sueldo
//       
//       case 1:
//            do {
//           
//                System.out.println("Ingrese los datos \n");
//                Leer.nextLine();
//                System.out.println("Nombre: "); nomb[i] = Leer.nextLine();
//                System.out.println("Apellido: ");apelli[i] = Leer.nextLine();
//                System.out.println("Edad: "); edad[i] = Leer.nextInt();
//                System.out.println("ID del Empleado: "); IDEmpleado[i] = Leer.nextInt();
//                System.out.println("Sueldo: "); sueldo[i] = Leer.nextInt();  
//                ObEmpleado[i] = new Empleado(nomb[i],apelli[i],edad[i]);
//                ObAdmin[i] = new Administrativo(nomb[i],apelli[i],edad[i],IDEmpleado[i],sueldo[i]);
//                i++;
//
//                System.out.println("Desea Continuar agregando empleado: Si(1), No(2)");
//                int Conf = Leer.nextInt();
//                if (Conf == 1) {
//                    Comfir = false;
//                    
//                } else {
//                    
//                    Comfir = true;
//                  
//                }
//  
//        } while (Comfir != true);
//            
//            break;
//       case 2:
//   System.out.println("Datos de los Empleados: \n(Acontinuacion, solo vera Los datos permitidos para el publico)\n");
//   for (int j = 0; j <=10; j++) {
//            try {
//               ObAdmin[j].MostrarDatos();
//            } catch (Exception e) {
//            }
//        }
//   
//   break;
//   
//       case 3:
//           Administrativo ob = new Administrativo(" "," ",0,0,0);
//           ob.CalcularSueldo();
//           break;
//           
//       case 4:
//           System.out.println("Ingese el ID el empleado: ");
//           int c = Leer.nextInt();
//           for (int j = 0; j <= c; j++) {
//               if (sueldo[j] != c) {
//                   System.out.println("Por ingrese cual sera el sueldo actual del empleado: ");
//                   int s = Leer.nextInt();
//                   sueldo[c] = s;
//                   ObAdmin[c] = new Administrativo(nomb[c],apelli[c],edad[c],IDEmpleado[c],sueldo[c]);
//                   break;
//               } else {
//                   System.out.println("Tarea2_Ejer02.main()");
//               }
//               
//           }
//           break;
//       case 0:
//           A = true;
//   break;
//       default:
//           
//           break;
//   }
//        
//         } while (A != true);
//                System.out.println("Ingrese los datos: \n");
//                System.out.println("Nombre: ");
//                nomb = Leer.nextLine();
//                System.out.println("Apellido: ");
//                apelli = Leer.nextLine();
//                System.out.println("Edad: ");
//                edad = Leer.nextInt();
//              
////                System.out.println("ID del Empleado: "); IDEmpleado = Leer.nextLine();
////                System.out.println("Sueldo: "); sueldo = Leer.nextInt();  
//                    
//                ObEmpleado[i] = new Empleado(nomb,apelli,edad);
//                i++;
//
//                System.out.println("Desea Continuar agregando empleado: Si(1), No(2)");
//                int Conf = Leer.nextInt();
//                if (Conf == 1) {
//                    Comfir = false;
//                    
//                } else {
//                    Comfir = true;
//                   
//                }
//  
//        } while (Comfir != true);
//        for (int j = 0; j <=ObEmpleado.length; j++) {
//            try {
//                ObEmpleado[j].MostrarDatos();
//            } catch (Exception e) {
//            }
//        }
//     
        
    }
    
}
