package _utilidades_;

public class _Funcion_ {
	public static int convierteABinario(int numero) {
		String binStr="";
		while(numero!=0) {
			if(numero%2==0) {
				binStr = "0"+binStr;
			}
			else {
				binStr = "1"+binStr;
			}
			numero =(int)numero/2;
		}
		return Integer.parseInt(binStr);
	}
	
	private static double parteDecimal( double n ) {
	    String val = ".";    
	    while ( n > 0 ) {     
	        double r = n * 2;   
	        if( r >= 1 ) {      
	            val += "1";       
	            n = r - 1;        
	        }else{              
	            val += "0";       
	            n = r;            
	        }
	    }
	    return Double.parseDouble(val);          
	}
	
	public static double convierteABinario(double numero) {
		double pF =numero%1;
		int pE = (int)(numero-pF);
		return (double)(convierteABinario(pE)+parteDecimal(pF));
	}
	
	public static int convierteABase10(int numero) {
		//Tengo entendido que base 10 es lo que usamos
		//Al menos que perdiera información.
		//En ese caso, perdón
		return numero;
	}

	public static void main(String[] args) {
		System.out.println(convierteABinario(25));
		System.out.println(parteDecimal(.125));
		System.out.println(convierteABinario(25.125));
		System.out.println(convierteABase10(25));
	}
}
