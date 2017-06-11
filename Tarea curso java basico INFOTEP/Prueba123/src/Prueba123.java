import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class Prueba123 implements ChangeListener{
    JFrame Ventana = new JFrame();
       @Override
    public void stateChanged(ChangeEvent ce) {
       
    }
    public  Prueba123(){
    
    Ventana.setSize(300,300);
    Ventana.setResizable(false);
    Ventana.setLocationRelativeTo(null);
    Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    
    public static void main(String[] args) {
      Prueba123 ob = new Prueba123();
      ob.Ventana.setVisible(true);
      
      
    }

        
}
