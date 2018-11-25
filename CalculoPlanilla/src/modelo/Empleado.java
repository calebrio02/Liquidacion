package modelo;

import javax.swing.JOptionPane;
public abstract class Empleado extends Persona{
	
	String nombreTrabajo;
	String dni;
	String lugarTrabajo;
	String fechaInicio;
	String fechaSalida;
	String tiempoLaborado; // Acomodar dela siguiente forma --> #dias, #Meses, #Anios
	String motivoSalida;
	String tipoPago;
	double vacaciones;
	double aguinaldo;
	double preaviso;
	double salarioBruto;
	double cesantia;
	double saldoTotal;

	int diasVacaciones;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	
public int getDiasVacaciones() {
		return diasVacaciones;
	}
	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}
	public String getTiempoLaborado() {
		return tiempoLaborado;
	}
	public void setTiempoLaborado(String tiempoLaborado) {
		this.tiempoLaborado = tiempoLaborado;
	}
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
public void ingresarEmpleado() {  // ignorar esto, ya que se debe enlazar con los ingresa de la interfaz
	
	//ingresaPersona();
	//setNombreTrabajo(JOptionPane.showInputDialog("Digite el nombre de la empresa para la que labora "+getNombre()));
//	setLugarTrabajo(JOptionPane.showInputDialog("Ingrese el puesto que desempena "+getNombre()));
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
