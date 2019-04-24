package Cosas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Juego extends JFrame {
	
	private JPanel contentPane;
	private Partida partida;
		

	/**
	 * Create the frame.
	 */
	public Juego(String usuario) {
		partida = new Partida();
		if(partida.jugadorNuevo(usuario)==false) {
			partida = partida.cargarDatos(usuario);
		}else {
			partida.nuevaPartida(usuario);
		}
		setTitle("EL JUEGO DE LA GALLETA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 350);
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
		
		JLabel lblDinero = new JLabel("Dinero:");
		lblDinero.setBounds(43, 64, 46, 14);
		panel.add(lblDinero);
		
		JLabel lblPuntuacionTotal = new JLabel("Puntuacion Total:");
		lblPuntuacionTotal.setBounds(43, 83, 102, 14);
		panel.add(lblPuntuacionTotal);
		
		JButton btnNewButton = new JButton("Logros");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Logros logros = new Logros();
				logros.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(142, 268, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnMejoras = new JButton("Mejoras");
		btnMejoras.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				MejorasPrevio mejoras = new MejorasPrevio();
				mejoras.setVisible(true);
			}
			
		});
		btnMejoras.setBackground(Color.WHITE);
		btnMejoras.setBounds(43, 268, 89, 23);
		panel.add(btnMejoras);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textPane.setEditable(false);
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(160, 64, 169, 14);
		textPane.setText(Integer.toString(partida.getDinero()));
		panel.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textPane_1.setEditable(false);
		textPane_1.setBackground(Color.WHITE);
		textPane_1.setBounds(160, 83, 169, 14);
		textPane_1.setText(Integer.toString(partida.getPuntuaciontotal()));
		panel.add(textPane_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int dinero = partida.getDinero()+1;
				int puntuaciontotal = partida.getPuntuaciontotal()+1;
				partida.setDinero(dinero);
				textPane.setText(Integer.toString(dinero));
				partida.setPuntuaciontotal(puntuaciontotal);
				textPane_1.setText(Integer.toString(puntuaciontotal));
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon(Juego.class.getResource("/Imagenes/cookieicon.png")));
		btnNewButton_1.setBounds(43, 130, 83, 70);
		panel.add(btnNewButton_1);
		
		JLabel lblGalleta = new JLabel("GALLETITA");
		lblGalleta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGalleta.setBounds(53, 211, 76, 14);
		panel.add(lblGalleta);
		
		JButton button_1 = new JButton("");
		button_1.setBackground(Color.WHITE);
		button_1.setEnabled(false);
		button_1.setIcon(new ImageIcon(Juego.class.getResource("/Imagenes/paniniicon.png")));
		button_1.setBounds(333, 130, 83, 70);
		panel.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(Color.WHITE);
		button_2.setEnabled(false);
		button_2.setIcon(new ImageIcon(Juego.class.getResource("/Imagenes/noodlesicon.png")));
		button_2.setBounds(480, 130, 83, 70);
		panel.add(button_2);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textPane_2.setEditable(false);
		textPane_2.setBackground(Color.GRAY);
		textPane_2.setBounds(43, 21, 117, 20);
		textPane_2.setText(partida.getUsuario());
		panel.add(textPane_2);
		
		JLabel lblPizzaNapolitana = new JLabel("PIZZA NAPOLITANA");
		lblPizzaNapolitana.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPizzaNapolitana.setBounds(174, 211, 117, 14);
		panel.add(lblPizzaNapolitana);
		
		JLabel lblPanini = new JLabel("PANINI DEL POLVILLO");
		lblPanini.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPanini.setBounds(317, 211, 129, 14);
		panel.add(lblPanini);
		
		JLabel lblNoodles = new JLabel("GOLDEN NOODLES");
		lblNoodles.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNoodles.setBounds(471, 211, 102, 14);
		panel.add(lblNoodles);
		
		JButton button = new JButton("");
		button.setEnabled(false);
		button.setBackground(Color.WHITE);
		button.setIcon(new ImageIcon(Juego.class.getResource("/Imagenes/pizzaicon.png")));
		button.setBounds(188, 130, 83, 70);
		panel.add(button);
		
		JLabel lblDineroPorSegundo = new JLabel("Dinero por segundo:");
		lblDineroPorSegundo.setBounds(355, 64, 129, 14);
		panel.add(lblDineroPorSegundo);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textPane_3.setEditable(false);
		textPane_3.setBackground(Color.WHITE);
		textPane_3.setBounds(471, 64, 101, 14);
		textPane_3.setText(Integer.toString(partida.getDineroporsegundo()));
		panel.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textPane_4.setEditable(false);
		textPane_4.setBackground(Color.WHITE);
		textPane_4.setBounds(472, 83, 101, 14);
		textPane_4.setText(Integer.toString(partida.getTiempototal()));
		panel.add(textPane_4);
		
		JLabel lblTiempoTotal = new JLabel("Tiempo total:");
		lblTiempoTotal.setBounds(355, 83, 129, 14);
		panel.add(lblTiempoTotal);
		
		JButton btnCargar = new JButton("Importar");
		btnCargar.setBackground(Color.WHITE);
		btnCargar.setBounds(480, 268, 89, 23);
		panel.add(btnCargar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setBounds(381, 268, 89, 23);
		panel.add(btnGuardar);
		
		JButton btnExportar = new JButton("Exportar");
		btnExportar.setBackground(Color.WHITE);
		btnExportar.setBounds(480, 236, 89, 23);
		panel.add(btnExportar);
	}
}
