package presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Rectangle;

public class Agenda extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
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
	public Agenda() {
		setBounds(new Rectangle(300, 300, 800, 600));
		setClosable(true);
		setTitle("Agenda");
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		

	}

}
