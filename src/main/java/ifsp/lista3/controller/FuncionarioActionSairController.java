package ifsp.lista3.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class FuncionarioActionSairController implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

	  // 0=SIM 1=NAO 2=CANCEL
		int respostaUsuario = JOptionPane.showConfirmDialog(null,
				" Deseja realmente sair ? ", 
				"***Confirmação de saída***",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
		
		if ( respostaUsuario == 0 ) {
			System.exit(WindowConstants.EXIT_ON_CLOSE);
		}
		
	}

}
