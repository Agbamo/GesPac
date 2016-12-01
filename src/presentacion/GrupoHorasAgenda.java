package presentacion;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;

public class GrupoHorasAgenda extends JPanel {
	
	ArrayList<HoraConsulta> horaConlusta_list = new ArrayList<>();
	private HoraConsulta cita;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JButton btnAniadirUrgencia;

	/**
	 * Create the panel.
	 */
	public GrupoHorasAgenda() {
		setLayout(new BorderLayout(0, 0));
		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "Agenda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(scrollPane);
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		{
			btnAniadirUrgencia = new JButton("Añadir urgencia");
			btnAniadirUrgencia.setIcon(new ImageIcon(GrupoHorasAgenda.class.getResource("/presentacion/icons/daily/emergency_32x32.png")));
			add(btnAniadirUrgencia, BorderLayout.SOUTH);
		}
		
		String horas;
		String minutos;
		String nombre_paciente;
		
		for(int i=8; i<=14; i++){
			if(i < 10) horas = "0" + String.valueOf(i);
			else horas = String.valueOf(i);
			for(int j=0; j<60; j+=10){
				if(j == 0) minutos= "0" + String.valueOf(j);
				else minutos = String.valueOf(j);
				
				nombre_paciente = "Paciente " + horas + ":" + minutos;
				this.cita = new HoraConsulta(horas + ":"  + minutos, nombre_paciente);
				panel.add(cita);
			}
		}
		setPreferredSize(panel.getPreferredSize());
		//padre.pack();

	}

}
