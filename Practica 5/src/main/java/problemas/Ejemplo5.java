package problemas;

public class Ejemplo5 {


    public static void main(String[] args) {
        int[] arEnteros = new int[10]; // arreglo de enteros
	char[] arCaracteres = {'\u0000','a','b'}; // arreglo de caracteres
	String cadena = "dinosaurio"; //toCharArray -> {'d','i','n','o','s','a','u','r','i','o'}
	String[] arCadenas = {" ", "", "", cadena}; // arreglo de cadenas

	System.out.println("El tamaño del arreglo arCaracteres es : " + arCaracteres.length);
	for (int i = 0; i < arCaracteres.length; i++) {
	    System.out.println("Índice : " + i + " Valor : " + arCaracteres[i]);
	}

	System.out.println("El tamaño del arreglo arCadenas es : " + arCadenas.length);
	for (int i = 0; i < arCadenas.length; i++) {
	    System.out.println("Índice : " + i + " Valor : " + arCadenas[i]);
	}

	System.out.println("RECORRIDO EN CADENAS");
	System.out.println("La longitud de la cadena es : " + cadena.length());
	for (int i = 0; i < cadena.length(); i++) {
	    System.out.println("Índice : " + i + " Valor : " + cadena.charAt(i));
	}
	
    }

}
