package problemas;

import java.util.Scanner;

/**
 * Clase que contiene implementada la soluci�n proporcionada
 * en el diagrama de flujo Ejemplo1
 * @author alejandro.perez
 * @since 11/11/2021
 */
public class Ejemplo1 {

    /**
     *
     * Método que busca la máquina virtual de java (JVM) para
     * ejecutar una aplicación.
     */
    public static void main(String[] args) {
	String nombre;
	String edad;
	// se crea un lector de entrada estándar, no viene en el diagrama, es propio de java
	Scanner sc = new Scanner(System.in); 
	System.out.println("Bienvenido ¿Cuál es su nombre?");
	nombre = sc.nextLine();
	System.out.println("Hola " + nombre + ", mucho gusto y... ¿Qué edad tienes?");
	edad = sc.nextLine();
	System.out.println("¡Oh, " + edad + "! Tanto tiempo sin conocernos " + nombre + ". Espero verte más seguido por acá.");
    }

}
