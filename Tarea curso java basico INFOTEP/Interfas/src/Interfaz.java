
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import javax.swing.event.*;


public class Interfaz extends  JFrame{
    
    
    JTextField  T1,T2;//Asi se crean los TextFuel son para escribir del lado del cliente
    JButton  B1,B2;//Botones
    JPanel PanelA;
    
    public Interfaz(){
     
         setBounds (650, 250, 400, 400);//Posicion y tamano de la ventana
         setVisible(true);//Esto es para mostrar la ventana
         PanelA = new JPanel();//Esto es el panel
         PanelA.setBackground(Color.gray);//Le asignamos color al panel
         setContentPane(PanelA);//Colocamos el panel dentro de la ventana
         PanelA.setLayout(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que cierre cuando cierre el form
         setTitle("Practica Visual");
         Container pa = getContentPane();
         
         T1 = new JTextField();
         T1.setBounds(30,25, 90, 25);
         add(T1);//Agregamos el texfiel al panel
         T2 = new JTextField();
         T2.setBounds(30,60, 90, 25);
         PanelA.add(T2);
         B1 = new JButton("Guardar");
         B1.setBounds(130, 25, 90, 25);
         add(B1);
         B2 = new JButton("Salir");
         B2.setBounds(130, 60, 90, 25);
         add(B2);
    
    }
    
        public static void main (String args[]){
           Interfaz V = new Interfaz();
                
        
        
        }
    
}
