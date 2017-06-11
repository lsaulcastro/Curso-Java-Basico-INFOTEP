
package visual;

import java.awt.Color;
import javax.swing.JOptionPane;




public class Visual {
public String Nombre;int edad;

Visual(){}

void Guardar(){

   Nombre = Datos.Nomre.getText();
   edad = Integer.parseInt(Datos.Edad.getText());

}
void mostrar() {
    JOptionPane.showMessageDialog(null,"Nombre: "+Nombre +"\nEdad: "+edad);

}
    
    public static void main(String[] args) {
         Datos ob = new Datos();
         ob.setTitle("Mi Primer Form");
         ob.setVisible(true);
         ob.setLocationRelativeTo(null);
         ob.setBackground(Color.gray);
    }
    
}
