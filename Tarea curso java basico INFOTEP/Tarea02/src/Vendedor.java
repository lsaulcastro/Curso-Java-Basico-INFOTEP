import java.util.Scanner;
public class Vendedor extends Empleado{
        
    private  String IDvendedor;
    int Sueldo = 300;
    public int hr;
    private int hrTotal;
    
   Vendedor(String nom, String ape, String es, int ed) {
        super(nom, ape, es, ed);
        IDvendedor = " ";
    }
    //Metodo para modificar
    public void setIDvendedor(String IDVende){
    this.IDvendedor = IDVende;
    }
    //metodo para obtener
    public String getIDvendedor(){
    return IDvendedor;
    }
    //Metodo para calcular sueldo
    public void CalcularSueldo(){
        Scanner Leer = new Scanner(System.in);
        int c;
   // double SueldoC = Sueldo * hr;
        System.out.println("Por favor ingrese las horas trabajadas: ");
        hr = Leer.nextInt();
       // Scanner Leer = new Scanner(System.in);
        double SueldoC = Sueldo * hr;
        System.out.println("Su sueldo Correspondiente a las horas trabajadas es: "+SueldoC + "\n___________________________________");
        hrTotal = hrTotal + hr;// Esta variable sera utilizada en un futuro para calcular algun porciento etc..
    }
    //Metodo para mostrar Datos
    public void MostrarDatosVende(){
    System.out.println("Datos de los empleados: \n");
    System.out.println("IDVendedor: " + getIDvendedor() + "\nNombre: " +  nombre + " \n" + "Apellido: " +  apellido + " \n" + "Edad: " + edad+ "\nEstado: " + estado + "\nSueldo: "+Sueldo);
    System.out.println("___________________________________");

    }
    
}
