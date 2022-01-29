package inventario.entidades;

import java.util.Date;
import java.util.Scanner;

import _utilidades_.LecturaEscrituraArchivos;

/**
 * Esta clase abstrae la entidad proveedor dentro de
 * nuestro inventario.
 * 
 * @author Alejandro.Perez
 * @since 18/01/2022
 * @version 1
 */

public class Proveedor {
	LecturaEscrituraArchivos Lec = new LecturaEscrituraArchivos();
	String nombre;
	String tienda;
	int noProductosEntregados;
	float totalMontoProductosEntregados;
	Producto producto;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public int getNoProductosEntregados() {
		return noProductosEntregados;
	}
	public void setNoProductosEntregados(int noProductosEntregados) {
		this.noProductosEntregados = noProductosEntregados;
	}
	public float getTotalMontoProductosEntregados() {
		return totalMontoProductosEntregados;
	}
	public void setTotalMontoProductosEntregados(float totalMontoProductosEntregados) {
		this.totalMontoProductosEntregados = totalMontoProductosEntregados;
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public String imprimirEstadoObjeto() {
		return "Informacion Proveedor: \n   Nombre=" + nombre 
				+ "\n   Tienda=" + tienda 
				+ "\n   Productos Entregados=" + noProductosEntregados
				+ "\n   Monto Productos Entregados=" + totalMontoProductosEntregados;
	}
	public Proveedor creaProveedor() {
		Scanner in = new Scanner(System.in);
		System.out.println("En esta función puedes dar de alta un nuevo proveedor.");
		 Proveedor productor = new Proveedor();
		 System.out.println("Nombre: ");
		 productor.setNombre(in.nextLine());
		 System.out.println("Tienda: ");
		 productor.setTienda(in.nextLine());
		 System.out.println("Numero de productos entregados: ");
		 productor.setNoProductosEntregados(Integer.parseInt(in.nextLine()));
		 System.out.println("Monto total de productos entregados: ");
		 productor.setTotalMontoProductosEntregados(Float.parseFloat(in.nextLine()));
		 Producto nuevoProducto = new Producto();
		 productor.setProducto(nuevoProducto.creaProducto());
		 Lec.escribeArchivo("proveedor.txt", productor.imprimirEstadoObjeto());
		 //System.out.print("\n\nModificación");
		 //productor.producto.setNombre("Producto modificado");
		 //System.out.println(productor.imprimirEstadoObjeto());
		 System.out.print("\nProducto creado. Precione enter para continuar...");
		 in.nextLine();
		 return productor;
	}
	
}
