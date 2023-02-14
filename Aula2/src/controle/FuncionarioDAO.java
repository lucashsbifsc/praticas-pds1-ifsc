package controle;

import java.util.ArrayList;

import modelo.Funcionario;

public class FuncionarioDAO {
	private static ArrayList listaFuncionarios;

	public FuncionarioDAO() {
		listaFuncionarios = new ArrayList();
	}

	public boolean inserir(Funcionario func) {
		return false;
	}

	public ArrayList listar(){
		return listaFuncionarios;
	}

	public static FuncionarioDAO getInstance() {
		return null;
	}
}