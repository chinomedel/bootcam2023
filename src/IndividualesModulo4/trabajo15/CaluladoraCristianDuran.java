package IndividualesModulo4.trabajo15;

import java.util.Scanner;

/**
 * Revisón
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public class CaluladoraCristianDuran {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String seleccion_de_operacion;
        int valor1 = 0;
        int valor2 = 0;
        int resultado;

        do {

            System.out.println("\n");
            System.out.println("Selecciona la operación aritmética a realizar, utilizando los siguientes símbolos: ");
            System.out.println("1.- Suma: +");
            System.out.println("2.- Resta: -");
            System.out.println("3.- Multiplicación: *");
            System.out.println("4.- División: /");
            System.out.println("5.- Resto: %");
            System.out.println("6.- Salir: !");

            seleccion_de_operacion = sc.nextLine();

            if (!seleccion_de_operacion.equals("!")) {
                System.out.println("Inserte primer número: ");
                valor1 = sc.nextInt();
                System.out.println("Ingrese segundo número: ");
                valor2 = sc.nextInt();
                sc.nextLine();
            }

            switch (seleccion_de_operacion) {
                case "+":
                    seleccion_de_operacion = "+";
                    resultado = valor1 + valor2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case "-":
                    seleccion_de_operacion = "-";
                    resultado = valor1 - valor2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case "*":
                    seleccion_de_operacion = "*";
                    resultado = valor1 * valor2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case "/":
                    seleccion_de_operacion = "/";
                    resultado = valor1 / valor2;
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                case "%":
                    seleccion_de_operacion = "%";
                    resultado = valor1 % valor2;
                    System.out.println("El resto de la solución es: " + resultado);
                    break;
            }

        } while (!seleccion_de_operacion.equals("!"));
        System.out.println("Has finalizado la calculadora,¡Hasta la próxima!");
    }

}
