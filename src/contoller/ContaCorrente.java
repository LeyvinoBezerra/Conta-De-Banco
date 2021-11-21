package contoller;

public class ContaCorrente extends Conta {

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (getSaldo() - valor < 0) {
			throw new SaldoInsuficienteException("saldo Negativo !");
		}
		setSaldo(getSaldo() - valor);
	}

	@Override
	public void depositar(double valor) throws SaldoInsuficienteException {

		setSaldo(getSaldo() + valor);

	}

}
