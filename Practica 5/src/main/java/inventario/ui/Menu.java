package inventario.ui;

import java.util.Scanner;
/**
 * Clase que contiene implementada la solución proporcionada
 * en el diagrama de flujo Ejemplo1
 * @author alejandro.perez
 * @since 11/11/2021
 */
public class Menu {//incluye todos los comentarios de la clase

    /** atributos */
    private String descripcion;
    private String[] opciones; //implementa sus mÃ©todos de acceso

    /**
     * Constructor sin parametros para una construcción estatica del menú
     */
    protected Menu() {
		this.descripcion = "\nMenú del inventario\nSeleccione la operación a realizar\n";
		this.opciones = new String[5];
		this.opciones[0] = "Registrar un nuevo producto";
		this.opciones[1] = "Dar de alta a un nuevo proveedor";
		this.opciones[2] = "Registrar la salida de un producto";
		this.opciones[3] = "Eliminar el registro de un proveedor";
		this.opciones[4] = "Salir";
	}

    /**
     * Constructor
     * @param descripcion : Instrucciones sobre la interpretación del menú.
     * @param opciones : arreglo con las opciones que formarÃ¡n parte del menÃº.
     */
    protected Menu(String descripcion, String[] opciones) {
    	this.descripcion = descripcion;
    	this.opciones = opciones;
    }

    /**
     * Constructor
     * @param descripcion : Instrucciones sobre la interpretación del menú.
     * @param numeroOpciones : Cantidad de opciones que aparecerán
     */
    protected Menu(String descripcion, int numeroOpciones) {
    	this.descripcion = descripcion;
    	this.opciones = new String[numeroOpciones];
	 	this.opciones[0] = "Registrar un nuevo producto";
		this.opciones[1] = "Dar de alta a un nuevo proveedor";
		this.opciones[2] = "Registrar la salida de un producto";
		this.opciones[3] = "Eliminar el registro de un proveedor";
		this.opciones[4] = "Salir";
    }
    
    /**
     * Modifica una de las opciones del menú de acuerdo a su posición en la lista
     * @param descripcion : Nueva descripción de la opción a modificar
     * @param numeroOpcion : Indice de la opción a modificar
     */
    protected void modificaOpcion(String descOpcion, int numeroOpcion) {
    	// implementaciÃ³n...
    	this.opciones[numeroOpcion] = descOpcion;
    }
    
    /**
     * Imprimer el menú y sus opciones
     */
    protected String muestraMenu() {
    	System.out.println(this.descripcion);
    	for (int i = 0; i < this.opciones.length; i++) {
    		  System.out.println((i+1)+"-"+this.opciones[i]);
    	}
    	Scanner s = new Scanner( System.in );
    	System.out.println("\nOpción:");
    	return s.nextLine();
    }

    protected void setDescripcion(String descripcion) {
    	 this.descripcion = descripcion;
    }

    protected String getDescripcion() {
	return this.descripcion;
    }
    
    protected String[] getOpciones() {
    	return opciones;
    }

}
