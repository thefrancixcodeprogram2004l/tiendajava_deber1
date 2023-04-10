package modelo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
//	protected ArrayList<Producto> productos = new ArrayList<>();



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	// Crear una instancia de Ventana2
	// Crear una instancia de Ventana2
	public Ventana1() {
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tienda");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO!!!");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(121, 21, 198, 40);
		contentPane.add(lblNewLabel);
		
		JButton btn_productos = new JButton("productos");
		btn_productos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btn_productos.setBounds(94, 207, 104, 43);
		contentPane.add(btn_productos);
		btn_productos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana2 v2 = new Ventana2();
				v2.setVisible(true);
				setVisible(false);
			}
		});
		
		
		JButton btn_clientes = new JButton("clientes");
		btn_clientes.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btn_clientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana3 v3 =new Ventana3();
				v3.setVisible(true);
				setVisible(false);
			}
		});
		btn_clientes.setBounds(268, 207, 104, 43);
		contentPane.add(btn_clientes);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Ventana1.class.getResource("/multimedia/demostracion-en-la-tienda.png")));
		lblNewLabel_1.setBounds(10, 11, 424, 192);
		contentPane.add(lblNewLabel_1);
	}
	
}
