package inventario.entidades;

import java.util.Scanner;

import problemas.cadena_reversa;

public class PruebaCadenaInversa {
	public static void main(String[] args) {
		 /* 
		   Lectura de datos de usuario	
		   usando el objeto Scanner
		 */
		 Scanner in = new Scanner(System.in);
		 String stdin;
		 cadena_reversa cr = new cadena_reversa();
		 System.out.println("Ingresa la cadena");
		 stdin = in.nextLine();
		 stdin = cr.invertir(stdin);
		 System.out.println("La cadena invertida es: ");
		 // Salida del dato almacenado
		 System.out.println(stdin);
		 
	    }
}
