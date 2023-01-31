package DoWhile;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Ejercicio1Anidado {

    /**
     * Algoritmo que imprima la suma de los 10 primeros numeros usando el ciclo do-while. Hasta que
     * el usuario quiera
     */
    public static void main(String[] args) {

        int i = 0, j = 0, suma = 0, cant = 0, n = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces a repetir"));

        while (j < n){

            JOptionPane.showMessageDialog(null, "Inicia La sumatoria");

            cant =Integer.parseInt(
                            JOptionPane.showInputDialog("Ingrese la cantidad de numeros a sumar"));
            
            i=0;
            suma=0;
            do {
                suma += i;
                i++;
            } while (i <= cant);
            System.out.println("La suma de los " + cant + " primeros numeros es: " + suma);

            j++;
        }
    }
}
