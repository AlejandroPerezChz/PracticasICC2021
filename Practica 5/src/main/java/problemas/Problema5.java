package problemas;

import java.util.Scanner;
import java.lang.Math;
public class Problema5 {

    public static void main(String[] arg) {
	//variables
	String entrada;
	double base;
	double altura;
	double area;
	double radio;
	double pi = 3.1416;
	Scanner sc = new Scanner(System.in);
	String pass;
	System.out.println("Usando do-while para validar acceso a usuarios");
	do {
	    // bloque de código
	    System.out.print("Ingresa la contraseña:");
	    pass = sc.nextLine();
	} while(!pass.equals("123"));
	System.out.println("Bienvenido, usuario válido...");
	
	
	System.out.println("Usando for, ingresa una cadena:");
	entrada = sc.nextLine();
	for (int i = 0; i < entrada.length(); i++) {
	    System.out.println("Esta es la iteración númrero : " + i);
	}
	
	System.out.println("Usando while");
	//int i = 0;
	//sc.nextLine();
	System.out.print("Ingresa la contraseña:");
	pass = sc.nextLine();
	while (!pass.equals("123")) {
	    //sc.nextLine();
	    System.out.print("La clave ingresada es incorrecta.\n"+
			       "Ingrésala nuevamente:");
	    pass = sc.nextLine();
	}


        
	switch (entrada){
	case "1":
	    System.out.println("¿Cuál es la base del triángulo?");
	    base = sc.nextDouble();
	    System.out.println("¿Cuál es la altura del triángulo?");
	    altura = sc.nextDouble();
	    area = (base * altura) / 2;
	    System.out.println("EL área del triangulo es : " + area);
	    //break;
	case "2":
	    System.out.println("¿Cuál es el radio del círculo?");
	    radio = sc.nextDouble();
	    //	    area = pi*radio*radio;
	    area =  pi*Math.pow(radio, 2);
	    System.out.println("El área del círculo es : " + area);//instrucciones
	    break;
	default:
	    System.out.println("La opción ingresada no es válida...");//instrucciones
	}

	
    }

}
