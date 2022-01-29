package inventario.entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * Clase que representa una produto de tipo alimento
 * @author alejandro.perez
 * @since 11/11/2021
 */
public class Alimento extends Producto{
	public Date fechaDeCaducidad;
	public double temperaturaDeAlmacenamiento;
	
	public Alimento(Producto fuente) {
		heredar(fuente,this);
	}
	
	public static void heredar(Producto fuente, Alimento destino) {
		destino.setNombre(fuente.getNombre());
		destino.setPrecioCompra(fuente.getPrecioCompra());
		destino.setPrecioVenta(fuente.getPrecioVenta());
		destino.setFechaEntrada(fuente.fechaEntrada);
		destino.setFechaSalida(fuente.getFechaSalida());
		destino.setProductorA(fuente.getProductorA());
		destino.setTipo(fuente.getTipo());
		System.out.println("Fecha de caducidad(DD/MM/AAAA): ");
		Scanner s = new Scanner( System.in );
		try {
			destino.setFechaDeCaducidad(new SimpleDateFormat("dd/MM/yyyy").parse(s.nextLine()));
		} catch (ParseException e) {
			System.out.println("Formato de fecha no valido. Favor de ingresar los datos de acuerdo al formato.");
		}
		System.out.println("Temperartura de almacenamiento: ");
        try {
        	String rest =s.nextLine();
        	System.out.println(rest);
        	destino.setTemperaturaDeAlmacenamiento(Double.parseDouble(rest));
		} catch (Exception e) {
			System.out.println("Este campo solo admite valores numericos.");
		}
	}

	public Date getFechaDeCaducidad() {
		return fechaDeCaducidad;
	}

	public void setFechaDeCaducidad(Date fechaDeCaducidad) {
		this.fechaDeCaducidad = fechaDeCaducidad;
	}

	public double getTemperaturaDeAlmacenamiento() {
		return temperaturaDeAlmacenamiento;
	}

	public void setTemperaturaDeAlmacenamiento(double temperaturaDeAlmacenamiento) {
		this.temperaturaDeAlmacenamiento = temperaturaDeAlmacenamiento;
	}

	@Override
	public String toString() {
		return "Alimento [fechaDeCaducidad=" + fechaDeCaducidad + ", temperaturaDeAlmacenamiento="
				+ temperaturaDeAlmacenamiento + ", nombre=" + nombre + ", tipo=" + tipo + ", fechaEntrada="
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
				"\n		Fecha  de caducidad: "+fechaDeCaducidad+
				"\n		Temperaruta de almacenamiento: "+temperaturaDeAlmacenamiento;
	}
	
}
