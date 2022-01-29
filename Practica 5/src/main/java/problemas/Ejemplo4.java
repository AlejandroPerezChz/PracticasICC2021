package problemas;

import java.util.Scanner;
import java.lang.Math;
public class Ejemplo4 {

    private static boolean esUsuarioValido() {
	String pass;
	Scanner sc = new Scanner(System.in);
	System.out.println("Usando do-while para validar acceso a usuarios");
	do {
	    // bloque de código
	    System.out.print("Ingresa la contraseña:");
	    pass = sc.nextLine();
	    if (!pass.equals("123")) {
		System.out.println("La contraseña ingresada "
				   + "es incorrecta, intenta de nuevo.");
	    } else {
		return true;
	    }
	} while(!pass.equals("123"));
	return false;
    }

    public static void main(String[] arg) {
	//se valida el acceso
	if (esUsuarioValido()) {
	    //incia sesión
	    System.out.println("Bienvenido, usuario válido...");
	} else {
	    // acceso denegado
	}
    }

}
