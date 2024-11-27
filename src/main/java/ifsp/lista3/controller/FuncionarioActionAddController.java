package ifsp.lista3.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ifsp.lista3.model.Funcionario;
import ifsp.lista3.repository.FuncionarioRepository;

public class FuncionarioActionAddController implements ActionListener {

	private JTextField txtNome;
	private JTextField txtCargo;
	private JFormattedTextField ftxSalario;
	private FuncionarioRepository repository;
	
	public FuncionarioActionAddController(JTextField txtNome, JTextField txtCargo, JFormattedTextField ftxSalario) {
		this.txtNome = txtNome;
		this.txtCargo = txtCargo;
		this.ftxSalario = ftxSalario;
		this.repository = new FuncionarioRepository();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
			// criar uma classe funcionario
			double salario=0;
			if ( !ftxSalario.getText().isEmpty()) {
				salario = Double.valueOf(ftxSalario.getText());
			}
			Funcionario funcionario = new Funcionario(txtNome.getText(), 
					txtCargo.getText(), salario);

			// usar o repositorio para inserir
			repository.adicionar(funcionario);

			// exibir mensagem sucesso ou erro
			JOptionPane.showMessageDialog(null, 
					"Funcionário cadastrado com sucesso. Lista: " + repository.listar(),
					"Cadastro de Funcionários", 
					JOptionPane.INFORMATION_MESSAGE);
			limparTela();
	}
	
	// Métodos funcionais
	public void limparTela() {
		this.txtNome.setText("");
		this.txtCargo.setText("");
		this.ftxSalario.setText("");
		this.txtNome.grabFocus();
	}

}
