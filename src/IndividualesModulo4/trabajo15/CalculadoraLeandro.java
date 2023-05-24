package IndividualesModulo4.trabajo15;
import java.util.*;

public class CalculadoraLeandro {

	public static void main(String[] args) {
		int num1, num2, resultado;
		String signo;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("******** Bienvenido a la Calculadora ********");
		System.out.println("");
		System.out.println("Ingrese 2 números para realizar operación");
		System.out.println("");
		System.out.println("Número 1: ");
		num1 = entrada.nextInt();
		System.out.println("");
		System.out.println("Número 2: ");
		num2 = entrada.nextInt();
		System.out.println("");
		System.out.println("Ingrese operación a Realizar tipeando el SIGNO:");
		System.out.println("+ (suma) - (Resta) x (Multiplicación) : (División) / (Módulo)");
		signo = entrada.next();
		System.out.println("");
		entrada.close();
		switch (signo) {
		case "+":
			resultado = num1 + num2;
			System.out.println("************************************************");
			System.out.println("El resultado de la suma entre: " + num1 + " + " + num2 + " = " + resultado);
			System.out.println("************************************************");
			break;
		case "-":
			resultado = num1 - num2;
			System.out.println("************************************************");
			System.out.println("El resultado de la resta entre: " + num1 + " - " + num2 + " = " + resultado);
			System.out.println("************************************************");
			break;
		case "x":
			resultado = num1 * num2;
			System.out.println("**********************************************************");
			System.out.println("El resultado de la multiplicación entre: " + num1 + " x " + num2 + " = " + resultado);
			System.out.println("**********************************************************");
			break;
		case ":":
			resultado = num1 / num2;
			System.out.println("*****************************************************");
			System.out.println("El resultado de la división entre: " + num1 + " : " + num2 + " = " + resultado);
			System.out.println("*****************************************************");
			break;
		case "/":
			resultado = num1 % num2;
			System.out.println("************************************************");
			System.out.println("El resultado del módulo entre: " + num1 + " / " + num2 + " = " + resultado);
			System.out.println("************************************************");
			break;
		default:
			System.out.println("");
			System.out.println("Opcion incorrecta...");
			break;
	}
		
		
	}

}

