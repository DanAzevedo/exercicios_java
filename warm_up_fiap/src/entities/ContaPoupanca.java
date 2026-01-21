package entities;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
