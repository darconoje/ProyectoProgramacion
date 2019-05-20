package Cosas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImportarPartida extends JFrame {

	private JPanel contentPane;
	private JList<String> list;
	
	/**
	 * Create the frame.
	 */
	public ImportarPartida(Partida partida, FicherosSave ficheros, DefaultListModel<String> partidas) {
		setTitle("IMPORTAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 325);
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
		
		JLabel lblPartidas = new JLabel("Partidas:");
		lblPartidas.setBounds(10, 11, 76, 14);
		panel.add(lblPartidas);
		
		list = new JList<>(partidas);
		list.setBounds(10, 36, 231, 193);
		panel.add(list);
		JButton button = new JButton("Volver");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		button.setBounds(10, 242, 89, 23);
		panel.add(button);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre = list.getSelectedValue();
				ficheros.importar(partida,nombre);
				dispose();
			}
		});
		btnCargar.setBounds(152, 242, 89, 23);
		panel.add(btnCargar);
	}
	
	public void repaintList(DefaultListModel<String> partidas) {
		this.list.setModel(partidas);
	}
}
