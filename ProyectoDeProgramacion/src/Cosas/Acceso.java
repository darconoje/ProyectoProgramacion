package Cosas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Acceso extends JFrame {
	
	//private String usuario;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnLogin;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private JButton btnRegistrarse;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceso frame = new Acceso();
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
	public Acceso() {
		setTitle("Acceso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 175);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setResizable(false);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(189, 11, 128, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Usuario:");
		lblNombre.setBounds(10, 14, 60, 14);
		panel.add(lblNombre);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(10, 45, 72, 14);
		panel.add(lblContrasea);
		
		JLabel lblUsuarioDuplicado = new JLabel("Usuario duplicado");
		lblUsuarioDuplicado.setForeground(Color.RED);
		lblUsuarioDuplicado.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblUsuarioDuplicado.setBounds(220, 74, 97, 14);
		lblUsuarioDuplicado.setVisible(false);
		panel.add(lblUsuarioDuplicado);
		
		btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean acceso = false;
				acceso = FuncionesAcceso.loginUsuario(textField.getText(),String.valueOf(passwordField.getPassword()));
				if(acceso == false) {
					lblUsuarioDuplicado.setVisible(false);
					lblNewLabel.setVisible(true);	
				}else {
					String usuario = textField.getText();
					dispose();
					Juego juego = new Juego(usuario);
					juego.setVisible(true);
					//setUsuario(textField.getText());
				}
			}
		});
		btnLogin.setBounds(10, 93, 89, 23);
		panel.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(189, 42, 128, 20);
		panel.add(passwordField);
		
		lblNewLabel = new JLabel("Nombre de usuario o contrase\u00F1a incorrecto");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel.setBounds(139, 74, 175, 14);
		lblNewLabel.setVisible(false);
		panel.add(lblNewLabel);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(FuncionesAcceso.usuarioDuplicado(textField.getText())==true) {
					lblNewLabel.setVisible(false);
					lblUsuarioDuplicado.setVisible(true);
				}else {
					lblNewLabel.setVisible(false);
					UsuariosBBDD.registrarse(textField.getText(),String.valueOf(passwordField.getPassword()));
					lblUsuarioDuplicado.setVisible(false);
				}	
			}
		});
		btnRegistrarse.setBounds(209, 93, 108, 23);
		panel.add(btnRegistrarse);
	}
}
