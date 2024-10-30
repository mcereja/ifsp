package ifsp.lista3.repository;

import java.util.ArrayList;
import java.util.List;

import ifsp.lista2.Funcionario;

/*
 * Representa o objeto de persistencia ou operacoes no banco de dados
 * Aqui utilizaremos uma collections List<> pois ainda nao aprendemos BD
 */

public class FuncionarioRepository {

	List<Funcionario> funcionarios = new ArrayList<>();
	
	public void adicionar(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void excluir(Funcionario funcionario) {
		int posicaoNaLista = funcionarios.indexOf(funcionario);
		funcionarios.remove(posicaoNaLista);
	}
	
	public List<Funcionario> listar(){
		return funcionarios;
	}
	
}
