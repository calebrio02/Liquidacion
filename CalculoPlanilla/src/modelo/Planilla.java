package modelo;

import javax.swing.JOptionPane;
/*Hacen falta los calculos para 
 * HorasExtra dependiendo de la jornada
 * del impuesto de renta
 * del seguro obligatorio
 * si tuviese embargo por pension
 * si tuviese algun otro embargo po ejemplo bancario
 * si tuvo incapcidad
 * si tuvo permiso sin goce de salario
 * si aporta para la asociacion solidarista de la empresa
 * y el total*/
public class Planilla extends Empleado{

	double salarioBase=0;
	double horasExtraDiurna=0;
	double horasExtraMixta=0;
	double horasExtraNoctunrna=0;
	int incapcidad=0, permisos=0;
	double comision=0;
	double embargos=0;
	double pension=0;
	double asociacion=0;
	
public Planilla() {	
}
public double getSalarioBase() {
	return salarioBase;
}
public void setSalarioBase(double salarioBase) {
	this.salarioBase = salarioBase;
}
public double getHorasExtraDiurna() {
	return horasExtraDiurna;
}
public void setHorasExtraDiurna(double horasExtraDiurna) {
	this.horasExtraDiurna = horasExtraDiurna;
}
public double getHorasExtraMixta() {
	return horasExtraMixta;
}
public void setHorasExtraMixta(double horasExtraMixta) {
	this.horasExtraMixta = horasExtraMixta;
}
public double getHorasExtraNoctunrna() {
	return horasExtraNoctunrna;
}
public void setHorasExtraNoctunrna(double horasExtraNoctunrna) {
	this.horasExtraNoctunrna = horasExtraNoctunrna;
}
public int getIncapcidad() {
	return incapcidad;
}
public void setIncapcidad(int incapcidad) {
	this.incapcidad = incapcidad;
}
public int getPermisos() {
	return permisos;
}
public void setPermisos(int permisos) {
	this.permisos = permisos;
}
public double getComision() {
	return comision;
}
public void setComision(double comision) {
	this.comision = comision;
}
public double getEmbargos() {
	return embargos;
}
public void setEmbargos(double embargos) {
	this.embargos = embargos;
}
public double getPension() {
	return pension;
}
public void setPension(double pension) {
	this.pension = pension;
}
public double getAsociacion() {
	return asociacion;
}
public void setAsociacion(double asociacion) {
	this.asociacion = asociacion;
}
public void ingresaPlanilla() {
	int cambio=0;
	ingresarEmpleado();
	
	do {
		try {
			setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base de "+getNombre())));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresa solo numeros\n"+ "Para conocer mas detalles del error busca: \n"+e);
			cambio=0;
		}
	} while (cambio==0);
	
	do {
		try {
			setHorasExtraDiurna(Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas extras de " +  getNombre()+" en modalidad diurna \n"
					+ "(Digitar 0 en caso de no haber)")));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresa solo numeros\n"+ "Para conocer mas detalles del error busca: \n"+e);
			cambio=0;
		}
	} while (cambio==0);
	
	do {
		try {
			setHorasExtraMixta(Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas extras de " +  getNombre()+" en modalidad mixta \n"
					+ "(Digitar 0 en caso de no haber)")));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresa solo numeros\n"+ "Para conocer mas detalles del error busca: \n"+e);
			cambio=0;
		}
	} while (cambio==0);
	
	do {
		try {
			setHorasExtraNoctunrna(Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas extras de " +  getNombre()+" en modalidad nocturna \n"
					+ "(Digitar 0 en caso de no haber)")));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresa solo numeros\n"+ "Para conocer mas detalles del error busca: \n"+e);
			cambio=0;
		}
	} while (cambio==0);
	
	do {
		try {
			setIncapcidad(Integer.parseInt(JOptionPane.showInputDialog("Dias de incapacidad de " +getNombre()+"\n"
					+ "(Digitar 0 en caso de no haber)")));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresa solo numeros\n"+ "Para conocer mas detalles del error busca: \n"+e);
			cambio=0;
		}
	} while (cambio==0);
	
	do {
		try {
			setPermisos(Integer.parseInt(JOptionPane.showInputDialog("Dias de libre sin goce salarial de " +getNombre()+"\n"
					+ "(Digitar 0 en caso de no haber)")));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresa solo numeros\n"+ "Para conocer mas detalles del error busca: \n"+e);
			cambio=0;
		}
	} while (cambio==0);
	
	do {
		try {
			setComision(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la comision ganada por " +  getNombre()+" \n"
					+ "(Digitar 0 en caso de no haber)")));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresa solo numeros\n"+ "Para conocer mas detalles del error busca: \n"+e);
			cambio=0;
		}
	} while (cambio==0);
	
	do {
		try {
			setEmbargos(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje a rebajar por concepto de embargo salarial " +  getNombre()+"  \n"
					+ "(Digitar 0 en caso de no haber)")));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresa solo numeros\n"+ "Para conocer mas detalles del error busca: \n"+e);
			cambio=0;
		}
	} while (cambio==0);
	
	do {
		try {
			setPension(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje a rebajar por concepto de pension alimenticia de " +  getNombre()+"  \n"
					+ "(Digitar 0 en caso de no haber)")));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresa solo numeros\n"+ "Para conocer mas detalles del error busca: \n"+e);
			cambio=0;
		}
	} while (cambio==0);
	
	do {
		try {
			setAsociacion(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje a rebajar por concepto de asociacion de " +  getNombre()+" \n"
					+ "(Digitar 0 en caso de no haber)")));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresa solo numeros\n"+ "Para conocer mas detalles del error busca: \n"+e);
			cambio=0;
		}
	} while (cambio==0);
}
@Override
public void ingresar() {
	// TODO Auto-generated method stub
	
}
@Override
public String soloDNI() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String soloNombre() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return null;
}
}
