package ifsp.lista3.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Representa a abstracao da acao do botao exibir da tela principal, e tem o objetivo
 *   de NAO deixar codigos excessivos na janela principal.
 * BOA PRATICA:: implementar uma classe para cada action de JButton
 */

public class FuncionarioActionExibirController implements ActionListener {

	private JTextField nome;
	
	public FuncionarioActionExibirController(JTextField nome) {
		this.nome=nome;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "CLIQUEI NO BOTÃO EXIBIR: " + this.nome.getText());
	}

}
