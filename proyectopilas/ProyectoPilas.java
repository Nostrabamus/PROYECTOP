package proyectopilas;

import javax.swing.JOptionPane;

public class ProyectoPilas {

    public static void main(String[] args) {
        int n = 0, d, opc;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la Pila"));
        Pila P1 = new Pila(n);
        Pila aux = new Pila(n);
        do {
            opc = Menu();
            switch (opc) {
                case 1:
                    if (P1.PilaLlena() == false) {
                        d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
                        P1.Apilar(d);
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila Llena...");
                    }
                    break;
                case 3:
                    if (P1.PilaVacia() == false || aux.PilaVacia() == false) {
                        int a = Integer.parseInt(JOptionPane.showInputDialog("***** CUAL PILA QUIERE MOSTAR *****\n"
                                + "1. Pila 1\n"
                                + "2. Pila aux\n"
                                + "INGRESE SU OPCION"));
                        if (a == 1) {
                            JOptionPane.showMessageDialog(null, P1.Mostrar());
                        } else if (a == 2) {
                            JOptionPane.showMessageDialog(null, aux.Mostrar());
                        } else {
                            JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila vacia");
                    }
                    break;

                case 4:
                    if (P1.PilaVacia() == false || aux.PilaLlena() == false) {
                        P1.Pasar_datos(aux, P1);
                    } else if (P1.PilaVacia() == true) {
                        JOptionPane.showMessageDialog(null, "Pila 1 esta vacia");
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila aux esta llena");
                    }
                    break;

            }
        } while (opc != 5);
    }

    public static int Menu() {
        int opc;
        opc = Integer.parseInt(JOptionPane.showInputDialog("*** Menu principal ***\n\n"
                + "1.Apilar\n"
                + "2.Desapilar \n"
                + "3.Mostrar Pila\n"
                + "4. Pasar Dato \n"
                + "5. Salir"));
        return opc;
    }
}
