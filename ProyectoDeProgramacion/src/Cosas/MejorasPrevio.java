package Cosas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MejorasPrevio extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MejorasPrevio(Partida partida) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 150, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JButton btnNewButton = new JButton("Galletas");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MejorasGalleta mejorasgalleta = new MejorasGalleta(partida);
				mejorasgalleta.setVisible(true);
			}
		});
		btnNewButton.setBounds(23, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pizzas");
		if(partida.getPuntuaciontotal()>=1000) {
			btnNewButton_1.setEnabled(true);
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					MejorasPizza mejoraspizza = new MejorasPizza(partida);
					mejoraspizza.setVisible(true);
				}
			});
		}else {
			btnNewButton_1.setEnabled(false);	
		}
		btnNewButton_1.setBounds(23, 45, 89, 23);
		contentPane.add(btnNewButton_1);
		JButton btnNewButton_2 = new JButton("Paninis");
		if(partida.getPuntuaciontotal()>=50000) {
			btnNewButton_2.setEnabled(true);
			btnNewButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					MejorasPanini mejoraspanini = new MejorasPanini(partida);
					mejoraspanini.setVisible(true);
				}
			});
		}else {
			btnNewButton_2.setEnabled(false);		
		}
		btnNewButton_2.setBounds(23, 79, 89, 23);
		contentPane.add(btnNewButton_2);
		JButton btnNewButton_3 = new JButton("Noodles");
		if(partida.getPuntuaciontotal()>=200000) {
			btnNewButton_3.setEnabled(true);
			btnNewButton_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					MejorasNoodles mejorasnoodles = new MejorasNoodles(partida);
					mejorasnoodles.setVisible(true);
				}
			});
		}else {
			btnNewButton_3.setEnabled(false);			
		}
		btnNewButton_3.setBounds(23, 113, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Volver");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_4.setBounds(23, 147, 89, 23);
		contentPane.add(btnNewButton_4);
	}

}
