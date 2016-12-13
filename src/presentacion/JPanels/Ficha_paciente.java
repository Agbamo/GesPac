package presentacion.JPanels;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Ficha_paciente extends JPanel {
	private JTabbedPane tabbedPane;
	private JPanel Datos;
	private JPanel Anatomia;
	private JPanel Info_destacable;
	private JLabel lblNHistorial;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblFechaDeNacimiento;
	private JLabel lblCip;
	private JLabel lblEdad;
	private JLabel lblDocIdentificador;
	private JLabel lblGnero;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtFecha;
	private JTextField txtEdad;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JTextField txtDocumento;
	private JLabel lblImagen;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public Ficha_paciente() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setSize(new Dimension(400, 0));
		add(tabbedPane);
		
		Datos = new JPanel();
		tabbedPane.addTab("Datos del paciente", null, Datos, null);
		GridBagLayout gbl_Datos = new GridBagLayout();
		gbl_Datos.columnWidths = new int[]{0, 0, 0, 0, 0, 17, 0, 0, 0, 0, 0, 0, 34, 0, 0, 0};
		gbl_Datos.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_Datos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Datos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Datos.setLayout(gbl_Datos);
		
		lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(Ficha_paciente.class.getResource("/presentacion/icons/medics_img/medico_64x64.png")));
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.gridheight = 4;
		gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagen.gridx = 1;
		gbc_lblImagen.gridy = 1;
		Datos.add(lblImagen, gbc_lblImagen);
		
		lblNHistorial = new JLabel("N\u00BA historial");
		GridBagConstraints gbc_lblNHistorial = new GridBagConstraints();
		gbc_lblNHistorial.gridwidth = 2;
		gbc_lblNHistorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblNHistorial.gridx = 3;
		gbc_lblNHistorial.gridy = 1;
		Datos.add(lblNHistorial, gbc_lblNHistorial);
		
		lblCip = new JLabel("CIP");
		GridBagConstraints gbc_lblCip = new GridBagConstraints();
		gbc_lblCip.insets = new Insets(0, 0, 5, 5);
		gbc_lblCip.gridx = 7;
		gbc_lblCip.gridy = 1;
		Datos.add(lblCip, gbc_lblCip);
		
		lblDocIdentificador = new JLabel("Doc. Identificador");
		GridBagConstraints gbc_lblDocIdentificador = new GridBagConstraints();
		gbc_lblDocIdentificador.anchor = GridBagConstraints.EAST;
		gbc_lblDocIdentificador.insets = new Insets(0, 0, 5, 5);
		gbc_lblDocIdentificador.gridx = 10;
		gbc_lblDocIdentificador.gridy = 1;
		Datos.add(lblDocIdentificador, gbc_lblDocIdentificador);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"DNI", "NIF"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 11;
		gbc_comboBox_1.gridy = 1;
		Datos.add(comboBox_1, gbc_comboBox_1);
		
		txtDocumento = new JTextField();
		GridBagConstraints gbc_txtDocumento = new GridBagConstraints();
		gbc_txtDocumento.insets = new Insets(0, 0, 5, 5);
		gbc_txtDocumento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDocumento.gridx = 12;
		gbc_txtDocumento.gridy = 1;
		Datos.add(txtDocumento, gbc_txtDocumento);
		txtDocumento.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 4;
		gbc_lblNombre.gridy = 2;
		Datos.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 9;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 5;
		gbc_txtNombre.gridy = 2;
		Datos.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 4;
		gbc_lblApellidos.gridy = 3;
		Datos.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 9;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 5;
		gbc_txtApellidos.gridy = 3;
		Datos.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		GridBagConstraints gbc_lblFechaDeNacimiento = new GridBagConstraints();
		gbc_lblFechaDeNacimiento.gridwidth = 2;
		gbc_lblFechaDeNacimiento.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeNacimiento.gridx = 3;
		gbc_lblFechaDeNacimiento.gridy = 4;
		Datos.add(lblFechaDeNacimiento, gbc_lblFechaDeNacimiento);
		
		txtFecha = new JTextField();
		GridBagConstraints gbc_txtFecha = new GridBagConstraints();
		gbc_txtFecha.gridwidth = 3;
		gbc_txtFecha.insets = new Insets(0, 0, 5, 5);
		gbc_txtFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFecha.gridx = 5;
		gbc_txtFecha.gridy = 4;
		Datos.add(txtFecha, gbc_txtFecha);
		txtFecha.setColumns(10);
		
		lblEdad = new JLabel("Edad");
		GridBagConstraints gbc_lblEdad = new GridBagConstraints();
		gbc_lblEdad.anchor = GridBagConstraints.EAST;
		gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdad.gridx = 8;
		gbc_lblEdad.gridy = 4;
		Datos.add(lblEdad, gbc_lblEdad);
		
		txtEdad = new JTextField();
		GridBagConstraints gbc_txtEdad = new GridBagConstraints();
		gbc_txtEdad.gridwidth = 2;
		gbc_txtEdad.insets = new Insets(0, 0, 5, 5);
		gbc_txtEdad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEdad.gridx = 9;
		gbc_txtEdad.gridy = 4;
		Datos.add(txtEdad, gbc_txtEdad);
		txtEdad.setColumns(10);
		
		lblGnero = new JLabel("G\u00E9nero");
		GridBagConstraints gbc_lblGnero = new GridBagConstraints();
		gbc_lblGnero.anchor = GridBagConstraints.EAST;
		gbc_lblGnero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGnero.gridx = 11;
		gbc_lblGnero.gridy = 4;
		Datos.add(lblGnero, gbc_lblGnero);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 12;
		gbc_comboBox.gridy = 4;
		Datos.add(comboBox, gbc_comboBox);
		
		Anatomia = new JPanel();
		tabbedPane.addTab("Anatom\u00EDa", null, Anatomia, null);
		GridBagLayout gbl_Anatomia = new GridBagLayout();
		gbl_Anatomia.columnWidths = new int[]{0};
		gbl_Anatomia.rowHeights = new int[]{0};
		gbl_Anatomia.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_Anatomia.rowWeights = new double[]{Double.MIN_VALUE};
		Anatomia.setLayout(gbl_Anatomia);
		
		Info_destacable = new JPanel();
		tabbedPane.addTab("Info. Destacable", null, Info_destacable, null);
		GridBagLayout gbl_Info_destacable = new GridBagLayout();
		gbl_Info_destacable.columnWidths = new int[]{0, 0};
		gbl_Info_destacable.rowHeights = new int[]{0, 0};
		gbl_Info_destacable.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_Info_destacable.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		Info_destacable.setLayout(gbl_Info_destacable);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		Info_destacable.add(textArea, gbc_textArea);

	}

}
