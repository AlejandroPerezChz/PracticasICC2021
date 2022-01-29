package inventario.entidades;

import java.util.Date;
/**
 * Clase que representa una actividad especifica 
 * realizada por un usuario
 * @author alejandro.perez
 * @since 11/11/2021
 */
public class Actividad {

	String detalle;
	Date horaActividad;
	
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Date getHoraActividad() {
		return horaActividad;
	}
	public void setHoraActividad(Date horaActividad) {
		this.horaActividad = horaActividad;
	} 
}
