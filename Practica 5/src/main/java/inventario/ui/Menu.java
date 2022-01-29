package inventario.ui;

import java.util.Scanner;
/**
 * Clase que contiene implementada la soluci�n proporcionada
 * en el diagrama de flujo Ejemplo1
 * @author alejandro.perez
 * @since 11/11/2021
 */
public class Menu {//incluye todos los comentarios de la clase

    /** atributos */
    private String descripcion;
    private String[] opciones; //implementa sus métodos de acceso

    /**
     * Constructor sin parametros para una construcci�n estatica del men�
     */
    protected Menu() {
		this.descripcion = "\nMen� del inventario\nSeleccione la operaci�n a realizar\n";
		this.opciones = new String[5];
		this.opciones[0] = "Registrar un nuevo producto";
		this.opciones[1] = "Dar de alta a un nuevo proveedor";
		this.opciones[2] = "Registrar la salida de un producto";
		this.opciones[3] = "Eliminar el registro de un proveedor";
		this.opciones[4] = "Salir";
	}

    /**
     * Constructor
     * @param descripcion : Instrucciones sobre la interpretaci�n del men�.
     * @param opciones : arreglo con las opciones que formarán parte del menú.
     */
    protected Menu(String descripcion, String[] opciones) {
    	this.descripcion = descripcion;
    	this.opciones = opciones;
    }

    /**
     * Constructor
     * @param descripcion : Instrucciones sobre la interpretaci�n del men�.
     * @param numeroOpciones : Cantidad de opciones que aparecer�n
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
     * Modifica una de las opciones del men� de acuerdo a su posici�n en la lista
     * @param descripcion : Nueva descripci�n de la opci�n a modificar
     * @param numeroOpcion : Indice de la opci�n a modificar
     */
    protected void modificaOpcion(String descOpcion, int numeroOpcion) {
    	// implementación...
    	this.opciones[numeroOpcion] = descOpcion;
    }
    
    /**
     * Imprimer el men� y sus opciones
     */
    protected String muestraMenu() {
    	System.out.println(this.descripcion);
    	for (int i = 0; i < this.opciones.length; i++) {
    		  System.out.println((i+1)+"-"+this.opciones[i]);
    	}
    	Scanner s = new Scanner( System.in );
    	System.out.println("\nOpci�n:");
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
