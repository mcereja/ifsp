package ifsp.lista3.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ifsp.lista2.Funcionario;
import ifsp.lista3.repository.FuncionarioRepository;

/*
 * Representaria a camada de intermediação entre a tela (view) e persistencia (repository)
 * e a abstração da ação dos botões da camada view
 * POREM!! NESSA VERSAO O CONTEUDO DOS JTextField NAO VEM FORA DO ESCOPO DA ACAO DO BOTAO
 * 	ENTAO CRIEI A FuncionarioController sem implementar ActionListener
 * NOTE que nessa proposta, usaria apenas uma classe para todos botoes da tela, o que
 *   nao seria uma boa pratica usar o switch case ou ifs encadeados
 */
public class FuncionarioActionController implements ActionListener {
	private JTextField txtNome;
	private JTextField txtCargo;
	private JTextField txtSalario;
	
	// Criar os mesmos atributos da tela com os mesmos tipos apenas fields
	private Funcionario funcionario;
	
	private FuncionarioRepository repository = new FuncionarioRepository();
	
	// Construtores
	public FuncionarioActionController() {
	}
	public FuncionarioActionController(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public FuncionarioActionController(JTextField txtNome, JTextField txtCargo, JTextField txtSalario) {
		this.txtNome = txtNome;
		this.txtCargo = txtCargo;
		this.txtSalario = txtSalario;
		
		double salario=0;
		if ( !txtSalario.getText().isEmpty()) {
			salario = Double.valueOf(txtSalario.getText());
		}

		this.funcionario = new Funcionario(txtNome.getText(), txtCargo.getText(), salario);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
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
