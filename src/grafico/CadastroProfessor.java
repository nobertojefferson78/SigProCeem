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
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class CadastroProfessor extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProfessor frame = new CadastroProfessor();
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
		panel.setBounds(10, 25, 604, 167);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(10, 196, 604, 139);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDisponibilidadesDeHorarios = new JLabel("Disponibilidades de Horarios: ");
		lblDisponibilidadesDeHorarios.setBounds(10, 11, 148, 14);
		panel_1.add(lblDisponibilidadesDeHorarios);
		
		JLabel lblSegunda = new JLabel("Segunda");
		lblSegunda.setBounds(84, 31, 46, 14);
		panel_1.add(lblSegunda);
		
		JLabel lblManh = new JLabel("Manh\u00E3");
		lblManh.setBounds(10, 57, 46, 14);
		panel_1.add(lblManh);
		
		JLabel lblTarde = new JLabel("Tarde");
		lblTarde.setBounds(10, 82, 46, 14);
		panel_1.add(lblTarde);
		
		JLabel lblNoite = new JLabel("Noite");
		lblNoite.setBounds(10, 107, 46, 14);
		panel_1.add(lblNoite);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 75, 560, 2);
		panel_1.add(separator);
		
		JCheckBox cbox2m12 = new JCheckBox("12");
		cbox2m12.setBackground(SystemColor.activeCaption);
		cbox2m12.setBounds(61, 52, 46, 23);
		panel_1.add(cbox2m12);
		
		JCheckBox cbox2m34 = new JCheckBox("34");
		cbox2m34.setBackground(SystemColor.activeCaption);
		cbox2m34.setBounds(109, 52, 46, 23);
		panel_1.add(cbox2m34);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 100, 560, 2);
		panel_1.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 123, 560, 2);
		panel_1.add(separator_2);
		
		JCheckBox checkBox = new JCheckBox("12");
		checkBox.setBackground(SystemColor.activeCaption);
		checkBox.setBounds(62, 77, 46, 23);
		panel_1.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("12");
		checkBox_1.setBackground(SystemColor.activeCaption);
		checkBox_1.setBounds(61, 103, 46, 23);
		panel_1.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("34");
		checkBox_2.setBackground(SystemColor.activeCaption);
		checkBox_2.setBounds(109, 77, 46, 23);
		panel_1.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("34");
		checkBox_3.setBackground(SystemColor.activeCaption);
		checkBox_3.setBounds(109, 103, 46, 23);
		panel_1.add(checkBox_3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(54, 31, 416, 94);
		panel_1.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 48, 560, 2);
		panel_1.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(156, 31, 314, 94);
		panel_1.add(separator_5);
		
		JLabel lblTera = new JLabel("Ter\u00E7a");
		lblTera.setBounds(192, 31, 46, 14);
		panel_1.add(lblTera);
		
		JCheckBox checkBox_4 = new JCheckBox("12");
		checkBox_4.setBackground(SystemColor.activeCaption);
		checkBox_4.setBounds(164, 51, 46, 23);
		panel_1.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("34");
		checkBox_5.setBackground(SystemColor.activeCaption);
		checkBox_5.setBounds(212, 51, 46, 23);
		panel_1.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("34");
		checkBox_6.setBackground(SystemColor.activeCaption);
		checkBox_6.setBounds(212, 76, 46, 23);
		panel_1.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("12");
		checkBox_7.setBackground(SystemColor.activeCaption);
		checkBox_7.setBounds(165, 76, 46, 23);
		panel_1.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("12");
		checkBox_8.setBackground(SystemColor.activeCaption);
		checkBox_8.setBounds(164, 102, 46, 23);
		panel_1.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("34");
		checkBox_9.setBackground(SystemColor.activeCaption);
		checkBox_9.setBounds(212, 102, 46, 23);
		panel_1.add(checkBox_9);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(260, 31, 210, 94);
		panel_1.add(separator_6);
		
		JCheckBox checkBox_10 = new JCheckBox("12");
		checkBox_10.setBackground(SystemColor.activeCaption);
		checkBox_10.setBounds(268, 51, 46, 23);
		panel_1.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("34");
		checkBox_11.setBackground(SystemColor.activeCaption);
		checkBox_11.setBounds(316, 51, 46, 23);
		panel_1.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("12");
		checkBox_12.setBackground(SystemColor.activeCaption);
		checkBox_12.setBounds(269, 76, 46, 23);
		panel_1.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("34");
		checkBox_13.setBackground(SystemColor.activeCaption);
		checkBox_13.setBounds(316, 76, 46, 23);
		panel_1.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("12");
		checkBox_14.setBackground(SystemColor.activeCaption);
		checkBox_14.setBounds(268, 102, 46, 23);
		panel_1.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("34");
		checkBox_15.setBackground(SystemColor.activeCaption);
		checkBox_15.setBounds(316, 102, 46, 23);
		panel_1.add(checkBox_15);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(468, 31, 2, 94);
		panel_1.add(separator_7);
		
		JCheckBox checkBox_16 = new JCheckBox("12");
		checkBox_16.setBackground(SystemColor.activeCaption);
		checkBox_16.setBounds(476, 51, 46, 23);
		panel_1.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("34");
		checkBox_17.setBackground(SystemColor.activeCaption);
		checkBox_17.setBounds(524, 51, 46, 23);
		panel_1.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("12");
		checkBox_18.setBackground(SystemColor.activeCaption);
		checkBox_18.setBounds(477, 76, 46, 23);
		panel_1.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("34");
		checkBox_19.setBackground(SystemColor.activeCaption);
		checkBox_19.setBounds(524, 76, 46, 23);
		panel_1.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("34");
		checkBox_20.setBackground(SystemColor.activeCaption);
		checkBox_20.setBounds(524, 102, 46, 23);
		panel_1.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("12");
		checkBox_21.setBackground(SystemColor.activeCaption);
		checkBox_21.setBounds(476, 102, 46, 23);
		panel_1.add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("34");
		checkBox_22.setBackground(SystemColor.activeCaption);
		checkBox_22.setBounds(420, 51, 46, 23);
		panel_1.add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("12");
		checkBox_23.setBackground(SystemColor.activeCaption);
		checkBox_23.setBounds(372, 51, 46, 23);
		panel_1.add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("12");
		checkBox_24.setBackground(SystemColor.activeCaption);
		checkBox_24.setBounds(373, 76, 46, 23);
		panel_1.add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("34");
		checkBox_25.setBackground(SystemColor.activeCaption);
		checkBox_25.setBounds(420, 76, 46, 23);
		panel_1.add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("34");
		checkBox_26.setBackground(SystemColor.activeCaption);
		checkBox_26.setBounds(420, 102, 46, 23);
		panel_1.add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("12");
		checkBox_27.setBackground(SystemColor.activeCaption);
		checkBox_27.setBounds(372, 102, 46, 23);
		panel_1.add(checkBox_27);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(364, 31, 106, 94);
		panel_1.add(separator_8);
		
		JLabel lblQuarta = new JLabel("Quarta");
		lblQuarta.setBounds(292, 31, 46, 14);
		panel_1.add(lblQuarta);
		
		JLabel lblQuinta = new JLabel("Quinta");
		lblQuinta.setBounds(393, 31, 46, 14);
		panel_1.add(lblQuinta);
		
		JLabel lblSexta = new JLabel("Sexta");
		lblSexta.setBounds(496, 31, 46, 14);
		panel_1.add(lblSexta);
	}
}
