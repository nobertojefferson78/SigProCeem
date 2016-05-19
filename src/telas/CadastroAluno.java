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
import java.awt.Panel;
import java.awt.Label;
import java.awt.Button;
import java.awt.Canvas;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class CadastroAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtRg;
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
		setBounds(100, 100, 831, 494);
		
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
		panel.setBounds(204, 6, 604, 264);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCep = new JLabel("CEP: ");
		lblCep.setBounds(209, 172, 40, 14);
		panel.add(lblCep);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setBounds(443, 139, 53, 14);
		panel.add(lblNumero);
		
		JLabel lblLogradouro = new JLabel("Rua: ");
		lblLogradouro.setBounds(6, 106, 40, 14);
		panel.add(lblLogradouro);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(209, 76, 40, 14);
		panel.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(6, 76, 62, 14);
		panel.add(lblTelefone);
		
		JLabel lblDataNasc = new JLabel("Data Nasc.");
		lblDataNasc.setBounds(401, 46, 62, 14);
		panel.add(lblDataNasc);
		
		JLabel lblRg = new JLabel("R.G.: ");
		lblRg.setBounds(209, 46, 38, 14);
		panel.add(lblRg);
		
		JLabel lblCpf = new JLabel("cpf: ");
		lblCpf.setBounds(6, 46, 40, 14);
		panel.add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(6, 13, 40, 14);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(74, 6, 516, 28);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(74, 39, 125, 28);
		panel.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtRg = new JTextField();
		txtRg.setBounds(250, 39, 125, 28);
		panel.add(txtRg);
		txtRg.setColumns(10);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(475, 39, 115, 28);
		panel.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(74, 69, 126, 28);
		panel.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(250, 69, 340, 28);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtRua = new JTextField();
		txtRua.setBounds(74, 99, 516, 28);
		panel.add(txtRua);
		txtRua.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(505, 132, 85, 28);
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(74, 132, 358, 28);
		panel.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(74, 165, 125, 28);
		panel.add(txtCidade);
		txtCidade.setColumns(10);
		
		txtCep1 = new JTextField();
		txtCep1.setBounds(250, 165, 100, 28);
		panel.add(txtCep1);
		txtCep1.setColumns(10);
		
		txtCep2 = new JTextField();
		txtCep2.setBounds(368, 165, 64, 28);
		panel.add(txtCep2);
		txtCep2.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado: ");
		lblEstado.setBounds(450, 172, 46, 14);
		panel.add(lblEstado);
		
		JComboBox cboxEstado = new JComboBox();
		cboxEstado.setBounds(505, 165, 85, 28);
		panel.add(cboxEstado);
		
		JLabel label = new JLabel("-");
		label.setBounds(348, 172, 22, 14);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNomePai = new JLabel("Nome Pai: ");
		lblNomePai.setBounds(6, 239, 69, 14);
		panel.add(lblNomePai);
		
		txtNomeMae = new JTextField();
		txtNomeMae.setBounds(74, 199, 516, 28);
		panel.add(txtNomeMae);
		txtNomeMae.setColumns(10);
		
		txtNomePai = new JTextField();
		txtNomePai.setBounds(74, 232, 516, 28);
		panel.add(txtNomePai);
		txtNomePai.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(6, 138, 55, 16);
		panel.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(6, 171, 55, 16);
		panel.add(lblCidade);
		
		JLabel lblNomeMe = new JLabel("Nome M\u00E3e:");
		lblNomeMe.setBounds(6, 205, 69, 16);
		panel.add(lblNomeMe);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(10, 277, 798, 95);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTurno = new JLabel("Turno de Aulas: ");
		lblTurno.setBounds(532, 11, 91, 14);
		panel_1.add(lblTurno);
		
		JComboBox cboxTurno = new JComboBox();
		cboxTurno.setBounds(635, 4, 125, 28);
		panel_1.add(cboxTurno);
		
		JLabel lblOpoLingua = new JLabel("Op\u00E7\u00E3o Lingua: ");
		lblOpoLingua.setBounds(279, 11, 90, 14);
		panel_1.add(lblOpoLingua);
		
		JComboBox cboxOpcaoLingua = new JComboBox();
		cboxOpcaoLingua.setBounds(376, 4, 125, 28);
		panel_1.add(cboxOpcaoLingua);
		
		JLabel lblSituaoEscolar = new JLabel("Situa\u00E7\u00E3o Escolar:");
		lblSituaoEscolar.setBounds(6, 11, 100, 14);
		panel_1.add(lblSituaoEscolar);
		
		JRadioButton rbtnConcluindo2Ano = new JRadioButton("Concluindo 2\u00BA ano");
		rbtnConcluindo2Ano.setBackground(SystemColor.activeCaption);
		rbtnConcluindo2Ano.setBounds(105, 7, 136, 23);
		panel_1.add(rbtnConcluindo2Ano);
		
		JRadioButton rbtnConcluindo3Ano = new JRadioButton("Concluindo 3\u00BA ano");
		rbtnConcluindo3Ano.setBackground(SystemColor.activeCaption);
		rbtnConcluindo3Ano.setBounds(105, 33, 136, 23);
		panel_1.add(rbtnConcluindo3Ano);
		
		JRadioButton rbtnEnsinoMedioCompleto = new JRadioButton("Ensino m\u00E9dio completo");
		rbtnEnsinoMedioCompleto.setBackground(SystemColor.activeCaption);
		rbtnEnsinoMedioCompleto.setBounds(105, 59, 165, 23);
		panel_1.add(rbtnEnsinoMedioCompleto);
		
		JLabel lblNotaPortugs = new JLabel("Nota Portugu\u00EAs: ");
		lblNotaPortugs.setBounds(279, 63, 100, 14);
		panel_1.add(lblNotaPortugs);
		
		txtNotaPortugues = new JTextField();
		txtNotaPortugues.setBounds(376, 56, 125, 28);
		panel_1.add(txtNotaPortugues);
		txtNotaPortugues.setColumns(10);
		
		JLabel lblNotaMatemtica = new JLabel("Nota Matem\u00E1tica: ");
		lblNotaMatemtica.setBounds(532, 63, 100, 14);
		panel_1.add(lblNotaMatemtica);
		
		txtNotaMatematica = new JTextField();
		txtNotaMatematica.setBounds(635, 56, 125, 28);
		panel_1.add(txtNotaMatematica);
		txtNotaMatematica.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaption);
		panel_2.setBounds(10, 6, 182, 264);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Norberto\\git\\SigProCeem\\image\\fotoInicial2.png"));
		button.setEnabled(false);
		button.setBounds(6, 6, 170, 172);
		panel_2.add(button);
		
		JButton btnNovaImagem = new JButton("Nova Imagem");
		btnNovaImagem.setBounds(17, 190, 146, 28);
		panel_2.add(btnNovaImagem);
		
		JButton btnRemoverImagem = new JButton("Remover Imagem");
		btnRemoverImagem.setBounds(17, 218, 146, 28);
		panel_2.add(btnRemoverImagem);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(10, 377, 799, 47);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(242, 6, 136, 35);
		panel_3.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(390, 6, 136, 35);
		panel_3.add(btnCancelar);
	}
}
