
public class Persona {
    public String[] _nombre = new String[10], _apellido = new String[10];
    public int [] _edad = new int [10];
    
    //Controlador
    public Persona(){}
    public Persona(String nom,String Ape,int Edad){
        
        for (int i = 0; i < 10; i++) {

    this._nombre[i] = nom;
    this._apellido[i] = Ape;
    this._edad[i] = Edad;
        }
    }
    //Mostrar datos
    public void MostrarDatos(){
        for (int i = 0; i < 10; i++) 
        if (_nombre[i] != null) {

            System.out.println("__________________________\n"+"Nombre: " + _nombre[i] + "\nApellido: " + _apellido[i] + "\nEdad:"+ _edad[i]+ "\n__________________________ ");
        }}
     //System.out.println("__________________________\n"+"Nombre: " + _nombre + "\nApellido: " + _apellido + "\nEdad:"+ _edad+ "\n__________________________ ");
    
}
