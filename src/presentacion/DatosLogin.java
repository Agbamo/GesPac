package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class DatosLogin extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblDni;
	private JTextField txtApellidos;
	private JTextField txtDni;
	private JLabel lblltimoAcceso;
	private JLabel lblFecha;
	private JLabel lblImagen;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//DatosLogin frame = new DatosLogin(nombre, apellidos, dni, ultimoAcceso); //Ver paso de par�metros.
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DatosLogin(String nombre, String apellidos, String dni, String ultimoAcceso) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 91, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(DatosLogin.class.getResource("/presentacion/icons/027-128.png")));
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.gridwidth = 2;
		gbc_lblImagen.gridheight = 4;
		gbc_lblImagen.insets = new Insets(0, 0, 0, 5);
		gbc_lblImagen.gridx = 1;
		gbc_lblImagen.gridy = 1;
		contentPane.add(lblImagen, gbc_lblImagen);
		
		lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 4;
		gbc_lblNombre.gridy = 1;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setText(nombre);
		txtNombre.setEnabled(false);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 5;
		gbc_txtNombre.gridy = 1;
		contentPane.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 4;
		gbc_lblApellidos.gridy = 2;
		contentPane.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setText(apellidos);
		txtApellidos.setEnabled(false);
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 5;
		gbc_txtApellidos.gridy = 2;
		contentPane.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		lblDni = new JLabel("DNI:");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 4;
		gbc_lblDni.gridy = 3;
		contentPane.add(lblDni, gbc_lblDni);
		
		txtDni = new JTextField();
		txtDni.setText(dni);
		txtDni.setEnabled(false);
		GridBagConstraints gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.insets = new Insets(0, 0, 5, 5);
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.gridx = 5;
		gbc_txtDni.gridy = 3;
		contentPane.add(txtDni, gbc_txtDni);
		txtDni.setColumns(10);
		
		lblltimoAcceso = new JLabel("\u00DAltimo acceso:");
		GridBagConstraints gbc_lblltimoAcceso = new GridBagConstraints();
		gbc_lblltimoAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_lblltimoAcceso.gridx = 4;
		gbc_lblltimoAcceso.gridy = 4;
		contentPane.add(lblltimoAcceso, gbc_lblltimoAcceso);
		
		lblFecha = new JLabel(ultimoAcceso);
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 5;
		gbc_lblFecha.gridy = 4;
		contentPane.add(lblFecha, gbc_lblFecha);
	}

}
