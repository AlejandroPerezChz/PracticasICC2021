package inventario.entidades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Clase que representa un usuario que hace login en la aplicación
 * @author alejandro.perez
 * @since 11/11/2021
 */
public class Usuario {
	String userName;
	String password;
	Date inicioSesion;
	Date finalSesion;
	List<Actividad> actividades =new ArrayList<Actividad>();
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getInicioSesion() {
		return inicioSesion;
	}
	public void setInicioSesion(Date inicioSesion) {
		this.inicioSesion = inicioSesion;
	}
	public Date getFinalSesion() {
		return finalSesion;
	}
	public void setFinalSesion(Date finalSesion) {
		this.finalSesion = finalSesion;
	}
	public List<Actividad> getActividades() {
		return actividades;
	}
	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String muesstraLog() {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String actividad="";
		for(Actividad act:actividades)  {
			actividad= actividad+"\n	Detalle: "+act.getDetalle()+" Horario: "+formatter.format(act.getHoraActividad()); 
		}
			    
		return "Datos de sesión: \n   Usuario=" + userName 
				+ "\n   Inicio de sesión=" + formatter.format(inicioSesion) 
				+ "\n   Productos Entregados=" + formatter.format(finalSesion)
				+ "\n   ACTIVIDADES" + actividad ;
	}
	public String stringBitacora() {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");	    
		return "inicio de sesión:   Usuario=" + userName + "   Hora de inicio=" + formatter.format(inicioSesion);
	}
	
}
