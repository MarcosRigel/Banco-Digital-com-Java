
public class Main {

	public static void main(String[] args) {
		
		Cliente rigel = new Cliente();
		rigel.setNome("Rigel");
		
		Conta cc = new ContaCorrente(rigel);
		Conta poupanca = new ContaPoupanca(rigel);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}