

package CondicionalDoble;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Ejercicio1 {

  /**
   * 
   * Cree un algoritmo que lea dos numeros reales y determine cual de ellos es mayor
   */
  public static void main(String[] args) {
    
    int num1,num2;
    
    num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
    
    
    
   if(num1>num2){
      JOptionPane.showMessageDialog(null, "El numero 1 es mayor que el numero 2");
   }else{
     JOptionPane.showMessageDialog(null, "El numero 2 es mayor que el numero 1");
   }
    
  }
}
