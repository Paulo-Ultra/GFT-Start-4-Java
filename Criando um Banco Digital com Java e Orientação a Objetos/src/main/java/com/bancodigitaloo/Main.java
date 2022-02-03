package com.bancodigitaloo;

public class Main {

    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo");
        paulo.setIdade(36);
        paulo.setId(1L);
        paulo.setEmail("prfultra@yahoo.com.br");


        Conta cc = new ContaCorrente(paulo);
        Conta poupanca = new ContaPoupanca(paulo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
