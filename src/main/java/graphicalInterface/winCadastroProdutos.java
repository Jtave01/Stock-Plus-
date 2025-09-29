package graphicalInterface;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class winCadastroProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winCadastroProdutos frame = new winCadastroProdutos();
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
	public winCadastroProdutos() {
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
		
		JLabel lblCdigoDeBarra = new JLabel("Código de Barra:");
		lblCdigoDeBarra.setBounds(176, 116, 194, 16);
		contentPane.add(lblCdigoDeBarra);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(235, 145, 56, 16);
		contentPane.add(lblNome);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(194, 253, 97, 16);
		contentPane.add(lblQuantidade);
		
		JLabel lblLocalizao = new JLabel("Localização:");
		lblLocalizao.setBounds(196, 282, 114, 16);
		contentPane.add(lblLocalizao);
		
		textField = new JTextField();
		textField.setBounds(283, 279, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(283, 113, 252, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(283, 145, 310, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(283, 250, 116, 22);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(283, 84, 87, 22);
		contentPane.add(textField_4);
		
		JLabel lblFornecedor = new JLabel("Fornecedor:");
		lblFornecedor.setBounds(196, 311, 114, 16);
		contentPane.add(lblFornecedor);
		
		JList list = new JList();
		list.setBounds(283, 310, 315, 25);
		contentPane.add(list);
		
		JLabel lblDescrip = new JLabel("Descrição:");
		lblDescrip.setBounds(207, 174, 105, 16);
		contentPane.add(lblDescrip);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(283, 174, 310, 66);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1 = new JLabel("CADASTRO DE PRODUTO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_1.setBounds(235, 27, 404, 44);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 204));
		panel.setBounds(162, 25, 504, 335);
		contentPane.add(panel);
		
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

	}
}
