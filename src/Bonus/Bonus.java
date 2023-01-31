package Bonus;

import javax.swing.JOptionPane;

/**
 * @author j
 */
public class Bonus {

    public static void main(String[] args) {

        int codVerdura, codTomate, codPapa, codCebolla;
        String menuVerdura, menuTomate, menuPapa, menuCebolla, resp = "";
        String msgVerdura, msgTomate, msgPapa, msgCebolla;

        menuVerdura = "Que Verdura Desea Saber El Precio?\n\n";
        menuVerdura += "1. Tomate\n";
        menuVerdura += "2. Repollo\n";
        menuVerdura += "3. Papa\n";
        menuVerdura += "4. Cebolla\n\n";
        menuVerdura += "Digite un codigo para continuar\n\n";

        menuTomate = "Que Tomate Desea saber el valor de la semilla\n\n";
        menuTomate += "1. Chonto\n";
        menuTomate += "2. Ensalada\n\n";
        menuTomate += "Digite un codigo para continuar\n\n";

        menuPapa = "Que Tipo de Papa Desea saber el valor de la semilla\n\n";
        menuPapa += "1. Criolla\n";
        menuPapa += "2. Pastusa\n";
        menuPapa += "3. Salentuna\n\n";
        menuPapa += "Digite un codigo para continuar\n\n";

        menuCebolla = "Que Tipo de Cebolla Desea saber el valor de la semilla\n\n";
        menuCebolla += "1. Larga\n";
        menuCebolla += "2. De Huevo\n";
        menuCebolla += "Digite un codigo para continuar\n\n";

        do {

            codVerdura = Integer.parseInt(JOptionPane.showInputDialog(menuVerdura));

            switch (codVerdura) {
                case 1:
                    codTomate = Integer.parseInt(JOptionPane.showInputDialog(menuTomate));
                    switch (codTomate) {
                        case 1:
                            int cantChonto =Integer.parseInt(JOptionPane.showInputDialog("Cuantas "
                                    + "semillas desea?"));
                            JOptionPane.showMessageDialog(null,"El valor de la semilla es de 15$\n"+
                                    "El total es: " + (cantChonto * 15)+"$");
                            break;
                        case 2:
                            int cantEnsalada =Integer.parseInt(JOptionPane.showInputDialog("Cuantas "
                                    + "semillas desea?"));
                            JOptionPane.showMessageDialog(null,"El valor de la semilla es de 20$\n"+
                                    "El total es: " + (cantEnsalada * 20)+"$");
                            break;
                        default:
                            msgTomate = "Codigo NO existe";
                            JOptionPane.showMessageDialog(null,msgTomate);
                    }
                    break;
                case 2:
                    int cantRepollo =Integer.parseInt(JOptionPane.showInputDialog("Cuantas semillas"
                            + " desea?"));
                    JOptionPane.showMessageDialog(null, "El valor de la semilla es de 10$\n"+
                            "El total es: " + (cantRepollo * 10)+"$");
                    break;
                case 3:
                    codPapa = Integer.parseInt(JOptionPane.showInputDialog(menuPapa));
                    switch (codPapa) {
                        case 1:
                            int cantCriolla =Integer.parseInt(JOptionPane.showInputDialog("Cuantas" 
                                    + " semillas desea?"));
                            JOptionPane.showMessageDialog(null, "El valor de la semilla es de 8$\n"+
                                    "El total es: " + (cantCriolla * 8)+"$");
                            break;
                        case 2:
                            int cantPastusa =Integer.parseInt(JOptionPane.showInputDialog("Cuantas "
                                    + "semillas desea?"));
                            JOptionPane.showMessageDialog(null,"El valor de la semilla es de 9$\n"+
                                    "El total es: " + (cantPastusa* 9)+"$");                            
                            break;
                        case 3:
                            int cantSalen =Integer.parseInt(JOptionPane.showInputDialog("Cuantas" 
                                    + " semillas desea?"));
                            JOptionPane.showMessageDialog(null, "El valor de la semilla es de 11$\n"+
                                    "El total es: " + (cantSalen * 11)+"$");
                            break;
                        default:
                            msgPapa = "Codigo NO existe";
                            JOptionPane.showMessageDialog(null, msgPapa);
                    }
                    break;
                case 4:
                    codCebolla = Integer.parseInt(JOptionPane.showInputDialog(menuCebolla));
                    switch (codCebolla) {
                        case 1:
                            int cantLarga =Integer.parseInt(JOptionPane.showInputDialog("Cuantas "
                                    + "semillas desea?"));
                            JOptionPane.showMessageDialog(null, "El valor de la semilla es de 15$\n"+
                                    "El total es: " + (cantLarga * 15)+"$");                            
                            break;
                        case 2:
                            int cantHuevo =Integer.parseInt(JOptionPane.showInputDialog("Cuantas"
                                    + " semillas desea?"));
                            JOptionPane.showMessageDialog(null, "El valor de la semilla es de 13$\n"+
                                    "El total es: " + (cantHuevo * 13)+"$");
                            break;
                        default:
                            msgCebolla="Codigo NO Existe";
                            JOptionPane.showMessageDialog(null, msgCebolla);
                    }
                    break;
                default:
                    msgVerdura = "Ese Codigo NO existe";
                    JOptionPane.showMessageDialog(null, msgVerdura);
            }

            resp =JOptionPane.showInputDialog("Si desea seguir digite SI,de lo contrario el programa "
                                    + "finalizara");

        } while (resp.equalsIgnoreCase("si"));
    }
}
