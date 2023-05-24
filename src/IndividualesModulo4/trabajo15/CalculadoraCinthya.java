package IndividualesModulo4.trabajo15;
import java.util.Scanner;

//Cintia Muñoz Valdés

public class CalculadoraCinthya {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n1;
		int n2;
		String operando;
		int resultado;
		
		System.out.println("Digita el primer número: ");
		n1 = leer.nextInt(); 
		System.out.println("Digita el segundo número: ");
		n2 = leer.nextInt();
		
		System.out.println("Digita el operador: ");
		operando = leer.next();
		
		leer.close();
		
		if(operando.equals("+")) {
			resultado = n1 + n2;
			System.out.println("El resultado de la suma es: " + resultado);
		} else if (operando.equals("-")) {
			resultado = n1 - n2;
			System.out.println("El resultado de la resta es: " + resultado);
		} else if (operando.equals("x")) {
			resultado = n1 * n2;
			System.out.println("El resultado de la multiplicación es: " + resultado);
		} else if (operando.equals(":")) {
			resultado = n1 / n2;
			System.out.println("El resultado de la división es: " + resultado);
		} else if (operando.equals("/")) {
			resultado = n1 % n2;
			System.out.println("El módulo es: " + resultado);
		} else {
			System.out.println("Operador no válido");
		}
	}

}
