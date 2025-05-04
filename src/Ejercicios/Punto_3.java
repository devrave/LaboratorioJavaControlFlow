package Ejercicios;

import javax.swing.*;

public class Punto_3 {

    public void saludoInicial() {
        while (true) {
            String tipoVehiculo = JOptionPane.showInputDialog(
                    """
                            Bienvenidos al parqueadero RAVEN
                            Las tarifas son las siguientes:
                                    🚙️ 1. CARRO -> $5.000
                                    🏍  2. MOTO  -> $2.500
                                    🚲 3. CICLA -> $1.000
                                    ❌ 4. Terminar transacción
                            
                            NOTA: RECARGO ADCIONALDEL 20% DESPUES DE LAS 20:00
                            
                            
                            Ingrese su tipo de vehículo:""");

            if (tipoVehiculo == null || tipoVehiculo.equals("4") || tipoVehiculo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Gracias por usar el parqueadero Raven");
                break;
            }

            String hora = "";
            float precio = 0;
            switch (tipoVehiculo) {
                case "1":
                    precio = 5000;
                    break;
                case "2":
                    precio = 2500;
                    break;
                case "3":
                    precio = 1000;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    continue;
            }
            while (true) {
                hora = JOptionPane.showInputDialog("Ingrese la hora de llegada (formato 24 horas, HH:mm): ");
                if (hora.matches("([01]\\d|2[0-3]):[0-5]\\d")) {
                    JOptionPane.showMessageDialog(null, "Hora de ingreso válida: " + hora);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Hora inválida. Use el formato HH:mm (ej. 09:45 o 23:59)");

                }
            }

            String[] partesHora = hora.split(":");
            int horas = Integer.parseInt(partesHora[0]);
            int minutos = Integer.parseInt(partesHora[1]);
            boolean recargo = (horas > 20) || (horas == 20 && minutos > 0);

            if (recargo) {
                precio *= 1.2F;
                JOptionPane.showMessageDialog(null, "Se aplica un recargo del 20% por llegar después de las 20:00.");
            }

            JOptionPane.showMessageDialog(null, "Total a pagar: $" + precio );
        }
    }

}
