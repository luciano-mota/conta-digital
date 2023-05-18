package com.matera.bootcamp2023.carteira;

import java.util.HashSet;
import java.util.Set;

public class Titular {

    private String nome;
    private String cpf;
    private Set<Conta> contas;

    public Titular(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        contas = new HashSet<>();
    }

    public void mostrarContas() {
        for (Conta conta : this.contas) {

            System.out.println("agencia: " + conta.getAgencia() + " conta: " + conta.getNumero());
        }
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void removerConta(Conta conta) {
        this.contas.remove(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
