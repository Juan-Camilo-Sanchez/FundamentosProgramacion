
package Secuencial;

import javax.swing.JOptionPane;

/**
 *
 * @author j
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        double nota1,nota2,nota3,prom;
        String mensaje;
        
        nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
        nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));
        nota3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"));
        
        prom=(nota1+nota2+nota3)/3;
        
        
        mensaje="La nota 1 = "+nota1+"\n";
        mensaje+="La nota 2 = "+nota2+"\n";
        mensaje+="La nota 3 = "+nota3+"\n\n";
        mensaje+="El promedio es: "+prom;
        
        JOptionPane.showMessageDialog(null,mensaje);
        
    }
    
}
