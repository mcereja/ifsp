package ifsp.lista3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

import ifsp.lista3.controller.FuncionarioActionAddController;
import ifsp.lista3.controller.FuncionarioActionExibirController;
import ifsp.lista3.controller.FuncionarioActionSairController;

public class CadastroFuncionario extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCargo;
	private JFormattedTextField ftxSalario;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
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
	public CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro de Funcionários");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(12, 12, 590, 25);
		contentPane.add(lblTitulo);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 72, 70, 15);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(131, 70, 382, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(12, 117, 70, 15);
		contentPane.add(lblCargo);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(131, 115, 159, 19);
		contentPane.add(txtCargo);
		txtCargo.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salário");
		lblSalario.setBounds(13, 166, 70, 15);
		contentPane.add(lblSalario);
		
		ftxSalario = new JFormattedTextField();
		ftxSalario.setBounds(131, 164, 114, 19);
		contentPane.add(ftxSalario);
		ftxSalario.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(10, 270, 117, 25);
		contentPane.add(btnAdicionar);

		JButton btnExibir = new JButton("Exibir");
		var acaoExibir = new FuncionarioActionExibirController(txtNome, 
				txtCargo, ftxSalario);
		btnExibir.addActionListener(acaoExibir);
		btnExibir.setBounds(254, 270, 117, 25);
		contentPane.add(btnExibir);
		
		JButton btnSair = new JButton("Sair");
		FuncionarioActionSairController acaoSair = 
				new FuncionarioActionSairController();
		btnSair.addActionListener(acaoSair);
		btnSair.setBounds(471, 270, 117, 25);
		contentPane.add(btnSair);
		
		FuncionarioActionAddController acaoAdd = 
				new FuncionarioActionAddController(txtNome, txtCargo, ftxSalario);
		btnAdicionar.addActionListener(acaoAdd);

	}

	public NumberFormatter formatadorInt(int inicio, int fim) {
		NumberFormat numberFormat = NumberFormat.getInstance();
		NumberFormatter formatter = new NumberFormatter(numberFormat);
		formatter.setValueClass(Integer.class);
		formatter.setMinimum(inicio);
		formatter.setMaximum(fim);
		formatter.setAllowsInvalid(false);
		return formatter;
	}
	
	public NumberFormatter formatadorSalario(BigDecimal inicio, BigDecimal fim) {
		NumberFormat numberFormat = NumberFormat.getInstance();
		NumberFormatter formatter = new NumberFormatter(numberFormat);
		formatter.setValueClass(BigDecimal.class);
		formatter.setMinimum(inicio);
		formatter.setMaximum(fim);
		formatter.setAllowsInvalid(false);
		return formatter;
	}
	
	public DefaultFormatterFactory formatadorSalario() {
		try {
            // Define a máscara para números decimais com até 2 casas decimais
            MaskFormatter mascara = new MaskFormatter("####.##");
            mascara.setInvalidCharacters(""); // Permite apenas números e ponto
            return new DefaultFormatterFactory(mascara);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	}
	
	public NumberFormatter novoFormatador() {
		NumberFormatter mascara = new NumberFormatter();
		mascara.setValueClass(NumberFormat.getCurrencyInstance().getClass());
		mascara.setMinimum(1.0);
		mascara.setMaximum(9999.99);
		mascara.setFormat(NumberFormat.getCurrencyInstance());
		//mascara.setAllowsInvalid(false);
		return mascara;
	}
	
  //  Tem que implements ActionListener e sobrescrever esse metodo da classe pai
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("DENTRO:::" + txtNome.getText());
//		JOptionPane.showMessageDialog(null, "Nome: "+txtNome.getText(), 
//				"Botão ADD", JOptionPane.INFORMATION_MESSAGE);
//		double salario = Double.valueOf(ftxSalario.getText());
//		Funcionario funcionario = new Funcionario(txtNome.getText(), 
//				txtCargo.getText(), salario);
//		repository.adicionar(funcionario);
	}
	
}
