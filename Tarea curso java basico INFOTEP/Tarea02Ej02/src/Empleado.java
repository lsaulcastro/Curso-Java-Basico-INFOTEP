
public class Empleado extends Persona{
    //Creamos los atributos propios de la clase empleado
      int[] ID = new int [10];
      int[] Sueldo = new int [10];
      String[] Estado = new String [10];
   
    //Constructores
    public Empleado(){}
    public Empleado(String nom, String Ape, int Edad,int id,int sueldo,String estado) {
        super(nom, Ape, Edad);
        for (int i = 0; i < 10; i++) {
            
        
        this.ID[i] = id;
        this.Sueldo[i] = sueldo;  }  
    }
    //Metodos
    //Metodo Para mostrar datos 
    public void MostradDatos(){
        
        for (int i = 0; i < 10; i++) {
            
            if (_nombre[i] != null) {
                System.out.println("__________________________\n"+"ID: "+ ID[i] +"\nNombre: " + _nombre[i] + "\nApellido: " + _apellido[i] + "\nEstado: "+ Estado[i] + "\nEdad:"+ _edad[i] +"\nSueldo: " + Sueldo[i] +"\n__________________________ ");
            } 
   // System.out.println("__________________________\n"+"ID: "+ ID[i] +"\nNombre: " + _nombre[i] + "\nApellido: " + _apellido[i] + "\nEstado: "+ Estado[i] + "\nEdad:"+ _edad[i] +"\nSueldo: " + Sueldo[i] +"\n__________________________ ");
        }
    }
    //Metodos de los atributos privados
//    public int setID(int id){
//        for (int i = 0; i < 10; i++) {
//            
//        
//        this.ID[i] = id;
//    }
//        return id;}
//    public void getID(int id){
//        for (int i = 0; i < 10; i++) {
//            
//        
//        this.ID[i] = id;
//    }
//       }
//    public int setSueldo(int su){
//         for (int i = 0; i < 10; i++) {
//            
//        
//        this.Sueldo[i] = su;
//    }
//        
//        return su;}
//    public void getSueldo(int sueldo){
//         for (int i = 0; i < 10; i++) {
//            
//        
//        this.Sueldo[i] = sueldo;
//    }
//       }
//    public String setEstado(String es){ 
//         for (int i = 0; i < 10; i++) {
//            
//        
//        this.Estado[i] = es;
//    }
//        
//        return es;}
//    public void getEstado(String estado){
//         for (int i = 0; i < 10; i++) {h
//            
//        
//        this.Estado[i] = estado;
//    }
//       }
    //Calcular Sueldo sueldo*Hora
    public int CalcularSueldo(int sueldo,int hora){return sueldo * hora;}
}
