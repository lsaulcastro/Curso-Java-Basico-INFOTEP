
import javax.swing.JOptionPane;


public class Triangulos {
    Triangulos(){}
    
    public static void Esescaleno(){
        JOptionPane.showMessageDialog(null,"El triángulo escaleno es un polígono de tres lados, \nsiendo todos éstos diferentes. Como consecuencia, \nsus ángulos también serán todos desiguales. Éstos, \ncomo en todos los triángulos, suman 180º ");  
    }
    public static void Esisosceles(){
        JOptionPane.showMessageDialog(null, "El triángulo isósceles es un polígono de tres lados, siendo dos\n iguales y el otro desigual. Por lo tanto, los ángulos también serán dos \niguales (α) y el otro diferente (β), siendo éste el ángulo que forman \nlos dos lados iguales (a).");
    }
    public static void Esequilatero(){
    JOptionPane.showMessageDialog(null, "En geometría, un triángulo equilátero, es un polígono \nregular con tres lados iguales. En la geometría euclídea \ntradicional, los triángulos equiláteros también son \nequiangulares, es decir, los tres ángulos internos también \nson congruentes entre sí, cada ángulo con un valor de 60°.");
    }
    public static void TieneAnguloRecto(){
    JOptionPane.showMessageDialog(null,"Se denomina hipotenusa al lado mayor del triángulo, el lado opuesto al ángulo recto. ");
    }
}
