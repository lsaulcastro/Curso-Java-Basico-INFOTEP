import java.awt.Container;
import java.awt.*;
import javax.swing.*;
 public class CalculadoraJava extends JFrame {
    // Constructor
   // JPanel PanelA,PanelB,PanelC;
     public CalculadoraJava(){
         super("2016-3561");
        setSize(230, 250);
         setResizable(false);//Desabbilitar el boton maximixar
         setLocationRelativeTo(null);
         //setUndecorated(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Container Contenedor = getContentPane();
         Contenedor.setBackground(Color.gray);
         
        
        //Panel de numeros 
        JPanel PanelA = new JPanel();
        GridLayout gl = new GridLayout(3, 3,3,4);
        PanelA.setLayout(gl);
         for (int i = 1; i <= 9; i++) {
             PanelA.add(new JButton(String.valueOf(i)));//En esta parte convertimos a String 
         }
         // Contenedor.add(PanelA,BorderLayout.WEST);
 
         //Panel Operadores
         JPanel PanelB = new JPanel();
         
        
         PanelB.setLayout(new GridLayout(3,1,3,4));
         JButton B1,B2,B3,B4,B5;
         B1 = new JButton("+");PanelB.add(B1);
         B2 = new JButton("-");PanelB.add(B2);
         B3 = new JButton("*");PanelB.add(B3);
        // B4 = new JButton("/");PanelB.add(B4);
         
         //boton calcular
           
           B4 = new JButton("Calcular");B4.setLayout(new FlowLayout());Contenedor.add(B4,BorderLayout.SOUTH);
            B5 = new JButton("+");B5.setLayout(new FlowLayout());Contenedor.add(B5);
         //  B5 = new JButton("/");PanelC.add(B5);
         
         //
         JPanel Panelc = new JPanel();
         Panelc.setLayout(new BoxLayout(Panelc, BoxLayout.Y_AXIS));
         JTextField T1,T2;
         JLabel L1,L2;
         L1 = new JLabel("Operacion: ");T1 = new JTextField(10);
         L2 = new JLabel("Resultado: ");T2 = new JTextField(10);
         Panelc.add(L1);Panelc.add(T1);
         Panelc.add(L2);Panelc.add(T2);

         Contenedor.add(PanelB, BorderLayout.EAST);         
          Contenedor.add(PanelA,BorderLayout.WEST);Contenedor.add(Panelc,BorderLayout.NORTH);
     }
     
     
    
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadoraJava ob = new CalculadoraJava();
        ob.setVisible(true);
        
    }
    
}
