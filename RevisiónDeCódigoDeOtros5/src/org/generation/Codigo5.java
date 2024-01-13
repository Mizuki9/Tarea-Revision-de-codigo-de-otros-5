//Este código te pide que introduzcas un número, el cuál lee y te dice si es un número de la suerte o no.
//Para decidir si tu número es de la suerte, lo divide entre 10, si el residuo es de 3, 7, 8 o 9, le suma un punto a la suerte.
//De lo contrario, le suma un punto a la mala suerte.
//Después divide tu número entre 10 para hacerlo más pequeño, truncando decimales, y repite el proceso hasta haber revisado todos los dígitos.
//Por último compara los puntos de suerte vs los puntos de mala suerte.
//Si los puntos de buena suerte son mayores, te dice que tu número es afortunado.
//De lo contrario, te dice que tu número no es afortunado.


// Agregué un paquete
package org.generation;

//Importé Scanner
import java.util.Scanner;

public class Codigo5 {

	// Agregué el método main
	public static void main(String[] args) {

		// Cambié el nombre del scanner de s a scanner para mejorar legibilidad
		// Agregué System.in dentro del paréntesis de new Scanner()
		Scanner scanner = new Scanner(System.in);
		//Cambié ' por "
		System.out.print("Introduzca un número: ");
		// La variable "ni" que almacena el número que escribes no es muy clara, le cambié el nombre a numero
		// Cambié la variable numero que almacena lo del scanner de String a Int
		// También agregué un if para revisar que se haya ingresado el tipo de dato correcto
		// Cambié la variable c de nombre para hacerla más clara e hice todas las operaciones con esa copia en lugar del número original
		if( scanner.hasNextInt() ) {
			int numero = scanner.nextInt();
			scanner.nextLine();

			int afo = 0;
			int noAfo = 0;
			int numeroCopia = numero;

			while (numeroCopia > 0) {
				int digito = (int)(numeroCopia % 10);
				if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
					// Cambié los ++ del lado derecho de afo y noAfo al lado izquierdo
					++afo;
				} else {
					++noAfo;
				}
				//Saqué la división de número entre 10 del if/else
				numeroCopia /= 10;
			//Subí la llave para que el ciclo while no incluyese el resultado
			}

				// Cambié c por numero
				if (afo > noAfo) {
					// A print le faltaba la t
					System.out.println("El " + numero + " es un número afortunado.");
				} else {
					System.out.println("El " + numero + " no es un número afortunado.");
				}


		} else {
			System.out.println("Opción Inválida.");
		}

	}

}