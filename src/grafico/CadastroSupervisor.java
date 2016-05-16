package grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class CadastroSupervisor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtRg;
	private JTextField txtOrgaoEmaissor;
	private JTextField txtDataNascimento;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtRua;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtCep1;
	private JTextField txtCep2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroSupervisor frame = new CadastroSupervisor();
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
	public CadastroSupervisor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 25, 604, 194);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCep = new JLabel("CEP: ");
		lblCep.setBounds(213, 137, 26, 14);
		panel.add(lblCep);
		
		JLabel lblCidade = new JLabel("Cidade: ");
		lblCidade.setBounds(10, 137, 40, 14);
		panel.add(lblCidade);
		
		JLabel lblBairro = new JLabel("Bairro: ");
		lblBairro.setBounds(10, 109, 35, 14);
		panel.add(lblBairro);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setBounds(446, 109, 44, 14);
		panel.add(lblNumero);
		
		JLabel lblLogradouro = new JLabel("Rua: ");
		lblLogradouro.setBounds(10, 84, 40, 14);
		panel.add(lblLogradouro);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(213, 59, 31, 14);
		panel.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telef.: ");
		lblTelefone.setBounds(10, 59, 40, 14);
		panel.add(lblTelefone);
		
		JLabel lblDataNasc = new JLabel("Data Nasc.");
		lblDataNasc.setBounds(446, 34, 53, 14);
		panel.add(lblDataNasc);
		
		JLabel lblOrgoEmissor = new JLabel("Org\u00E3o Emissor");
		lblOrgoEmissor.setBounds(313, 34, 69, 14);
		panel.add(lblOrgoEmissor);
		
		JLabel lblRg = new JLabel("R.G.: ");
		lblRg.setBounds(164, 34, 29, 14);
		panel.add(lblRg);
		
		JLabel lblCpf = new JLabel("cpf: ");
		lblCpf.setBounds(10, 34, 22, 14);
		panel.add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 11, 34, 14);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(68, 8, 526, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(68, 31, 86, 20);
		panel.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtRg = new JTextField();
		txtRg.setBounds(203, 31, 100, 20);
		panel.add(txtRg);
		txtRg.setColumns(10);
		
		txtOrgaoEmaissor = new JTextField();
		txtOrgaoEmaissor.setBounds(392, 31, 44, 20);
		panel.add(txtOrgaoEmaissor);
		txtOrgaoEmaissor.setColumns(10);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(509, 31, 85, 20);
		panel.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(68, 56, 136, 20);
		panel.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(254, 56, 340, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtRua = new JTextField();
		txtRua.setBounds(68, 81, 526, 20);
		panel.add(txtRua);
		txtRua.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(509, 106, 85, 20);
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(68, 106, 368, 20);
		panel.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(68, 134, 135, 20);
		panel.add(txtCidade);
		txtCidade.setColumns(10);
		
		txtCep1 = new JTextField();
		txtCep1.setBounds(254, 134, 100, 20);
		panel.add(txtCep1);
		txtCep1.setColumns(10);
		
		txtCep2 = new JTextField();
		txtCep2.setBounds(372, 134, 64, 20);
		panel.add(txtCep2);
		txtCep2.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado: ");
		lblEstado.setBounds(446, 137, 46, 14);
		panel.add(lblEstado);
		
		JComboBox cboxEstado = new JComboBox();
		cboxEstado.setBounds(509, 134, 85, 20);
		panel.add(cboxEstado);
		
		JLabel label = new JLabel("-");
		label.setBounds(352, 137, 22, 14);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblMatricula = new JLabel("Matricula: ");
		lblMatricula.setBounds(10, 169, 53, 14);
		panel.add(lblMatricula);
		
		textField = new JTextField();
		textField.setBounds(68, 165, 136, 20);
		panel.add(textField);
		textField.setColumns(10);
	}

}
