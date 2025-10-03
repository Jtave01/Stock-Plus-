package br.com.stockplus.graphicalInterface.search;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class WinPesquisaFornecedor extends JFrame {

    private static final long serialVersionUID = 1L;

    // Painéis
    public JPanel contentPane;

    // Labels
    public JLabel lblTitulo;
    public JLabel lblCnpj;

    // Campos de texto
    public JTextField textCnpj;

    // Tabela
    public JTable table;
    public JScrollPane scrollPane;

    // Botões
    public JButton btnPesquisar;
    public JButton btnExcluir;
    public JButton btnEditar;
    public JButton btnSalvar;

    /**
     * Create the frame.
     */
    public WinPesquisaFornecedor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 888, 580);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 102, 153));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Título
        lblTitulo = new JLabel("FORNECEDORES");
        lblTitulo.setBounds(302, 31, 225, 33);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 27));
        contentPane.add(lblTitulo);

        // Label CNPJ
        lblCnpj = new JLabel("CNPJ:");
        lblCnpj.setForeground(new Color(255, 255, 255));
        lblCnpj.setBounds(128, 150, 56, 16);
        contentPane.add(lblCnpj);

        // Campo CNPJ
        textCnpj = new JTextField();
        textCnpj.setColumns(10);
        textCnpj.setBounds(170, 147, 252, 22);
        contentPane.add(textCnpj);

        // Botão Pesquisar
        btnPesquisar = new JButton("Pesquisar");
        btnPesquisar.setBounds(170, 179, 97, 25);
        contentPane.add(btnPesquisar);

        // Tabela com JScrollPane
        table = new JTable();
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(128, 217, 615, 187);
        contentPane.add(scrollPane);

        // Botão Excluir
        btnExcluir = new JButton("EXCLUIR");
        btnExcluir.setForeground(new Color(248, 248, 255));
        btnExcluir.setBackground(new Color(220, 20, 60));
        btnExcluir.setBounds(186, 438, 135, 32);
        contentPane.add(btnExcluir);

        // Botão Editar
        btnEditar = new JButton("EDITAR");
        btnEditar.setForeground(new Color(248, 248, 255));
        btnEditar.setBackground(new Color(255, 153, 0));
        btnEditar.setBounds(360, 438, 135, 32);
        contentPane.add(btnEditar);

        // Botão Salvar
        btnSalvar = new JButton("SALVAR");
        btnSalvar.setForeground(new Color(248, 248, 255));
        btnSalvar.setBackground(new Color(102, 204, 102));
        btnSalvar.setBounds(534, 438, 135, 32);
        contentPane.add(btnSalvar);
    }
}