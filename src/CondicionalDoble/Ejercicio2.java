package CondicionalDoble;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Ejercicio2 {

  public static void main(String[] args) {
    double precioCompra, descuento;

    precioCompra = Double.parseDouble(JOptionPane.showInputDialog("De cuanto fue su compra"));

    if (precioCompra >= 100000) {
      descuento = precioCompra * 0.5;
      precioCompra = precioCompra - descuento;
      JOptionPane.showMessageDialog(null, "El valor descontado de su compra es del 50% que es "
          + "equivalente a: " + descuento);
    }else{
      descuento=precioCompra*0.1;
      precioCompra-=descuento;
      JOptionPane.showMessageDialog(null, "El valor descontado de su compra es del 10% que es "
          + "equivalente a: " + descuento);
    }

    JOptionPane.showMessageDialog(null, "El total de su compra es: " + precioCompra);
  }
}
