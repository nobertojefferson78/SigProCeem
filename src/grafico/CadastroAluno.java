package grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JRadioButton;

public class CadastroAluno extends JFrame {

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
	private JTextField txtNomeMae;
	private JTextField txtNomePai;
	private JTextField txtNotaPortugues;
	private JTextField txtNotaMatematica;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAluno frame = new CadastroAluno();
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
	public CadastroAluno() {
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
		panel.setBounds(10, 25, 604, 215);
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
		
		JLabel lblNomeMe = new JLabel("Nome M\u00E3e: ");
		lblNomeMe.setBounds(10, 162, 62, 14);
		panel.add(lblNomeMe);
		
		JLabel lblNomePai = new JLabel("Nome Pai: ");
		lblNomePai.setBounds(10, 187, 62, 14);
		panel.add(lblNomePai);
		
		txtNomeMae = new JTextField();
		txtNomeMae.setBounds(68, 159, 526, 20);
		panel.add(txtNomeMae);
		txtNomeMae.setColumns(10);
		
		txtNomePai = new JTextField();
		txtNomePai.setBounds(68, 184, 526, 20);
		panel.add(txtNomePai);
		txtNomePai.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(10, 243, 604, 114);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTurno = new JLabel("Turno: ");
		lblTurno.setBounds(10, 11, 46, 14);
		panel_1.add(lblTurno);
		
		JComboBox cboxTurno = new JComboBox();
		cboxTurno.setBounds(66, 8, 100, 20);
		panel_1.add(cboxTurno);
		
		JLabel lblOpoLingua = new JLabel("Op\u00E7\u00E3o Lingua: ");
		lblOpoLingua.setBounds(209, 11, 72, 14);
		panel_1.add(lblOpoLingua);
		
		JComboBox cboxOpcaoLingua = new JComboBox();
		cboxOpcaoLingua.setBounds(291, 8, 100, 20);
		panel_1.add(cboxOpcaoLingua);
		
		JLabel lblSituaoEscolar = new JLabel("Situa\u00E7\u00E3o Escolar:");
		lblSituaoEscolar.setBounds(10, 36, 82, 14);
		panel_1.add(lblSituaoEscolar);
		
		JRadioButton rbtnConcluindo2Ano = new JRadioButton("Concluindo 2\u00BA ano");
		rbtnConcluindo2Ano.setBackground(SystemColor.activeCaption);
		rbtnConcluindo2Ano.setBounds(103, 32, 136, 23);
		panel_1.add(rbtnConcluindo2Ano);
		
		JRadioButton rbtnConcluindo3Ano = new JRadioButton("Concluindo 3\u00BA ano");
		rbtnConcluindo3Ano.setBackground(SystemColor.activeCaption);
		rbtnConcluindo3Ano.setBounds(103, 58, 136, 23);
		panel_1.add(rbtnConcluindo3Ano);
		
		JRadioButton rbtnEnsinoMedioCompleto = new JRadioButton("Ensino m\u00E9dio completo");
		rbtnEnsinoMedioCompleto.setBackground(SystemColor.activeCaption);
		rbtnEnsinoMedioCompleto.setBounds(103, 84, 136, 23);
		panel_1.add(rbtnEnsinoMedioCompleto);
		
		JLabel lblNotaPortugs = new JLabel("Nota Portug\u00EAs: ");
		lblNotaPortugs.setBounds(412, 11, 90, 14);
		panel_1.add(lblNotaPortugs);
		
		txtNotaPortugues = new JTextField();
		txtNotaPortugues.setBounds(512, 8, 82, 20);
		panel_1.add(txtNotaPortugues);
		txtNotaPortugues.setColumns(10);
		
		JLabel lblNotaMatemtica = new JLabel("Nota Matem\u00E1tica: ");
		lblNotaMatemtica.setBounds(412, 36, 90, 14);
		panel_1.add(lblNotaMatemtica);
		
		txtNotaMatematica = new JTextField();
		txtNotaMatematica.setBounds(512, 33, 82, 20);
		panel_1.add(txtNotaMatematica);
		txtNotaMatematica.setColumns(10);
	}
}
