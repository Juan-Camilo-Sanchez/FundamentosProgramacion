package CondicionalMultiple;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        double sueldo, tiempo, aumento;

        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
        tiempo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su tiempo de antigüedad"));

        if (sueldo < 500 && tiempo >= 10) {
            aumento = sueldo * 0.2;
            sueldo += aumento;
            JOptionPane.showMessageDialog(
                    null, "Usted tiene un aumento del 20%,su sueldo nuevo es " + "de: " + sueldo);
        } else if (sueldo < 500 && tiempo < 10) {
            aumento = sueldo * 0.05;
            sueldo = sueldo + aumento;
            JOptionPane.showMessageDialog(
                    null, "Usted tiene un aumento del 5%, su sueldo  nuevo es " + "de: " + sueldo);
        } else if (sueldo >= 500) {
            JOptionPane.showMessageDialog(
                    null, "Usted no tiene nigun aumento en su sueldo,su sueldo es : " + sueldo);
        }
    }
}
