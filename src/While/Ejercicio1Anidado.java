package While;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Ejercicio1Anidado {

    /**
     * Algoritmo que imprima la suma de los 10 primeros numeros usando el ciclo while,hasta que el
     * usuario desee
     */
    public static void main(String[] args) {

        int i, suma, cant = 0;
        String respuesta = "si";

         do{

            cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
            i=0;
            suma=0;
            while (i <= cant) {
                suma += i;
                i++;
            }
            
            System.out.println("La suma de los " + cant + " primeros numeros es: " + suma);
            
            respuesta=JOptionPane.showInputDialog("Si desea continuar escriba si, de lo "
                            + "contrario el programa finalizara");
        }while (respuesta.equalsIgnoreCase("si"));

                
    }
}
