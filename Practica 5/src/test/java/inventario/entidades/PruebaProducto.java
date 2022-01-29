package inventario.entidades;

import java.util.Scanner;
/**
 *
 *
 */
public class PruebaProducto {

    /**
     * Método principal, el que búsca la MV java
     * para ejecutar la app.
     */
    public static void main(String[] args) {
	 /* 
	   Lectura de datos de usuario	
	   usando el objeto Scanner
	 */
    	
	 Scanner in = new Scanner(System.in);
	 String stdin;
	 Producto producto = new Producto();
	 System.out.println("Ingresa el nombre del producto, incluye números "
			    + "y letras");
	 stdin = in.nextLine();
	 producto.setNombre(stdin);
	 System.out.println("El nombre del producto es: ");
	 // Salida del dato almacenado
	 System.out.println(producto.getNombre());
	 
    }
}
