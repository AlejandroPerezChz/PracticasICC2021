package problemas;
/**
 * Clase que contiene la funcionalidad de invertir una cadena
 * @author alejandro.perez
 * @since 11/11/2021
 */
public class cadena_reversa {

	/**
     * Invierte una cadena dada
     * @param s : cadena original
     */
	public String invertir(String s) {
		String rs="";
		for(int i =(s.length()-1);i>=0;i--) {
			rs = rs+s.charAt(i);
		}
		System.out.println(rs);
		return rs;
	}
}
