/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.contabancaria;

/**
 *
 * @author Jader
 */
public class TestConta {
    
    public static void main (String args[]){
        
        Conta conta = new Conta();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        
        conta.deposita(1000.00);
        contaCorrente.deposita(1000.00);
        contaPoupanca.deposita(1000.00);

        conta.atualiza(0.1);
        contaCorrente.atualiza(0.1);
        contaPoupanca.atualiza(0.2);
        /*teste*/
        System.out.println(conta.getSaldo());
        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaPoupanca.getSaldo());
    }
    
}
