package IndividualesModulo4.trabajo15;
import java.util.Scanner;

public class CalculadoraLuisZambrano {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido");
		System.out.println("Ingresa un numero");
		int numero1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Ingresa el segundo numero");
		int numero2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Ingresa el signo de la operacion que quieras realizar");
		System.out.println("Para sumar: '+'");
		System.out.println("Para estar: '-'");
		System.out.println("Para multiplicar: 'x'");
		System.out.println("Para dividir: ':'");
		System.out.println("Para modulo: '/'");
		String signo = scanner.nextLine();
		
		
		switch (signo) {
			case "+":
				int suma = numero1 + numero2;
				System.out.println("El resultado de la suma entre: " + numero1 + " + " + numero2 + " = " + suma);
				break;
			case "-":
				int resta = numero1 - numero2;
				System.out.println("El resultado de la resta entre: " + numero1 + " - " + numero2 + " = " + resta);
				break;
			case "x":
				int multiplicacion = numero1 * numero2;
				System.out.println("El resultado de la multiplicacion entre: " + numero1 + " x " + numero2 + " = " + multiplicacion);
				break;
			case ":":
				int division = numero1 / numero2;
				System.out.println("El resultado de la division entre: " + numero1 + " : " + numero2 + " = " + division);
				break;
			case "/":
				int modulo = numero1 % numero2;
				System.out.println("El resultado de la modulo entre: " + numero1 + " / " + numero2 + " = " + modulo);
				break;
			default:
				System.out.println("Opcion incorrecta...");
				break;
		}
		
		scanner.close();
	}
}
