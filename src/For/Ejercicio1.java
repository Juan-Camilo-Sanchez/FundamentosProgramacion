package For;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Ejercicio1 {

    /** Algoritmo que imprima la suma de los 10 primeros numeros usando el ciclo for */
    public static void main(String[] args) {

        int i, suma = 0, cant = 0;

        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));

        for (i = 0; i <= cant; i++) {
            suma += i;
        }
        
        System.out.println("La suma de los " + cant + " primeros numeros es: " + suma);
    }
}
