package telas;

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
import javax.swing.UIManager;

import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JRadioButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JSeparator;

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
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//usado para chamar o tema que eu quero neste caso o nimbus
					UIManager.LookAndFeelInfo[] looks =   
			        		UIManager.getInstalledLookAndFeels();
					UIManager.setLookAndFeel(looks[1].getClassName());
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
		menuBar.setToolTipText("");
		menuBar.setFont(new Font("SansSerif", Font.PLAIN, 16));
		setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		mnInicio.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnInicio);
		
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		mntmPrincipal.setFont(new Font("Arial", Font.PLAIN, 14));
		mnInicio.add(mntmPrincipal);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setFont(new Font("Arial", Font.PLAIN, 14));
		mnInicio.add(mntmSair);
		
		JMenu mnUsurios = new JMenu("Usu\u00E1rios");
		mnUsurios.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnUsurios);
		
		JMenu mnProfessor = new JMenu("Professor");
		mnProfessor.setFont(new Font("Arial", Font.PLAIN, 14));
		mnUsurios.add(mnProfessor);
		
		JMenuItem mntmExibir = new JMenuItem("Pesquisar");
		mntmExibir.setFont(new Font("Arial", Font.PLAIN, 14));
		mnProfessor.add(mntmExibir);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.setFont(new Font("Arial", Font.PLAIN, 14));
		mnProfessor.add(mntmCadastrar);
		
		JMenu mnAluno = new JMenu("Aluno");
		mnAluno.setFont(new Font("Arial", Font.PLAIN, 14));
		mnUsurios.add(mnAluno);
		
		JMenuItem mntmCadastrar_1 = new JMenuItem("Cadastrar");
		mntmCadastrar_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnAluno.add(mntmCadastrar_1);
		
		JMenuItem mntmPesquisar = new JMenuItem("Pesquisar");
		mntmPesquisar.setFont(new Font("Arial", Font.PLAIN, 14));
		mnAluno.add(mntmPesquisar);
		
		JMenu mnApoio = new JMenu("Apoio");
		mnApoio.setFont(new Font("Arial", Font.PLAIN, 14));
		mnUsurios.add(mnApoio);
		
		JMenuItem mntmCadastrar_2 = new JMenuItem("Cadastrar");
		mntmCadastrar_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnApoio.add(mntmCadastrar_2);
		
		JMenuItem mntmPesquisar_1 = new JMenuItem("Pesquisar");
		mntmPesquisar_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnApoio.add(mntmPesquisar_1);
		
		JMenu mnAdministrador = new JMenu("Administrador");
		mnAdministrador.setFont(new Font("Arial", Font.PLAIN, 14));
		mnUsurios.add(mnAdministrador);
		
		JMenuItem mntmCadastrar_3 = new JMenuItem("Cadastrar");
		mntmCadastrar_3.setFont(new Font("Arial", Font.PLAIN, 14));
		mnAdministrador.add(mntmCadastrar_3);
		
		JMenuItem mntmPesquisar_2 = new JMenuItem("Pesquisar");
		mntmPesquisar_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnAdministrador.add(mntmPesquisar_2);
		
		JMenu mnTurmas = new JMenu("Turmas");
		mnTurmas.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnTurmas);
		
		JMenuItem mntmCadastrar_4 = new JMenuItem("Cadastrar");
		mntmCadastrar_4.setFont(new Font("Arial", Font.PLAIN, 14));
		mnTurmas.add(mntmCadastrar_4);
		
		JMenuItem mntmPesquisar_3 = new JMenuItem("Pesquisar");
		mntmPesquisar_3.setFont(new Font("Arial", Font.PLAIN, 14));
		mnTurmas.add(mntmPesquisar_3);
		
		JMenuItem mntmAlocaoDeAlunos = new JMenuItem("Aloca\u00E7\u00E3o de alunos");
		mntmAlocaoDeAlunos.setFont(new Font("Arial", Font.PLAIN, 14));
		mnTurmas.add(mntmAlocaoDeAlunos);
		
		JMenu mnDisciplinas = new JMenu("Disciplinas");
		mnDisciplinas.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnDisciplinas);
		
		JMenuItem mntmCadastrar_5 = new JMenuItem("Cadastrar");
		mntmCadastrar_5.setFont(new Font("Arial", Font.PLAIN, 14));
		mnDisciplinas.add(mntmCadastrar_5);
		
		JMenuItem mntmPesquisar_4 = new JMenuItem("Pesquisar");
		mntmPesquisar_4.setFont(new Font("Arial", Font.PLAIN, 14));
		mnDisciplinas.add(mntmPesquisar_4);
		
		JMenu mnFrequencias = new JMenu("Frequ\u00EAncias");
		mnFrequencias.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnFrequencias);
		
		JMenuItem mntmCadastrar_6 = new JMenuItem("Cadastrar");
		mntmCadastrar_6.setFont(new Font("Arial", Font.PLAIN, 14));
		mnFrequencias.add(mntmCadastrar_6);
		
		JMenuItem mntmPesquisar_5 = new JMenuItem("Pesquisar");
		mntmPesquisar_5.setFont(new Font("Arial", Font.PLAIN, 14));
		mnFrequencias.add(mntmPesquisar_5);
		
		JMenu mnRelatrios = new JMenu("Relat\u00F3rios");
		mnRelatrios.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnRelatrios);
		
		JMenu mnAlunos = new JMenu("Alunos");
		mnAlunos.setFont(new Font("Arial", Font.PLAIN, 14));
		mnRelatrios.add(mnAlunos);
		
		JMenuItem mntmInscritos = new JMenuItem("Inscritos");
		mntmInscritos.setFont(new Font("Arial", Font.PLAIN, 14));
		mnAlunos.add(mntmInscritos);
		
		JMenuItem mntmNotas = new JMenuItem("Notas");
		mntmNotas.setFont(new Font("Arial", Font.PLAIN, 14));
		mnAlunos.add(mntmNotas);
		
		JMenuItem mntmFrequncias = new JMenuItem("Frequ\u00EAncias");
		mntmFrequncias.setFont(new Font("Arial", Font.PLAIN, 14));
		mnAlunos.add(mntmFrequncias);
		
		JMenu mnTurmas_1 = new JMenu("Turmas");
		mnTurmas_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnRelatrios.add(mnTurmas_1);
		
		JMenuItem mntmMdiaNotas = new JMenuItem("M\u00E9dia Notas");
		mntmMdiaNotas.setFont(new Font("Arial", Font.PLAIN, 14));
		mnTurmas_1.add(mntmMdiaNotas);
		
		JMenuItem mntmFrequncia = new JMenuItem("Frequ\u00EAncia");
		mntmFrequncia.setFont(new Font("Arial", Font.PLAIN, 14));
		mnTurmas_1.add(mntmFrequncia);
		
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
		lblCep.setBounds(213, 141, 40, 14);
		panel.add(lblCep);
		
		JLabel lblCidade = new JLabel("Cidade: ");
		lblCidade.setBounds(10, 141, 53, 14);
		panel.add(lblCidade);
		
		JLabel lblBairro = new JLabel("Bairro: ");
		lblBairro.setBounds(10, 115, 40, 14);
		panel.add(lblBairro);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setBounds(447, 115, 53, 14);
		panel.add(lblNumero);
		
		JLabel lblLogradouro = new JLabel("Rua: ");
		lblLogradouro.setBounds(10, 88, 40, 14);
		panel.add(lblLogradouro);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(213, 59, 40, 14);
		panel.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 63, 62, 14);
		panel.add(lblTelefone);
		
		JLabel lblDataNasc = new JLabel("Data Nasc.");
		lblDataNasc.setBounds(447, 38, 62, 14);
		panel.add(lblDataNasc);
		
		JLabel lblOrgoEmissor = new JLabel("Org\u00E3o Emissor");
		lblOrgoEmissor.setBounds(315, 38, 76, 14);
		panel.add(lblOrgoEmissor);
		
		JLabel lblRg = new JLabel("R.G.: ");
		lblRg.setBounds(166, 38, 38, 14);
		panel.add(lblRg);
		
		JLabel lblCpf = new JLabel("cpf: ");
		lblCpf.setBounds(10, 38, 40, 14);
		panel.add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 13, 40, 14);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(78, 6, 516, 28);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(78, 31, 76, 28);
		panel.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtRg = new JTextField();
		txtRg.setBounds(203, 31, 100, 28);
		panel.add(txtRg);
		txtRg.setColumns(10);
		
		txtOrgaoEmaissor = new JTextField();
		txtOrgaoEmaissor.setBounds(392, 31, 44, 28);
		panel.add(txtOrgaoEmaissor);
		txtOrgaoEmaissor.setColumns(10);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(509, 31, 85, 28);
		panel.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(78, 56, 126, 28);
		panel.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(254, 56, 340, 28);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtRua = new JTextField();
		txtRua.setBounds(78, 81, 516, 28);
		panel.add(txtRua);
		txtRua.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(509, 106, 85, 28);
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(78, 106, 358, 28);
		panel.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(78, 134, 125, 28);
		panel.add(txtCidade);
		txtCidade.setColumns(10);
		
		txtCep1 = new JTextField();
		txtCep1.setBounds(254, 134, 100, 28);
		panel.add(txtCep1);
		txtCep1.setColumns(10);
		
		txtCep2 = new JTextField();
		txtCep2.setBounds(372, 134, 64, 28);
		panel.add(txtCep2);
		txtCep2.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado: ");
		lblEstado.setBounds(447, 141, 46, 14);
		panel.add(lblEstado);
		
		JComboBox cboxEstado = new JComboBox();
		cboxEstado.setBounds(509, 134, 85, 28);
		panel.add(cboxEstado);
		
		JLabel label = new JLabel("-");
		label.setBounds(352, 141, 22, 14);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNomeMe = new JLabel("Nome M\u00E3e: ");
		lblNomeMe.setBounds(10, 166, 69, 14);
		panel.add(lblNomeMe);
		
		JLabel lblNomePai = new JLabel("Nome Pai: ");
		lblNomePai.setBounds(10, 191, 69, 14);
		panel.add(lblNomePai);
		
		txtNomeMae = new JTextField();
		txtNomeMae.setBounds(78, 159, 516, 28);
		panel.add(txtNomeMae);
		txtNomeMae.setColumns(10);
		
		txtNomePai = new JTextField();
		txtNomePai.setBounds(78, 184, 516, 28);
		panel.add(txtNomePai);
		txtNomePai.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(10, 243, 604, 127);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTurno = new JLabel("Turno: ");
		lblTurno.setBounds(10, 11, 46, 14);
		panel_1.add(lblTurno);
		
		JComboBox cboxTurno = new JComboBox();
		cboxTurno.setBounds(78, 4, 100, 28);
		panel_1.add(cboxTurno);
		
		JLabel lblOpoLingua = new JLabel("Op\u00E7\u00E3o Lingua: ");
		lblOpoLingua.setBounds(204, 15, 90, 14);
		panel_1.add(lblOpoLingua);
		
		JComboBox cboxOpcaoLingua = new JComboBox();
		cboxOpcaoLingua.setBounds(289, 4, 100, 28);
		panel_1.add(cboxOpcaoLingua);
		
		JLabel lblSituaoEscolar = new JLabel("Situa\u00E7\u00E3o Escolar:");
		lblSituaoEscolar.setBounds(10, 52, 100, 14);
		panel_1.add(lblSituaoEscolar);
		
		JRadioButton rbtnConcluindo2Ano = new JRadioButton("Concluindo 2\u00BA ano");
		rbtnConcluindo2Ano.setBackground(SystemColor.activeCaption);
		rbtnConcluindo2Ano.setBounds(113, 48, 136, 23);
		panel_1.add(rbtnConcluindo2Ano);
		
		JRadioButton rbtnConcluindo3Ano = new JRadioButton("Concluindo 3\u00BA ano");
		rbtnConcluindo3Ano.setBackground(SystemColor.activeCaption);
		rbtnConcluindo3Ano.setBounds(113, 73, 136, 23);
		panel_1.add(rbtnConcluindo3Ano);
		
		JRadioButton rbtnEnsinoMedioCompleto = new JRadioButton("Ensino m\u00E9dio completo");
		rbtnEnsinoMedioCompleto.setBackground(SystemColor.activeCaption);
		rbtnEnsinoMedioCompleto.setBounds(113, 98, 165, 23);
		panel_1.add(rbtnEnsinoMedioCompleto);
		
		JLabel lblNotaPortugs = new JLabel("Nota Portugu\u00EAs: ");
		lblNotaPortugs.setBounds(412, 18, 100, 14);
		panel_1.add(lblNotaPortugs);
		
		txtNotaPortugues = new JTextField();
		txtNotaPortugues.setBounds(512, 8, 82, 28);
		panel_1.add(txtNotaPortugues);
		txtNotaPortugues.setColumns(10);
		
		JLabel lblNotaMatemtica = new JLabel("Nota Matem\u00E1tica: ");
		lblNotaMatemtica.setBounds(412, 40, 100, 14);
		panel_1.add(lblNotaMatemtica);
		
		txtNotaMatematica = new JTextField();
		txtNotaMatematica.setBounds(512, 33, 82, 28);
		panel_1.add(txtNotaMatematica);
		txtNotaMatematica.setColumns(10);
	}
}
