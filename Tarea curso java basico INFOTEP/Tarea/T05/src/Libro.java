
public  class Libro {
  
  
  // Variables
  public static String TituloL; public static boolean Original , Prestable;
  //Constructor
     Libro(){}
   Libro(String A , boolean B, boolean C){Libro.TituloL = A;Libro.Original = B;Libro.Prestable = C;}
   
    
  
  //Metodos
  //sets
  public void setTitulo(String Titu){Libro.TituloL = Titu;}
  public void setOriginal(boolean Ori){Libro.Original =Ori;}
  public void setPrestable(boolean prestable){Libro.Prestable = prestable;}
  //Gets
  public String getTitulo(){return Libro.TituloL;}
  public boolean getOriginal(){return Libro.Original;}
  public boolean getPrestable(){return Libro.Prestable;}
  
}
