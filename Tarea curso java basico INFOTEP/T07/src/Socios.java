
public class Socios {
    public static String[] nombre = new String [10];
    public static int [] numero  = new int[10];
    public static int  proxnumero = 0;
    Socios(){}
    //Metodos
   
    //Sets
   public static void setnombre(String nom){ Socios.proxnumero ++; Socios.nombre[Socios.proxnumero] = nom;}
   public static void setnumero(int num){ Socios.numero[proxnumero] = num;}
   //Gets
   public static String getnombre(){return nombre[proxnumero];}
   public static int getnumero(){return numero[proxnumero];}
}
