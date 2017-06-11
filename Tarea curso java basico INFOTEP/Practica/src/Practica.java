import java.lang.Object;
import javax.swing.JOptionPane;
public class Practica {
    nb ob12 = new nb();
    String nomb;int edad;
    public Practica(){}
    //public Practica(String nom,int ed){this.nomb = nom; this.edad = ed;}
    public void Guardad(){
        
        nomb = nb.Nombre.getText();
        edad = Integer.parseInt(nb.Edad.getText());
        //no compilo jaja
    }
    public void mostrar(){
        JOptionPane.showMessageDialog(null,"Nombre: "+nomb +"\nEdad: "+edad);
    
    }
    public static void main(String[] args) {
//        ob12
//      
        nb ob123 = new nb();
        ob123.setBounds(650, 250, 400, 400);
   //     ob123.setLocationRelativeTo(ob123);
        ob123.setTitle("Primera ventana");
        ob123.setVisible(true);
    }
    
    
}
//Ni ideaa tengo jaja no estoy creando la ventana XDD