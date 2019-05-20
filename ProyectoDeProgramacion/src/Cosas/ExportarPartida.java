package Cosas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExportarPartida extends JFrame {
	
	private JPanel contentPane;
	private Sobreescribir sobreescribir;

	/**
	 * Create the frame.
	 */
	public ExportarPartida(Partida partida,FicherosSave ficheros) {

		setTitle("EXPORTAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 140);
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
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 56, 14);
		panel.add(lblNombre);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(10, 36, 125, 14);
		panel.add(textPane);
		
		JButton button = new JButton("Volver");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		button.setBounds(10, 61, 89, 23);
		panel.add(button);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre = textPane.getText();
				if(ficheros.archivoRepetido(nombre)==true) {
					sobreescribir = new Sobreescribir(partida,nombre,ficheros);
					sobreescribir.setVisible(true);
				}else {
					ficheros.exportar(partida, nombre);	
					dispose();
				}

			}
		});
		btnGuardar.setBounds(154, 61, 89, 23);
		panel.add(btnGuardar);
	}
}
