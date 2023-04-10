package modelo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nombre;
	private ArrayList<Producto> productos = new ArrayList<>();




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("cantidad");
		lblNewLabel_1.setBounds(10, 102, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("costo");
		lblNewLabel_2.setBounds(10, 173, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(98, 29, 86, 20);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		JSpinner spn_cantidad = new JSpinner();
		spn_cantidad.setBounds(98, 99, 86, 20);
		contentPane.add(spn_cantidad);
		
		JSpinner spn_costo = new JSpinner();
		spn_costo.setBounds(98, 170, 86, 20);
		contentPane.add(spn_costo);
		
		JLabel lblNewLabel_4 = new JLabel("imagen");
		lblNewLabel_4.setIcon(new ImageIcon(Ventana2.class.getResource("/multimedia/carrito-de-supermercado.png")));
		lblNewLabel_4.setBounds(217, 0, 233, 212);
		contentPane.add(lblNewLabel_4);
		
		JButton btn_agregar = new JButton("agregar");
		btn_agregar.setIcon(new ImageIcon(Ventana2.class.getResource("/multimedia/aceptar (1).png")));
		btn_agregar.setBounds(217, 223, 104, 43);
		contentPane.add(btn_agregar);
		btn_agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre =txt_nombre.getText();
				String cantidad = spn_cantidad.getValue().toString();
				String costo =spn_costo.getValue().toString();
				if(nombre.isEmpty() || cantidad.isEmpty() || costo.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Datos vacios!!!");
				}else {
					productos.add(new Producto(nombre,cantidad,costo));		
				}
			}
		});
		
		JButton btn_cancelar = new JButton("cancelar");
		btn_cancelar.setIcon(new ImageIcon(Ventana2.class.getResource("/multimedia/cancelar.png")));
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
				dispose();
				Ventana1 v1 = new Ventana1();
				v1.setVisible(true);
			}
		});
		btn_cancelar.setBounds(336, 223, 104, 43);
		contentPane.add(btn_cancelar);
		
		JButton btnNewButton = new JButton("ver");
		btnNewButton.setIcon(new ImageIcon(Ventana2.class.getResource("/multimedia/portapapeles.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Producto p : productos) {
		            System.out.println(p.toString());
		        }

			}
		});
		btnNewButton.setBounds(98, 223, 104, 43);
		contentPane.add(btnNewButton);
		
		
	}
}
