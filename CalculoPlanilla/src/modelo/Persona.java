package modelo;

import javax.swing.JOptionPane;

public class Persona {
	
	String nombre;
	String dni;
	
public Persona() {
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public void ingresaPersona() {
	
	setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado"));
	setDni(JOptionPane.showInputDialog("Ingrese el numero de identificacion de "+getNombre()));
}

public String muestraPersona() {
	String respuesta="";
	
	respuesta+="Nombre: "+getNombre()+"\n"
			+ "Identificacion: "+getDni()+"\n\n";
	
	return respuesta;
}
}
