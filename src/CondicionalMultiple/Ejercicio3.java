package CondicionalMultiple;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        
        int cod;
        String menu = "MENU DE OPCIONES\n\n";

        menu += "1. Ejercicio 1 Secuencial simple\n";
        menu += "2. Ejercicio 1 Condicional simple\n";
        menu += "3. Ejercicio 1 Condicional Doble\n";
        menu += "4. Ejercicio 1 Condicional Multiple con condicion Anidada\n";
        menu += "5. Ejercicio 1 Condicional Anidada\n\n";
        menu += "Ingrese una opcion\n\n";

        cod = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (cod) {
            case 1:
                double nota1, nota2, nota3, prom;
                String mensaje;

                nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
                nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));
                nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"));

                prom = (nota1 + nota2 + nota3) / 3;

                mensaje = "La nota 1 = " + nota1 + "\n";
                mensaje += "La nota 2 = " + nota2 + "\n";
                mensaje += "La nota 3 = " + nota3 + "\n\n";
                mensaje += "El promedio es: " + prom;

                JOptionPane.showMessageDialog(null, mensaje);
                break;
            case 2:
                double precioCompra, descuento;

                precioCompra =
                        Double.parseDouble(JOptionPane.showInputDialog("De cuanto fue su compra"));

                if (precioCompra >= 100000) {
                    descuento = precioCompra * 0.5;
                    precioCompra = precioCompra - descuento;
                    JOptionPane.showMessageDialog(
                            null,
                            "El valor descontado de su compra es del 50% que es equivalente a: "
                                    + descuento);
                }

                JOptionPane.showMessageDialog(null, "El total de su compra es: " + precioCompra);
                break;
            case 3:
                int num1, num2;

                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));

                if (num1 > num2) {
                    JOptionPane.showMessageDialog(null, "El numero 1 es mayor que el numero 2");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero 2 es mayor que el numero 1");
                }
                break;
            case 4:
                double sueldo, tiempo, aumento;

                sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
                tiempo =
                        Double.parseDouble(
                                JOptionPane.showInputDialog("Ingrese su tiempo de antigüedad"));

                if (sueldo < 500 && tiempo >= 10) {
                    aumento = sueldo * 0.2;
                    sueldo += aumento;
                    JOptionPane.showMessageDialog(
                            null,
                            "Usted tiene un aumento del 20%,su sueldo nuevo es " + "de: " + sueldo);
                } else if (sueldo < 500 && tiempo < 10) {
                    aumento = sueldo * 0.05;
                    sueldo = sueldo + aumento;
                    JOptionPane.showMessageDialog(
                            null,
                            "Usted tiene un aumento del 5%, su sueldo  nuevo es "
                                    + "de: "
                                    + sueldo);
                } else if (sueldo >= 500) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Usted no tiene nigun aumento en su sueldo,su sueldo es : " + sueldo);
                }
                break;
            case 5:
                int codigo;
                String mensaje2 = "",menu2;

                menu2 = "Menu \n\n";
                menu2 += "1. Lunes\n";
                menu2 += "2. Martes\n";
                menu2 += "3. Miercoles\n";
                menu2 += "4. Jueves\n";
                menu2 += "5. Viernes\n";
                menu2 += "6. Sabado\n";
                menu2 += "7. Domingo\n";

                codigo =
                        Integer.parseInt(
                                JOptionPane.showInputDialog(menu2 + "\n Ingrese un codigo"));

                switch (codigo) {
                    case 1:
                        mensaje2 = "El dia es Lunes";
                        break;
                    case 2:
                        mensaje2 = "El dia es Martes";
                        break;
                    case 3:
                        mensaje2 = "El dia es Miercoles";
                        break;
                    case 4:
                        mensaje2 = "El dia es Jueves";
                        break;
                    case 5:
                        mensaje2 = "El dia es Viernes";
                        break;
                    case 6:
                        mensaje2 = "El dia es Sabado";
                        break;
                    case 7:
                        mensaje2 = "El dia es Domingo";
                        break;
                    default:
                        mensaje = "NO existe ese codigo";
                }
                JOptionPane.showMessageDialog(null, mensaje2);
                break;

            default:
                
                break;
                
        }
    }
}
