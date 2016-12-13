package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class Idioma {

	private JFrame frame;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Idioma window = new Idioma();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Idioma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		{
			comboBox = new JComboBox();
			DefaultListModel modeloLista = new DefaultListModel();
			comboBox.setModel((ComboBoxModel) modeloLista);
			modeloLista.addElement("Español");
			modeloLista.addElement("English");
			comboBox.setRenderer(new LanguajeRender());
			
			
			frame.getContentPane().add(comboBox);
		}
	}

}
