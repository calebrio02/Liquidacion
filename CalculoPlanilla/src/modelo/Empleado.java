package modelo;

import javax.swing.JOptionPane;
public abstract class Empleado extends Persona{
	
	String nombreTrabajo;
	String lugarTrabajo;
	
public Empleado() {
}
public String getNombreTrabajo() {
	return nombreTrabajo;
}
public void setNombreTrabajo(String nombreTrabajo) {
	this.nombreTrabajo = nombreTrabajo;
}
public String getLugarTrabajo() {
	return lugarTrabajo;
}
public void setLugarTrabajo(String lugarTrabajo) {
	this.lugarTrabajo = lugarTrabajo;
}
public void ingresarEmpleado() {
	
	ingresaPersona();
	setNombreTrabajo(JOptionPane.showInputDialog("Digite el nombre de la empresa para la que labora "+getNombre()));
	setLugarTrabajo(JOptionPane.showInputDialog("Ingrese el puesto que desempena "+getNombre()));
}
public String muestraEmpleado() {
	
	String respuesta="";
	
	respuesta+=	muestraPersona()
				+"Empresa: "+getNombreTrabajo()+"\n"
				+"Puesto: "+getLugarTrabajo()+"\n\n";
	
	return respuesta;
}
public abstract void ingresar();

public abstract String soloDNI();

public abstract String soloNombre();

public abstract String toString();
}
