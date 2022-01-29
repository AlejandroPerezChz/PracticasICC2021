package problemas;

import java.util.Scanner;

public class Ejemplo3 {
    public static final int MI_CONSTANTE = 2;
    public static int misObjetos = 0;

    public static void main(String[] arg) {
	String entrada;
	double base;
	double altura;
	int area;
	double radio;
	double pi = 3.1416;
	Scanner sc = new Scanner(System.in);
	String pass;
	
	System.out.println("Este programa te permite calcular el área de "
			   + "dos figuras:"
			   + "\n\t1. Triángulo"
			   + "\n\t2. Círculo"
			   + "\nIngresa el número asociado a la opción");
	entrada = sc.nextLine();
	//	Ejemplo3.MI_CONSTANTE;
	
	switch (entrada){
	case "1":
	    System.out.println("¿Cuál es la base del triángulo?");
	    base = Double.parseDouble(sc.nextLine());
	    System.out.println("la conversión obtenida fue : " + base);
	    System.out.println("¿Cuál es la altura del triángulo?");
	    altura = sc.nextDouble();
	    area = (int) ((base * altura) / 2);
	    //area = 5/2;
	    System.out.println("EL área del triangulo es : " + area);
	    break;
	case "2":
	    System.out.println("¿Cuál es el radio del círculo?");
	    radio = sc.nextDouble();
	    //	    area = pi*radio*radio;
	    area = (int) (pi*Math.pow(radio, 2));
	    System.out.println("El área del círculo es : " + area);//instrucciones
	    break;
	default:
	    System.out.println("La opción ingresada no es válida...");//instrucciones
	}
    }
}
