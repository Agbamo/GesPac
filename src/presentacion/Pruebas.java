package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Cursor;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import java.awt.Rectangle;

public class Pruebas extends JFrame {

	private JPanel contentPane;
	private GrupoHorasAgenda grupoHoras;
	private JScrollPane scrollPane;
	private SesionDoctor sesionDoctor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pruebas frame = new Pruebas();
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
	public Pruebas() {
		setBounds(new Rectangle(0, 0, 200, 300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		{
			sesionDoctor = new SesionDoctor("Alfredo Gómez Salido");
			contentPane.add(sesionDoctor);
		}
		
		grupoHoras = new GrupoHorasAgenda();
		contentPane.add(grupoHoras);
		{
			
			
		}
		
	}

}
