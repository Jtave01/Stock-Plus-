package br.com.stockplus.graphicalInterface;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Objects;

public class WinLogin extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WinLogin frame = new WinLogin() ;
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public WinLogin() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1280, 720);
        setLocationRelativeTo(null);
        setTitle("Login - Sistema de Almoxarifado");

        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 102, 153));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JButton btnLogin = new JButton("LOGIN");
        btnLogin.setBackground(new Color(102, 204, 102));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnLogin.setBounds(565, 410, 150, 35);
        btnLogin.addActionListener(e -> {
            // ---> Verificar

          btnLogin.setEnabled(false);
          irParaHome();
        });
        contentPane.add(btnLogin);;

        JTextArea textLogin = new JTextArea();
        textLogin.setTabSize(0);
        textLogin.setBounds(516, 305, 248, 20);
        contentPane.add(textLogin);

        JLabel loginLabel = new JLabel("Login:");
        loginLabel.setForeground(new Color(255, 255, 255));
        loginLabel.setBounds(470, 300, 60, 20);
		contentPane.add(loginLabel);

		JLabel passwordLabel = new JLabel("Senha:");
		passwordLabel.setForeground(new Color(255, 255, 255));
        passwordLabel.setBounds(470, 370, 60, 20);
		contentPane.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(516, 365, 248, 20);
        contentPane.add(passwordField);

		JLabel imgLabel = new JLabel("New label");
		imgLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imgs/logo_pri.png"))));
        imgLabel.setBounds(437, 80, 407, 250);
		contentPane.add(imgLabel);

		JPanel panel = new JPanel();
        panel.setBackground(new Color(102, 153, 204));
        panel.setBounds(390, 150, 500, 420);
		contentPane.add(panel);

	}
    private void irParaHome() {
        this.getContentPane().setEnabled(false);

        Timer timer = new Timer(150, e -> {
            setVisible(false);

            WinPrincipal principal = new WinPrincipal();
            principal.setLocationRelativeTo(null);
            principal.setVisible(true);

            dispose();
        });
        timer.setRepeats(false);
        timer.start();
    }

}
