package bancodigital;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsuariosMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banco bancoClientes = new Banco();
		
		boolean sair = false;
		System.out.println("Bem vindo ao Banco Digital\n \nDigite:");
		while(!sair) {
			try {
				System.out.println("\n[1] - Criar conta");
				System.out.println("Caso já tenha uma conta, Digite:");
				System.out.println("[2] - Consultar extrato");
				System.out.println("[3] - Depositar");
				System.out.println("[4] - Sacar");
				System.out.println("[5] - Transferir");
				System.out.println("[6] - Finalizar operação");
				System.out.print(">>> ");
				int opcoes = sc.nextInt();
				switch(opcoes) {
				 	case 1: 
				 		System.out.println("Qual conta deseja Criar?");
				 		System.out.println("[1] - Conta Poupança\n[2] - Conta Corrente");
				 		System.out.print(">>> ");
				 		int tiposContas = sc.nextInt();
				 		sc.nextLine();
				 		if(tiposContas == 1) {
				 			System.out.print("Digite seu nome e sobrenome: ");
				 			String nomeCliente = sc.nextLine();
				 			Conta conta = new ContaPoupanca(new Cliente(nomeCliente));
				 			bancoClientes.adicionarCliente(conta);
				 			System.out.println(String.format("\nCONTA POUPANÇA CRIADA\nAGENCIA: 1\nCONTA: %d\n", conta.getNumero()));
					
				 		}else if(tiposContas == 2){
				 			System.out.print("Digite seu nome e sobrenome: ");
				 			String nomeCliente = sc.nextLine();
				 			Cliente cliente = new Cliente(nomeCliente);
				 			Conta conta = new ContaCorrente(cliente);
				 			bancoClientes.adicionarCliente(conta);
				 			System.out.println(String.format("\nCONTA CORRENTE CRIADA\nAGENCIA: 1\nCONTA: %d\n", conta.getNumero()));
						
				 		}else {
				 			System.out.println("Opção Inválida.");
				 		}
				 		break;
				
				 	case 2:
				 		System.out.print("Digite o numero da sua conta: ");
				 		int contaCliente = sc.nextInt();
				 		System.out.println(bancoClientes.buscarContas(contaCliente));
				 		break;
				
				 	case 3: 
				 		System.out.print("Digite o numero da sua conta: ");
				 		int contaDeposito = sc.nextInt();
				 		bancoClientes.contaParaDepositar(contaDeposito);
				 		break;
				 	
				 	case 4: 
				 		System.out.print("Digite o numero da sua conta: ");
				 		int contaSaque = sc.nextInt();
				 		sc.nextLine();
				 		bancoClientes.contaParaSacar(contaSaque);
				 		break;
				 	case 5:
				 		System.out.print("Digite o numero da sua conta: ");
				 		int contaCliente1 = sc.nextInt();
				 		sc.nextLine();
				 		System.out.print("Digite o numero da conta destino: ");
				 		int contaCliente2 = sc.nextInt();
				 		sc.nextLine();
				 		bancoClientes.transferenciaEntreContas(contaCliente1, contaCliente2);
				 		break;
				
				 	case 6:
				 		System.out.println("Finalizando a operação...");
				 		sair = true;
				 		break;
				
				 	default: 
				 		System.out.println("Opção inválida. Digite novamente!\n");
				 		break;
				
				}
			} catch(InputMismatchException e){
				System.out.println("Entrada inválida. Por favor, digite apenas números inteiros.\n");
				sc.nextLine();
			}
			
		}
		
	sc.close();
	}
}
