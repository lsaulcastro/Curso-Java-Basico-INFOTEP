import java.util.Scanner;
public class Administrador extends Empleado {
    Scanner Leer = new Scanner(System.in);
    //Esto es por los datos...
    int []sueldo = new int[10];
    String[] estado = new String[10];
    int i = 1;
    //Constructores
    public Administrador(){}
    public Administrador(String nom, String Ape, int Edad,int id,int sueldo,String estado) {
        super(nom, Ape, Edad,id,sueldo,estado);  
    }
    //Agregar empleado
    public void AgregarEmpleado(){
        
        String[] nomb= new String[10];
        String []apelli = new String[10];//;String[] estado = new String[10];
        int [] IDEmpleado = new int[10];
        int []edad = new int [10];
//        int []sueldo = new int[10];
//        int i = 1;
        boolean Comfir = false;
        
     do {
           
                System.out.println("_________________________\nIngrese los datos \n");
                
                Leer.nextLine();
                System.out.println("Nombre: "); nomb[i] = Leer.nextLine();
                System.out.println("Apellido: ");apelli[i] = Leer.nextLine();
                System.out.println("Edad: "); edad[i] = Leer.nextInt();
                System.out.println("ID del Empleado: "); IDEmpleado[i] = Leer.nextInt();Leer.nextLine(); 
                System.out.println("Estado: "); estado[i] = Leer.nextLine(); 
                System.out.println("Sueldo: "); sueldo[i] = Leer.nextInt(); 
                //System.out.println("Estado: "); estado[i] = Leer.nextLine(); 
                System.out.println("_________________________");
                _nombre[i] = nomb[i];
                _apellido[i] = apelli[i];
                _edad[i] = edad[i];
                ID[i] = IDEmpleado[i];
                Sueldo[i] = sueldo[i];
                Estado[i] = estado[i];
                
//                ObEmpleado[i] = new Empleado(nomb[i],apelli[i],edad[i]);
//                ObAdmin[i] = new Administrativo(nomb[i],apelli[i],edad[i],IDEmpleado[i],sueldo[i]);
                i++;

                System.out.println("Desea Continuar agregando empleado: Si(1), No(2)");
                int Conf = Leer.nextInt();
                if (Conf == 1) {
                    Comfir = false;
                    
                } else {
                    
                    Comfir = true;
                  
                }
  
        } while (Comfir != true);
            
    }
    //Aumentar Sueldo
    public void AumentarSueldo(){
        boolean A = false;
    System.out.println("Ingese el ID el empleado: ");
    
           int id = Leer.nextInt();
          for (int j = 1; j <= id; j++) {
            
        
               if (ID[j] == id) {
                   System.out.println("Por ingrese cual sera el sueldo actual del empleado: ");
                   int s =Leer.nextInt();
                   Sueldo[id] = s;
                   System.out.println("Sueldo,Actualizado... Exitosamente");
                   A = true;
                   break;
               }
          }
          
         if (A == false) {
            System.out.println("Error... ID no encontrado");
        }
        }

    //Despedir empleado
    public void DespedirEmpleado(){
    
     boolean A = false;
    System.out.println("Ingese el ID el empleado: ");
    
           int id = Leer.nextInt();
          for (int j = 1; j <= id; j++) {
            
        
               if ((ID[j] == id) ) {
                   System.out.println("Por ingrese cual sera el estado actual del empleado: ");
                   Leer.nextLine();
                   String s = Leer.nextLine();
                   Estado[id] = s;
                   System.out.println("Sueldo,Actualizado... Exitosamente");
                   A = true;
                   break;
               }
          }
          
         if (A == false) {
            System.out.println("Error... ID no encontrado");
        }
        }
    
    
               }
        
    

