package IndividualesModulo4.trabajo15;

import java.util.Scanner;

public class CalculadoraLivio {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int num1, num2;
		String respuesta;
		
		
		System.out.println("Seleccione entre +, -, *,:, /");
		respuesta=leer.nextLine();
		
		switch(respuesta){
		case "+":
			System.out.println("Digite el numero");
			num1=leer.nextInt();
			System.out.println("Digite el segundo numero");
			num2=leer.nextInt();
			System.out.println("La suma es:  " + (num1+num2));
			break;
		case "-":
			System.out.println("Digite el numero");
			num1=leer.nextInt();
			System.out.println("Digite el segundo numero");
			num2=leer.nextInt();
			System.out.println("La resta es: " + (num1-num2));
			break;
		case "*":
			System.out.println("Digite el numero");
			num1=leer.nextInt();
			System.out.println("Digite el segundo numero");
			num2=leer.nextInt();
			System.out.println("La Multiplicacion es: " + (num1*num2));
			break;
		case ":":
			System.out.println("Digite el numero");
			num1=leer.nextInt();
			System.out.println("Digite el segundo numero");
			num2=leer.nextInt();
			System.out.println("La division es: " + (num1/num2));
			break;
		case "/":
			System.out.println("Digite el numero");
			num1=leer.nextInt();
			System.out.println("Digite el segundo numero");
			num2=leer.nextInt();
			System.out.println("La division es: " + (num1%num2));
			break;
		}
			
	}

}
