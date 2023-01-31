package CondicionalMultiple;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Ejercicio2 {

    /**
     * Algoritmo que solicite un codigo y basado en este imprima el dia correspondiente
     *
     * <p>1-Lunes 2-Martes 3-Miercoles 4-Jueves 5-Viernes 6-Sabado 7-Domingo
     */
    public static void main(String[] args) {

        int codigo;
        String mensaje,menu;
        
        menu="Menu \n\n";
        menu+="1. Lunes\n";
        menu+="2. Martes\n";
        menu+="3. Miercoles\n";
        menu+="4. Jueves\n";
        menu+="5. Viernes\n";
        menu+="6. Sabado\n";
        menu+="7. Domingo\n";


        codigo = Integer.parseInt(JOptionPane.showInputDialog(menu+"\n Ingrese un codigo"));

        switch (codigo) {
            case 1:mensaje= "El dia es Lunes";
                break;
            case 2:mensaje= "El dia es Martes";
                break;
            case 3:mensaje= "El dia es Miercoles";
                break;
            case 4:mensaje= "El dia es Jueves";
                break;
            case 5:mensaje= "El dia es Viernes";
                break;
            case 6:mensaje= "El dia es Sabado";
                break;
            case 7:mensaje= "El dia es Domingo";
                break;
            default:
                mensaje="NO existe ese codigo";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
