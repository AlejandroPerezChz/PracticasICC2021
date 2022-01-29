package inventario.entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 * Clase que representa una produto de tipo ropa
 * @author alejandro.perez
 * @since 11/11/2021
 */
public class Ropa extends Producto{
	public String talla;
	public String sexo;
	
	public Ropa(Producto fuente) {
		heredar(fuente,this);
	}
	
	public static void heredar(Producto fuente, Ropa destino) {
		destino.setNombre(fuente.getNombre());
		destino.setPrecioCompra(fuente.getPrecioCompra());
		destino.setPrecioVenta(fuente.getPrecioVenta());
		destino.setFechaEntrada(fuente.fechaEntrada);
		destino.setFechaSalida(fuente.getFechaSalida());
		destino.setProductorA(fuente.getProductorA());
		destino.setTipo(fuente.getTipo());
		System.out.println("Talla(CH/MD/GD/XG): ");
		Scanner s = new Scanner( System.in );
		destino.setTalla(s.nextLine());
		System.out.println("Sexo(M/F/O): ");
		destino.setSexo(s.nextLine());
	}
	
	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Ropa [talla=" + talla + ", sexo=" + sexo + ", nombre=" + nombre + ", tipo=" + tipo + ", fechaEntrada="
				+ fechaEntrada + ", fechaSalida=" + fechaSalida + ", precioCompra=" + precioCompra + ", precioVenta="
				+ precioVenta + ", productorA=" + productorA + "]";
	}
	
	public String mostrarInfo() {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return "\nInformacion del producto"+
				"\n		Nombre de producto: "+nombre+
				"\n		Tipo de producto: "+tipo+
				"\n		Fecha de entrada: "+formatter.format(fechaEntrada)+
				"\n		Fecha de salida: "+formatter.format(fechaSalida)+
				"\n		Precio compra: "+precioCompra+
				"\n		Precio venta: "+precioVenta+
				"\n		Productor asociado: "+productorA+
				"\n		Tipo: "+tipo+
				"\n		Talla: "+talla+
				"\n		Sexo: "+sexo;
	}
	
}
