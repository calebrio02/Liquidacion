package vista;

import java.awt.HeadlessException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;


public class PrincipalPlanilla {

	public static void main(String[] args) throws HeadlessException, IOException {
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy"); 
	     
	     final String firstInput = JOptionPane.showInputDialog("primera fecha. Formato: dd MM aaaa"); 
	     final String secondInput = JOptionPane.showInputDialog("segunda fecha. Formato: dd MM aaaa"); 
	     final LocalDate firstDate = LocalDate.parse(firstInput, formatter); 
	     final LocalDate secondDate = LocalDate.parse(secondInput, formatter); 
	    double meses = betweenDates(firstDate, secondDate);
	    double anios = ChronoUnit.YEARS.between(firstDate, secondDate);
	    double semanas = ChronoUnit.WEEKS.between(firstDate, secondDate);
	    double dias= ChronoUnit.DAYS.between(firstDate, secondDate);
	    JOptionPane.showMessageDialog(null, "Diferencia en meses: "+ meses+"\n"
	    		+ "Diferencia en anios: " + anios +"\n"
	    		+ "Diferencia en semanas: "+ semanas+"\n"
	    				+ "Diferencia en dias: "+dias);
	     
//
	}
	public static long betweenDates(LocalDate firstDate, LocalDate secondDate) throws IOException 
	{ 
	     return ChronoUnit.MONTHS.between(firstDate, secondDate); 
	}
}
