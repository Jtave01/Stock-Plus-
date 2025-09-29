package graphicalInterface;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class winLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winLogin frame = new winLogin();
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
	public winLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 516);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(102, 204, 102));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(265, 352, 104, 20);
		contentPane.add(btnLogin);
		
		JTextArea textLogin = new JTextArea();
		textLogin.setTabSize(0);
		textLogin.setBounds(185, 264, 248, 20);
		contentPane.add(textLogin);
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(185, 240, 44, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(185, 296, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(185, 316, 248, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/imgs/logo_pri.png"))));
		lblNewLabel_2.setBounds(106, 53, 407, 209);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 204));
		panel.setBounds(130, 98, 372, 309);
		contentPane.add(panel);

	}
}
