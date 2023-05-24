package IndividualesModulo4.trabajo15;

import java.util.Scanner;

/**
 * Revis�n
 *
 * @author El Piero tiene sue�o
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
            System.out.println("Selecciona la operaci�n aritm�tica a realizar, utilizando los siguientes s�mbolos: ");
            System.out.println("1.- Suma: +");
            System.out.println("2.- Resta: -");
            System.out.println("3.- Multiplicaci�n: *");
            System.out.println("4.- Divisi�n: /");
            System.out.println("5.- Resto: %");
            System.out.println("6.- Salir: !");

            seleccion_de_operacion = sc.nextLine();

            if (!seleccion_de_operacion.equals("!")) {
                System.out.println("Inserte primer n�mero: ");
                valor1 = sc.nextInt();
                System.out.println("Ingrese segundo n�mero: ");
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
                    System.out.println("El resultado de la multiplicaci�n es: " + resultado);
                    break;
                case "/":
                    seleccion_de_operacion = "/";
                    resultado = valor1 / valor2;
                    System.out.println("El resultado de la divisi�n es: " + resultado);
                    break;
                case "%":
                    seleccion_de_operacion = "%";
                    resultado = valor1 % valor2;
                    System.out.println("El resto de la soluci�n es: " + resultado);
                    break;
            }

        } while (!seleccion_de_operacion.equals("!"));
        System.out.println("Has finalizado la calculadora,�Hasta la pr�xima!");
    }

}
