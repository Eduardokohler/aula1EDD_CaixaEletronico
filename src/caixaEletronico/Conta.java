package caixaEletronico;

public class Conta {
	Pessoa titular;
	double saldo;
	
	void depositar(double valor)	{
		
		if (valor > 0 ) {
			saldo = saldo + valor;
			System.out.println("Deposito feito com sucesso");
		}else {
			System.out.println("Este valor não é possivel depositar");
		}
		
	}
}
