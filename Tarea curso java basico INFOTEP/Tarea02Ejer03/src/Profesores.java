/*

 */
public class Profesores extends Persona{
    public int [] IDProfesores = new int [2];
    
    
    //Datos Predefinidos de profesores
    public void DatosProfesoresPredefinidos(){
        IDProfesores[1] = 1; this.nombre = "Saul"; this.apellido = "Castro"; this.edad = 19; 
         IDProfesores[2] = 2; this.nombre = "Desconocido"; this.apellido = "Desconocido"; this.edad = 0; 
   
    }
    public Profesores(){}
    public Profesores(String nom, String ape, int ed) {
        super(nom, ape, ed);
    }
    
    
}
