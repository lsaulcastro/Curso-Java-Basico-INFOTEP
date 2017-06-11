

public class TareaJava1 {

 
    public static void main(String[] args) {
        //String nom, String apelli, String docu, int edad, boolean ECivil
        Personas PersObj = new Personas("Saul","Castro","Ninguno",19,false);
        PersObj.MostrarDatos();
        Personas PersObj1 = new Personas("Kelvin","Pimentel","Ninguno",19,true);
        PersObj1.MostrarDatos();
        Personas PersObj2 = new Personas("Albania","Espinal","Ninguno",19,true);
        PersObj2.MostrarDatos();
        Personas PersObj3 = new Personas("Luis","Santana","Ninguno",19,false);
        PersObj3.MostrarDatos();
        Personas PersObj4 = new Personas("Sergio","Joel","Ninguno",19,false);
        PersObj4.MostrarDatos();
                
    }
    
}
