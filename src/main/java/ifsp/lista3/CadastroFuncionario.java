package ifsp.lista3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;

import ifsp.lista2.Funcionario;
import ifsp.lista3.controller.FuncionarioActionExibirController;
import ifsp.lista3.repository.FuncionarioRepository;

public class CadastroFuncionario extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCargo;
	private JFormattedTextField ftxSalario;
	
	private FuncionarioRepository repository = new FuncionarioRepository();
	
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
		setBounds(100, 100, 614, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro de Funcionários");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(12, 12, 590, 15);
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
		btnAdicionar.setBounds(27, 351, 117, 25);
		contentPane.add(btnAdicionar);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.setBounds(259, 351, 117, 25);
		contentPane.add(btnExibir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, repository.listar());

  //  a var icon, seria o ultimo argumento da showConfirmDialog
  //            ImageIcon icon = new ImageIcon("src/images/turtle64.png");
				 
				int respostaUsuario = JOptionPane.showConfirmDialog(null,
						"Lista Cadastrada: " + repository.listar(), 
						"Deseja sair ?",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
				
				// 0=SIM 1=NAO 2=CANCEL
				if ( respostaUsuario == 0 ) {
					System.exit(EXIT_ON_CLOSE);	
				}
				
			}
		});
		btnSair.setBounds(463, 351, 117, 25);
		contentPane.add(btnSair);
		
		// Antes das acoes dos botoes devemos preparar o funcionario
		//double salario = Double.valueOf(txtSalario.getText());
		//Funcionario funcionario = new Funcionario(txtNome.getText(), txtCargo.getText(), 0);
		//FuncionarioController controller = new FuncionarioController(txtNome, txtCargo, txtSalario);
		//btnAdicionar.addActionListener(controller);
		
		System.out.println("FORA:::" + txtNome.getText());
		btnAdicionar.addActionListener(this);

	  // Botao exibir usamos uma classe separada, supondo um codigo grande
		btnExibir.addActionListener(new FuncionarioActionExibirController(txtNome));
		
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

  //  Tem que implements ActionListener e sobrescrever esse metodo da classe pai
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("DENTRO:::" + txtNome.getText());
		JOptionPane.showMessageDialog(null, "Nome: "+txtNome.getText(), 
				"Botão ADD", JOptionPane.INFORMATION_MESSAGE);
		double salario = Double.valueOf(ftxSalario.getText());
		Funcionario funcionario = new Funcionario(txtNome.getText(), 
				txtCargo.getText(), salario);
		repository.adicionar(funcionario);
	}
	
}
