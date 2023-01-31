package CondicionalSimple;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Ejercicio2 {

  public static void main(String[] args) {
    
    int num;
    
    num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    
    if(num<0){
      num*=-1;
    }
    JOptionPane.showMessageDialog(null,"El numero es: "+num);
  }
}
