package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import com.github.lgooddatepicker.components.DateTimePicker;
import com.github.lgooddatepicker.components.DatePicker;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Menu extends JFrame {

	private JPanel PanelPrincipal;
	private JPanel PanelMenu;
	private JPanel PanelIngreso;
	private JButton btnIngresarEmpleado;
	private JButton btnAtrasIngresar;
	private DatePicker SelectorFechaInicio;
	private JTextField textNombre;
	private DatePicker SelectorFechaFinal;
	private JTextField textLugarDeTrabajo;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		Interfaz();
		Acciones();
	}
	public void Acciones() {
		
		btnIngresarEmpleado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal.removeAll();
				PanelPrincipal.add(PanelIngreso);
				PanelPrincipal.repaint();
				PanelPrincipal.revalidate();
			}
		});
		
		
		btnAtrasIngresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PanelPrincipal.removeAll();
				PanelPrincipal.add(PanelMenu);
				PanelPrincipal.repaint();
				PanelPrincipal.revalidate();
				
			}
		});
		
	}
	public void Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 530);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(new CardLayout(0, 0));
		
		PanelMenu = new JPanel();
		PanelPrincipal.add(PanelMenu, "name_402663833261743");
		PanelMenu.setLayout(null);
		
		btnIngresarEmpleado = new JButton("Ingresar Empleado");
		btnIngresarEmpleado.setBounds(50, 44, 145, 23);
		PanelMenu.add(btnIngresarEmpleado);
		
		PanelIngreso = new JPanel();
		PanelPrincipal.add(PanelIngreso, "name_402666408091989");
		PanelIngreso.setLayout(null);
		
		btnAtrasIngresar = new JButton("Atras");
		btnAtrasIngresar.setBounds(12, 446, 89, 23);
		PanelIngreso.add(btnAtrasIngresar);
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio");
		lblFechaDeInicio.setBounds(12, 116, 89, 16);
		PanelIngreso.add(lblFechaDeInicio);
		
		SelectorFechaInicio = new DatePicker();
		SelectorFechaInicio.setBounds(149, 108, 155, 24);
		PanelIngreso.add(SelectorFechaInicio);
		
		Label label_1 = new Label("Fecha de despido :");
		label_1.setBounds(12, 164, 132, 23);
		PanelIngreso.add(label_1);
		
		SelectorFechaFinal = new DatePicker();
		SelectorFechaFinal.setBounds(149, 163, 155, 24);
		PanelIngreso.add(SelectorFechaFinal);
		
		textNombre = new JTextField();
		textNombre.setBounds(150, 12, 114, 20);
		PanelIngreso.add(textNombre);
		textNombre.setColumns(10);
		
		Label label = new Label("Nombre :");
		label.setBounds(12, 12, 69, 23);
		PanelIngreso.add(label);
		
		textLugarDeTrabajo = new JTextField();
		textLugarDeTrabajo.setBounds(150, 63, 114, 20);
		PanelIngreso.add(textLugarDeTrabajo);
		textLugarDeTrabajo.setColumns(10);
		
		JLabel lblLugarDeTrabajo = new JLabel("Lugar de trabajo");
		lblLugarDeTrabajo.setBounds(12, 65, 102, 16);
		PanelIngreso.add(lblLugarDeTrabajo);
		
		
		
	String[] preaviso = {"selecciona","Con preaviso", "Sin preaviso"};
	String[] motivoSalida = {"selecciona","Despido con resposabilidad", "despido sin responsabilidad","Renuncia","Se acoje a la pension"};
	String[] tipoPago = {"selecciona","semanal", "Quincenal"};
		JComboBox comboBox = new JComboBox(preaviso);
		comboBox.setBounds(459, 10, 186, 25);
		PanelIngreso.add(comboBox);
		
		Label label_2 = new Label("Existe preaviso?");
		label_2.setBounds(351, 12, 102, 23);
		PanelIngreso.add(label_2);
		
		Label label_3 = new Label("Motivo de salida");
		label_3.setBounds(351, 60, 102, 23);
		PanelIngreso.add(label_3);
		
		JComboBox comboBox_1 = new JComboBox(motivoSalida);
		comboBox_1.setBounds(459, 61, 186, 25);
		PanelIngreso.add(comboBox_1);
		
		Label label_4 = new Label("Tipo de pago");
		label_4.setBounds(351, 119, 102, 23);
		PanelIngreso.add(label_4);
		
		JComboBox comboBox_2 = new JComboBox(tipoPago);
		comboBox_2.setBounds(459, 116, 186, 25);
		PanelIngreso.add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(478, 190, 114, 20);
		PanelIngreso.add(textField);
		textField.setColumns(10);
		
		Label label_5 = new Label("Saldo de vacaciones");
		label_5.setBounds(351, 187, 133, 23);
		PanelIngreso.add(label_5);
		
		
	}
}
