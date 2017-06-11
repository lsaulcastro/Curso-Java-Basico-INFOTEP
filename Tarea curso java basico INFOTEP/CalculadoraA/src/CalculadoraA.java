
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraA extends JFrame{
    String N1,N2,Op;
    double resultado;
    JTextField T1,T2,T3;
    JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19;
    public CalculadoraA(){
        setSize(300,440);
        setResizable(false);
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container Contenedor = getContentPane();
        
       
        // Panel A
        JPanel PanelA = new JPanel();
        PanelA.setLayout(new BoxLayout(PanelA, BoxLayout.Y_AXIS));
        PanelA.setBackground(Color.white);
        JLabel A = new JLabel("Operacion");PanelA.add(A);
        T1 = new JTextField();T1.setPreferredSize(new Dimension(50,50));PanelA.add(T1);
        JLabel B = new JLabel("Resultado");PanelA.add(B);
       
        T2 = new JTextField();T2.setPreferredSize(new Dimension(50,50));PanelA.add(T2); T2.setEditable(false);
        
        Contenedor.add(PanelA,BorderLayout.NORTH);
        
        //Panel B
        JPanel PanelB = new JPanel();
        GridLayout Grid = new GridLayout(3,3);
        PanelB.setPreferredSize(new Dimension(60,200));
        PanelB.setLayout(Grid);
        B15 = new JButton("Calcular");Contenedor.add(B15,BorderLayout.SOUTH);
        B1 = new JButton("1");B2 = new JButton("2");B3 = new JButton("3");B4 = new JButton("4");B5 = new JButton("5");B6 = new JButton("6");B7 = new JButton("7");B8 = new JButton("8");B9 = new JButton("9");
        PanelB.add(B1);PanelB.add(B2);PanelB.add(B3);PanelB.add(B4);PanelB.add(B5);PanelB.add(B6);PanelB.add(B7);PanelB.add(B8);PanelB.add(B9);
        B1.setBorder(null);B2.setBorder(null);B3.setBorder(null);B4.setBorder(null);B5.setBorder(null);B6.setBorder(null);B7.setBorder(null);B8.setBorder(null);B9.setBorder(null);
        B1.addActionListener(new b1());B2.addActionListener(new b2());B3.addActionListener(new b3());B4.addActionListener(new b4());B5.addActionListener(new b5());B6.addActionListener(new b6());B7.addActionListener(new b7());B8.addActionListener(new b8());B9.addActionListener(new b9());
        PanelB.setBackground(Color.white);
        
               
        Contenedor.add(PanelB,BorderLayout.SOUTH);
        //Panel C
        JPanel PanelC = new JPanel();
        GridLayout Gri = new GridLayout(2,3);
        PanelC.setLayout(Gri);
        PanelC.setBackground(Color.white);
 
        B11 = new JButton("+");B12 = new JButton("x");B13 = new JButton("÷");B14 = new JButton("-");B15 = new JButton("CE");B16 = new JButton("x²");B17 = new JButton("=");B18 = new JButton("4");
        PanelC.add(B11);PanelC.add(B12);PanelC.add(B13);PanelC.add(B14);PanelC.add(B15);PanelC.add(B16);Contenedor.add(B17,BorderLayout.LINE_END);
        B11.setBorder(null);B12.setBorder(null);B13.setBorder(null);B14.setBorder(null);B15.setBorder(null);B16.setBorder(null);
        B11.addActionListener(new suma());B12.addActionListener(new Multi());B13.addActionListener(new Division());B14.addActionListener(new resta());B17.addActionListener(new resul());
        B15.addActionListener(new borrar());B16.addActionListener(new cuadrado());
        Contenedor.add(PanelC);
   
        
    }  
    //Eventos numeros
     public class b1 implements ActionListener {
        
      @Override
       public void actionPerformed(ActionEvent e){
           T1.setText(T1.getText() + "1");
      
       }
       
        }
     public class b2 implements ActionListener {
        
      @Override
       public void actionPerformed(ActionEvent e){
           T1.setText(T1.getText() + "2");
      
       }
       
        }
     public class b3 implements ActionListener {
        
      @Override
       public void actionPerformed(ActionEvent e){
           T1.setText(T1.getText() + "3");
      
       }
       
        }
     public class b4 implements ActionListener {
        
      @Override
       public void actionPerformed(ActionEvent e){
           T1.setText(T1.getText() + "4");
      
       }
       
        }
      public class b5 implements ActionListener {
        
      @Override
       public void actionPerformed(ActionEvent e){
           T1.setText(T1.getText() + "5");
      
       }
       
        }
      public class b6 implements ActionListener {
        
      @Override
       public void actionPerformed(ActionEvent e){
           T1.setText(T1.getText() + "6");
      
       }
       
        }
      public class b7 implements ActionListener {
        
      @Override
       public void actionPerformed(ActionEvent e){
           T1.setText(T1.getText() + "7");
      
       }
       
        }
      public class b8 implements ActionListener {
        
      @Override
       public void actionPerformed(ActionEvent e){
           T1.setText(T1.getText() + "8");
      
       }
       
        }
      public class b9 implements ActionListener {
        
      @Override
       public void actionPerformed(ActionEvent e){
           T1.setText(T1.getText() + "9");
      
       }
       
        }
      // Eventos Operaciones
        public class suma implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (!T1.getText().equals("")) {
                N1 = T1.getText();
                Op = "+";
                T1.setText("");
            }
            
        }
        
        
        
        }
        public class resta implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (!T1.getText().equals("")) {
                N1 = T1.getText();
                Op = "-";
                T1.setText("");
            }
            
        }
        
        
        
        }
        public class Multi implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (!T1.getText().equals("")) {
                N1 = T1.getText();
                Op = "x";
                T1.setText("");
            }
            
        }
        
        
        
        }
        public class Division implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (!T1.getText().equals("")) {
                N1 = T1.getText();
                Op = "÷";
                T1.setText("");
            }
            
        }
        
        
        
        }
        public class cuadrado implements ActionListener{
               @Override
            public void actionPerformed(ActionEvent e){
            
                   String c = T1.getText();
                   int p = Integer.parseInt(c);
                   double o = Math.pow(p, 2 );
                   T1.setText(String.valueOf(o));
                   T2.setText(String.valueOf(o));
                   
            }
             
        
        }
        public class borrar implements ActionListener{
       @Override
        public void actionPerformed(ActionEvent e){
        T1.setText("");
        }
                
        }
     ///Resultado
     public class resul implements ActionListener{
     @Override
     public void actionPerformed(ActionEvent e){
         if (Op.equals("+")) {
             N2 = T1.getText();
             resultado = Double.parseDouble(N1) + Double.parseDouble(N2);
             String r = String.valueOf(resultado);
             T2.setText(r);
             T1.setText(r);
         }
         if (Op.equals("÷")) {
             N2 = T1.getText();
             resultado = Double.parseDouble(N1) / Double.parseDouble(N2);
             String r = String.valueOf(resultado);
             T2.setText(r);
             T1.setText(r);
         }
         if (Op.equals("-")) {
             N2 = T1.getText();
             resultado = Double.parseDouble(N1) - Double.parseDouble(N2);
             String r = String.valueOf(resultado);
             T2.setText(r);
             T1.setText(r);
         }
         if (Op.equals("x")) {
             N2 = T1.getText();
             resultado = Double.parseDouble(N1) * Double.parseDouble(N2);
             String r = String.valueOf(resultado);
             T2.setText(r);
             T1.setText(r);
         }
     
     }
   
     }
    public static void main(String[] args) {
        
      CalculadoraA A =  new CalculadoraA();
        A.setVisible(true);
    }
    
}
