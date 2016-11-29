package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;

public class SesionDoctor extends JPanel {
	private JLabel lblDoctorImg;
	private JComboBox comboBox;

	private String nombre_doctor;
	/**
	 * Create the panel.
	 */
	public SesionDoctor(String nombre_doctor) {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.nombre_doctor = nombre_doctor;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		{
			lblDoctorImg = new JLabel("");
			lblDoctorImg.setIcon(new ImageIcon(SesionDoctor.class.getResource("/presentacion/icons/medics_img/medico_32x32.png")));
			GridBagConstraints gbc_lblDoctorImg = new GridBagConstraints();
			gbc_lblDoctorImg.anchor = GridBagConstraints.EAST;
			gbc_lblDoctorImg.insets = new Insets(0, 0, 0, 5);
			gbc_lblDoctorImg.gridx = 0;
			gbc_lblDoctorImg.gridy = 0;
			add(lblDoctorImg, gbc_lblDoctorImg);
		}
		{
			String [] opciones_list = new String [] {nombre_doctor,"Cerrar sesión"};
			comboBox = new JComboBox(opciones_list);
			comboBox.setRenderer(new SesionDoctorRender());
			
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 0;
			add(comboBox, gbc_comboBox);
		}

	}

}
