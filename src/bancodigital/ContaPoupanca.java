package bancodigital;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {
	
	LocalDate date = LocalDate.now();
	
	private static final String TIPO_DE_CONTA = "CONTA POUPANÇA";
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	

	public static String getTipoDeConta() {
		return TIPO_DE_CONTA;
	}


	@Override
	public String toString() {
		return "  Extrato " + date  +"\n   Tipo de conta: "+ TIPO_DE_CONTA + "\n   Titular: " + cliente + "\n   Agencia: "
				+ agencia + "\n   Numero: " + numero + "\n   Saldo: " + saldo 
				+ "                   ";	
	}
	
	
}
