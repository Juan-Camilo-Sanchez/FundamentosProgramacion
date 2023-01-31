package Secuencial;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Ejercicio2 {

  public static void main(String[] args) {

    double sueldoPersona, sueldoTotal, horasExtras,totalHorasExtras;
    String mensaje;

    sueldoPersona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
    horasExtras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas extras " +
        "trabajadas"));
    
    totalHorasExtras=horasExtras * 3000;
    sueldoTotal = sueldoPersona + totalHorasExtras;
    
    mensaje="Su sueldo base es de "+sueldoPersona+"\n";
    mensaje+="Trabajo "+horasExtras+" horas extras\n";
    mensaje+="Total horas Extras "+totalHorasExtras +"\n\n";
    mensaje+="Su sueldo Total es de "+sueldoTotal;

    JOptionPane.showMessageDialog(null,mensaje);
  }
}
