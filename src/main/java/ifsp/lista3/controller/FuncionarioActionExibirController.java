package ifsp.lista3.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Representa a abstracao da acao do botao exibir da tela principal, e tem o objetivo
 *   de NAO deixar codigos excessivos na janela principal.
 * BOA PRATICA:: implementar uma classe para cada action de JButton
 */

public class FuncionarioActionExibirController implements ActionListener {

	private JTextField txtNome;
	private JTextField txtCargo;
	private JFormattedTextField ftxSalario;

	public FuncionarioActionExibirController(JTextField txtNome, JTextField txtCargo, JFormattedTextField ftxSalario) {
		this.txtNome = txtNome;
		this.txtCargo = txtCargo;
		this.ftxSalario = ftxSalario;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, 
				"Nome: " + txtNome.getText() + 
				"\n Cargo: " + txtCargo.getText() + 
				"\n Salário: " + ftxSalario.getText());
	}

}
