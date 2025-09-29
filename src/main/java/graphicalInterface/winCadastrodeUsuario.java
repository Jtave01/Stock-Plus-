package graphicalInterface;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class winCadastrodeUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winCadastrodeUsuario frame = new winCadastrodeUsuario();
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
	public winCadastrodeUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 433);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(254, 87, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblCdigoDeBarra = new JLabel("Usuário:");
		lblCdigoDeBarra.setBounds(221, 116, 63, 16);
		contentPane.add(lblCdigoDeBarra);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(231, 148, 87, 16);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(283, 113, 252, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(283, 145, 310, 22);
		contentPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(283, 84, 87, 22);
		contentPane.add(textField_4);
		
		JLabel lblDescrip = new JLabel("E-mail:");
		lblDescrip.setBounds(227, 183, 105, 16);
		contentPane.add(lblDescrip);
		
		JLabel lblNewLabel_1 = new JLabel("CADASTRO DE USUÁRIO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_1.setBounds(267, 23, 404, 44);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCadastrar = new JButton("CADASTRAR +");
		btnCadastrar.setForeground(new Color(248, 248, 255));
		btnCadastrar.setBackground(new Color(102, 204, 102));
		btnCadastrar.setBounds(428, 328, 135, 32);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(new Color(248, 248, 255));
		btnCancelar.setBackground(new Color(220, 20, 60));
		btnCancelar.setBounds(254, 328, 135, 32);
		contentPane.add(btnCancelar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(283, 180, 310, 22);
		contentPane.add(textField);
		
		JLabel lblBairro = new JLabel("Senha:");
		lblBairro.setBounds(221, 215, 105, 16);
		contentPane.add(lblBairro);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(283, 212, 193, 22);
		contentPane.add(textField_6);
		
		JLabel lblCidade = new JLabel("Repita a senha:");
		lblCidade.setBounds(166, 244, 105, 16);
		contentPane.add(lblCidade);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(283, 244, 193, 22);
		contentPane.add(textField_7);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 204));
		panel.setBounds(133, 24, 547, 270);
		contentPane.add(panel);

	}
}
