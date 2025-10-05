package br.com.stockplus.graphicalInterface.search;

import br.com.stockplus.dao.FornecedorDAO;
import br.com.stockplus.entity.FornecedorEntity;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class WinPesquisaFornecedor extends JFrame {

    private static final long serialVersionUID = 1L;

    public JPanel contentPane;
    public JPanel panel;

    // Campos de texto
    public JTextField textCnpj;
    public JTextField textId;
    public JTextField textRazaoSocial;
    public JTextField textEmail;
    public JTextField textTelefone;
    public JTextField textCidade;
    public JTextField textUf;

    // Botões
    public JButton btnBuscar;
    public JButton btnLimpar;

    // Tabela
    public JTable tableFornecedores;
    public DefaultTableModel tableModel;
    public JScrollPane scrollPane;

    public WinPesquisaFornecedor() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1250, 550);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 102, 153));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panel = new JPanel();
        panel.setBackground(new Color(102, 153, 204));
        panel.setBounds(30, 24, 547, 450);  // Mudei X de 133 para 30 e altura para 450
        panel.setLayout(null);
        contentPane.add(panel);

        // Título
        JLabel lblTitulo = new JLabel("PESQUISAR FORNECEDOR");
        lblTitulo.setForeground(new Color(255, 255, 255));
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 27));
        lblTitulo.setBounds(80, 10, 450, 44);
        panel.add(lblTitulo);

        // CNPJ (campo de busca)
        JLabel lblCnpj = new JLabel("CNPJ:");
        lblCnpj.setBounds(95, 70, 50, 16);
        panel.add(lblCnpj);

        textCnpj = new JTextField();
        textCnpj.setColumns(10);
        textCnpj.setBounds(145, 67, 200, 22);
        panel.add(textCnpj);

        btnBuscar = new JButton("BUSCAR");
        btnBuscar.setBackground(new Color(51, 153, 255));
        btnBuscar.setForeground(Color.WHITE);
        btnBuscar.setBounds(355, 66, 100, 25);
        panel.add(btnBuscar);
        btnBuscar.addActionListener(e -> buscarFornecedor());

        // Separador
        JSeparator separator = new JSeparator();
        separator.setBounds(20, 105, 507, 2);
        panel.add(separator);

        JLabel lblResultados = new JLabel("Resultados da Pesquisa:");
        lblResultados.setForeground(Color.WHITE);
        lblResultados.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblResultados.setBounds(20, 115, 200, 20);
        panel.add(lblResultados);

        // ID (resultado)
        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(112, 145, 30, 16);
        panel.add(lblId);

        textId = new JTextField();
        textId.setColumns(10);
        textId.setBounds(145, 142, 80, 22);
        textId.setEditable(false);
        textId.setBackground(Color.LIGHT_GRAY);
        panel.add(textId);

        // Razão Social
        JLabel lblRazaoSocial = new JLabel("Razão Social:");
        lblRazaoSocial.setBounds(53, 177, 90, 16);
        panel.add(lblRazaoSocial);

        textRazaoSocial = new JTextField();
        textRazaoSocial.setColumns(10);
        textRazaoSocial.setBounds(145, 174, 310, 22);
        textRazaoSocial.setEditable(false);
        textRazaoSocial.setBackground(Color.WHITE);
        panel.add(textRazaoSocial);

        // E-mail
        JLabel lblEmail = new JLabel("E-mail:");
        lblEmail.setBounds(89, 209, 105, 16);
        panel.add(lblEmail);

        textEmail = new JTextField();
        textEmail.setColumns(10);
        textEmail.setBounds(145, 206, 310, 22);
        textEmail.setEditable(false);
        textEmail.setBackground(Color.WHITE);
        panel.add(textEmail);

        // Telefone
        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(73, 241, 70, 16);
        panel.add(lblTelefone);

        textTelefone = new JTextField();
        textTelefone.setColumns(10);
        textTelefone.setBounds(145, 238, 193, 22);
        textTelefone.setEditable(false);
        textTelefone.setBackground(Color.WHITE);
        panel.add(textTelefone);

        // Cidade
        JLabel lblCidade = new JLabel("Cidade:");
        lblCidade.setBounds(87, 273, 60, 16);
        panel.add(lblCidade);

        textCidade = new JTextField();
        textCidade.setColumns(10);
        textCidade.setBounds(145, 270, 193, 22);
        textCidade.setEditable(false);
        textCidade.setBackground(Color.WHITE);
        panel.add(textCidade);

        // UF
        JLabel lblUf = new JLabel("UF:");
        lblUf.setBounds(350, 273, 30, 16);
        panel.add(lblUf);

        textUf = new JTextField();
        textUf.setColumns(10);
        textUf.setBounds(375, 270, 80, 22);
        textUf.setEditable(false);
        textUf.setBackground(Color.WHITE);
        panel.add(textUf);

        btnLimpar = new JButton("LIMPAR");
        btnLimpar.setForeground(new Color(248, 248, 255));
        btnLimpar.setBackground(new Color(255, 140, 0));
        btnLimpar.setBounds(225, 480, 135, 32);  // Ajustar Y de 395 para 480
        contentPane.add(btnLimpar);

        // PAINEL DIREITO - Tabela com todos os fornecedores
        JPanel panelTabela = new JPanel();
        panelTabela.setBackground(new Color(102, 153, 204));
        panelTabela.setBounds(600, 24, 600, 450);  // Ajustar X de 600 e largura para 600
        panelTabela.setLayout(null);
        contentPane.add(panelTabela);



        JLabel lblTodosFornecedores = new JLabel("TODOS OS FORNECEDORES");
        lblTodosFornecedores.setForeground(Color.WHITE);
        lblTodosFornecedores.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTodosFornecedores.setBounds(160, 10, 300, 30);
        panelTabela.add(lblTodosFornecedores);
        String[] colunas = {"CNPJ", "Razão Social", "E-mail", "Endereço", "Número", "Telefone", "Bairro", "Cidade", "UF"};
        tableModel = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tableFornecedores = new JTable(tableModel);
        tableFornecedores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // colunas
        tableFornecedores.getColumnModel().getColumn(0).setPreferredWidth(130); // CNPJ
        tableFornecedores.getColumnModel().getColumn(0).setMaxWidth(130);
        tableFornecedores.getColumnModel().getColumn(0).setMinWidth(130);
        tableFornecedores.getColumnModel().getColumn(1).setPreferredWidth(200); // Razão Social
        tableFornecedores.getColumnModel().getColumn(1).setMaxWidth(200);
        tableFornecedores.getColumnModel().getColumn(1).setMinWidth(200);
        tableFornecedores.getColumnModel().getColumn(2).setPreferredWidth(180); // E-mail
        tableFornecedores.getColumnModel().getColumn(2).setMaxWidth(180);
        tableFornecedores.getColumnModel().getColumn(2).setMinWidth(180);
        tableFornecedores.getColumnModel().getColumn(3).setPreferredWidth(200); // Endereço
        tableFornecedores.getColumnModel().getColumn(3).setMaxWidth(200);
        tableFornecedores.getColumnModel().getColumn(3).setMinWidth(200);
        tableFornecedores.getColumnModel().getColumn(4).setPreferredWidth(70);  // Número
        tableFornecedores.getColumnModel().getColumn(4).setMaxWidth(70);
        tableFornecedores.getColumnModel().getColumn(4).setMinWidth(70);
        tableFornecedores.getColumnModel().getColumn(5).setPreferredWidth(120); // Telefone
        tableFornecedores.getColumnModel().getColumn(5).setMaxWidth(120);
        tableFornecedores.getColumnModel().getColumn(5).setMinWidth(120);
        tableFornecedores.getColumnModel().getColumn(6).setPreferredWidth(150); // Bairro
        tableFornecedores.getColumnModel().getColumn(6).setMaxWidth(150);
        tableFornecedores.getColumnModel().getColumn(6).setMinWidth(150);
        tableFornecedores.getColumnModel().getColumn(7).setPreferredWidth(150); // Cidade
        tableFornecedores.getColumnModel().getColumn(7).setMaxWidth(150);
        tableFornecedores.getColumnModel().getColumn(7).setMinWidth(150);
        tableFornecedores.getColumnModel().getColumn(8).setPreferredWidth(50);  // UF
        tableFornecedores.getColumnModel().getColumn(8).setMaxWidth(50);
        tableFornecedores.getColumnModel().getColumn(8).setMinWidth(50);
        tableFornecedores.getTableHeader().setResizingAllowed(false);
        tableFornecedores.getTableHeader().setReorderingAllowed(false);

        tableFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int row = tableFornecedores.getSelectedRow();
                if (row >= 0) {
                    String cnpj = (String) tableModel.getValueAt(row, 0);
                   // carregarFornecedorPorCnpj(cnpj);
                }
            }
        });
        scrollPane = new JScrollPane(tableFornecedores);
        tableFornecedores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // ADICIONE ESTA LINHA
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(20, 50, 560, 380);
        panelTabela.add(scrollPane);

       // carregarTodosFornecedores();

        // Carregar todos os fornecedores automaticamente
       // carregarTodosFornecedores();
    }

    private void buscarFornecedor() {
    }

    private void limparCampos() {
    }


}