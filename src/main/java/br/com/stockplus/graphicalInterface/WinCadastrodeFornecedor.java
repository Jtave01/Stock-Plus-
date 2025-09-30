package br.com.stockplus.graphicalInterface;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class WinCadastrodeFornecedor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public WinCadastrodeFornecedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(254, 87, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblCdigoDeBarra = new JLabel("CNPJ:");
		lblCdigoDeBarra.setBounds(235, 116, 46, 16);
		contentPane.add(lblCdigoDeBarra);
		
		JLabel lblNome = new JLabel("Razão Social:");
		lblNome.setBounds(183, 148, 87, 16);
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
		
		JLabel lblDescrip = new JLabel("Endereço:");
		lblDescrip.setBounds(207, 177, 105, 16);
		contentPane.add(lblDescrip);
		
		JLabel lblNewLabel_1 = new JLabel("CADASTRO DE FORNECEDOR");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_1.setBounds(235, 27, 404, 44);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCadastrar = new JButton("CADASTRAR +");
		btnCadastrar.setForeground(new Color(248, 248, 255));
		btnCadastrar.setBackground(new Color(102, 204, 102));
		btnCadastrar.setBounds(431, 381, 135, 32);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(new Color(248, 248, 255));
		btnCancelar.setBackground(new Color(220, 20, 60));
		btnCancelar.setBounds(267, 381, 135, 32);
		contentPane.add(btnCancelar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(283, 180, 310, 22);
		contentPane.add(textField);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(217, 216, 105, 16);
		contentPane.add(lblNumero);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(283, 213, 87, 22);
		contentPane.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(495, 215, 87, 22);
		contentPane.add(textField_5);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(430, 216, 105, 16);
		contentPane.add(lblTelefone);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(227, 245, 105, 16);
		contentPane.add(lblBairro);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(283, 245, 193, 22);
		contentPane.add(textField_6);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(217, 278, 105, 16);
		contentPane.add(lblCidade);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(283, 275, 193, 22);
		contentPane.add(textField_7);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(488, 278, 105, 16);
		contentPane.add(lblUf);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(518, 275, 56, 22);
		contentPane.add(textField_8);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 204));
		panel.setBounds(175, 27, 504, 314);
		contentPane.add(panel);

	}
}
