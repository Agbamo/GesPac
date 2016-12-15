package presentacion.JPanels;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InformesAdjuntos extends JInternalFrame {
	private JPanel pnlEste;
	private JButton btnAgregarAdjunto;
	private JButton btnSolicitarPrueba;
	private JTable miTabla;
	private JPanel pnlOeste;
	private JButton btnAniadir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformesAdjuntos frame = new InformesAdjuntos();
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
	public InformesAdjuntos() {
		setFrameIcon(new ImageIcon(InformesAdjuntos.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Paste-Black.png")));
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setTitle("Informes Adjuntos");
		setBounds(new Rectangle(200, 200, 400, 400));
		setBounds(100, 100, 554, 215);
		ModeloDatosTabla modeloTabla = new ModeloDatosTabla();
		
		Object[] fila1= {"23/10/2014", "Analítica", "CBC"};
				modeloTabla.aniadeFila(fila1);

		/*miTabla.setModel(new DefaultTableModel(
			new Object[][] {
				{"23/10/2014", "Anal\u00EDtica", "CBC"},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Fecha", "Tipo", "Descripci\u00F3n"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		}); */
		
		pnlEste = new JPanel();
		getContentPane().add(pnlEste, BorderLayout.EAST);
		GridBagLayout gbl_pnlEste = new GridBagLayout();
		gbl_pnlEste.columnWidths = new int[]{0, 113, 0, 0};
		gbl_pnlEste.rowHeights = new int[]{0, 31, 0, 0, 0};
		gbl_pnlEste.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlEste.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlEste.setLayout(gbl_pnlEste);
		
		btnAniadir = new JButton(" A\u00F1adir Informe ");
		btnAniadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnAniadir = new GridBagConstraints();
		gbc_btnAniadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAniadir.gridx = 1;
		gbc_btnAniadir.gridy = 1;
		pnlEste.add(btnAniadir, gbc_btnAniadir);
		
		btnAgregarAdjunto = new JButton("Agregar Adjunto");
		GridBagConstraints gbc_btnAgregarAdjunto = new GridBagConstraints();
		gbc_btnAgregarAdjunto.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnAgregarAdjunto.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregarAdjunto.gridx = 1;
		gbc_btnAgregarAdjunto.gridy = 2;
		pnlEste.add(btnAgregarAdjunto, gbc_btnAgregarAdjunto);
		
		btnSolicitarPrueba = new JButton(" Solicitar Prueba ");
		GridBagConstraints gbc_btnSolicitarPrueba = new GridBagConstraints();
		gbc_btnSolicitarPrueba.insets = new Insets(0, 0, 0, 5);
		gbc_btnSolicitarPrueba.anchor = GridBagConstraints.NORTH;
		gbc_btnSolicitarPrueba.gridx = 1;
		gbc_btnSolicitarPrueba.gridy = 3;
		pnlEste.add(btnSolicitarPrueba, gbc_btnSolicitarPrueba);
		
		pnlOeste = new JPanel();
		getContentPane().add(pnlOeste, BorderLayout.WEST);
		pnlOeste.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		miTabla = new JTable();
		pnlOeste.add(miTabla);
		miTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		miTabla.setModel(modeloTabla);
		miTabla.getColumnModel().getColumn(0).setPreferredWidth(65);
		miTabla.getColumnModel().getColumn(1).setPreferredWidth(76);
		miTabla.getColumnModel().getColumn(2).setPreferredWidth(165);
		
				
				ListSelectionModel rowSM = miTabla.getSelectionModel();
		rowSM.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
					taFilaSeleccionada.setText("Fila "+filaSeleccionada+" seleccionada");
		}
		}
		});
			
		class btnAniadirActionListener implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				ModeloDatosTabla modeloTabla = (ModeloDatosTabla) miTabla.getModel();
				Object[] nuevaFila = {"...", "...", "..."};
								modeloTabla.aniadeFila(nuevaFila);
								modeloTabla.fireTableDataChanged();
				}
			}
		}

}
