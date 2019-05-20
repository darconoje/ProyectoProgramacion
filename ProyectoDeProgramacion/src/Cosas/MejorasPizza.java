package Cosas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MejorasPizza extends JFrame {
	private JPanel contentPane;
	private JButton btnX;
	private JButton btnX_1;
	private JButton btnX_2;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	
	public MejorasPizza(Partida partida) {
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
		

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(352, 36, 46, 20);
		textPane.setText(Integer.toString(partida.getStandpizza()));
		contentPane.add(textPane);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		textPane_4.setBounds(352, 62, 46, 20);
		textPane_4.setText(Integer.toString(partida.getVendedorpizza()));
		contentPane.add(textPane_4);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setEditable(false);
		textPane_8.setBounds(352, 87, 46, 20);
		textPane_8.setText(Integer.toString(partida.getSupermercadopizza()));
		contentPane.add(textPane_8);
		
		JTextPane textPane_12 = new JTextPane();
		textPane_12.setEditable(false);
		textPane_12.setBounds(352, 112, 46, 20);
		textPane_12.setText(Integer.toString(partida.getMercadillopizza()));
		contentPane.add(textPane_12);
		
		JTextPane textPane_16 = new JTextPane();
		textPane_16.setEditable(false);
		textPane_16.setBounds(352, 137, 46, 20);
		textPane_16.setText(Integer.toString(partida.getFabricapizza()));
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
		
		JLabel lblMejorasDePizza = new JLabel("MEJORAS DE PIZZA");
		lblMejorasDePizza.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMejorasDePizza.setBackground(Color.WHITE);
		lblMejorasDePizza.setBounds(166, 8, 149, 14);
		contentPane.add(lblMejorasDePizza);
		
		this.btnX = new JButton("x1");
		btnX.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(btnX.isEnabled()==true) {
						int standpizza = ((partida.getStandpizza())+1);
						partida.setStandpizza(standpizza);
						textPane.setText(Integer.toString(standpizza));
						partida.setDinero(partida.getDinero()-partida.precioStandPizzas()*1);
					}
				}
		});			

		btnX.setBackground(Color.WHITE);
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX.setBounds(144, 33, 60, 23);

		contentPane.add(btnX);
		
		this.btnX_1 = new JButton("x10");
		btnX_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnX_1.isEnabled()==true) {
					int standpizza = ((partida.getStandpizza())+10);
					partida.setStandpizza(standpizza);
					textPane.setText(Integer.toString(standpizza));
					partida.setDinero(partida.getDinero()-partida.precioStandPizzas()*10);
				}
			}
		});	
		btnX_1.setBackground(Color.WHITE);
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX_1.setBounds(213, 33, 60, 23);
		contentPane.add(btnX_1);
		
		this.btnX_2 = new JButton("x100");
		btnX_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnX_2.isEnabled()==true) {
					int standpizza = ((partida.getStandpizza())+100);
					partida.setStandpizza(standpizza);
					textPane.setText(Integer.toString(standpizza));
					partida.setDinero(partida.getDinero()-partida.precioStandPizzas()*100);
				}
			}
		});	
		btnX_2.setBackground(Color.WHITE);
		btnX_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX_2.setBounds(282, 33, 60, 23);
		contentPane.add(btnX_2);
		
		this.button = new JButton("x1");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button.isEnabled()==true) {
					int vendedorpizza = ((partida.getVendedorpizza())+1);
					partida.setVendedorpizza(vendedorpizza);
					textPane_4.setText(Integer.toString(vendedorpizza));
					partida.setDinero(partida.getDinero()-partida.precioVendedorPizzas()*1);
				}
			}
		});
		button.setBackground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button.setBounds(144, 59, 60, 23);
		contentPane.add(button);
		
		this.button_1 = new JButton("x10");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button_1.isEnabled()==true) {
					int vendedorpizza = ((partida.getVendedorpizza())+10);
					partida.setVendedorpizza(vendedorpizza);
					textPane_4.setText(Integer.toString(vendedorpizza));
					partida.setDinero(partida.getDinero()-partida.precioVendedorPizzas()*10);
				}
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_1.setBounds(213, 59, 60, 23);
		contentPane.add(button_1);
		
		this.button_2 = new JButton("x100");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button_2.isEnabled()==true) {
					int vendedorpizza = ((partida.getVendedorpizza())+100);
					partida.setVendedorpizza(vendedorpizza);
					textPane_4.setText(Integer.toString(vendedorpizza));
					partida.setDinero(partida.getDinero()-partida.precioVendedorPizzas()*100);
				}
			}
		});
		button_2.setBackground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_2.setBounds(282, 59, 60, 23);
		contentPane.add(button_2);
		
		this.button_3 = new JButton("x1");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button_3.isEnabled()==true) {
					int supermercadopizza = ((partida.getSupermercadopizza())+1);
					partida.setSupermercadopizza(supermercadopizza);
					textPane_8.setText(Integer.toString(supermercadopizza));
					partida.setDinero(partida.getDinero()-partida.precioSupermercadoPizzas()*1);
				}
			}
		});
		button_3.setBackground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_3.setBounds(144, 84, 60, 23);
		contentPane.add(button_3);
		
		this.button_4 = new JButton("x10");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button_4.isEnabled()==true) {
					int supermercadopizza = ((partida.getSupermercadopizza())+10);
					partida.setSupermercadopizza(supermercadopizza);
					textPane_8.setText(Integer.toString(supermercadopizza));
					partida.setDinero(partida.getDinero()-partida.precioSupermercadoPizzas()*10);
				}
			}
		});
		button_4.setBackground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_4.setBounds(213, 84, 60, 23);
		contentPane.add(button_4);
		
		this.button_5 = new JButton("x100");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button_5.isEnabled()==true) {
					int supermercadopizza = ((partida.getSupermercadopizza())+100);
					partida.setSupermercadopizza(supermercadopizza);
					textPane_8.setText(Integer.toString(supermercadopizza));
					partida.setDinero(partida.getDinero()-partida.precioSupermercadoPizzas()*100);
				}
			}
		});
		button_5.setBackground(Color.WHITE);
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_5.setBounds(282, 84, 60, 23);
		contentPane.add(button_5);
		
		this.button_6 = new JButton("x1");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button_6.isEnabled()==true) {
					int mercadillopizza = ((partida.getMercadillopizza())+1);
					partida.setMercadillopizza(mercadillopizza);
					textPane_12.setText(Integer.toString(mercadillopizza));
					partida.setDinero(partida.getDinero()-partida.precioMercadilloPizzas()*1);
				}
			}
		});
		button_6.setBackground(Color.WHITE);
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_6.setBounds(144, 109, 60, 23);
		contentPane.add(button_6);
		
		this.button_7 = new JButton("x10");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button_7.isEnabled()==true) {
					int mercadillopizza = ((partida.getMercadillopizza())+10);
					partida.setMercadillopizza(mercadillopizza);
					textPane_12.setText(Integer.toString(mercadillopizza));
					partida.setDinero(partida.getDinero()-partida.precioMercadilloPizzas()*10);
				}
			}
		});
		button_7.setBackground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_7.setBounds(213, 109, 60, 23);
		contentPane.add(button_7);
		
		this.button_8 = new JButton("x100");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button_7.isEnabled()==true) {
					int mercadillopizza = ((partida.getMercadillopizza())+100);
					partida.setMercadillopizza(mercadillopizza);
					textPane_12.setText(Integer.toString(mercadillopizza));
					partida.setDinero(partida.getDinero()-partida.precioMercadilloPizzas()*100);
				}
			}
		});
		button_8.setBackground(Color.WHITE);
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_8.setBounds(282, 109, 60, 23);
		contentPane.add(button_8);
		
		this.button_9 = new JButton("x1");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button_9.isEnabled()==true) {
					int fabricapizza = ((partida.getFabricapizza())+1);
					partida.setFabricapizza(fabricapizza);
					textPane_16.setText(Integer.toString(fabricapizza));
					partida.setDinero(partida.getDinero()-partida.precioFabricaPizzas()*1);
				}
			}
		});
		button_9.setBackground(Color.WHITE);
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_9.setBounds(144, 134, 60, 23);
		contentPane.add(button_9);
		
		this.button_10 = new JButton("x10");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button_10.isEnabled()==true) {
					int fabricapizza = ((partida.getFabricapizza())+10);
					partida.setFabricapizza(fabricapizza);
					textPane_16.setText(Integer.toString(fabricapizza));
					partida.setDinero(partida.getDinero()-partida.precioFabricaPizzas()*10);
				}
			}
		});
		button_10.setBackground(Color.WHITE);
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_10.setBounds(213, 134, 60, 23);
		contentPane.add(button_10);
		
		this.button_11 = new JButton("x100");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button_11.isEnabled()==true) {
					int fabricapizza = ((partida.getFabricapizza())+100);
					partida.setFabricapizza(fabricapizza);
					textPane_16.setText(Integer.toString(fabricapizza));
					partida.setDinero(partida.getDinero()-partida.precioFabricaPizzas()*100);
				}
			}
		});
		button_11.setBackground(Color.WHITE);
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_11.setBounds(282, 134, 60, 23);
		contentPane.add(button_11);
		
		new Timer().scheduleAtFixedRate(new TimerTask(){
		    @Override
		    public void run(){
		    	textPane.setText(Integer.toString(partida.getStandpizza()));
		    	textPane_4.setText(Integer.toString(partida.getVendedorpizza()));
		    	textPane_8.setText(Integer.toString(partida.getSupermercadopizza()));
		    	textPane_12.setText(Integer.toString(partida.getMercadillopizza()));
		    	textPane_16.setText(Integer.toString(partida.getFabricapizza()));
		    }
		},0,100);
	}
	
	public JButton getBtnX() {
		return btnX;
	}
	
	public void setBtnX(boolean enable) {
		this.btnX.setEnabled(enable);
	}
	
	public JButton getBtnX_1() {
		return btnX_1;
	}
	
	public void setBtnX_1(boolean enable) {
		this.btnX_1.setEnabled(enable);
	}
	
	public JButton getBtnX_2() {
		return btnX_2;
	}
	
	public void setBtnX_2(boolean enable) {
		this.btnX_2.setEnabled(enable);
	}
	
	public JButton getButton() {
		return button;
	}
	
	public void setButton(boolean enable) {
		this.button.setEnabled(enable);
	}
	
	public JButton getButton_1() {
		return button_1;
	}
	
	public void setButton_1(boolean enable) {
		this.button_1.setEnabled(enable);
	}
	
	public JButton getButton_2() {
		return button_2;
	}
	
	public void setButton_2(boolean enable) {
		this.button_2.setEnabled(enable);
	}
	
	public JButton getButton_3() {
		return button_3;
	}
	
	public void setButton_3(boolean enable) {
		this.button_3.setEnabled(enable);
	}
	
	public JButton getButton_4() {
		return button_4;
	}
	
	public void setButton_4(boolean enable) {
		this.button_4.setEnabled(enable);
	}
	
	public JButton getButton_5() {
		return button_5;
	}
	
	public void setButton_5(boolean enable) {
		this.button_5.setEnabled(enable);
	}
	
	public JButton getButton_6() {
		return button_6;
	}
	
	public void setButton_6(boolean enable) {
		this.button_6.setEnabled(enable);
	}
	
	public JButton getButton_7() {
		return button_7;
	}
	
	public void setButton_7(boolean enable) {
		this.button_7.setEnabled(enable);
	}
	
	public JButton getButton_8() {
		return button_8;
	}
	
	public void setButton_8(boolean enable) {
		this.button_8.setEnabled(enable);
	}
	
	public JButton getButton_9() {
		return button_9;
	}
	
	public void setButton_9(boolean enable) {
		this.button_9.setEnabled(enable);
	}
	
	public JButton getButton_10() {
		return button_10;
	}
	
	public void setButton_10(boolean enable) {
		this.button_10.setEnabled(enable);
	}
	
	public JButton getButton_11() {
		return button_11;
	}
	
	public void setButton_11(boolean enable) {
		this.button_11.setEnabled(enable);
	}
}