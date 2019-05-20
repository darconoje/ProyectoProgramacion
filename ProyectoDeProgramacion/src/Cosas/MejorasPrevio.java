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
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public MejorasPrevio(Partida partida, MejorasGalleta galleta, MejorasPizza pizza, MejorasPanini panini, MejorasNoodles noodles) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 150, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		this.btnNewButton = new JButton("Galletas");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				galleta.setVisible(true);
			}
		});
		btnNewButton.setBounds(23, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		this.btnNewButton_1 = new JButton("Pizzas");
			btnNewButton_1.setEnabled(true);
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(btnNewButton_1.isEnabled()==true) {
					pizza.setVisible(true);
					}
				}
			});	
		btnNewButton_1.setBounds(23, 45, 89, 23);
		contentPane.add(btnNewButton_1);
		
		this.btnNewButton_2 = new JButton("Paninis");
			btnNewButton_2.setEnabled(true);
			btnNewButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(btnNewButton_2.isEnabled()==true) {
						panini.setVisible(true);						
					}
				}
			});

		btnNewButton_2.setBounds(23, 79, 89, 23);
		contentPane.add(btnNewButton_2);
		
		this.btnNewButton_3 = new JButton("Noodles");
			btnNewButton_3.setEnabled(true);
			btnNewButton_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(btnNewButton_3.isEnabled()==true) {
						noodles.setVisible(true);					
					}
				}
			});
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
	
	public JButton btnNewButton() {
		return btnNewButton;
	}
	
	public void setbtnNewButton(boolean enable) {
		this.btnNewButton.setEnabled(enable);
	}

	public JButton btnNewButton_1() {
		return btnNewButton_1;
	}
	
	public void setbtnNewButton_1(boolean enable) {
		this.btnNewButton_1.setEnabled(enable);
	}

	public JButton btnNewButton_2() {
		return btnNewButton_2;
	}
	
	public void setbtnNewButton_2(boolean enable) {
		this.btnNewButton_2.setEnabled(enable);
	}

	public JButton btnNewButton_3() {
		return btnNewButton_3;
	}
	
	public void setbtnNewButton_3(boolean enable) {
		this.btnNewButton_3.setEnabled(enable);
	}

}
