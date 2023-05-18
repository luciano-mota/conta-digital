package com.matera.bootcamp2023.carteira;

import java.math.BigDecimal;

public class Conta {

    private int agencia;
    private int numero;
    private BigDecimal saldo;
    private Titular titular;

    public Conta(int agencia, int numero, BigDecimal saldo, Titular titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public  void credito(BigDecimal valor) {

    }

    public void debito(BigDecimal valor) {
        this.validar(valor);

        if (valor.compareTo(saldo) > 0) {
            throw new RuntimeException();
        }

        saldo.subtract(valor);
    }

    private void validar(BigDecimal valor) {
        if (valor == null) {
            throw new RuntimeException();
        }

        if (this.valorIncorreto(valor)) {
            throw new RuntimeException();
        }

        saldo.add(valor);
    }

    private boolean valorIncorreto(BigDecimal valor) {
        return valor.compareTo(BigDecimal.ZERO) <= 0;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
}
