/*

 */
public class Alumnos extends Persona{
    int IDAlumno;
    public Alumnos(){}
    
    public Alumnos(String nom, String ape, int ed,int IDAlumno) {
        super(nom, ape, ed);
        this.IDAlumno = IDAlumno;
        
    }
    ///Mostrar Datos de alumnos
    public void mostrarAlumnos(){  
        System.out.println("ID: " + this.IDAlumno + "\nNombre: " + this.nombre + "\nApellido: " + this.apellido + "\nEdad: " + this.edad + "\n__________________________\n");
    }
    
    
    
}
