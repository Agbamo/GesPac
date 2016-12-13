package presentacion.JPanels;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import java.awt.Dimension;
import java.awt.Rectangle;

public class Motivo_consulta extends JPanel {
	private JLabel lblMotivoDeLa;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public Motivo_consulta() {
		setBounds(new Rectangle(0, 0, 650, 208));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 483, 0};
		gridBagLayout.rowHeights = new int[]{21, 9, 127, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblMotivoDeLa = new JLabel("Motivo de la consulta:");
		GridBagConstraints gbc_lblMotivoDeLa = new GridBagConstraints();
		gbc_lblMotivoDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotivoDeLa.gridx = 1;
		gbc_lblMotivoDeLa.gridy = 1;
		add(lblMotivoDeLa, gbc_lblMotivoDeLa);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.gridwidth = 2;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 2;
		add(textArea, gbc_textArea);

	}

}
