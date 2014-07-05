package br.com.contabancaria;


public class ContaCorrente extends Conta{

	@Override
	void atualiza(double taxa){
		this.saldo = this.saldo * taxa * 2;
	}
	
	@Override
	void deposita(double deposito){
		super.deposita(deposito);
		this.saldo -= 0.10;
	}
	
}
