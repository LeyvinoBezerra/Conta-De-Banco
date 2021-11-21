package contoller;

public abstract class Conta {

	private double saldo;

	public abstract void sacar(double valor) throws SaldoInsuficienteException;

	public abstract void depositar(double valor) throws SaldoInsuficienteException;

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
