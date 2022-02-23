
public class ContaPoupanca extends Conta {

	private static final int SEQUENCIAL = 1;

	public ContaPoupanca() {
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
	}
}
