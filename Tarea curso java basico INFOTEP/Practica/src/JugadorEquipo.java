import java.lang.Object;

public class JugadorEquipo extends Persona{
  
        EquipoDeFutbol ob = new EquipoDeFutbol();
        String nombreEqui = ob.gettNombreEquipo();
    
    
    public JugadorEquipo(String nom, String ape, int ed) {
        super(nom, ape, ed);
       
        
    }
    //metodo to string

    
    @Override
    public String toString(){
        
    String MostrarMensaje = "El nombre: " + nombre + "\nApellido: "+ apellido + "\nEdad: " + edad + "\nNombre de equipo: " + nombreEqui  ;
    
    return MostrarMensaje;
    }
    
}
