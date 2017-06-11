
public class Empleado {
    
    //Creamos las variable o atributos que usaran en todo el programa
  public String nombre,apellido;
  public int edad;
   //Creamos el constructor
  public Empleado(String nom,String ape, int ed){
        this.nombre = nom;
        this.apellido = ape;
        this.edad = ed;
  
  }

  //Creamos los metodos
  public void MostrarDatos(){
//      System.out.println("Datos de los Empleados: \n(Acontinuacion, solo vera Los datos permitidos para el publico)\n");
      System.out.println("__________________________\n"+"Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad:"+ edad+ "\n__________________________ ");
  
  }
}
