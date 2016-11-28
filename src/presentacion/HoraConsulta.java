package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ComponentColorModel;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HoraConsulta extends JPanel {
	private JLabel lblHora;
	private JPanel panel;
	private JFrame padre;
	private JToggleButton toggleButton;
	private JLabel lblNombrePaciente;
	
	private String hora;
	private String nombre_paciente;
	private JToggleButton toggleButton_1;
	
	
	private ImageIcon ENTER = new ImageIcon(HoraConsulta.class.getResource("/presentacion/icons/daily/SignIn_16x16.png"));
	private ImageIcon EXIT = new ImageIcon(HoraConsulta.class.getResource("/presentacion/icons/daily/SignOut_16x16.png"));
	private ImageIcon CANCEL = new ImageIcon(HoraConsulta.class.getResource("/presentacion/icons/daily/Close_Icon_Dark_16x16.png"));
	private ImageIcon CHECK = new ImageIcon(HoraConsulta.class.getResource("/presentacion/icons/daily/Tick_Mark_Circle_16x16.png"));
	private ImageIcon LATER = new ImageIcon(HoraConsulta.class.getResource("/presentacion/icons/daily/out_oflist_16x16.png"));
	private ImageIcon NOTHING = new ImageIcon(HoraConsulta.class.getResource("/presentacion/icons/daily/Nothing_16x16.png"));
	private ImageIcon QUESTION = new ImageIcon(HoraConsulta.class.getResource("/presentacion/icons/daily/question_16x16.png"));
	private ImageIcon REVERT = new ImageIcon(HoraConsulta.class.getResource("/presentacion/icons/daily/document-revert_16x16.png"));
	/**
	 * Create the panel.
	 */
	public HoraConsulta(String hora, String nombre_paciente) {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.hora = hora;
		this.nombre_paciente = nombre_paciente;
		
		setLayout(new BorderLayout(0, 0));
		{
			lblHora = new JLabel(hora);
			lblHora.setMinimumSize(new Dimension(65, 32));
			lblHora.addMouseListener(new LblHoraMouseListener());
			lblHora.setIcon(NOTHING);
			add(lblHora, BorderLayout.NORTH);
		}
		{
			panel = new JPanel();
			add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{72, 72, 0};
			gbl_panel.rowHeights = new int[]{31, 31, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				lblNombrePaciente = new JLabel(nombre_paciente);
				GridBagConstraints gbc_lblNombrePaciente = new GridBagConstraints();
				gbc_lblNombrePaciente.gridwidth = 2;
				gbc_lblNombrePaciente.fill = GridBagConstraints.BOTH;
				gbc_lblNombrePaciente.insets = new Insets(0, 0, 5, 0);
				gbc_lblNombrePaciente.gridx = 0;
				gbc_lblNombrePaciente.gridy = 0;
				panel.add(lblNombrePaciente, gbc_lblNombrePaciente);
			}
			{
				toggleButton_1 = new JToggleButton("");
				toggleButton_1.addActionListener(new ToggleButton_1ActionListener());
				toggleButton_1.setToolTipText("Entrada del paciente");
				toggleButton_1.setIcon(ENTER);
				toggleButton_1.setSelectedIcon(EXIT);
				GridBagConstraints gbc_toggleButton_1 = new GridBagConstraints();
				gbc_toggleButton_1.insets = new Insets(0, 0, 0, 5);
				gbc_toggleButton_1.gridx = 0;
				gbc_toggleButton_1.gridy = 1;
				panel.add(toggleButton_1, gbc_toggleButton_1);
			}
			{
				toggleButton = new JToggleButton("");
				toggleButton.addActionListener(new ToggleButtonActionListener());
				toggleButton.setToolTipText("No ha aparecido el paciente.");
				toggleButton.setSelectedIcon(LATER);
				toggleButton.setIcon(QUESTION);
				GridBagConstraints gbc_toggleButton = new GridBagConstraints();
				gbc_toggleButton.fill = GridBagConstraints.VERTICAL;
				gbc_toggleButton.gridx = 1;
				gbc_toggleButton.gridy = 1;
				panel.add(toggleButton, gbc_toggleButton);
			}
			
		}
		panel.setVisible(false);
		panel.setSize(panel.getPreferredSize());

	}
	
	public Object getFather(){
		return this.padre;
	}

	private class LblHoraMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			//Hacer que aparezca o desaparezca el panel del medio
			panel.setVisible(!panel.isVisible());
			panel.setSize(panel.getPreferredSize());
			
			
			
			
		}
	}
	private class ToggleButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
			if (toggleButton_1.isSelected()){
				
				toggleButton_1.setIcon(EXIT);
				toggleButton_1.setToolTipText("Terminar consulta.");
				
				
				toggleButton.setSelected(false);
				toggleButton.setIcon(CANCEL);
				toggleButton.setToolTipText("Cancelar acción.");
				
				lblHora.setIcon(ENTER);
				lblHora.setForeground(Color.BLACK);
				toggleButton.setEnabled(true);
			}
			else{
				
				lblHora.setIcon(CHECK);
				lblHora.setForeground(Color.GREEN);
				
				toggleButton_1.setIcon(REVERT);
				toggleButton_1.setToolTipText("Volver a la consulta.");
				
				
				toggleButton.setIcon(NOTHING);
				toggleButton.setDisabledSelectedIcon(NOTHING);
				toggleButton.setEnabled(false);
				
			}
			
		}
	}
	private class ToggleButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (!toggleButton_1.isSelected()){
				if(toggleButton.isSelected()){
					toggleButton.setIcon(LATER);
					toggleButton.setToolTipText("Atendido fuera de orden.");
					
					toggleButton_1.setIcon(ENTER);
					toggleButton_1.setToolTipText("Entrada del paciente.");
					
					lblHora.setIcon(QUESTION);
					lblHora.setForeground(Color.ORANGE);
				}else{
					toggleButton.setIcon(QUESTION);
					toggleButton.setToolTipText("No ha aparecido el paciente..");
					
					toggleButton_1.setIcon(ENTER);
					toggleButton_1.setToolTipText("Entrada del paciente.");
					
					lblHora.setIcon(NOTHING);
					lblHora.setForeground(Color.BLACK);
				}
			}else{
				lblHora.setIcon(NOTHING);
				lblHora.setForeground(Color.BLACK);
				
				toggleButton_1.setIcon(ENTER);
				toggleButton_1.setToolTipText("Entrada del paciente.");
				toggleButton_1.setSelected(false);
				
				toggleButton.setIcon(QUESTION);
				toggleButton.setSelected(false);
				toggleButton.setToolTipText("No ha aparecido el paciente.");
			}		
		}
	}
}
