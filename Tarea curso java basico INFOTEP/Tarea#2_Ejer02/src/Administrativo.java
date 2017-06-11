import java.util.Scanner;
public class Administrativo extends Empleado{
    Scanner Leer = new Scanner(System.in);
     int IDEmpleado;
    int SueldoEm;
    
    //Controlador
    public Administrativo(String nom, String ape, int ed,int IDem,int sueldo) {
        super(nom, ape, ed);
        this.IDEmpleado = IDem;
        this.SueldoEm = sueldo;
    }

    
    @Override
    public void MostrarDatos(){
    System.out.println("ID Empleado:  "+IDEmpleado +"\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad:"+ edad + "\nSueldo: " + SueldoEm +"\n__________________________ ");
    }
   
    public void CalcularSueldo(){
        int s;
        System.out.println("Ingrese el sueldo a calcular");
        s = Leer.nextInt();
        System.out.println("Ingrese Las horas trabajadas");
        int h = Leer.nextInt();
        s = s * h;
        System.out.println("El sueldo a pagar es de : " + s);
        
        
    }
    //Para modificar el admin
    public void setIdempleado(int IDempleado){
    this.IDEmpleado = IDempleado;
    }
    //Retorna el id
    public int getidAdmin(){
    return IDEmpleado;
    }  
    public void setSueldo(int sueldo){
    this.SueldoEm = sueldo;
    
    }
    public int getsueldo(){return SueldoEm;}
    
//    public void AgregarEmpleado(){
//        boolean Comfir = false;
//        int b = 0;
//        String nomb,apelli,eda,IDEmpleado;
//        int edad,sueldo;
//        
//        do {
//         
//               
//                System.out.println("Ingrese los datos: \n");
//                Leer.nextLine();
//                System.out.println("Nombre: "); nomb = Leer.nextLine();
//                System.out.println("Apellido: "); apelli = Leer.nextLine();
//                System.out.println("Edad: "); edad = Leer.nextInt();
//                Leer.nextInt();
//                System.out.println("ID del Empleado "); IDEmpleado = Leer.nextLine();
//                System.out.println("Sueldo: "); sueldo = Leer.nextInt();
//                this.nombre = nomb;
//                this.apellido = apelli;
//                this.edad = edad;
//                //Controlador de empleado
//                //Administrativo(this.nombre,this.apellido,this.edad);
//               
//                System.out.println("Desea Continuar agregando empleado: Si(1), No(2)");
//                int Conf = Leer.nextInt();
//                if (Conf == 1) {
//                    Comfir = false;
//                    
//                } else {
//                    Comfir = true;
//                    break;
//                }
//                
//                             
//            
//            
//            
//        } while (Comfir != true);
//        
//    
//    
    
    

   

   
    

}