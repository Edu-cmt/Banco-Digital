package bancodigital;


import java.util.Scanner;


public class Conta {

	private static final int AGENCIA_PADRAO = 1;
	private static  int SEQUENCIAL = 356979;
	
	protected Cliente cliente;
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	Scanner sc = new Scanner(System.in);
	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL = SEQUENCIAL + 9999;
		this.cliente = cliente;
	}
    

	public double sacar() {
		System.out.println("Quanto deseja sacar?");
		double valor = sc.nextDouble();
		if(saldo < valor) {
			System.out.println("Valor Insuficiente.");
			System.out.println("Digite:\n1 - Para realizar depósito\n2 - Para voltar.");
			int opcoes = sc.nextInt();
			if(opcoes == 1) {
				return 0;
			}else {
		    	return 1;
			}
			
		}else {
			System.out.println(String.format("Saque de R$%.2f realizado.\n", valor)); 
			return saldo -= valor;
		}
		
	}

	public double depositar() {
		System.out.println("Quanto deseja depositar?");
		double valor = sc.nextDouble();
		System.out.println(String.format("Deposito de R$%.2f realizado.\n", valor));
		return saldo += valor;
		
	}

	public void transferir(Conta contaDestino) {
		System.out.println("Quanto deseja transferir?");
		double valor = sc.nextDouble();
		saldo -= valor;
		contaDestino.saldo += valor;
		System.out.println("Transferência Realizada!\n");
	}

	public String getCliente() {
		return cliente.getNome();
	}
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


	@Override
	public String toString() {
		return "Conta [cliente=" + cliente + ", agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
}
