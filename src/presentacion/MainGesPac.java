package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MainGesPac {

	private JFrame frmGestionDePacientes;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnNuevo;
	private JMenu mnAbrir;
	private JMenuItem mntmGuardar;
	private JSeparator separator;
	private JMenuItem mntmExportar;
	private JSeparator separator_1;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsulta;
	private JMenuItem mntmInforme;
	private JMenuItem mntmPaciente;
	private JMenuItem mntmAnalitica;
	private JMenuItem mntmInforme_1;
	private JMenuItem mntmRadiografa;
	private JMenu mnEdicin;
	private JMenuItem mntmDeshacer;
	private JMenuItem mntmRehacer;
	private JSeparator separator_2;
	private JMenuItem mntmCopiar;
	private JMenuItem mntmCortar;
	private JMenuItem mntmPegar;
	private JSeparator separator_3;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmBuscar;
	private JSeparator separator_4;
	private JMenuItem mntmReemplazar;
	private JSeparator separator_5;
	private JMenuItem mntmPreferencias;
	private JMenu mnVer;
	private JMenuItem mntmInicio;
	private JSeparator separator_6;
	private JMenu mnListados;
	private JSeparator separator_7;
	private JMenuItem mntmInformacinDoctor;
	private JSeparator separator_8;
	private JMenu mnTamaoFuente;
	private JMenuItem mntmEspecialistas;
	private JMenuItem mntmPacientes;
	private JMenuItem mntmInformes;
	private JMenuItem mntmAumentarTamao;
	private JMenuItem mntmDisminuirTamao;
	private JMenu mnAyuda;
	private JMenuItem mntmSobreGespac;
	private JPanel panel;
	private Languaje_selector languaje_selector;
	private JPanel panel_1;
	private SesionDoctor sesionDoctor;
	private Breadcrumbs breadcrumbs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGesPac window = new MainGesPac();
					window.frmGestionDePacientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGesPac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionDePacientes = new JFrame();
		frmGestionDePacientes.setBounds(new Rectangle(0, 0, 1280, 800));
		frmGestionDePacientes.setTitle("Gestión de pacientes");
		frmGestionDePacientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			menuBar = new JMenuBar();
			frmGestionDePacientes.setJMenuBar(menuBar);
			{
				mnArchivo = new JMenu("Archivo");
				mnArchivo.setEnabled(false);
				mnArchivo.setMnemonic('A');
				menuBar.add(mnArchivo);
				{
					mnNuevo = new JMenu("Nuevo");
					mnArchivo.add(mnNuevo);
					{
						mntmConsulta = new JMenuItem("Consulta");
						mnNuevo.add(mntmConsulta);
					}
					{
						mntmInforme = new JMenuItem("Informe");
						mnNuevo.add(mntmInforme);
					}
					{
						mntmPaciente = new JMenuItem("Paciente");
						mnNuevo.add(mntmPaciente);
					}
				}
				{
					mnAbrir = new JMenu("Abrir");
					mnArchivo.add(mnAbrir);
					{
						mntmAnalitica = new JMenuItem("Analitica");
						mnAbrir.add(mntmAnalitica);
					}
					{
						mntmInforme_1 = new JMenuItem("Informe");
						mnAbrir.add(mntmInforme_1);
					}
					{
						mntmRadiografa = new JMenuItem("Radiografía");
						mnAbrir.add(mntmRadiografa);
					}
				}
				{
					mntmGuardar = new JMenuItem("Guardar");
					mnArchivo.add(mntmGuardar);
				}
				{
					separator = new JSeparator();
					mnArchivo.add(separator);
				}
				{
					mntmExportar = new JMenuItem("Exportar");
					mnArchivo.add(mntmExportar);
				}
				{
					separator_1 = new JSeparator();
					mnArchivo.add(separator_1);
				}
				{
					mntmSalir = new JMenuItem("Salir");
					mntmSalir.setIcon(new ImageIcon(MainGesPac.class.getResource("/presentacion/icons/medics_img/SignOut_red_16x16.png")));
					mnArchivo.add(mntmSalir);
				}
			}
			{
				mnEdicin = new JMenu("Edición");
				mnEdicin.setEnabled(false);
				mnEdicin.setMnemonic('E');
				menuBar.add(mnEdicin);
				{
					mntmDeshacer = new JMenuItem("Deshacer    Ctrl+Z");
					mnEdicin.add(mntmDeshacer);
				}
				{
					mntmRehacer = new JMenuItem("Rehacer      Ctrl+Y");
					mnEdicin.add(mntmRehacer);
				}
				{
					separator_2 = new JSeparator();
					mnEdicin.add(separator_2);
				}
				{
					mntmCopiar = new JMenuItem("Copiar        Ctrl+C");
					mnEdicin.add(mntmCopiar);
				}
				{
					mntmCortar = new JMenuItem("Cortar        Ctrl+X");
					mnEdicin.add(mntmCortar);
				}
				{
					mntmPegar = new JMenuItem("Pegar          Ctrl+V");
					mnEdicin.add(mntmPegar);
				}
				{
					separator_3 = new JSeparator();
					mnEdicin.add(separator_3);
				}
				{
					mntmNewMenuItem = new JMenuItem("Seleccionar todo    Ctrl+E");
					mnEdicin.add(mntmNewMenuItem);
				}
				{
					separator_4 = new JSeparator();
					mnEdicin.add(separator_4);
				}
				{
					mntmBuscar = new JMenuItem("Buscar           Ctrl+B");
					mnEdicin.add(mntmBuscar);
				}
				{
					mntmReemplazar = new JMenuItem("Reemplazar    Ctrl+R");
					mnEdicin.add(mntmReemplazar);
				}
				{
					separator_5 = new JSeparator();
					mnEdicin.add(separator_5);
				}
				{
					mntmPreferencias = new JMenuItem("Preferencias");
					mnEdicin.add(mntmPreferencias);
				}
			}
			{
				mnVer = new JMenu("Ver");
				mnVer.setEnabled(false);
				mnVer.setMnemonic('V');
				menuBar.add(mnVer);
				{
					mntmInicio = new JMenuItem("Inicio");
					mnVer.add(mntmInicio);
				}
				{
					separator_6 = new JSeparator();
					mnVer.add(separator_6);
				}
				{
					mnListados = new JMenu("Listados");
					mnVer.add(mnListados);
					{
						mntmEspecialistas = new JMenuItem("Especialistas");
						mnListados.add(mntmEspecialistas);
					}
					{
						mntmPacientes = new JMenuItem("Pacientes");
						mnListados.add(mntmPacientes);
					}
					{
						mntmInformes = new JMenuItem("Informes");
						mnListados.add(mntmInformes);
					}
				}
				{
					separator_7 = new JSeparator();
					mnVer.add(separator_7);
				}
				{
					mntmInformacinDoctor = new JMenuItem("Información doctor");
					mnVer.add(mntmInformacinDoctor);
				}
				{
					separator_8 = new JSeparator();
					mnVer.add(separator_8);
				}
				{
					mnTamaoFuente = new JMenu("Tamaño fuente");
					mnVer.add(mnTamaoFuente);
					{
						mntmAumentarTamao = new JMenuItem("Aumentar tamaño");
						mnTamaoFuente.add(mntmAumentarTamao);
					}
					{
						mntmDisminuirTamao = new JMenuItem("Disminuir tamaño");
						mnTamaoFuente.add(mntmDisminuirTamao);
					}
				}
			}
			{
				mnAyuda = new JMenu("Ayuda");
				mnAyuda.setEnabled(false);
				mnAyuda.setMnemonic('y');
				menuBar.add(mnAyuda);
				{
					mntmSobreGespac = new JMenuItem("Sobre GesPaC");
					mnAyuda.add(mntmSobreGespac);
				}
			}
		}
		{
			panel = new JPanel();
			frmGestionDePacientes.getContentPane().add(panel, BorderLayout.SOUTH);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{407, 0, 32, 0};
			gbl_panel.rowHeights = new int[]{0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				languaje_selector = new Languaje_selector();
				GridBagConstraints gbc_languaje_selector = new GridBagConstraints();
				gbc_languaje_selector.insets = new Insets(0, 0, 0, 5);
				gbc_languaje_selector.anchor = GridBagConstraints.EAST;
				gbc_languaje_selector.fill = GridBagConstraints.VERTICAL;
				gbc_languaje_selector.gridx = 1;
				gbc_languaje_selector.gridy = 0;
				panel.add(languaje_selector, gbc_languaje_selector);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
			frmGestionDePacientes.getContentPane().add(panel_1, BorderLayout.NORTH);
			GridBagLayout gbl_panel_1 = new GridBagLayout();
			gbl_panel_1.columnWidths = new int[]{16, 558, 145, 32, 0};
			gbl_panel_1.rowHeights = new int[]{32, 0};
			gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
			panel_1.setLayout(gbl_panel_1);
			{
				breadcrumbs = new Breadcrumbs();
				GridBagConstraints gbc_breadcrumbs = new GridBagConstraints();
				gbc_breadcrumbs.insets = new Insets(0, 0, 0, 5);
				gbc_breadcrumbs.fill = GridBagConstraints.BOTH;
				gbc_breadcrumbs.gridx = 1;
				gbc_breadcrumbs.gridy = 0;
				panel_1.add(breadcrumbs, gbc_breadcrumbs);
			}
			{
				sesionDoctor = new SesionDoctor((String) null);
				sesionDoctor.setBorder(null);
				GridBagConstraints gbc_sesionDoctor = new GridBagConstraints();
				gbc_sesionDoctor.insets = new Insets(0, 0, 0, 5);
				gbc_sesionDoctor.anchor = GridBagConstraints.NORTHEAST;
				gbc_sesionDoctor.gridx = 2;
				gbc_sesionDoctor.gridy = 0;
				panel_1.add(sesionDoctor, gbc_sesionDoctor);
			}
		}
	}

}
