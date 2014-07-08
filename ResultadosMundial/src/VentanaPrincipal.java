import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField nombreEquipo1;
	private JTextField nombreEquipo2;
	private JTextField golesEquipo1;
	private JTextField golesEquipo2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 33, 414, 20);
		contentPane.add(comboBox);
		
		JLabel lblEnfrentamiento = new JLabel("Enfrentamiento");
		lblEnfrentamiento.setBounds(10, 11, 115, 14);
		contentPane.add(lblEnfrentamiento);
		
		JLabel lblEquipo = new JLabel("EQUIPO1");
		lblEquipo.setBounds(10, 75, 81, 14);
		contentPane.add(lblEquipo);
		
		JLabel lblEquipo_1 = new JLabel("EQUIPO2");
		lblEquipo_1.setBounds(248, 75, 73, 14);
		contentPane.add(lblEquipo_1);
		
		nombreEquipo1 = new JTextField();
		nombreEquipo1.setEditable(false);
		nombreEquipo1.setBounds(10, 100, 176, 20);
		contentPane.add(nombreEquipo1);
		nombreEquipo1.setColumns(10);
		
		nombreEquipo2 = new JTextField();
		nombreEquipo2.setEditable(false);
		nombreEquipo2.setColumns(10);
		nombreEquipo2.setBounds(248, 100, 176, 20);
		contentPane.add(nombreEquipo2);
		
		JLabel lblGolesEquipo = new JLabel("Goles Equipo 1");
		lblGolesEquipo.setBounds(10, 139, 81, 14);
		contentPane.add(lblGolesEquipo);
		
		JLabel lblGolesEquipo_1 = new JLabel("Goles Equipo 2");
		lblGolesEquipo_1.setBounds(248, 139, 81, 14);
		contentPane.add(lblGolesEquipo_1);
		
		golesEquipo1 = new JTextField();
		golesEquipo1.setEditable(false);
		golesEquipo1.setColumns(10);
		golesEquipo1.setBounds(10, 164, 176, 20);
		contentPane.add(golesEquipo1);
		
		golesEquipo2 = new JTextField();
		golesEquipo2.setEditable(false);
		golesEquipo2.setColumns(10);
		golesEquipo2.setBounds(248, 164, 176, 20);
		contentPane.add(golesEquipo2);
	}
}
