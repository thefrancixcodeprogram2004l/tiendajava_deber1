package modelo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Button;
import java.awt.Label;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Ventana3 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nombre;
	private JTextField txt_mail;
	private JTextField txt_cedula;
	private ArrayList<Clientes> clientes = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
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
	public Ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 324);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Edad");
		lblNewLabel_1.setBounds(10, 84, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mail");
		lblNewLabel_2.setBounds(10, 140, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cedula");
		lblNewLabel_3.setBounds(10, 190, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(95, 29, 86, 20);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		txt_mail = new JTextField();
		txt_mail.setBounds(95, 137, 86, 20);
		contentPane.add(txt_mail);
		txt_mail.setColumns(10);
		
		txt_cedula = new JTextField();
		txt_cedula.setBounds(95, 187, 86, 20);
		contentPane.add(txt_cedula);
		txt_cedula.setColumns(10);
		
		JSpinner spn_edad = new JSpinner();
		spn_edad.setBounds(95, 81, 86, 20);
		contentPane.add(spn_edad);
		
		JButton btn_cancel = new JButton("cancel");
		btn_cancel.setIcon(new ImageIcon(Ventana3.class.getResource("/multimedia/cancelar.png")));
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Ventana1 v1 = new Ventana1();
				v1.setVisible(true);
			}
		});
		btn_cancel.setBounds(364, 241, 104, 43);
		contentPane.add(btn_cancel);
		
		JButton btn_visualizar = new JButton("ver");
		btn_visualizar.setIcon(new ImageIcon(Ventana3.class.getResource("/multimedia/portapapeles.png")));
		btn_visualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Clientes c : clientes) {
		            System.out.println(c.toString());
		        }
			}
		});
		btn_visualizar.setBounds(137, 241, 104, 43);
		contentPane.add(btn_visualizar);
		
		JButton btn_agg = new JButton("agg");
		btn_agg.setIcon(new ImageIcon(Ventana3.class.getResource("/multimedia/aceptar (1).png")));
		btn_agg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre =txt_nombre.getText();
				String edad = spn_edad.getValue().toString();
				String mail =txt_mail.getText();
				String cedula =txt_cedula.getText();
				if(nombre.isEmpty() || edad.isEmpty() || mail.isEmpty() || cedula.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Datos vacios!!!");
				}else {
					clientes.add(new Clientes(nombre,edad,mail,cedula));		
				}
			}
		});
		btn_agg.setBounds(250, 241, 104, 43);
		contentPane.add(btn_agg);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Ventana3.class.getResource("/multimedia/clasificacion.png")));
		lblNewLabel_4.setBounds(197, 0, 282, 223);
		contentPane.add(lblNewLabel_4);
	}
}
