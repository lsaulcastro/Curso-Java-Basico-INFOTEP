import java.util.Scanner;
public class Tarea02Ej02 {

    /**
    Implementar una jerarquía Empleado de cualquier tipo de empresa que le sea familiar. La

    jerarquía debe tener al menos tres niveles, con herencia de miembros dato y métodos. Los

    métodos deben poder calcular salarios, despidos, promociones, altas, jubilaciones, etc. Los

    métodos deben permitir también calcular aumentos salariales y primas para empleados de

    acuerdo con su categoría y productividad. La jerarquía de herencia debe poder ser

    utilizada para proporcionar diferentes tipos de acceso a empleados. Por ejemplo, el tipo

    de acceso garantizado al público diferirá del tipo de acceso proporcionado a un supervisor

    de empleado, al departamento de nóminas o al Ministerio de Hacienda.
     */
    public static void main(String[] args) {
        Administrador ObAdm = new Administrador();
        int A = 0;
        int c = 0;
        boolean y = false;
        boolean X = false;
        Scanner Leer = new Scanner(System.in);
       do{
        System.out.println("        *Menu Principal*        \n1.Administrador \n2.Visitantes \n3.Empleado \n0.Salir \n  *Por faovor,Identifiquese: ");
        try {
            A = Leer.nextInt();
        } catch (Exception e) {
            System.out.println("Error...Solo se adminte datos numericos: "+e);
        }
           
        switch(A){
            case 1:
                int b = 0;
                int code = 0;
               
                do{
                System.out.println("    *Por favor Ingrese el siguiente codigo para entrar como admin\n\n           *Codiigo: ");
                try {
                     code = Leer.nextInt();
                } catch (Exception e) {
                    System.out.println("Error...Solo se adminte datos numericos: "+e);
                }
                     }while(code != 1234);
                   do{
                if (code == 1234) {
                    
                    System.out.println("        *Menu del Admin*        \n1.Agregar Empleado \n2.Calcular Sueldo \n3.Aumentar Sueldo \n4.Despedir \n5.Mostrar Empleado \n0.Salir \n  *Por faovor,ingrese la opcion deseada: ");
                    try {
                        b = Leer.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error...Solo se adminte datos numericos: "+e);
                    }
                    switch(b){
                        case 1:
                            System.out.println("        Registrar Usuario       \n ");
                            ObAdm.AgregarEmpleado();
                            System.out.println("||Para Salir precione 0 || \n||Volver al menu precione un numero: ||");
                             b = Leer.nextInt();
                             if(b == 0){
                                 X = true;
                             }else{
                             X = false;
                             }   
                             
                             
                             break;
            case 2:
                boolean p = false;
                do {                    
                    int sl=0,hr=0;
                    System.out.println("*   Por favor ingrese el sueldo: \n NOTA: (SUELDO X HORAS) ");
                    try{
                    sl = Leer.nextInt();
                    }catch(Exception e){
                    System.out.println("Error...Solo se adminte datos numericos: "+e);
                    }
                    System.out.println("*   Por favor ingrese las horas trabajadas: ");
                    try{
                    hr = Leer.nextInt();
                    }catch(Exception e){
                    System.out.println("Error...Solo se adminte datos numericos: "+e);
                    }
                     sl =  ObAdm.CalcularSueldo(sl, hr);
                    System.out.println("El sueldo correspondiente a pagar es: "+ sl);
                     System.out.println("||Para Salir precione 0 || \n||Volver a intentar 1 Volver al menu Cualquier numero mayor que 1 ||");
                     
                     
                             b = Leer.nextInt();
                             if(b == 0){
                                 p = true; 
                                 X = true;
                             }else{
                                
                        
                             }
                                                     
                } while (p == false );
                
               break;
                
            case 3:
               p = false;
                do {                    
                    System.out.println("    *Aumentar Sueldo    \n");
                    ObAdm.AumentarSueldo();
                     ObAdm.MostradDatos();
                    System.out.println("||Para Salir precione 0 || \n||Volver a intentar cualquier numero ||");
                   
                             b = Leer.nextInt();
                             if(b == 0){
                                 p = true; 
                                 X = true;
                             }else{
                            
                             }            
                } while (p == false);
                break;
                    case 4:
                p = false;
                do {                    
                    System.out.println("    *Despedir empleados    \n");
                    ObAdm.DespedirEmpleado();
                    System.out.println("||Para Salir precione 0 || \n||Volver a intentar cualquier numero ||");
                             b = Leer.nextInt();
                             if(b == 0){
                                 p = true; 
                                 X = true;
                             }else{
                           
                             }            
                } while (p == false);
                break;
            case 5:
               p = false;
                do {                    
                    System.out.println("    *Mostrar empleados    \n");
                    ObAdm.MostradDatos();
                    System.out.println("||Para Salir precione 0 || \n||Volver a intentar cualquier numero ||");
                             b = Leer.nextInt();
                             if(b == 0){
                                 p = true; 
                                 X = true;
                             }else{
                             X = false;
                             }            
                } while (p == false);
                break;
                    
            case 0:
               X = true;
                break;
                    }
                    
                    
                } else {
                }
                }while( X != true);
             break;
            case 2:
                System.out.println("Datos de los Empleados: \n(Acontinuacion, solo vera Los datos permitidos para el publico)\n");
                ObAdm.MostradDatos();
                 System.out.println("||Para Salir precione 0 || \n||Volver al menu cualquier numero ||");
                             b = Leer.nextInt();
                             if(b == 0){
                                y = true;
                             }else{
                          
                             }        
                break;
            case 3:
                b =0;
                 System.out.println("        *Menu del Empleado*        \n1.Calcular Sueldo  \n  *Por faovor,ingrese la opcion deseada: ");
                    try {
                        b = Leer.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error...Solo se adminte datos numericos: "+e);
                    }
                    switch(b){
                    
                        case 1:
                             boolean p = false;
                do {                    
                    int sl=0,hr=0;
                    System.out.println("*   Por favor ingrese el sueldo: ");
                    try{
                    sl = Leer.nextInt();
                    }catch(Exception e){
                    System.out.println("Error...Solo se adminte datos numericos: "+e);
                    }
                    System.out.println("*   Por favor ingrese las horas trabajadas: ");
                    try{
                    hr = Leer.nextInt();
                    }catch(Exception e){
                    System.out.println("Error...Solo se adminte datos numericos: "+e);
                    }
                  sl =  ObAdm.CalcularSueldo(sl, hr);
                    System.out.println("El sueldo correspondiente a pagar es: "+ sl);
                     System.out.println("||Para Salir precione 0 || \n||Volver a intentar 1 Volver al menu Cualquier numero mayor que 1 ||");
                     
                     
                             b = Leer.nextInt();
                             if(b == 0){
                                 p = true; 
                                 y = true;
                             }else{
                                
                        
                             }
                                                     
                } while (p == false );
                            break;
                    
                    }
               break;
//            case 4:
//                boolean p = false;
//                do {                    
//                    System.out.println("    *Despedir empleados    \n");
//                    ObAdm.DespedirEmpleado();
//                    System.out.println("||Para Salir precione 0 || \n||Volver a intentar cualquier numero ||");
//                             b = Leer.nextInt();
//                             if(b == 0){
//                                 p = true; 
//                                 X = true;
//                             }else{
//                             X = false;
//                             }            
//                } while (p == false);
//                break;
//            case 5:
//               p = false;
//                do {                    
//                    System.out.println("    *Mostrar empleados    \n");
//                    ObAdm.MostradDatos();
//                    System.out.println("||Para Salir precione 0 || \n||Volver a intentar cualquier numero ||");
//                             b = Leer.nextInt();
//                             if(b == 0){
//                                 p = true; 
//                                 X = true;
//                             }else{
//                             X = false;
//                             }            
//                } while (p == false);
//                break;
                  
//                break;
//            case 2:
//                boolean p = false;
//                do {                    
//                    int sl=0,hr=0;
//                    System.out.println("*   Por favor ingrese el sueldo: ");
//                    try{
//                    sl = Leer.nextInt();
//                    }catch(Exception e){
//                    System.out.println("Error...Solo se adminte datos numericos: "+e);
//                    }
//                    System.out.println("*   Por favor ingrese las horas trabajadas: ");
//                    try{
//                    hr = Leer.nextInt();
//                    }catch(Exception e){
//                    System.out.println("Error...Solo se adminte datos numericos: "+e);
//                    }
//                  sl =  ObAdm.CalcularSueldo(sl, hr);
//                    System.out.println("El sueldo correspondiente a pagar es: "+ sl);
//                     System.out.println("||Para Salir precione 0 || \n||Volver a intentar cualquier numero ||");
//                             b = Leer.nextInt();
//                             if(b == 0){
//                                 p = true;     
//                             }                            
//                } while (p == false );
//                
//               break;
//                
//            case 3:
//                do {                    
//                    System.out.println("    *Aumentar Sueldo    \n");
//                    ObAdm.AumentarSueldo();
//                    System.out.println("||Para Salir precione 0 || \n||Volver a intentar cualquier numero ||");
//                             b = Leer.nextInt();
//                             if(b == 0){
//                                 X = true;     
//                             }             
//                } while (X != false);
//                break;
        }
       }while(y != true);
           
        }

    }
    

