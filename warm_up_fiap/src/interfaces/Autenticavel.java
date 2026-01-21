package interfaces;

public abstract interface Autenticavel {
	
	public abstract void setSenha(Integer senha);
	
	public abstract boolean autentica(Integer senha);
}
