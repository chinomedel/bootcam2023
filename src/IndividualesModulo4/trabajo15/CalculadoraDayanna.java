package IndividualesModulo4.trabajo15;
//importamos la libreria scaner para poder solicitar datos por consola
import java.util.Scanner;

public class CalculadoraDayanna {

	public static void main(String[] args) {
		// aquí declaramos las variables
		int numero1;//guardamos valor 1
		int numero2;//guardamos valor 2
		String simbolo;//guardamos valor del simbolo ingresado
		//y lo iniciamos en 0 porque depende si se cumple la condicion del if para darle un valor
		int resultado =0;//para calcular la operacion y guardarla en la variable resultado
		int validacion=0;//para saber si eligio alguna opc valida o no
		//llamamos a la funcion scanner y luego almacenamos en una variable
		//para poder hacer las funciones del scaner a través de la variable
		//Sintaxis : Scanner [nombre de variable] = new Scanner (System.in);
		Scanner leer = new Scanner (System.in);
		//aqui pedimos datos por consola
		//primero le enviamos un mensaje para que sepa que tipo de dato tenga que ingresar
		//Sintaxis: System.out.println([Mensaje que quieres mostrar])
		System.out.println("Por favor ingresar el primer valor: ");
		//Hacemos una pausa para obligar al usuario ingresar un dato por consola
		//Sintaxis: [Variables donde se almacenara lo ingresado] = [variables_del_scanner].next[tipo de dato]();
		// si es int entonces nextInt(), si es String entonces next(), si es double entonces nextDouble()
		numero1 = leer.nextInt();
		// Repetimos el proceso para solicitar el numero2
		System.out.println("\"Por favor ingresar el segundo valor: \"");
		numero2 = leer.nextInt();
		// Repetimos el proceso para solicitar el simbolo
		// \n = Es para solicitar un salto de linea
		System.out.println("Por favor ingrese el operador \n Suma (+) \n Resta (-) \n Multiplicación (x) \n División (:) \n División(/)");
		simbolo = leer.next();
		
		//comparamos el simbolo para que pueda realizar la operacion matematica
		//Sintaxis del if anidado
		// if ([condicion]){ [expresión]}
		// else if (condicion){[expresión]}
		// else {[expresión]}
		if (simbolo.equals("+")){
			resultado= numero1 + numero2;
		}
			else if(simbolo.equals("-")) {
				resultado= numero1 - numero2;
			}
				else if(simbolo.equals("x")){
					resultado= numero1 * numero2;
				}
					else if(simbolo.equals(":")){
						resultado= numero1 / numero2;
					}
						else if(simbolo.equals("/")){
							resultado= numero1 % numero2;
						}
							else {System.out.println("Error al ingresar datos");
							  validacion=1;
							}
		//Imprimir el resultado validando que haya ingresado correctamente el simbolo
		if (validacion != 1){
			//con el "+" se concatena
			System.out.println("El resultado es " + resultado);
		}
}
}
