package graphicalInterface;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;
import java.util.Objects;

public class winPrincipal extends JFrame {

	@Serial
    private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winPrincipal frame = new winPrincipal();
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
	public winPrincipal() {
		getContentPane().setBackground(new Color(204, 204, 204));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Objects.requireNonNull(winPrincipal.class.getResource("/imgs/dash_new.png"))));
		lblNewLabel.setBounds(115, 50, 1151, 466);
		getContentPane().add(lblNewLabel);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 102, 153));
		setJMenuBar(menuBar);
		
		JMenu mnProdutos = new JMenu("PRODUTOS");
		mnProdutos.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imgs/ico_produtos.png"))));
		mnProdutos.setForeground(Color.WHITE);
		mnProdutos.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnProdutos);
		
		JMenu mnFornecedores = new JMenu("FORNECEDORES");
		mnFornecedores.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imgs/ico_fornecedores.png"))));
		mnFornecedores.setForeground(Color.WHITE);
		mnFornecedores.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnFornecedores);
		
		JMenu mnProdutos_1_1 = new JMenu("USUÁRIOS");
		mnProdutos_1_1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imgs/ico_usuarios.png"))));
		mnProdutos_1_1.setForeground(Color.WHITE);
		mnProdutos_1_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnProdutos_1_1);
		
		JMenu mnProdutos_1_1_1_1_1 = new JMenu("SAIR");
		mnProdutos_1_1_1_1_1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imgs/ico_sair.png"))));
		mnProdutos_1_1_1_1_1.setForeground(Color.WHITE);
		mnProdutos_1_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnProdutos_1_1_1_1_1);
		
		

	}
}
