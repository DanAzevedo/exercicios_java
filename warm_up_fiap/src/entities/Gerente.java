package entities;

import interfaces.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel{
	
	

	@Override
	public Double bonificacao() {
		return 250.00;
	}

	@Override
	public void setSenha(Integer senha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autentica(Integer senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
