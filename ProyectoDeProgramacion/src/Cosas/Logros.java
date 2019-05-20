package Cosas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Este jFrame esta sin desarrollar

public class Logros extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Logros() {
		setTitle("LOGROS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 325);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pobre");
		chckbxNewCheckBox.setBackground(Color.LIGHT_GRAY);
		chckbxNewCheckBox.setBounds(22, 106, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Clase Media");
		chckbxNewCheckBox_1.setBackground(Color.LIGHT_GRAY);
		chckbxNewCheckBox_1.setBounds(121, 106, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxRico = new JCheckBox("Millonario");
		chckbxRico.setBackground(Color.LIGHT_GRAY);
		chckbxRico.setBounds(220, 106, 97, 23);
		contentPane.add(chckbxRico);
		
		JCheckBox chckbxMultimillonario = new JCheckBox("Multimillonario");
		chckbxMultimillonario.setBackground(Color.LIGHT_GRAY);
		chckbxMultimillonario.setBounds(319, 106, 97, 23);
		contentPane.add(chckbxMultimillonario);
		
		JLabel lblPuntuacionTotal = new JLabel("Puntuacion Total");
		lblPuntuacionTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPuntuacionTotal.setBounds(22, 26, 110, 14);
		contentPane.add(lblPuntuacionTotal);
		
		JLabel lblDinero = new JLabel("Dinero");
		lblDinero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDinero.setBounds(22, 85, 110, 14);
		contentPane.add(lblDinero);
		
		JLabel lblTiempoTotal = new JLabel("Dinero por Segundo");
		lblTiempoTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTiempoTotal.setBounds(22, 136, 149, 14);
		contentPane.add(lblTiempoTotal);
		
		JCheckBox checkBox = new JCheckBox("Pobre");
		checkBox.setBackground(Color.LIGHT_GRAY);
		checkBox.setBounds(22, 55, 97, 23);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Clase Media");
		checkBox_1.setBackground(Color.LIGHT_GRAY);
		checkBox_1.setBounds(121, 55, 97, 23);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Millonario");
		checkBox_2.setBackground(Color.LIGHT_GRAY);
		checkBox_2.setBounds(220, 55, 97, 23);
		contentPane.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Multimillonario");
		checkBox_3.setBackground(Color.LIGHT_GRAY);
		checkBox_3.setBounds(319, 55, 97, 23);
		contentPane.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Pobre");
		checkBox_4.setBackground(Color.LIGHT_GRAY);
		checkBox_4.setBounds(22, 157, 97, 23);
		contentPane.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Clase Media");
		checkBox_5.setBackground(Color.LIGHT_GRAY);
		checkBox_5.setBounds(121, 157, 97, 23);
		contentPane.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("Millonario");
		checkBox_6.setBackground(Color.LIGHT_GRAY);
		checkBox_6.setBounds(220, 157, 97, 23);
		contentPane.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("Multimillonario");
		checkBox_7.setBackground(Color.LIGHT_GRAY);
		checkBox_7.setBounds(319, 157, 97, 23);
		contentPane.add(checkBox_7);
		
		JLabel label = new JLabel("Tiempo total");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(22, 187, 110, 14);
		contentPane.add(label);
		
		JCheckBox checkBox_8 = new JCheckBox("Multimillonario");
		checkBox_8.setBackground(Color.LIGHT_GRAY);
		checkBox_8.setBounds(319, 208, 97, 23);
		contentPane.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("Millonario");
		checkBox_9.setBackground(Color.LIGHT_GRAY);
		checkBox_9.setBounds(220, 208, 97, 23);
		contentPane.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("Clase Media");
		checkBox_10.setBackground(Color.LIGHT_GRAY);
		checkBox_10.setBounds(121, 208, 97, 23);
		contentPane.add(checkBox_10);
		
		JCheckBox chckbxCasual = new JCheckBox("Pobre");
		chckbxCasual.setBackground(Color.LIGHT_GRAY);
		chckbxCasual.setBounds(22, 208, 97, 23);
		contentPane.add(chckbxCasual);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnVolver.setBounds(335, 253, 89, 23);
		contentPane.add(btnVolver);
	}
}
