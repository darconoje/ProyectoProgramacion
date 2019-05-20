package Cosas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sobreescribir extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Sobreescribir(Partida partida, String nombre, FicherosSave fichero) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 150);
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
		
		JLabel lblNombreDeLa = new JLabel("Partida ya existe. \u00BFSobreescribir?");
		lblNombreDeLa.setBounds(10, 11, 205, 14);
		panel.add(lblNombreDeLa);
		
		JButton btnSi = new JButton("Si");
		btnSi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fichero.borrarPartida(nombre);
				fichero.exportar(partida, nombre);
				dispose();
			}
		});
		btnSi.setBounds(10, 50, 76, 23);
		panel.add(btnSi);
		
		JButton btnNo = new JButton("No");
		btnNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNo.setBounds(116, 50, 76, 23);
		panel.add(btnNo);
	}
}
