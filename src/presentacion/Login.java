package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5955026755634966936L;

	private static HashMap<String, String> Usuarios = new HashMap<String, String>();
	
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblUser;
	private JLabel lblPassword;
	private JTextField txtUser;
	private JLabel lblErrorText;
	private JButton btnAceptar;
	private JLabel lblInfoToSignIn;
	private JPasswordField pwdfPassword;
	private JLabel lblIconPass;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("GesPaC - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel = new JPanel();
			panel.setAlignmentY(Component.TOP_ALIGNMENT);
			panel.setAlignmentX(Component.LEFT_ALIGNMENT);
			contentPane.add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{18, 0, 0, 48, 173, 18, 18, 0};
			gbl_panel.rowHeights = new int[]{18, 16, 40, 0, 0, 18, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				lblInfoToSignIn = new JLabel("Ingrese sus credenciales para acceder a la aplicación.");
				lblInfoToSignIn.setFont(new Font("Tahoma", Font.BOLD, 13));
				GridBagConstraints gbc_lblInfoToSignIn = new GridBagConstraints();
				gbc_lblInfoToSignIn.anchor = GridBagConstraints.WEST;
				gbc_lblInfoToSignIn.gridwidth = 3;
				gbc_lblInfoToSignIn.insets = new Insets(0, 0, 5, 5);
				gbc_lblInfoToSignIn.gridx = 3;
				gbc_lblInfoToSignIn.gridy = 1;
				panel.add(lblInfoToSignIn, gbc_lblInfoToSignIn);
			}
			{
				lblIconPass = new JLabel("");
				lblIconPass.setIcon(new ImageIcon(Login.class.getResource("/presentacion/icons/password_lock-128.png")));
				GridBagConstraints gbc_lblIconPass = new GridBagConstraints();
				gbc_lblIconPass.gridheight = 4;
				gbc_lblIconPass.insets = new Insets(0, 0, 5, 5);
				gbc_lblIconPass.gridx = 1;
				gbc_lblIconPass.gridy = 1;
				panel.add(lblIconPass, gbc_lblIconPass);
			}
			{
				lblUser = new JLabel("Usuario:");
				GridBagConstraints gbc_lblUser = new GridBagConstraints();
				gbc_lblUser.insets = new Insets(0, 0, 5, 5);
				gbc_lblUser.anchor = GridBagConstraints.SOUTHWEST;
				gbc_lblUser.gridx = 3;
				gbc_lblUser.gridy = 2;
				panel.add(lblUser, gbc_lblUser);
			}
			{
				txtUser = new JTextField();
				txtUser.addFocusListener(new MiFocusListener());
				txtUser.addActionListener(new TxtUserActionListener());
				txtUser.setToolTipText("Ingrese el identificador del usuario.");
				GridBagConstraints gbc_txtUser = new GridBagConstraints();
				gbc_txtUser.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtUser.anchor = GridBagConstraints.SOUTH;
				gbc_txtUser.gridwidth = 2;
				gbc_txtUser.insets = new Insets(0, 0, 5, 5);
				gbc_txtUser.gridx = 4;
				gbc_txtUser.gridy = 2;
				panel.add(txtUser, gbc_txtUser);
				txtUser.setColumns(10);
			}
			{
				lblPassword = new JLabel("Contraseña:");
				lblPassword.setEnabled(false);
				GridBagConstraints gbc_lblPassword = new GridBagConstraints();
				gbc_lblPassword.anchor = GridBagConstraints.SOUTHEAST;
				gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
				gbc_lblPassword.gridx = 3;
				gbc_lblPassword.gridy = 3;
				panel.add(lblPassword, gbc_lblPassword);
			}
			{
				lblErrorText = new JLabel("Error Message");
				lblErrorText.setHorizontalAlignment(SwingConstants.CENTER);
				lblErrorText.setVisible(false);
				{
					pwdfPassword = new JPasswordField();
					pwdfPassword.addFocusListener(new MiFocusListener());
					pwdfPassword.addActionListener(new PwdfPasswordActionListener());
					pwdfPassword.setEchoChar('*');
					pwdfPassword.setEnabled(false);
					GridBagConstraints gbc_pwdfPassword = new GridBagConstraints();
					gbc_pwdfPassword.anchor = GridBagConstraints.SOUTH;
					gbc_pwdfPassword.gridwidth = 2;
					gbc_pwdfPassword.insets = new Insets(0, 0, 5, 5);
					gbc_pwdfPassword.fill = GridBagConstraints.HORIZONTAL;
					gbc_pwdfPassword.gridx = 4;
					gbc_pwdfPassword.gridy = 3;
					panel.add(pwdfPassword, gbc_pwdfPassword);
				}
				lblErrorText.setIcon(new ImageIcon(Login.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
				lblErrorText.setForeground(Color.RED);
				GridBagConstraints gbc_lblErrorText = new GridBagConstraints();
				gbc_lblErrorText.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblErrorText.gridwidth = 2;
				gbc_lblErrorText.insets = new Insets(0, 0, 5, 5);
				gbc_lblErrorText.gridx = 3;
				gbc_lblErrorText.gridy = 4;
				panel.add(lblErrorText, gbc_lblErrorText);
			}
			{
				btnAceptar = new JButton("Aceptar");
				btnAceptar.addActionListener(new BtnAceptarActionListener());
				btnAceptar.setEnabled(false);
				GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
				gbc_btnAceptar.anchor = GridBagConstraints.EAST;
				gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
				gbc_btnAceptar.gridx = 5;
				gbc_btnAceptar.gridy = 4;
				panel.add(btnAceptar, gbc_btnAceptar);
			}
		}
		recogerUsuarios();
	}

	private void recogerUsuarios() {
		Usuarios.put("Eduardo", "1");
		Usuarios.put("Elena", "2");
		Usuarios.put("Enrique", "3");
		Usuarios.put("Maria", "4");
		Usuarios.put("Antonio", "5");
		Usuarios.put("Oscar", "6");
		
	}

	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String usuario = txtUser.getText();
			
			if(String.valueOf(pwdfPassword.getPassword()).equals(Usuarios.get(usuario))){
				//Lamamos a la ventana principal del programa y activamos los menús
				
				System.out.println("GO AHEAD!!!");
			}else{
				errorProcedure();
			}
		}

		private void errorProcedure() {
			lblErrorText.setText("Usuario y/o contraseña incorrectos");
			lblErrorText.setVisible(true);
			lblIconPass.setOpaque(true);
			lblIconPass.setBackground(new Color(255,102,102));
			

			txtUser.setBackground(new Color(255,102,102));
			txtUser.setForeground(Color.WHITE);
			txtUser.requestFocus();
			txtUser.selectAll();
			
			pwdfPassword.setBackground(new Color(255,102,102));
			pwdfPassword.setForeground(Color.WHITE);
			pwdfPassword.setEnabled(false);
			
			btnAceptar.setEnabled(false);
			
		}
		
	}
	private class TxtUserActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblPassword.setEnabled(true);
			pwdfPassword.setEnabled(true);
			pwdfPassword.requestFocus();
			pwdfPassword.selectAll();
		}
	}
	private class PwdfPasswordActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnAceptar.setEnabled(true);
			btnAceptar.requestFocus();
		}
	}
	private class MiFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(255,255,210));
			e.getComponent().setForeground(Color.BLACK);
		}

		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,250));
			e.getComponent().setForeground(Color.BLACK);
		}	
	}
}
