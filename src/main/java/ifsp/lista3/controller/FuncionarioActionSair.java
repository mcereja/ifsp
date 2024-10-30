package ifsp.lista3.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class FuncionarioActionSair implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		int respostaUsuario = // 0=SIM 1=NAO 2=CANCEL
				JOptionPane.showConfirmDialog(null, 
				"Lista Cadastrada: ",
				"Deseja Sair ?",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
		
		if ( respostaUsuario == 0 ) {
			System.exit(WindowConstants.EXIT_ON_CLOSE);
		}
		
	}

}
