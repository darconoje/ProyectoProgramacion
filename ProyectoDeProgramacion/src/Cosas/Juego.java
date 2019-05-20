package Cosas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Juego extends JFrame {
	
	private JPanel contentPane;
	private Partida partida;
	private JTextPane textPane;
	private MejorasPrevio mejorasprevio;
	private MejorasGalleta galleta;
	private MejorasPizza pizza;
	private MejorasPanini panini;
	private MejorasNoodles noodles;
	private ExportarPartida exportarpartida;
	private ImportarPartida importarpartida;
	private DefaultListModel<String> partidas;
	private JList<String> list;
	private FicherosSave ficheros;

	/**
	 * Create the frame.
	 */
	public Juego(String usuario) {
		partida = new Partida();
		/*si el nombre del usuario que viene del login es un nuevo usuario que no existe en la tabla partidas
		primero se llama al a funcion nuevaPartida para actualizar la tabla añadiendo una fila correspondiente al jugador nuevo
		con todas las variables a 0, si no simplemente se cargan los datos de la partida desde la base de datos
		*/
		if(partida.jugadorNuevo(usuario)==false) {
			partida = partida.cargarDatos(usuario);
		}else {
			partida.nuevaPartida(usuario);
		}
		galleta = new MejorasGalleta(partida);
		pizza = new MejorasPizza(partida);
		panini = new MejorasPanini(partida);
		noodles = new MejorasNoodles(partida);
		mejorasprevio = new MejorasPrevio(partida,galleta,pizza,panini,noodles);
		ficheros = new FicherosSave();
		partidas = ficheros.listarSaves();
		exportarpartida = new ExportarPartida(partida,ficheros);
		importarpartida = new ImportarPartida(partida,ficheros,partidas);
		
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
				mejorasprevio.setVisible(true);
			}
			
		});
		btnMejoras.setBackground(Color.WHITE);
		btnMejoras.setBounds(43, 268, 89, 23);
		panel.add(btnMejoras);
		
		textPane = new JTextPane();
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
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(button_1.isEnabled()==true) {
					int dinero = partida.getDinero()+100;
					int puntuaciontotal = partida.getPuntuaciontotal()+100;
					partida.setDinero(dinero);
					textPane.setText(Integer.toString(dinero));
					partida.setPuntuaciontotal(puntuaciontotal);
					textPane_1.setText(Integer.toString(puntuaciontotal));
				}
			}
		});
		button_1.setIcon(new ImageIcon(Juego.class.getResource("/Imagenes/paniniicon.png")));
		button_1.setBounds(333, 130, 83, 70);
		panel.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(Color.WHITE);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(button_2.isEnabled()==true) {
					int dinero = partida.getDinero()+500;
					int puntuaciontotal = partida.getPuntuaciontotal()+500;
					partida.setDinero(dinero);
					textPane.setText(Integer.toString(dinero));
					partida.setPuntuaciontotal(puntuaciontotal);
					textPane_1.setText(Integer.toString(puntuaciontotal));
				}
			}
		});
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
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(button.isEnabled()==true) {
				int dinero = partida.getDinero()+25;
				int puntuaciontotal = partida.getPuntuaciontotal()+25;
				partida.setDinero(dinero);
				textPane.setText(Integer.toString(dinero));
				partida.setPuntuaciontotal(puntuaciontotal);
				textPane_1.setText(Integer.toString(puntuaciontotal));
				}
			}
		});
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
		btnCargar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				partidas = ficheros.listarSaves();
				importarpartida.repaintList(partidas);
				importarpartida.setVisible(true);
			}
		});
		btnCargar.setBackground(Color.WHITE);
		btnCargar.setBounds(480, 268, 89, 23);
		panel.add(btnCargar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				partida.guardarPartida(partida);
			}
		});
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setBounds(381, 268, 89, 23);
		panel.add(btnGuardar);
		
		JButton btnExportar = new JButton("Exportar");
		btnExportar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				exportarpartida.setVisible(true);
			}
		});
		btnExportar.setBackground(Color.WHITE);
		btnExportar.setBounds(480, 236, 89, 23);
		panel.add(btnExportar);
		
		/**
		 * Este timer se actualiza cada decima de segundo y habilita/deshabilita los botones de productos y mejoras dependiendo del dinero o la
		 * puntuacion total que haya disponible
		 */
		
		new Timer().scheduleAtFixedRate(new TimerTask(){
		    @Override
		    public void run(){
		       textPane.setText(partida.getDinero()+"");
		       textPane_1.setText(partida.getPuntuaciontotal()+"");
		       textPane_3.setText(Integer.toString(partida.obtenerDineroPorSegundo()));
		       
		       if(partida.getDinero()<partida.getPreciostandgalletitas()*1) {
		    	   galleta.setBtnX(false);
		       }else {
		    	   galleta.setBtnX(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciostandgalletitas()*10) {
		    	   galleta.setBtnX_1(false);
		       }else {
		    	   galleta.setBtnX_1(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciostandgalletitas()*100) {
		    	   galleta.setBtnX_2(false);
		       }else {
		    	   galleta.setBtnX_2(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedorgalletitas()*1) {
		    	   galleta.setButton(false);
		       }else {
		    	   galleta.setButton(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedorgalletitas()*10) {
		    	   galleta.setButton_1(false);
		       }else {
		    	   galleta.setButton_1(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedorgalletitas()*100) {
		    	   galleta.setButton_2(false);
		       }else {
		    	   galleta.setButton_2(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadogalletitas()*1) {
		    	   galleta.setButton_3(false);
		       }else {
		    	   galleta.setButton_3(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadogalletitas()*10) {
		    	   galleta.setButton_4(false);
		       }else {
		    	   galleta.setButton_4(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadogalletitas()*100) {
		    	   galleta.setButton_5(false);
		       }else {
		    	   galleta.setButton_5(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillogalletitas()*1) {
		    	   galleta.setButton_6(false);
		       }else {
		    	   galleta.setButton_6(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillogalletitas()*10) {
		    	   galleta.setButton_7(false);
		       }else {
		    	   galleta.setButton_7(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillogalletitas()*100) {
		    	   galleta.setButton_8(false);
		       }else {
		    	   galleta.setButton_8(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricagalletitas()*1) {
		    	   galleta.setButton_9(false);
		       }else {
		    	   galleta.setButton_9(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricagalletitas()*10) {
		    	   galleta.setButton_10(false);
		       }else {
		    	   galleta.setButton_10(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricagalletitas()*100) {
		    	   galleta.setButton_11(false); 
		       }else {
		    	   galleta.setButton_11(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciostandpizza()*1) {
		    	   pizza.setBtnX(false);
		       }else {
		    	   pizza.setBtnX(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciostandpizza()*10) {
		    	   pizza.setBtnX_1(false);
		       }else {
		    	   pizza.setBtnX_1(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciostandpizza()*100) {
		    	   pizza.setBtnX_2(false);
		       }else {
		    	   pizza.setBtnX_2(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedorpizza()*1) {
		    	   pizza.setButton(false);
		       }else {
		    	   pizza.setButton(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedorpizza()*10) {
		    	   pizza.setButton_1(false);
		       }else {
		    	   pizza.setButton_1(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedorpizza()*100) {
		    	   pizza.setButton_2(false);
		       }else {
		    	   pizza.setButton_2(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadopizza()*1) {
		    	   pizza.setButton_3(false);
		       }else {
		    	   pizza.setButton_3(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadopizza()*10) {
		    	   pizza.setButton_4(false);
		       }else {
		    	   pizza.setButton_4(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadopizza()*100) {
		    	   pizza.setButton_5(false);
		       }else {
		    	   pizza.setButton_5(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillopizza()*1) {
		    	   pizza.setButton_6(false);
		       }else {
		    	   pizza.setButton_6(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillopizza()*10) {
		    	   pizza.setButton_7(false);
		       }else {
		    	   pizza.setButton_7(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillopizza()*100) {
		    	   pizza.setButton_8(false);
		       }else {
		    	   pizza.setButton_8(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricapizza()*1) {
		    	   pizza.setButton_9(false);
		       }else {
		    	   pizza.setButton_9(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricapizza()*10) {
		    	   pizza.setButton_10(false);
		       }else {
		    	   pizza.setButton_10(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricapizza()*100) {
		    	   pizza.setButton_11(false); 
		       }else {
		    	   pizza.setButton_11(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciostandpanini()*1) {
		    	   panini.setBtnX(false);
		       }else {
		    	   panini.setBtnX(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciostandpanini()*10) {
		    	   panini.setBtnX_1(false);
		       }else {
		    	   panini.setBtnX_1(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciostandpanini()*100) {
		    	   panini.setBtnX_2(false);
		       }else {
		    	   panini.setBtnX_2(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedorpanini()*1) {
		    	   panini.setButton(false);
		       }else {
		    	   panini.setButton(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedorpanini()*10) {
		    	   panini.setButton_1(false);
		       }else {
		    	   panini.setButton_1(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedorpanini()*100) {
		    	   panini.setButton_2(false);
		       }else {
		    	   panini.setButton_2(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadopanini()*1) {
		    	   panini.setButton_3(false);
		       }else {
		    	   panini.setButton_3(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadopanini()*10) {
		    	   panini.setButton_4(false);
		       }else {
		    	   panini.setButton_4(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadopanini()*100) {
		    	   panini.setButton_5(false);
		       }else {
		    	   panini.setButton_5(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillopanini()*1) {
		    	   panini.setButton_6(false);
		       }else {
		    	   panini.setButton_6(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillopanini()*10) {
		    	   panini.setButton_7(false);
		       }else {
		    	   panini.setButton_7(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillopanini()*100) {
		    	   panini.setButton_8(false);
		       }else {
		    	   panini.setButton_8(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricapanini()*1) {
		    	   panini.setButton_9(false);
		       }else {
		    	   panini.setButton_9(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricapanini()*10) {
		    	   panini.setButton_10(false);
		       }else {
		    	   panini.setButton_10(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricapanini()*100) {
		    	   panini.setButton_11(false); 
		       }else {
		    	   panini.setButton_11(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciostandnoodles()*1) {
		    	   noodles.setBtnX(false);
		       }else {
		    	   noodles.setBtnX(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciostandnoodles()*10) {
		    	   noodles.setBtnX_1(false);
		       }else {
		    	   noodles.setBtnX_1(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciostandnoodles()*100) {
		    	   noodles.setBtnX_2(false);
		       }else {
		    	   noodles.setBtnX_2(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedornoodles()*1) {
		    	   noodles.setButton(false);
		       }else {
		    	   noodles.setButton(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedornoodles()*10) {
		    	   noodles.setButton_1(false);
		       }else {
		    	   noodles.setButton_1(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciovendedornoodles()*100) {
		    	   noodles.setButton_2(false);
		       }else {
		    	   noodles.setButton_2(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadonoodles()*1) {
		    	   noodles.setButton_3(false);
		       }else {
		    	   noodles.setButton_3(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadonoodles()*10) {
		    	   noodles.setButton_4(false);
		       }else {
		    	   noodles.setButton_4(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciosupermercadonoodles()*100) {
		    	   noodles.setButton_5(false);
		       }else {
		    	   noodles.setButton_5(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillonoodles()*1) {
		    	   noodles.setButton_6(false);
		       }else {
		    	   noodles.setButton_6(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillonoodles()*10) {
		    	   noodles.setButton_7(false);
		       }else {
		    	   noodles.setButton_7(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciomercadillonoodles()*100) {
		    	   noodles.setButton_8(false);
		       }else {
		    	   noodles.setButton_8(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricanoodles()*1) {
		    	   noodles.setButton_9(false);
		       }else {
		    	   noodles.setButton_9(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricanoodles()*10) {
		    	   noodles.setButton_10(false);
		       }else {
		    	   noodles.setButton_10(true);
		       }
		       
		       if(partida.getDinero()<partida.getPreciofabricanoodles()*100) {
		    	   noodles.setButton_11(false); 
		       }else {
		    	   noodles.setButton_11(true);
		       }
		       
		       if(partida.getPuntuaciontotal()>1000) {
		    	   button.setEnabled(true);
		    	   mejorasprevio.setbtnNewButton_1(true);
		       }else {
		    	   button.setEnabled(false);
		    	   mejorasprevio.setbtnNewButton_1(false);
		       }
		       
		       if(partida.getPuntuaciontotal()>50000) {
		    	   button_1.setEnabled(true);
		    	   mejorasprevio.setbtnNewButton_2(true);
		       }else {
		    	   button_1.setEnabled(false);
		    	   mejorasprevio.setbtnNewButton_2(false);
		       }
		       
		       if(partida.getPuntuaciontotal()>200000) {
		    	   button_2.setEnabled(true);
		    	   mejorasprevio.setbtnNewButton_3(true);
		       }else {
		    	   button_2.setEnabled(false);
		    	   mejorasprevio.setbtnNewButton_3(false);
		       }
		    }
		},0,100);
		
		/**
		 *  Este timer actualiza cada segundo el tiempo total de la partida, ademas del dinero y la puntuacion que se gana cada segundo debido
		 *  a las mejoras que se hayan comprado
		 */
		
		new Timer().scheduleAtFixedRate(new TimerTask(){
		    @Override
		    public void run(){
		    partida.setTiempototal(partida.getTiempototal()+1);
		    textPane_4.setText(Integer.toString(partida.getTiempototal()));
			partida.setDinero(partida.getDinero()+partida.obtenerDineroPorSegundo());
			textPane.setText(Integer.toString(partida.getDinero()));
			partida.setPuntuaciontotal(partida.getPuntuaciontotal()+partida.obtenerDineroPorSegundo());
			textPane_1.setText(Integer.toString(partida.getPuntuaciontotal()));
		    }
		},0,1000);
	}
}
