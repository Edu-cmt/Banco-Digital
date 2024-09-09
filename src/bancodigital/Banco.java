package bancodigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Banco {
	private List<Conta> listaClientes;
	Scanner sc = new Scanner(System.in);
	
	public Banco() {
		this.listaClientes = new ArrayList<>();
	}
	
	public void listarClientes() {
		System.out.println(listaClientes);
	}
	
	public void adicionarCliente(Conta conta) {
		listaClientes.add(conta);
	}
	
	public List<Conta> buscarContas( int numeroConta){
		List<Conta> contasBuscadas = new ArrayList<>();
		List<Integer> contasClientes = new ArrayList<>();
		if(!listaClientes.isEmpty()) {
			for(Conta c : listaClientes) {
				contasClientes.add(c.getNumero());
				if(c.getNumero() == numeroConta) {
					contasBuscadas.add(c);
				}
			}
			if(!contasClientes.contains(numeroConta)){
				System.out.println("\nConta Inexistente.");
			}
			
		}
		
		return contasBuscadas;
	}
	
	public void contaParaDepositar(int numeroConta) {
		List<Integer> contasClientes = new ArrayList<>();
		if(!listaClientes.isEmpty()){
			for(Conta c : listaClientes) {
				contasClientes.add(c.getNumero());
				if(c.getNumero() == numeroConta) {
					c.depositar();
				}
			}
			if(!contasClientes.contains(numeroConta)){
				System.out.println("Conta Inexistente.");
			}
		}
	}
	
	public void contaParaSacar(int numeroConta) {
		List<Integer> contasClientes = new ArrayList<>();
		if(!listaClientes.isEmpty()) {
			for(Conta c : listaClientes) {
				contasClientes.add(c.getNumero());
				if(c.getNumero() == numeroConta) {
						if(c.sacar() == 0) {
							c.depositar();
						}else {
							System.out.println("Voltando para o menu inicial...\n");
						}					
				}
			}
			if(!contasClientes.contains(numeroConta)) {
				System.out.println("Conta Inexistente.");
			}
		}
		
	}
	
	public void transferenciaEntreContas(int numeroConta1, int numeroConta2) {
		Conta conta1 = null;
		Conta conta2 = null;
		for(Conta c1 : listaClientes) {
			if(c1.getNumero() == numeroConta1) {
				conta1 = c1;
			}
		}
		for (Conta c2 : listaClientes) {
			if(c2.getNumero() == numeroConta2) {
				conta2 = c2;
			}
		}
		conta1.transferir(conta2);
	}
	
	
	public void exibirClientes() {
		System.out.println(listaClientes);
	}
	
	
}
