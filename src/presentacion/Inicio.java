package presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class Inicio extends JInternalFrame {
	private JLabel lblCorreoInterno;
	private JLabel lblAgenda;
	private JLabel lblConsultas;
	private JLabel lblEnfermera;
	private JLabel lblEspecialistas;
	private JLabel lblAnalticas;
	private JLabel lblInformes;
	private JLabel lblRadiografas;
	private JLabel lblCerrarSesin;
	private JLabel lblAgendaicono;
	private JLabel lblConsultasicono;
	private JLabel lblCorreoicon;
	private JLabel lblEnfermeriaicono;
	private JLabel lblEspecialistasicono;
	private JLabel lblAnalticasicono;
	private JLabel lblInformesicono;
	private JLabel lblRadiografasicono;
	private JLabel lblCerraricono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setClosable(true);
		setIconifiable(true);
		setBounds(100, 100, 722, 596);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		lblAgendaicono = new JLabel("");
		lblAgendaicono.setMaximumSize(new Dimension(34, 7));
		lblAgendaicono.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/040-128.png")));
		GridBagConstraints gbc_lblAgendaicono = new GridBagConstraints();
		gbc_lblAgendaicono.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgendaicono.gridx = 4;
		gbc_lblAgendaicono.gridy = 2;
		getContentPane().add(lblAgendaicono, gbc_lblAgendaicono);
		
		lblConsultasicono = new JLabel("");
		lblConsultasicono.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/hospital009-128.png")));
		GridBagConstraints gbc_lblConsultasicono = new GridBagConstraints();
		gbc_lblConsultasicono.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsultasicono.gridx = 6;
		gbc_lblConsultasicono.gridy = 2;
		getContentPane().add(lblConsultasicono, gbc_lblConsultasicono);
		
		lblCorreoicon = new JLabel("");
		lblCorreoicon.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/path_EMR_online-128.png")));
		GridBagConstraints gbc_lblCorreoicon = new GridBagConstraints();
		gbc_lblCorreoicon.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoicon.gridx = 11;
		gbc_lblCorreoicon.gridy = 2;
		getContentPane().add(lblCorreoicon, gbc_lblCorreoicon);
		
		lblAgenda = new JLabel("Agenda");
		GridBagConstraints gbc_lblAgenda = new GridBagConstraints();
		gbc_lblAgenda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgenda.gridx = 4;
		gbc_lblAgenda.gridy = 3;
		getContentPane().add(lblAgenda, gbc_lblAgenda);
		
		lblConsultas = new JLabel("Consultas");
		GridBagConstraints gbc_lblConsultas = new GridBagConstraints();
		gbc_lblConsultas.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsultas.gridx = 6;
		gbc_lblConsultas.gridy = 3;
		getContentPane().add(lblConsultas, gbc_lblConsultas);
		
		lblCorreoInterno = new JLabel("Correo Interno");
		GridBagConstraints gbc_lblCorreoInterno = new GridBagConstraints();
		gbc_lblCorreoInterno.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoInterno.gridx = 11;
		gbc_lblCorreoInterno.gridy = 3;
		getContentPane().add(lblCorreoInterno, gbc_lblCorreoInterno);
		
		lblEnfermeriaicono = new JLabel("");
		lblEnfermeriaicono.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/69-128.png")));
		GridBagConstraints gbc_lblEnfermeriaicono = new GridBagConstraints();
		gbc_lblEnfermeriaicono.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnfermeriaicono.gridx = 4;
		gbc_lblEnfermeriaicono.gridy = 5;
		getContentPane().add(lblEnfermeriaicono, gbc_lblEnfermeriaicono);
		
		lblEspecialistasicono = new JLabel("");
		lblEspecialistasicono.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/027-128.png")));
		GridBagConstraints gbc_lblEspecialistasicono = new GridBagConstraints();
		gbc_lblEspecialistasicono.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialistasicono.gridx = 6;
		gbc_lblEspecialistasicono.gridy = 5;
		getContentPane().add(lblEspecialistasicono, gbc_lblEspecialistasicono);
		
		lblEnfermera = new JLabel("Enfermer\u00EDa");
		GridBagConstraints gbc_lblEnfermera = new GridBagConstraints();
		gbc_lblEnfermera.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnfermera.gridx = 4;
		gbc_lblEnfermera.gridy = 6;
		getContentPane().add(lblEnfermera, gbc_lblEnfermera);
		
		lblEspecialistas = new JLabel("Especialistas");
		GridBagConstraints gbc_lblEspecialistas = new GridBagConstraints();
		gbc_lblEspecialistas.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialistas.gridx = 6;
		gbc_lblEspecialistas.gridy = 6;
		getContentPane().add(lblEspecialistas, gbc_lblEspecialistas);
		
		lblAnalticasicono = new JLabel("");
		lblAnalticasicono.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/syringe_injection_drug_steroid-128.png")));
		GridBagConstraints gbc_lblAnalticasicono = new GridBagConstraints();
		gbc_lblAnalticasicono.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnalticasicono.gridx = 4;
		gbc_lblAnalticasicono.gridy = 8;
		getContentPane().add(lblAnalticasicono, gbc_lblAnalticasicono);
		
		lblInformesicono = new JLabel("");
		lblInformesicono.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/032-128.png")));
		GridBagConstraints gbc_lblInformesicono = new GridBagConstraints();
		gbc_lblInformesicono.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformesicono.gridx = 6;
		gbc_lblInformesicono.gridy = 8;
		getContentPane().add(lblInformesicono, gbc_lblInformesicono);
		
		lblRadiografasicono = new JLabel("");
		lblRadiografasicono.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/path_radiology-128.png")));
		GridBagConstraints gbc_lblRadiografasicono = new GridBagConstraints();
		gbc_lblRadiografasicono.insets = new Insets(0, 0, 5, 5);
		gbc_lblRadiografasicono.gridx = 8;
		gbc_lblRadiografasicono.gridy = 8;
		getContentPane().add(lblRadiografasicono, gbc_lblRadiografasicono);
		
		lblCerraricono = new JLabel("");
		lblCerraricono.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/gases-128.png")));
		GridBagConstraints gbc_lblCerraricono = new GridBagConstraints();
		gbc_lblCerraricono.insets = new Insets(0, 0, 5, 5);
		gbc_lblCerraricono.gridx = 11;
		gbc_lblCerraricono.gridy = 8;
		getContentPane().add(lblCerraricono, gbc_lblCerraricono);
		
		lblAnalticas = new JLabel("Anal\u00EDticas");
		GridBagConstraints gbc_lblAnalticas = new GridBagConstraints();
		gbc_lblAnalticas.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnalticas.gridx = 4;
		gbc_lblAnalticas.gridy = 9;
		getContentPane().add(lblAnalticas, gbc_lblAnalticas);
		
		lblInformes = new JLabel("Informes");
		GridBagConstraints gbc_lblInformes = new GridBagConstraints();
		gbc_lblInformes.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformes.gridx = 6;
		gbc_lblInformes.gridy = 9;
		getContentPane().add(lblInformes, gbc_lblInformes);
		
		lblRadiografas = new JLabel("Radiograf\u00EDas");
		GridBagConstraints gbc_lblRadiografas = new GridBagConstraints();
		gbc_lblRadiografas.insets = new Insets(0, 0, 5, 5);
		gbc_lblRadiografas.gridx = 8;
		gbc_lblRadiografas.gridy = 9;
		getContentPane().add(lblRadiografas, gbc_lblRadiografas);
		
		lblCerrarSesin = new JLabel("Cerrar Sesi\u00F3n");
		GridBagConstraints gbc_lblCerrarSesin = new GridBagConstraints();
		gbc_lblCerrarSesin.insets = new Insets(0, 0, 5, 5);
		gbc_lblCerrarSesin.gridx = 11;
		gbc_lblCerrarSesin.gridy = 9;
		getContentPane().add(lblCerrarSesin, gbc_lblCerrarSesin);

	}

}
