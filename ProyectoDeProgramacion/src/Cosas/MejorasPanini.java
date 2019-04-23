package Cosas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MejorasPanini extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public MejorasPanini() {
		setTitle("MEJORAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 250);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel lblStand = new JLabel("Stand");
		lblStand.setBounds(10, 42, 46, 14);
		contentPane.add(lblStand);
		
		JLabel lblVendedorAmbulante = new JLabel("Vendedor Ambulante");
		lblVendedorAmbulante.setBounds(10, 67, 123, 14);
		contentPane.add(lblVendedorAmbulante);
		
		JLabel lblFabrica = new JLabel("Fabrica");
		lblFabrica.setBounds(10, 143, 46, 14);
		contentPane.add(lblFabrica);
		
		JLabel lblMercadilloGitano = new JLabel("Mercadillo Gitano");
		lblMercadilloGitano.setBounds(10, 118, 101, 14);
		contentPane.add(lblMercadilloGitano);
		
		JLabel lblSupermercado = new JLabel("Supermercado");
		lblSupermercado.setBounds(10, 93, 88, 14);
		contentPane.add(lblSupermercado);
		
		JButton btnX = new JButton("x1");
		btnX.setBackground(Color.WHITE);
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX.setBounds(144, 33, 60, 23);
		contentPane.add(btnX);
		
		JButton btnX_1 = new JButton("x10");
		btnX_1.setBackground(Color.WHITE);
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX_1.setBounds(213, 33, 60, 23);
		contentPane.add(btnX_1);
		
		JButton btnX_2 = new JButton("x100");
		btnX_2.setBackground(Color.WHITE);
		btnX_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX_2.setBounds(282, 33, 60, 23);
		contentPane.add(btnX_2);
		
		JButton button = new JButton("x1");
		button.setBackground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button.setBounds(144, 59, 60, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("x10");
		button_1.setBackground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_1.setBounds(213, 59, 60, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("x100");
		button_2.setBackground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_2.setBounds(282, 59, 60, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("x1");
		button_3.setBackground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_3.setBounds(144, 84, 60, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("x10");
		button_4.setBackground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_4.setBounds(213, 84, 60, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("x100");
		button_5.setBackground(Color.WHITE);
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_5.setBounds(282, 84, 60, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("x1");
		button_6.setBackground(Color.WHITE);
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_6.setBounds(144, 109, 60, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("x10");
		button_7.setBackground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_7.setBounds(213, 109, 60, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("x100");
		button_8.setBackground(Color.WHITE);
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_8.setBounds(282, 109, 60, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("x1");
		button_9.setBackground(Color.WHITE);
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_9.setBounds(144, 134, 60, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("x10");
		button_10.setBackground(Color.WHITE);
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_10.setBounds(213, 134, 60, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("x100");
		button_11.setBackground(Color.WHITE);
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_11.setBounds(282, 134, 60, 23);
		contentPane.add(button_11);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(352, 36, 46, 20);
		contentPane.add(textPane);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		textPane_4.setBounds(352, 62, 46, 20);
		contentPane.add(textPane_4);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setEditable(false);
		textPane_8.setBounds(352, 87, 46, 20);
		contentPane.add(textPane_8);
		
		JTextPane textPane_12 = new JTextPane();
		textPane_12.setEditable(false);
		textPane_12.setBounds(352, 112, 46, 20);
		contentPane.add(textPane_12);
		
		JTextPane textPane_16 = new JTextPane();
		textPane_16.setEditable(false);
		textPane_16.setBounds(352, 137, 46, 20);
		contentPane.add(textPane_16);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(311, 178, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblMejorasDeGalletitas = new JLabel("MEJORAS DE PANINI");
		lblMejorasDeGalletitas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMejorasDeGalletitas.setBackground(Color.WHITE);
		lblMejorasDeGalletitas.setBounds(183, 8, 123, 14);
		contentPane.add(lblMejorasDeGalletitas);
	}
}
