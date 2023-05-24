package IndividualesModulo4.trabajo15;

import java.util.Scanner;

/**
 * Revision
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public class CalculadoraGenesis {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 0, b = 0, resul = 0;
        String sel = null;
        Scanner tec = new Scanner(System.in);
        System.out.println("Seleccione la opcion \n");
        System.out.println("+: Suma"
                + "\n-: Resta"
                + "\n*: Multiplicacion"
                + "\n/: Division");
        sel = tec.next();
        switch (sel) {
            case "+":
                System.out.println("ha seleccionado suma\n");
                System.out.println("Ingrese el primer numero");
                a = tec.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = tec.nextInt();
                resul = a + b;
                System.out.println(a + "+" + b + "=" + resul);
                break;

            case "-":
                System.out.println("ha seleccionado resta\n");
                System.out.println("Ingrese el primer numero");
                a = tec.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = tec.nextInt();
                resul = a - b;
                System.out.println(a + "-" + b + "=" + resul);
                break;

            case "*":
                System.out.println("ha seleccionado multiplicacion\n");
                System.out.println("Ingrese el primer numero");
                a = tec.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = tec.nextInt();
                resul = a * b;
                System.out.println(a + "*" + b + "=" + resul);
                break;
            case "/":
                System.out.println("ha seleccionado division\n");
                System.out.println("Ingrese el primer numero");
                a = tec.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = tec.nextInt();
                resul = a / b;
                System.out.println(a + "/" + b + "=" + resul);
                break;
            default:
                System.out.println("Esa opcion es incorrecta.");

        }
    }
    }
