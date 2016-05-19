package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmContato = new JMenuItem("Contato");
		mnAjuda.add(mntmContato);
		
		JMenu mnOpes = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(mnOpes);
		
		JMenuItem mntmConfiguraes = new JMenuItem("Configura\u00E7\u00F5es");
		mnOpes.add(mntmConfiguraes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProceem = new JLabel("PROCEEM");
		lblProceem.setHorizontalAlignment(SwingConstants.CENTER);
		lblProceem.setBounds(10, 41, 414, 14);
		contentPane.add(lblProceem);
		
		JLabel lblLogin = new JLabel("Login: ");
		lblLogin.setBounds(88, 75, 46, 14);
		contentPane.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(136, 72, 176, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setBounds(88, 110, 46, 14);
		contentPane.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 107, 176, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(180, 138, 89, 23);
		contentPane.add(btnEntrar);
		
		JLabel lblEsqueceuASenha = new JLabel("Esqueceu a senha?");
		lblEsqueceuASenha.setForeground(SystemColor.activeCaption);
		lblEsqueceuASenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblEsqueceuASenha.setBounds(136, 169, 176, 14);
		contentPane.add(lblEsqueceuASenha);
	}
}
