package inventario.entidades;

import java.util.Scanner;

public class PruebaProveedor {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 Proveedor proveedor1 = new Proveedor();
		 System.out.println("Nombre: ");
		 proveedor1.setNombre(in.nextLine());
		 System.out.println("Tienda: ");
		 proveedor1.setTienda(in.nextLine());
		 System.out.println("Numero de productos entregados: ");
		 proveedor1.setNoProductosEntregados(Integer.parseInt(in.nextLine()));
		 System.out.println("Monto total de productos entregados: ");
		 proveedor1.setTotalMontoProductosEntregados(Float.parseFloat(in.nextLine()));
		 
		 //Proveedor proveedor2 = proveedor1;
		 
		 /*Proveedor proveedor2 = new Proveedor();
		 proveedor2.setNombre(proveedor1.getNombre());
		 proveedor2.setTienda(proveedor1.getTienda());
		 proveedor2.setNoProductosEntregados(proveedor1.getNoProductosEntregados());
		 proveedor2.setTotalMontoProductosEntregados(proveedor1.getTotalMontoProductosEntregados());
		 */
		 
		 //proveedor1.setNombre("Nombre modificado");
		 
		 System.out.println(proveedor1.imprimirEstadoObjeto());
		 //System.out.println(proveedor2.imprimirEstadoObjeto());
	    }
}
