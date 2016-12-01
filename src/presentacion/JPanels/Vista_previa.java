package presentacion.JPanels;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTextArea;
import java.awt.Insets;

public class Vista_previa extends JPanel {
	private JTabbedPane tabbedPane;
	private JPanel vista_previa;
	private JPanel buscar;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public Vista_previa() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		add(tabbedPane, gbc_tabbedPane);
		
		vista_previa = new JPanel();
		tabbedPane.addTab("Vista previa", null, vista_previa, null);
		GridBagLayout gbl_vista_previa = new GridBagLayout();
		gbl_vista_previa.columnWidths = new int[]{0, 0};
		gbl_vista_previa.rowHeights = new int[]{0, 0};
		gbl_vista_previa.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_vista_previa.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		vista_previa.setLayout(gbl_vista_previa);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		vista_previa.add(textArea, gbc_textArea);
		
		buscar = new JPanel();
		tabbedPane.addTab("Buscar", null, buscar, null);
		GridBagLayout gbl_buscar = new GridBagLayout();
		gbl_buscar.columnWidths = new int[]{0, 0};
		gbl_buscar.rowHeights = new int[]{0, 0};
		gbl_buscar.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_buscar.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		buscar.setLayout(gbl_buscar);

	}

}
