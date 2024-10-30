package ifsp.lista3.controller;

import java.awt.event.ActionEvent;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ifsp.lista2.Funcionario;
import ifsp.lista3.repository.FuncionarioRepository;

/*
 * Representa a camada de intermediação entre a tela (view) e persistencia (repository)
 *   e a abstração da ação dos botões da camada view
 * Foi criada por utilizarmos antes, uma unica classe para representar a acao de todos
 *   os botoes da tela (NAO e' uma boa pratica)
 * 
 */
public class FuncionarioController {
	private JTextField txtNome;
	private JTextField txtCargo;
	private JFormattedTextField ftxSalario;
	
  // Criar os mesmos atributos da tela com os mesmos tipos apenas fields
	private Funcionario funcionario;
	private FuncionarioRepository repository = new FuncionarioRepository();
	
  // Construtores
	public FuncionarioController() {
	}
	public FuncionarioController(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public FuncionarioController(JTextField txtNome, JTextField txtCargo, JFormattedTextField ftxSalario) {
		this.txtNome = txtNome;
		this.txtCargo = txtCargo;
		this.ftxSalario = ftxSalario;
		
		double salario=0;
		if ( !ftxSalario.getText().isEmpty()) {
			salario = Double.valueOf(ftxSalario.getText());
		}

		this.funcionario = new Funcionario(txtNome.getText(), txtCargo.getText(), salario);
	}

  // Getters and Setters
	public JTextField getTxtNome() {
		return txtNome;
	}
	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}
	public JTextField getTxtCargo() {
		return txtCargo;
	}
	public void setTxtCargo(JTextField txtCargo) {
		this.txtCargo = txtCargo;
	}
	public JFormattedTextField getFtxSalario() {
		return ftxSalario;
	}
	public void setFtxSalario(JFormattedTextField ftxSalario) {
		this.ftxSalario = ftxSalario;
	}

  // Metodos funcionais
	public void executarAcao(ActionEvent e) {
		// Captura o nome do botao que o usuario clicou no momento
		String cmd = e.getActionCommand();
		switch (cmd) {
			case "Adicionar": 
				repository.adicionar(funcionario);
				JOptionPane.showInternalMessageDialog(null, funcionario, "Sucesso", 
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case "Remover": 
				System.out.println("remover aqui...");
				break;
		}
	}
	
}
