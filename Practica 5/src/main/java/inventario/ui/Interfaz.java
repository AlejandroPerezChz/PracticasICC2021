package inventario.ui;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import _utilidades_.SessionInventario;
import inventario.entidades.Actividad;
import inventario.entidades.Producto;
import inventario.entidades.Proveedor;
import inventario.entidades.Usuario;
/**
 * Clase que contiene funciones generales para UI
 * @author alejandro.perez
 * @since 11/11/2021
 */

public class Interfaz { //incluye todos los comentarios de la clase
	
	/** atributos */
	public static Usuario user= new Usuario();
	public static boolean sessionActive = false;
	public static List<Actividad> actividades =new ArrayList<Actividad>();
	public static SessionInventario session = new SessionInventario();
	
	/**
     * Muestra la bienvenida al aplicativo
     */
    public static boolean muestraBienvenida() {
        Scanner s = new Scanner( System.in );
        System.out.println( "Hola. Bienvenido al sistema de control de inventarios.\n¿Nombre de usuario?: ");
        user.setUserName(s.nextLine());
        System.out.println( "\nContraseña: ");
        user.setPassword(s.nextLine());
        user.setInicioSesion(new Date());
        sessionActive = true;
        return session.login(user);
    }

    /**
     * Clase main, se ejecuta al iniciar la aplicación
     */
    public static void main(String[] args) {
    	Menu menuInventario = new Menu();
    	if(muestraBienvenida()==false) {
    		sessionActive = false;
    		clearScreen();
    		System.out.print("\nAcceso denegado. Intente ingresar de nuevo su nombre de usuario y contraseña");
    	}
  
    	while(sessionActive) {
    		clearScreen();
    		String x = menuInventario.muestraMenu();
    		if(x.equals("1")) {
    			clearScreen();
    			Producto nuevo_producto = new Producto();
    			if(nuevo_producto.creaProducto()==null) {
    				Actividad nueva_actividad = new Actividad();
    				nueva_actividad.setHoraActividad(new Date());
    				nueva_actividad.setDetalle("Alta de producto. Intento fallido.");
    				actividades.add(nueva_actividad);
    			}
    			else {
    				Actividad nueva_actividad = new Actividad();
    				nueva_actividad.setHoraActividad(new Date());
    				nueva_actividad.setDetalle("Alta de producto. Exitoso.");
    				actividades.add(nueva_actividad);
    			}
    		}
    		else if (x.equals("2")) {
    			clearScreen();
    			Proveedor nuevo_proveedor = new Proveedor();
    			nuevo_proveedor.creaProveedor();
    			Actividad nueva_actividad = new Actividad();
				nueva_actividad.setHoraActividad(new Date());
				nueva_actividad.setDetalle("Alta de proveedor.");
				actividades.add(nueva_actividad);
    		}
    		else if (x.equals("3")) {
    			clearScreen();
    			Scanner s = new Scanner( System.in );
    	        System.out.println( "Implementación en proceso.");
    	        System.out.print("\nProducto creado. Precione enter para continuar...");
    	        s.nextLine();
    		}
    		else if (x.equals("4")) {
    			clearScreen();
    			Scanner s = new Scanner( System.in );
    	        System.out.println( "Implementación en proceso.");
    	        System.out.print("\nProducto creado. Precione enter para continuar...");
    	        s.nextLine();
    		}
    		else if (x.equals("5")) {
    			clearScreen();
    			sessionActive = false;
    			user.setActividades(actividades);
    			user.setFinalSesion(new Date());
    			System.out.println(user.muesstraLog());
    			System.out.println("\nHasta luego...");
    		}
    		else {
    			clearScreen();
    			Scanner s = new Scanner( System.in );
    	        System.out.println("Opción no valida.");
    	        System.out.print("\nProducto creado. Precione enter para continuar...");
    	        s.nextLine();
    		}
    	}
    }
    /**
     * Desplaza elementos para simular una limpieza de pantalla
     */
    public static void clearScreen() {
    	for (int i = 0; i < 50; ++i) System.out.println();
    }
    
}
