package presentacion.JPanels;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JList;

public class Informes_adjuntos extends JPanel {
	private JLabel lblInformesAdjuntos;
	private JButton btnAgregarInforme;
	private JButton btnSolicitarPrueba;
	private JList list;
	private JLabel lblFecha;
	private JLabel lblTipo;
	private JLabel lblDescripcin;
	private JList list_1;
	private JList list_2;

	/**
	 * Create the panel.
	 */
	public Informes_adjuntos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 73, 64, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblInformesAdjuntos = new JLabel("Informes Adjuntos");
		GridBagConstraints gbc_lblInformesAdjuntos = new GridBagConstraints();
		gbc_lblInformesAdjuntos.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformesAdjuntos.gridx = 1;
		gbc_lblInformesAdjuntos.gridy = 0;
		add(lblInformesAdjuntos, gbc_lblInformesAdjuntos);
		
		lblFecha = new JLabel("Fecha");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 1;
		gbc_lblFecha.gridy = 1;
		add(lblFecha, gbc_lblFecha);
		
		lblTipo = new JLabel("Tipo");
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.gridx = 2;
		gbc_lblTipo.gridy = 1;
		add(lblTipo, gbc_lblTipo);
		
		lblDescripcin = new JLabel("Descripci\u00F3n");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 3;
		gbc_lblDescripcin.gridy = 1;
		add(lblDescripcin, gbc_lblDescripcin);
		
		list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 4;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 2;
		add(list, gbc_list);
		
		list_1 = new JList();
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.gridheight = 4;
		gbc_list_1.insets = new Insets(0, 0, 5, 5);
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.gridx = 2;
		gbc_list_1.gridy = 2;
		add(list_1, gbc_list_1);
		
		list_2 = new JList();
		GridBagConstraints gbc_list_2 = new GridBagConstraints();
		gbc_list_2.gridheight = 4;
		gbc_list_2.insets = new Insets(0, 0, 5, 5);
		gbc_list_2.fill = GridBagConstraints.BOTH;
		gbc_list_2.gridx = 3;
		gbc_list_2.gridy = 2;
		add(list_2, gbc_list_2);
		
		btnAgregarInforme = new JButton("Agregar Informe");
		GridBagConstraints gbc_btnAgregarInforme = new GridBagConstraints();
		gbc_btnAgregarInforme.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregarInforme.gridx = 5;
		gbc_btnAgregarInforme.gridy = 3;
		add(btnAgregarInforme, gbc_btnAgregarInforme);
		
		btnSolicitarPrueba = new JButton("Solicitar prueba");
		GridBagConstraints gbc_btnSolicitarPrueba = new GridBagConstraints();
		gbc_btnSolicitarPrueba.insets = new Insets(0, 0, 5, 5);
		gbc_btnSolicitarPrueba.gridx = 5;
		gbc_btnSolicitarPrueba.gridy = 4;
		add(btnSolicitarPrueba, gbc_btnSolicitarPrueba);

	}

}
