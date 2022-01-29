package inventario.entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 * Clase que representa una produto de tipo tarjeta de regalo
 * @author alejandro.perez
 * @since 11/11/2021
 */
public class TarjetaRegalo extends Producto{
	public String marca;
	public double monto;
	
	public TarjetaRegalo(Producto fuente) {
		heredar(fuente,this);
	}
	
	public static void heredar(Producto fuente, TarjetaRegalo destino) {
		destino.setNombre(fuente.getNombre());
		destino.setPrecioCompra(fuente.getPrecioCompra());
		destino.setPrecioVenta(fuente.getPrecioVenta());
		destino.setFechaEntrada(fuente.fechaEntrada);
		destino.setFechaSalida(fuente.getFechaSalida());
		destino.setProductorA(fuente.getProductorA());
		destino.setTipo(fuente.getTipo());
		System.out.println("Marca: ");
		Scanner s = new Scanner( System.in );
		destino.setMarca(s.nextLine());
		
		System.out.println("Monto: ");
        try {
        	destino.setMonto(Double.parseDouble(s.nextLine()));
		} catch (Exception e) {
			System.out.println("Este campo solo admite valores numericos.");
		}
	}
	
	public TarjetaRegalo() {
		super();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "TarjetaRegalo [marca=" + marca + ", monto=" + monto + ", nombre=" + nombre + ", tipo=" + tipo
				+ ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + ", productorA=" + productorA + "]";
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
				"\n		Marca: "+marca+
				"\n		Monto: "+monto;
	}
	
}
