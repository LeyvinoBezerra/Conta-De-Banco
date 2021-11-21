package contoller;

public class Aplication {

	public static void main(String[] args) {

		ContaCorrente c1 = new ContaCorrente();
		try {
			c1.depositar(1000);
		} catch (SaldoInsuficienteException e1) {
			
			e1.printStackTrace();
		}

		try {
			c1.sacar(300);
		} catch (SaldoInsuficienteException e) {

			e.printStackTrace();
		}
       System.out.println(c1.getSaldo());
	}

}
