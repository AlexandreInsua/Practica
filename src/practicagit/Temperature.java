package practicagit;

import java.util.Scanner;

/** Temperatura: Pide unha temperatura en grados celsius e a devolve en farenheit 
 * @version 1.0
 * @date 01/02/2016
 * @author Alexandre Insua Moreira
 */

public class Temperature {

	public static void main(String[] args) {
		float temperatura;
		Scanner td = new Scanner(System.in);
		System.out.println("Introduza a temperatura (en C) que quere convertir: ");
		temperatura = td.nextFloat();

		System.out.println(celsiusToFarenheit(temperatura));

		
		td.close();
		System.out.println("\n\n FIN DE PROGRAMA");
	}

	/** Método de clase que realiza a conversión. Toma o dato en celsius,transfórmao en farenheit e o devolve por pantalla*/ 
	static public float celsiusToFarenheit(float temp) {
		float celsius = temp;
		float farenheit = 32 + ((9 * celsius) / 5);
		return farenheit;
	}
}
