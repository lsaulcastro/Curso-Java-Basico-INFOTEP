import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Calculadora extends JFrame{
JTextField T1 = new JTextField();
String N1 , N2; double Resultado = 0;
String Op;
JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24;

    public Calculadora(){
                setSize(338,545);
                setTitle("2016-3561");
                setBackground(Color.white);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLocationRelativeTo(null);
               // setResizable(false);
               
                Container Contenedor = getContentPane();
                
                
                //Panel
                JPanel PanelA = new JPanel();
                GridLayout GL = new GridLayout(6,4);
               PanelA.setLayout(new BoxLayout(PanelA,BoxLayout.Y_AXIS));
                PanelA.setBackground(Color.white);
                
                Font fon = new Font("Calibri", 1, 48);//Esto es para cambiar el texto que s eingreza al text field
                T1.setFont(fon);
                JLabel L1 = new JLabel("Estandar");
                L1.setFont(new Font("Time New Roman", 1, 18));PanelA.add(L1,BorderLayout.NORTH);
                T1.setPreferredSize( new Dimension( 330,180 ) );PanelA.add(T1);//Esto es para cambiarle el tamano al Texfield
                T1.setHorizontalAlignment(JTextField.RIGHT);//Esto es para que empiece a escribir desde la derecha
                 JPanel b = new JPanel();
                 
                 //Prueba
//             b.setBackground(Color.yellow);
//             JButton a = new JButton();
//             b.add(a);
//             PanelA.add(b,BorderLayout.SOUTH);
               Contenedor.add(PanelA,BorderLayout.NORTH);
                //Panel b
               
                JPanel PanelB = new JPanel();
                PanelB.setBackground(Color.LIGHT_GRAY);
                PanelB.setLayout(GL);
                B1 = new JButton("%");B2 = new JButton("√");B3 = new JButton("x²");B4 = new JButton("1/x");B5 = new JButton("CE");B6 = new JButton("C");B7 = new JButton("«");B8 = new JButton("÷");
                B9 = new JButton("1");B10 = new JButton("2");B11 = new JButton("3");B12 = new JButton("×");B13 = new JButton("4");B14 = new JButton("5");B15 = new JButton("6");B16 = new JButton("-");
                B17 = new JButton("7");B18 = new JButton("8");B19 = new JButton("9");B20 = new JButton("+");B21 = new JButton("±");B22 = new JButton("0");B23 = new JButton(".");B24 = new JButton("=");
                B1.setBackground(Color.white);B2.setBackground(Color.white);B3.setBackground(Color.white);B4.setBackground(Color.white);B5.setBackground(Color.LIGHT_GRAY);B6.setBackground(Color.LIGHT_GRAY);B7.setBackground(Color.LIGHT_GRAY);B8.setBackground(Color.LIGHT_GRAY);
                B9.setBackground(Color.LIGHT_GRAY);B10.setBackground(Color.LIGHT_GRAY);B11.setBackground(Color.LIGHT_GRAY);B12.setBackground(Color.LIGHT_GRAY);B13.setBackground(Color.LIGHT_GRAY);B14.setBackground(Color.LIGHT_GRAY);B15.setBackground(Color.LIGHT_GRAY);B16.setBackground(Color.LIGHT_GRAY);
                B17.setBackground(Color.LIGHT_GRAY);B18.setBackground(Color.LIGHT_GRAY);B19.setBackground(Color.LIGHT_GRAY);B20.setBackground(Color.LIGHT_GRAY);B21.setBackground(Color.LIGHT_GRAY);B22.setBackground(Color.LIGHT_GRAY);B23.setBackground(Color.LIGHT_GRAY);B24.setBackground(Color.LIGHT_GRAY);
                PanelB.add(B1);PanelB.add(B2);PanelB.add(B3);PanelB.add(B4);PanelB.add(B5);PanelB.add(B6);PanelB.add(B7);PanelB.add(B8);PanelB.add(B9);PanelB.add(B10);PanelB.add(B11);PanelB.add(B12);PanelB.add(B13);PanelB.add(B14);
                PanelB.add(B15);PanelB.add(B16);PanelB.add(B17);PanelB.add(B18);PanelB.add(B19);PanelB.add(B20);PanelB.add(B21);PanelB.add(B22);PanelB.add(B23);PanelB.add(B24);
                B1.setBorder(null);B2.setBorder(null);B3.setBorder(null);B4.setBorder(null);B5.setBorder(null);B6.setBorder(null);B7.setBorder(null);B8.setBorder(null);
                B9.setBorder(null);B10.setBorder(null);B11.setBorder(null);B12.setBorder(null);B13.setBorder(null);B14.setBorder(null);B15.setBorder(null);B16.setBorder(null);
                 B17.setBorder(null);B18.setBorder(null);B19.setBorder(null);B20.setBorder(null);B21.setBorder(null);B22.setBorder(null);B23.setBorder(null);B24.setBorder(null);
                 B9.addActionListener( new b1());
                 B24.addActionListener(new b2());
                 B20.addActionListener(new b20()); 
             Contenedor.add(PanelB);
             
            
        }
        public class b1 implements ActionListener {
        
      @Override
       public void actionPerformed(ActionEvent e){
           T1.setText(T1.getText() + "1");
      
       }
       
        }
        public class b20 implements ActionListener {
        
      @Override
       public void actionPerformed(ActionEvent e){
           if(!T1.getText().equals("")){
           
           N1 = T1.getText();
           Op = "+";
           T1.setText("");
           System.out.println(N1);
           }else{
           
           
           }
      
       }
            

        
        }
        public class b2 implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            if (Op.equals("+")) {
                N2 = T1.getText();
                 
                Resultado = Double.parseDouble(N1) + Double.parseDouble(N2);
                String r = String.valueOf(Resultado);
                
               T1.setText(r);
            }
         
        }
            
        
        
        }
  
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora Ob = new Calculadora();
        Ob.setVisible(true);
      
    }
    
}
