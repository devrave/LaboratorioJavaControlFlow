package Ejercicios;

import javax.swing.*;

public class Punto_2 {

    public void Veterinaria(){
        String tipoAnimal = JOptionPane.showInputDialog("Que tipo de animal es: ");
        String edadnimal = JOptionPane.showInputDialog("Que edad tiene: ");
        int edad = Integer.parseInt(edadnimal);
        String resultado = switch (tipoAnimal){
            case "gato","perro","loro" -> "Dr. Armando";
            case "ave","pez","hamster" -> "Dra. Melissa";
            case "mico","zarigueya","ardilla" -> "Dr. Francisco";
            default -> "valor no válido";
        };
        //se llama el metodo
        String adicional = vacunAdicional(tipoAnimal,edad);
        JOptionPane.showMessageDialog(null,
                "El veterinari@ correspondiente es" + resultado +
                       "\n y de acuerdo al tipo y edad. " + adicional);
    }

    //  metodo de vacuna adicionl
       public String vacunAdicional(String mascota, int edad) {
       String mensaje = "";
       if ((mascota.equals("perro") || mascota.equals("gato")) && (edad > 5)) {
           mensaje = "Se recomienda una vacuna adicional ";
       }else{
           mensaje = "No se requiere vacuna adicional";
       }
       return mensaje;
   }
}


