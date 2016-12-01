package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;

public class Breadcrumbs extends JPanel {
	private JLabel lblBreadCrumbs;

	/**
	 * Create the panel.
	 */
	public Breadcrumbs() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{286, 0};
		gridBagLayout.rowHeights = new int[]{32, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		{
			lblBreadCrumbs = new JLabel("Breadcrumbs");
			GridBagConstraints gbc_lblBreadCrumbs = new GridBagConstraints();
			gbc_lblBreadCrumbs.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblBreadCrumbs.gridx = 0;
			gbc_lblBreadCrumbs.gridy = 0;
			add(lblBreadCrumbs, gbc_lblBreadCrumbs);
		}

	}

}
