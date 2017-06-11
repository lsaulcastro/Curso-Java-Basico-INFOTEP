/*

 */
public class Asignatura {
    public String []AsigNom = new String[4]; public String[] GrupoAsig = new String[4];
    public int[] IDAsignatura = new int [4];
    public int[] Calificacion = new int [4];
    //Cada asginatura solo tendra dos examenes si el id es uno entonces los examenes seran 1,2 si el id de asignatura es 2 entonces seras 3,4 los examenes
    public String [] Exam = new String [2];
    
    public void DatosExam(){
    
    Exam [1] = "Sociales";
    Exam [2] = "Matematica";
    
    
    }
    public void MostrarExam(){
        for (int i = 1; i <=2; i++) {
            
        
        System.out.println("\nNombre: " + Exam[i] );
    
        }
    }
    public void DatosPreDefinidosAsignatura(){
    
     IDAsignatura[1] = 1;  AsigNom[1] = "Sociales"; GrupoAsig[1] = "SOC-01";
     IDAsignatura[2] = 2;  AsigNom[2] = "Matematica"; GrupoAsig[2] = "Mat-01";
     IDAsignatura[3] = 3;  AsigNom[3] = "Lenguaje"; GrupoAsig[3] = "Len-01";
     IDAsignatura[4] = 4;  AsigNom[4] = "Naturales"; GrupoAsig[4] = "Nat-01";
     
    
    }
    
    Asignatura(){}
}
