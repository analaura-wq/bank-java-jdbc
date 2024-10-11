package br.sesi.bank.bank_java_jdbc.domain.conta;

import br.sesi.bank.bank_java_jdbc.domain.cliente.cliente;

import java.math.BigDecimal;

  public class Conta {
    private Integer numero;
    private BigDecimal valor;
    private cliente titular;

    public Conta(Integer numero, BigDecimal saldo, cliente titular){

    }

}
