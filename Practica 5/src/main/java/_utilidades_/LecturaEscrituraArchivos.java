package _utilidades_;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LecturaEscrituraArchivos {
	
	public static String procesaArchivo(String nombreArchivo) {
		Path fileName = Path.of("src/resources/"+nombreArchivo);
	    String actual;
		try {
			actual = Files.readString(fileName);
			return actual;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static void escribeArchivo(String nombreArchivo,String texto) {
	    try {
	    	Files.write(Paths.get("src/resources/"+nombreArchivo), (texto + "\n").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	    }catch (IOException e) {
	    }
	}

}
