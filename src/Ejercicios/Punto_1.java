package Ejercicios;

import javax.swing.*;

public class Punto_1 {


    public void facturacionSuper() {
        while (true) {
            // Solicitar valores de la compra
            String totalCompra = JOptionPane.showInputDialog("¿Cuál es el total de la compra?");
            if (totalCompra == null || totalCompra.isEmpty())
                continue;
            float compra = Float.parseFloat(totalCompra);
            String totalProductos = JOptionPane.showInputDialog("¿Cuántos productos compró?");
            if (totalProductos == null || totalProductos.isEmpty())
                continue;
            int productos = Integer.parseInt(totalProductos);
            while (true) {
                String membresia = JOptionPane.showInputDialog(
                        """
                                TIENE MEMBRESÍA
                                1. Sí
                                2. No
                                3. Salir
                                Ingrese una opción:"""
                );

                if (membresia == null || membresia.isEmpty() || membresia.equals("3")) {
                    JOptionPane.showMessageDialog(null, "Vuelve pronto, supermercado Raven");
                    return;
                }
                String mensaje = "";
                switch (membresia) {
                    case "1":
                        mensaje = "Eres cliente con membresía";
                        mensaje += membresia(productos, compra);
                        break;
                    case "2":
                        mensaje = "Eres cliente sin membresía.";
                        mensaje += cliente(productos, compra);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opción inválida");
                        continue;
                }
                JOptionPane.showMessageDialog(null, mensaje);
                break;
            }
        }

    }

    public String membresia(int productos, float compra) {
        String mensaje = "";
        if (productos > 0 && productos <= 10) {
            float descuento = compra * 0.10f;
            float totalConDescuento = compra - descuento;
            mensaje += "\nDescuento aplicado: $" +  String.format("%.2f",descuento) +
                    "\nTotal a pagar: $" + String.format("%.2f", totalConDescuento);
        } else {
            if (productos > 10) {
                float descuento = compra * 0.15f;
                float totalConDescuento = compra - descuento;
                mensaje += "\nDescuento aplicado: $" +  String.format("%.2f",descuento) +
                        "\nTotal a pagar: $" + String.format("%.2f", totalConDescuento);
            }
        }
        return mensaje;
    }


    public String cliente(int productos, float compra){
        String mensaje = "";
        if (productos > 10) {
            float descuento = compra * 0.05f;
            float totalConDescuento = compra - descuento;
            mensaje += "\nDescuento aplicado: $" + String.format("%.2f",descuento)  +
                    "\nTotal a pagar: $" + String.format("%.2f", totalConDescuento);
        } else {
            mensaje += "\nTotal a pagar: $" + compra;
        }
        return mensaje;
    }
}
