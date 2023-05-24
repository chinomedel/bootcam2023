package IndividualesModulo4.trabajo15;

import java.util.Scanner;

public class CalculadoraNazly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        int numero1;
        String operacion;
        boolean comprobar = false;

        do {
            do {
                System.out.println("\n Ingrese un número ");
                while (!sc.hasNextInt()) {
                    System.out.println("Ingrese un número entero.");
                    sc.next();
                }
                numero1 = sc.nextInt();
            } while (numero1 == 0);

            do {
                System.out.println("\n ¿Qué operación desea hacer? (Solo coloque un signo)");
                System.out.println("Teniendo en cuenta que:\n+ = sumar\n- = restar\n"
                        + "x = multiplicar\n/ = dividir\n* = elevar primer número al segundo número."
                        + "\n% = residuo");
                operacion = sc.next();
                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") ||
                        operacion.equals("X") || operacion.equals("/") || operacion.equals("%") ||
                        operacion.equals("*")) {
                    comprobar = true;
                } else {
                    comprobar = false;
                }
            } while (!comprobar);

            int numero2;
            do {
                System.out.println("\n Ingrese el segundo número.");
                while (!sc.hasNextInt()) {
                    System.out.println("Ingrese un número entero.");
                    sc.next();
                }
                numero2 = sc.nextInt();
            } while (numero2 == 0);

            do {
                comprobar = true;
                switch (operacion) {
                    case "+":
                        res = numero1 + numero2;
                        break;
                    case "-":
                        res = numero1 - numero2;
                        break;
                    case "x":
                    case "X":
                        res = numero1 * numero2;
                        break;
                    case "/":
                        while (numero2 == 0) {
                            System.err.println(" En el denominador se encuentra \n"
                                    + "un cero, para evitar errores coloca otro número.");
                            while (!sc.hasNextInt()) {
                                System.out.println("Ingrese un número entero.");
                                sc.next();
                            }
                            numero2 = sc.nextInt();
                        }
                        res = (double) numero1 / numero2;
                        break;
                    case "*":
                        res = Math.pow(numero1, numero2);
                        break;
                    case "%":
                        while (numero2 == 0) {
                            System.err.println(" En el denominador se encuentra \n"
                                    + "un cero, para evitar errores coloca otro número.");
                            while (!sc.hasNextInt()) {
                                System.out.println("Entrada inválida. Introduce un número entero.");
                                sc.next();
                            }
                            numero2 = sc.nextInt();
                        }
                        res = numero1 % numero2;
                        break;
                }
            } while (!comprobar);

            System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
            System.out.println("\n ¿Desea hacer alguna otra operación? \n");
            System.out.println(" [s/n]");
            do {
                comprobar = true;
                operacion = sc.next();

                switch (operacion) {
                    case "s":
                    case "S":
                    case "n":
                    case "N":
                        break;
                    default:
                        System.err.println("\n Error, ponga un literal válido. \n");
                        comprobar = false;
                }
            } while (!comprobar);
        } while (operacion.equals("s") || operacion.equals("S"));
    }
}