
package For;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Ejercicio1Anidado {

   
    public static void main(String[] args) {

        int tablas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta que tabla que desea ver"));
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Hasta que numero desea multiplicar?"));

        for (int i = 1; i <= tablas; i++) {
            for (int j = 1; j <= cant; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println("");
        }
    }
}
