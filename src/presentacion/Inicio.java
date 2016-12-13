package presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JButton;

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
	private JButton btnDaily;
	private JButton btnConsultations;
	private JButton btnInbox;
	private JButton btnSignout;
	private JButton btnNurse;
	private JButton btnSpecialist;
	private JButton btnAnalitics;
	private JButton btnReports;
	private JButton btnRadiology;

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
		setTitle("Inicio");
		setClosable(true);
		setIconifiable(true);
		setBounds(100, 100, 722, 431);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		btnDaily = new JButton("");
		btnDaily.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/Inicio_iconos/daily_64x64.png")));
		GridBagConstraints gbc_btnDaily = new GridBagConstraints();
		gbc_btnDaily.insets = new Insets(0, 0, 5, 5);
		gbc_btnDaily.gridx = 1;
		gbc_btnDaily.gridy = 1;
		getContentPane().add(btnDaily, gbc_btnDaily);
		
		btnConsultations = new JButton("");
		btnConsultations.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/Inicio_iconos/consultations_64x64.png")));
		GridBagConstraints gbc_btnConsultations = new GridBagConstraints();
		gbc_btnConsultations.insets = new Insets(0, 0, 5, 5);
		gbc_btnConsultations.gridx = 3;
		gbc_btnConsultations.gridy = 1;
		getContentPane().add(btnConsultations, gbc_btnConsultations);
		
		btnInbox = new JButton("");
		btnInbox.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/Inicio_iconos/inbox_64x64.png")));
		GridBagConstraints gbc_btnInbox = new GridBagConstraints();
		gbc_btnInbox.insets = new Insets(0, 0, 5, 5);
		gbc_btnInbox.gridx = 7;
		gbc_btnInbox.gridy = 1;
		getContentPane().add(btnInbox, gbc_btnInbox);
		
		lblAgenda = new JLabel("Agenda");
		GridBagConstraints gbc_lblAgenda = new GridBagConstraints();
		gbc_lblAgenda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgenda.gridx = 1;
		gbc_lblAgenda.gridy = 2;
		getContentPane().add(lblAgenda, gbc_lblAgenda);
		
		lblConsultas = new JLabel("Consultas");
		GridBagConstraints gbc_lblConsultas = new GridBagConstraints();
		gbc_lblConsultas.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsultas.gridx = 3;
		gbc_lblConsultas.gridy = 2;
		getContentPane().add(lblConsultas, gbc_lblConsultas);
		
		lblCorreoInterno = new JLabel("Correo Interno");
		GridBagConstraints gbc_lblCorreoInterno = new GridBagConstraints();
		gbc_lblCorreoInterno.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoInterno.gridx = 7;
		gbc_lblCorreoInterno.gridy = 2;
		getContentPane().add(lblCorreoInterno, gbc_lblCorreoInterno);
		
		btnNurse = new JButton("");
		btnNurse.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/Inicio_iconos/nurse_64x64.png")));
		GridBagConstraints gbc_btnNurse = new GridBagConstraints();
		gbc_btnNurse.insets = new Insets(0, 0, 5, 5);
		gbc_btnNurse.gridx = 1;
		gbc_btnNurse.gridy = 4;
		getContentPane().add(btnNurse, gbc_btnNurse);
		
		btnSpecialist = new JButton("");
		btnSpecialist.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/Inicio_iconos/specialist_64x64.png")));
		GridBagConstraints gbc_btnSpecialist = new GridBagConstraints();
		gbc_btnSpecialist.insets = new Insets(0, 0, 5, 5);
		gbc_btnSpecialist.gridx = 3;
		gbc_btnSpecialist.gridy = 4;
		getContentPane().add(btnSpecialist, gbc_btnSpecialist);
		
		lblEnfermera = new JLabel("Enfermer\u00EDa");
		GridBagConstraints gbc_lblEnfermera = new GridBagConstraints();
		gbc_lblEnfermera.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnfermera.gridx = 1;
		gbc_lblEnfermera.gridy = 5;
		getContentPane().add(lblEnfermera, gbc_lblEnfermera);
		
		lblEspecialistas = new JLabel("Especialistas");
		GridBagConstraints gbc_lblEspecialistas = new GridBagConstraints();
		gbc_lblEspecialistas.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialistas.gridx = 3;
		gbc_lblEspecialistas.gridy = 5;
		getContentPane().add(lblEspecialistas, gbc_lblEspecialistas);
		
		btnAnalitics = new JButton("");
		btnAnalitics.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/Inicio_iconos/analitics_64x64.png")));
		GridBagConstraints gbc_btnAnalitics = new GridBagConstraints();
		gbc_btnAnalitics.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnalitics.gridx = 1;
		gbc_btnAnalitics.gridy = 7;
		getContentPane().add(btnAnalitics, gbc_btnAnalitics);
		
		btnReports = new JButton("\r\n");
		btnReports.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/Inicio_iconos/reports_64x64.png")));
		GridBagConstraints gbc_btnReports = new GridBagConstraints();
		gbc_btnReports.insets = new Insets(0, 0, 5, 5);
		gbc_btnReports.gridx = 3;
		gbc_btnReports.gridy = 7;
		getContentPane().add(btnReports, gbc_btnReports);
		
		btnRadiology = new JButton("");
		btnRadiology.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/Inicio_iconos/radiology_64x64.png")));
		GridBagConstraints gbc_btnRadiology = new GridBagConstraints();
		gbc_btnRadiology.insets = new Insets(0, 0, 5, 5);
		gbc_btnRadiology.gridx = 5;
		gbc_btnRadiology.gridy = 7;
		getContentPane().add(btnRadiology, gbc_btnRadiology);
		
		btnSignout = new JButton("");
		btnSignout.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/icons/Inicio_iconos/SignOut_64x64.png")));
		GridBagConstraints gbc_btnSignout = new GridBagConstraints();
		gbc_btnSignout.insets = new Insets(0, 0, 5, 5);
		gbc_btnSignout.gridx = 7;
		gbc_btnSignout.gridy = 7;
		getContentPane().add(btnSignout, gbc_btnSignout);
		
		lblAnalticas = new JLabel("Anal\u00EDticas");
		GridBagConstraints gbc_lblAnalticas = new GridBagConstraints();
		gbc_lblAnalticas.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnalticas.gridx = 1;
		gbc_lblAnalticas.gridy = 8;
		getContentPane().add(lblAnalticas, gbc_lblAnalticas);
		
		lblInformes = new JLabel("Informes");
		GridBagConstraints gbc_lblInformes = new GridBagConstraints();
		gbc_lblInformes.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformes.gridx = 3;
		gbc_lblInformes.gridy = 8;
		getContentPane().add(lblInformes, gbc_lblInformes);
		
		lblRadiografas = new JLabel("Radiograf\u00EDas");
		GridBagConstraints gbc_lblRadiografas = new GridBagConstraints();
		gbc_lblRadiografas.insets = new Insets(0, 0, 5, 5);
		gbc_lblRadiografas.gridx = 5;
		gbc_lblRadiografas.gridy = 8;
		getContentPane().add(lblRadiografas, gbc_lblRadiografas);
		
		lblCerrarSesin = new JLabel("Cerrar Sesi\u00F3n");
		GridBagConstraints gbc_lblCerrarSesin = new GridBagConstraints();
		gbc_lblCerrarSesin.insets = new Insets(0, 0, 5, 5);
		gbc_lblCerrarSesin.gridx = 7;
		gbc_lblCerrarSesin.gridy = 8;
		getContentPane().add(lblCerrarSesin, gbc_lblCerrarSesin);

	}

}
