package caixaEletronico;

public class Conta {
	Pessoa titular;
	double saldo;
	
	void depositar(double valor)	{
		
		if (valor > 0 ) {
			saldo = saldo + valor;
			System.out.println("Deposito foi feito com sucesso");
		}else {
			System.out.println("Este valor não é possivel depositar");
		}
		
	}
	
	void sacar(double valor)	{
		
		if (valor > 0 && valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("Saque foi feito com sucesso");
		}else {
			System.out.println("Este valor não é possivel suficiente");
		}
		
	}
	
	void mostrarSaldo() {
		System.out.print("Saldo atual é de:" + saldo);
	}
	
}
