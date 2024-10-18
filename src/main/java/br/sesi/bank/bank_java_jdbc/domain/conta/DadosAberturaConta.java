package br.sesi.bank.bank_java_jdbc.domain.conta;

import br.sesi.bank.bank_java_jdbc.domain.cliente.DadosCadastroCliente;

public class DadosAberturaConta {
    public Integer numero;
    public DadosCadastroCliente dadosCliente;

    public DadosAberturaConta(Integer numero,DadosCadastroCliente dadosClientes){
         this.numero = numero;
         this.dadosCliente = dadosClientes;
    }
}

