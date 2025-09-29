package graphicalInterface;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class winPesquisaProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winPesquisaProdutos frame = new winPesquisaProdutos();
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




	public winPesquisaProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PRODUTOS");
		lblNewLabel_1.setBounds(302, 31, 225, 33);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(122, 118, 106, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Código de barra:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(65, 147, 119, 16);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(170, 115, 423, 22);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(170, 147, 252, 22);
		contentPane.add(textField_1);
		
		table = new JTable();
		table.setBounds(170, 217, 503, 187);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.setBounds(170, 179, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setForeground(new Color(248, 248, 255));
		btnExcluir.setBackground(new Color(220, 20, 60));
		btnExcluir.setBounds(186, 438, 135, 32);
		contentPane.add(btnExcluir);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setForeground(new Color(248, 248, 255));
		btnSalvar.setBackground(new Color(102, 204, 102));
		btnSalvar.setBounds(522, 438, 135, 32);
		contentPane.add(btnSalvar);
		
		JButton btnAlterar = new JButton("EDITAR");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlterar.setForeground(new Color(248, 248, 255));
		btnAlterar.setBackground(new Color(255, 153, 0));
		btnAlterar.setBounds(360, 438, 135, 32);
		contentPane.add(btnAlterar);

	}

}
