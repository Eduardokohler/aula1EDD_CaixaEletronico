package caixaEletronico;
import java.util.Scanner;
public class CaixaEletronico {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		Conta conta = new Conta();
		
		System.out.println("CPF: ");
		pessoa.cpf = s.nextLine();
		
		System.out.println("Nome: ");
		pessoa.nome = s.nextLine();
		
		System.out.println("Número da Conta: ");
		pessoa.nrconta = s.nextInt();
		
		conta.titular = pessoa;
		System.out.println("Informe o saldo: ");
		conta.saldo = s.nextDouble();
		
	int opcao;
	do {
		
		System.out.println("\n Opção numero 1: Consultar Saldo");
		System.out.println("\n Opção numero 2: Sacar ");
		System.out.println("\n Opção numero 3: Depositar ");
		System.out.println("\n Sair ");
		System.out.println("\n Opções");
		
		opcao = s.nextInt();
		
		if (opcao == 1 ) {
			System.out.println("Titular: "+ conta.titular.nome);
			conta.mostrarSaldo();
		}else if (opcao == 2 ) {
			System.out.println("O valor do saque é?: ");
			conta.sacar(s.nextDouble());
		}else if (opcao == 3) {
			System.out.println("O valor do deposito é?: ");
			conta.depositar(s.nextDouble());
		}
	}while(opcao !=0 );
	{
		s.close();
	}
	}
	
}
