package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class CadastroProfessor extends JFrame {
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
	private JTextField txtMatricula;

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
	public CadastroProfessor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 597);
		
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
		lblCep.setBounds(209, 222, 40, 14);
		panel.add(lblCep);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setBounds(443, 189, 53, 14);
		panel.add(lblNumero);
		
		JLabel lblLogradouro = new JLabel("Rua: ");
		lblLogradouro.setBounds(6, 156, 40, 14);
		panel.add(lblLogradouro);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(6, 126, 40, 14);
		panel.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Cel.: ");
		lblTelefone.setBounds(209, 93, 62, 14);
		panel.add(lblTelefone);
		
		JLabel lblDataNasc = new JLabel("Data Nasc.");
		lblDataNasc.setBounds(401, 63, 62, 14);
		panel.add(lblDataNasc);
		
		JLabel lblRg = new JLabel("R.G.: ");
		lblRg.setBounds(209, 63, 38, 14);
		panel.add(lblRg);
		
		JLabel lblCpf = new JLabel("cpf: ");
		lblCpf.setBounds(6, 63, 40, 14);
		panel.add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(6, 30, 40, 14);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(74, 23, 523, 28);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(74, 56, 125, 28);
		panel.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtRg = new JTextField();
		txtRg.setBounds(250, 56, 125, 28);
		panel.add(txtRg);
		txtRg.setColumns(10);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(475, 56, 122, 28);
		panel.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(250, 86, 126, 28);
		panel.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(74, 119, 523, 28);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtRua = new JTextField();
		txtRua.setBounds(74, 149, 523, 28);
		panel.add(txtRua);
		txtRua.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(505, 182, 92, 28);
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(74, 182, 358, 28);
		panel.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(74, 215, 125, 28);
		panel.add(txtCidade);
		txtCidade.setColumns(10);
		
		txtCep1 = new JTextField();
		txtCep1.setBounds(250, 215, 100, 28);
		panel.add(txtCep1);
		txtCep1.setColumns(10);
		
		txtCep2 = new JTextField();
		txtCep2.setBounds(368, 215, 64, 28);
		panel.add(txtCep2);
		txtCep2.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado: ");
		lblEstado.setBounds(450, 222, 46, 14);
		panel.add(lblEstado);
		
		JComboBox cboxEstado = new JComboBox();
		cboxEstado.setBounds(505, 215, 92, 28);
		panel.add(cboxEstado);
		
		JLabel label = new JLabel("-");
		label.setBounds(348, 222, 22, 14);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(6, 188, 55, 16);
		panel.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(6, 221, 55, 16);
		panel.add(lblCidade);
		
		JLabel lblMatricula = new JLabel("Matricula: ");
		lblMatricula.setBounds(6, 92, 55, 16);
		panel.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(74, 86, 125, 28);
		panel.add(txtMatricula);
		txtMatricula.setColumns(10);
		
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
		panel_3.setBounds(9, 480, 799, 47);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(242, 6, 136, 35);
		panel_3.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(390, 6, 136, 35);
		panel_3.add(btnCancelar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(10, 282, 798, 187);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDisponibilidadesDeHorarios = new JLabel("Disponibilidades de Horarios: ");
		lblDisponibilidadesDeHorarios.setBounds(10, 11, 168, 14);
		panel_1.add(lblDisponibilidadesDeHorarios);
		
		JLabel lblSegunda = new JLabel("Segunda");
		lblSegunda.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegunda.setBounds(109, 31, 87, 14);
		panel_1.add(lblSegunda);
		
		JLabel lblManh = new JLabel("Manh\u00E3");
		lblManh.setBounds(17, 66, 46, 14);
		panel_1.add(lblManh);
		
		JLabel lblTarde = new JLabel("Tarde");
		lblTarde.setBounds(17, 106, 46, 14);
		panel_1.add(lblTarde);
		
		JLabel lblNoite = new JLabel("Noite");
		lblNoite.setBounds(17, 146, 46, 14);
		panel_1.add(lblNoite);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 92, 782, 2);
		panel_1.add(separator);
		
		JCheckBox cbox2m12 = new JCheckBox("1/2");
		cbox2m12.setBackground(SystemColor.activeCaption);
		cbox2m12.setBounds(109, 61, 47, 23);
		panel_1.add(cbox2m12);
		
		JCheckBox cbox2m34 = new JCheckBox("3/4");
		cbox2m34.setBackground(SystemColor.activeCaption);
		cbox2m34.setBounds(157, 61, 39, 23);
		panel_1.add(cbox2m34);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 132, 782, 2);
		panel_1.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 173, 782, 2);
		panel_1.add(separator_2);
		
		JCheckBox cbox2t12 = new JCheckBox("1/2");
		cbox2t12.setBackground(SystemColor.activeCaption);
		cbox2t12.setBounds(110, 101, 46, 23);
		panel_1.add(cbox2t12);
		
		JCheckBox cbox2n12 = new JCheckBox("1/2");
		cbox2n12.setBackground(SystemColor.activeCaption);
		cbox2n12.setBounds(109, 142, 46, 23);
		panel_1.add(cbox2n12);
		
		JCheckBox cbox2t34 = new JCheckBox("3/4");
		cbox2t34.setBackground(SystemColor.activeCaption);
		cbox2t34.setBounds(157, 101, 39, 23);
		panel_1.add(cbox2t34);
		
		JCheckBox cbox2n34 = new JCheckBox("3/4");
		cbox2n34.setBackground(SystemColor.activeCaption);
		cbox2n34.setBounds(157, 142, 39, 23);
		panel_1.add(cbox2n34);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 52, 782, 2);
		panel_1.add(separator_4);
		
		JLabel lblTera = new JLabel("Ter\u00E7a");
		lblTera.setHorizontalAlignment(SwingConstants.CENTER);
		lblTera.setBounds(250, 31, 101, 14);
		panel_1.add(lblTera);
		
		JCheckBox cbox3m12 = new JCheckBox("1/2");
		cbox3m12.setBackground(SystemColor.activeCaption);
		cbox3m12.setBounds(254, 61, 46, 23);
		panel_1.add(cbox3m12);
		
		JCheckBox cbox3m34 = new JCheckBox("3/4");
		cbox3m34.setBackground(SystemColor.activeCaption);
		cbox3m34.setBounds(302, 61, 39, 23);
		panel_1.add(cbox3m34);
		
		JCheckBox cbox3t34 = new JCheckBox("3/4");
		cbox3t34.setBackground(SystemColor.activeCaption);
		cbox3t34.setBounds(302, 101, 39, 23);
		panel_1.add(cbox3t34);
		
		JCheckBox cbox3t12 = new JCheckBox("1/2");
		cbox3t12.setBackground(SystemColor.activeCaption);
		cbox3t12.setBounds(255, 101, 46, 23);
		panel_1.add(cbox3t12);
		
		JCheckBox cbox3n12 = new JCheckBox("1/2");
		cbox3n12.setBackground(SystemColor.activeCaption);
		cbox3n12.setBounds(254, 143, 46, 23);
		panel_1.add(cbox3n12);
		
		JCheckBox cbox3n34 = new JCheckBox("3/4");
		cbox3n34.setBackground(SystemColor.activeCaption);
		cbox3n34.setBounds(302, 143, 39, 23);
		panel_1.add(cbox3n34);
		
		JCheckBox cbox4m12 = new JCheckBox("1/2");
		cbox4m12.setBackground(SystemColor.activeCaption);
		cbox4m12.setBounds(400, 61, 46, 23);
		panel_1.add(cbox4m12);
		
		JCheckBox cbox4m34 = new JCheckBox("3/4");
		cbox4m34.setBackground(SystemColor.activeCaption);
		cbox4m34.setBounds(448, 61, 39, 23);
		panel_1.add(cbox4m34);
		
		JCheckBox cbox4t12 = new JCheckBox("1/2");
		cbox4t12.setBackground(SystemColor.activeCaption);
		cbox4t12.setBounds(401, 101, 46, 23);
		panel_1.add(cbox4t12);
		
		JCheckBox cbox4t34 = new JCheckBox("3/4");
		cbox4t34.setBackground(SystemColor.activeCaption);
		cbox4t34.setBounds(448, 101, 39, 23);
		panel_1.add(cbox4t34);
		
		JCheckBox cbox4n12 = new JCheckBox("1/2");
		cbox4n12.setBackground(SystemColor.activeCaption);
		cbox4n12.setBounds(400, 143, 46, 23);
		panel_1.add(cbox4n12);
		
		JCheckBox cbox4n34 = new JCheckBox("3/4");
		cbox4n34.setBackground(SystemColor.activeCaption);
		cbox4n34.setBounds(448, 143, 39, 23);
		panel_1.add(cbox4n34);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(661, 31, 2, 144);
		panel_1.add(separator_7);
		
		JCheckBox cbox6m12 = new JCheckBox("1/2");
		cbox6m12.setBackground(SystemColor.activeCaption);
		cbox6m12.setBounds(691, 61, 46, 23);
		panel_1.add(cbox6m12);
		
		JCheckBox cbox6m34 = new JCheckBox("3/4");
		cbox6m34.setBackground(SystemColor.activeCaption);
		cbox6m34.setBounds(739, 61, 39, 23);
		panel_1.add(cbox6m34);
		
		JCheckBox cbox6t12 = new JCheckBox("1/2");
		cbox6t12.setBackground(SystemColor.activeCaption);
		cbox6t12.setBounds(692, 101, 46, 23);
		panel_1.add(cbox6t12);
		
		JCheckBox cbox6t34 = new JCheckBox("3/4");
		cbox6t34.setBackground(SystemColor.activeCaption);
		cbox6t34.setBounds(739, 101, 39, 23);
		panel_1.add(cbox6t34);
		
		JCheckBox cbox6n34 = new JCheckBox("3/4");
		cbox6n34.setBackground(SystemColor.activeCaption);
		cbox6n34.setBounds(739, 143, 39, 23);
		panel_1.add(cbox6n34);
		
		JCheckBox cbox6n12 = new JCheckBox("1/2");
		cbox6n12.setBackground(SystemColor.activeCaption);
		cbox6n12.setBounds(691, 143, 46, 23);
		panel_1.add(cbox6n12);
		
		JCheckBox cbox5m34 = new JCheckBox("3/4");
		cbox5m34.setBackground(SystemColor.activeCaption);
		cbox5m34.setBounds(589, 61, 46, 23);
		panel_1.add(cbox5m34);
		
		JCheckBox cbox5m12 = new JCheckBox("1/2");
		cbox5m12.setBackground(SystemColor.activeCaption);
		cbox5m12.setBounds(541, 61, 46, 23);
		panel_1.add(cbox5m12);
		
		JCheckBox cbox5t12 = new JCheckBox("1/2");
		cbox5t12.setBackground(SystemColor.activeCaption);
		cbox5t12.setBounds(542, 101, 46, 23);
		panel_1.add(cbox5t12);
		
		JCheckBox cbox5t34 = new JCheckBox("3/4");
		cbox5t34.setBackground(SystemColor.activeCaption);
		cbox5t34.setBounds(589, 101, 46, 23);
		panel_1.add(cbox5t34);
		
		JCheckBox cbox5n34 = new JCheckBox("3/4");
		cbox5n34.setBackground(SystemColor.activeCaption);
		cbox5n34.setBounds(589, 143, 46, 23);
		panel_1.add(cbox5n34);
		
		JCheckBox cbox5n12 = new JCheckBox("1/2");
		cbox5n12.setBackground(SystemColor.activeCaption);
		cbox5n12.setBounds(541, 143, 46, 23);
		panel_1.add(cbox5n12);
		
		JLabel lblQuarta = new JLabel("Quarta");
		lblQuarta.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuarta.setBounds(400, 31, 87, 14);
		panel_1.add(lblQuarta);
		
		JLabel lblQuinta = new JLabel("Quinta");
		lblQuinta.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuinta.setBounds(541, 31, 90, 14);
		panel_1.add(lblQuinta);
		
		JLabel lblSexta = new JLabel("Sexta");
		lblSexta.setHorizontalAlignment(SwingConstants.CENTER);
		lblSexta.setBounds(691, 31, 87, 14);
		panel_1.add(lblSexta);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(512, 31, 2, 144);
		panel_1.add(separator_3);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(372, 31, 2, 144);
		panel_1.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(224, 31, 2, 144);
		panel_1.add(separator_6);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(82, 37, 2, 144);
		panel_1.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(790, 31, 2, 144);
		panel_1.add(separator_9);
	}
}
