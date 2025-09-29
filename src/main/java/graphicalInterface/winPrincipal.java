package graphicalInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
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
     *
     *
     *
     *
	 */
    private void voltarParaDashboard() {
        try {
            // Fechar janela atual
            this.dispose();

            // Criar nova instância da winPrincipal
            winPrincipal novaTela = new winPrincipal();
            novaTela.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void abrirCadastroProduto() {
        try {
            // Salvar dados importantes da janela atual
            JMenuBar menuAtual = this.getJMenuBar();
            String tituloAtual = this.getTitle();
            // Criar a tela temporariamente
            winCadastroProdutos tempFrame = new winCadastroProdutos();
            // Pegar APENAS o painel principal (contentPane)
            JPanel painelCadastro = (JPanel) tempFrame.getContentPane();

            this.getContentPane().removeAll();
            this.setLayout(painelCadastro.getLayout());

            while (painelCadastro.getComponentCount() > 0) {
                Component comp = painelCadastro.getComponent(0);
                painelCadastro.remove(comp);
                this.getContentPane().add(comp);
            }

            this.getContentPane().setBackground(painelCadastro.getBackground());

            this.setJMenuBar(menuAtual);
            this.setTitle("Cadastro de Produtos");

            this.revalidate();
            this.repaint();

            tempFrame.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Erro: " + ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

	public winPrincipal() {

        setLocationRelativeTo(null);


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


        /// ----> Produtos
		JMenu menuProdutos = new JMenu("PRODUTOS");
		menuProdutos.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imgs/ico_produtos.png"))));
		menuProdutos.setForeground(Color.WHITE);
		menuProdutos.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(menuProdutos);
        JMenuItem subMenuPCadastar = new JMenuItem("Cadastrar Produto");
        JMenuItem subMenuPPesquisar = new JMenuItem("Pesquisar Produto");
        menuProdutos.add(subMenuPCadastar);
        menuProdutos.addSeparator();
        menuProdutos.add(subMenuPPesquisar);
        subMenuPCadastar.addActionListener(e -> abrirCadastroProduto());



        /// -----> Fornecedores
		JMenu menuFornecedores = new JMenu("FORNECEDORES");
		menuFornecedores.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imgs/ico_fornecedores.png"))));
		menuFornecedores.setForeground(Color.WHITE);
		menuFornecedores.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(menuFornecedores);
        JMenuItem subMenuFCadastrar = new JMenuItem("Cadastrar fornecedor");
        JMenuItem subMenuFPEsquisar = new JMenuItem("Pesquisar fornecedor");
        menuFornecedores.add(subMenuFCadastrar);
        menuFornecedores.addSeparator();
        menuFornecedores.add(subMenuFPEsquisar);

        /// ----> Usuaarios
		JMenu menuUsuarios = new JMenu("USUÁRIOS");
		menuUsuarios.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imgs/ico_usuarios.png"))));
		menuUsuarios.setForeground(Color.WHITE);
		menuUsuarios.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(menuUsuarios);
        JMenuItem subMenuUCadastro = new JMenuItem("Cadastro de usuarios");
        menuUsuarios.add(subMenuUCadastro);


        /// --- HOME
		JMenu menuSair = new JMenu("HOME");
		menuSair.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imgs/ico_sair.png"))));
		menuSair.setForeground(Color.WHITE);
		menuSair.setFont(new Font("Segoe UI", Font.BOLD, 16));
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent e) {
                dispose(); // Fecha atual
                new winPrincipal().setVisible(true); // Abre nova
            }
        });
        menuBar.add(menuSair);

		

	}
}
