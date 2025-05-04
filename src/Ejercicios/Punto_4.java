package Ejercicios;

import javax.swing.*;

public class Punto_4 {

    public void tiendaRopa() {
        while (true) {
            String tipoPrenda = JOptionPane.showInputDialog(null,
                    """
                            Bienvenido a tienda RAVEN
                            ¿Qué tipo de prenda desea comprar?
                            1. Camisa
                            2. Pantalón
                            3. Chaqueta
                            4. Salir
                            """
            );

            if (tipoPrenda == null || tipoPrenda.equals("4")) {
                JOptionPane.showMessageDialog(null, "Gracias por usar la tienda RAVEN");
                break;
            }

            float precio = 0;
            switch (tipoPrenda) {
                case "1":
                    precio = 25000;
                    break;
                case "2":
                    precio = 90000;
                    break;
                case "3":
                    precio = 150000;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    continue;
            }

            while (true) {
                String cantPrenda = JOptionPane.showInputDialog("Ingrese la cantidad de prendas:");

                if (cantPrenda == null || cantPrenda.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida.");
                    continue;
                }

                try {
                    int prendas = Integer.parseInt(cantPrenda);

                    if (prendas > 5) {
                        float precioTotal = (precio * prendas) * 1.15F; // 15% de recargo
                        JOptionPane.showMessageDialog(null, "El precio total con recargo es: " + precioTotal);
                        break;
                    } else if (prendas >= 1) {
                        float precioTotal = precio * prendas;
                        JOptionPane.showMessageDialog(null, "El precio total es: " + precioTotal);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe ingresar al menos 1 prenda.");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.");
                }
            }
        }
    }
}