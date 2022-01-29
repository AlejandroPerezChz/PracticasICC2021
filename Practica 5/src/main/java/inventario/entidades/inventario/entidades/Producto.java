package inventario.entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
// bibliotecas usando import
import java.util.Date;
import java.util.Scanner;

import _utilidades_.LecturaEscrituraArchivos;

/**
 * Esta clase abstrae la entidad producto dentro de
 * nuestro inventario.
 * 
 * @author leonardo.gallo
 * @since 21/10/2022
 * @version 1
 */
public class Producto {

    /* Atributos */
	LecturaEscrituraArchivos Lec = new LecturaEscrituraArchivos();
    String nombre;
    String tipo;
    Date fechaEntrada;
    Date fechaSalida;
    double precioCompra;
    double precioVenta;
    String productorA;

    public Producto() {}

    public void setNombre(String nuevoNombre) {
    	nombre = nuevoNombre;
    }
    public String getNombre() {
    	return nombre;
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getProductorA() {
		return productorA;
	}

	public void setProductorA(String productorA) {
		this.productorA = productorA;
	}
	
	public String mostrarInfo() {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return "\n		Informacion del producto"+
				"\n		Nombre de producto: "+nombre+
				"\n		Tipo de producto: "+tipo+
				"\n		Fecha de entrada: "+formatter.format(fechaEntrada)+
				"\n		Fecha de salida: "+formatter.format(fechaSalida)+
				"\n		Precio compra: "+precioCompra+
				"\n		Precio venta: "+precioVenta+
				"\n		Productor asociado: "+productorA;
	}
	
	public boolean validaProveedor(String proveedor) {
		String resp= Lec.procesaArchivo("proveedor.txt");
		return resp.contains("Nombre="+proveedor);
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", tipo=" + tipo + ", fechaEntrada=" + fechaEntrada + ", fechaSalida="
				+ fechaSalida + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", productorA="
				+ productorA + "]";
	}
	
	public Producto creaProducto() {
		Scanner s = new Scanner( System.in );
		System.out.println("En esta función puedes dar de alta un nuevo producto.");
		Producto nuevoProducto = new Producto();
        System.out.println("Nombre: ");
        nuevoProducto.setNombre(s.nextLine());
        System.out.println("Fecha de entrada(DD/MM/AAAA): ");
        try {
			nuevoProducto.setFechaEntrada(new SimpleDateFormat("dd/MM/yyyy").parse(s.nextLine()));
		} catch (ParseException e) {
			System.out.println("Formato de fecha no valido. Favor de ingresar los datos de acuerdo al formato.\nPresiona una tecla pra continuar...");
			s.nextLine();
			return null;
		}
        System.out.println("Fecha de salida(DD/MM/AAAA): ");
        try {
			nuevoProducto.setFechaSalida(new SimpleDateFormat("dd/MM/yyyy").parse(s.nextLine()));
		} catch (ParseException e) {
			System.out.println("Formato de fecha no valido. Favor de ingresar los datos de acuerdo al formato.\nPresiona una tecla pra continuar...");
			s.nextLine();
			return null;
		}
        System.out.println("Precio de compra: ");
        try {
			nuevoProducto.setPrecioCompra(Double.parseDouble(s.nextLine()));
		} catch (Exception e) {
			System.out.println("Este campo solo admite valores numericos.\nPresiona una tecla pra continuar...");
			s.nextLine();
			return null;
		}
        System.out.println("Precio de venta: ");
        try {
			nuevoProducto.setPrecioVenta(Double.parseDouble(s.nextLine()));
		} catch (Exception e) {
			System.out.println("Este campo solo admite valores numericos.\nPresiona una tecla pra continuar...");
			s.nextLine();
			return null;
		}
        System.out.println("Productor asociado: ");
        nuevoProducto.setProductorA(s.nextLine());
        if(validaProveedor(nuevoProducto.getProductorA())==false) {
        	System.out.println("Proveedor no registrado. \nPresiona una tecla pra continuar...");
        	s.nextLine();
			return null;
        }
        System.out.println("\nTipos de productos: \n1) Alimento \n2) Ropa \n3) Tarjeta de regalo");
        System.out.println("\nTipo: ");
        String tipo =s.nextLine();
        if(tipo.equals("1")) {
        	nuevoProducto.setTipo("Alimento");
        	Alimento nuevoAlimento = new Alimento(nuevoProducto);
        	Lec.escribeArchivo("productos.txt", nuevoAlimento.mostrarInfo());
        	return nuevoAlimento;
        }
        else if (tipo.equals("2")) {
        	nuevoProducto.setTipo("Ropa");
        	Ropa nuevoRopa = new Ropa(nuevoProducto);
        	Lec.escribeArchivo("productos.txt", nuevoRopa.mostrarInfo());
        	return nuevoRopa;
        }
        else if (tipo.equals("3")) {
        	nuevoProducto.setTipo("Tarjeta de regalo");
        	TarjetaRegalo nuevoTarjeta = new TarjetaRegalo(nuevoProducto);
        	Lec.escribeArchivo("productos.txt", nuevoTarjeta.mostrarInfo());
        	return nuevoTarjeta;
        }
        else{
        	return null;
        }
	}
    
    
}
