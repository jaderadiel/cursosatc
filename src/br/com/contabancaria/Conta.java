package br.com.contabancaria;


public class Conta {

	protected double saldo;
	
	double getSaldo(){
		return this.saldo;
	}
	
	void deposita(double deposito){
		this.saldo += deposito;
	}
	
	void saca(double saque){
		this.saldo -= saque;
	}
	
	void atualiza(double taxa){
		this.saldo = this.saldo * taxa;
	}
	
}
