package com.matera.bootcamp2023.carteira;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pix {

    private Conta contaDestino;
    private Conta contaOrigem;
    private LocalDateTime dataTransacao;
    private BigDecimal valor;

    public Pix(Conta contaDestino, Conta contaOrigem, LocalDateTime dataTransacao, BigDecimal valor) {
        this.contaDestino = contaDestino;
        this.contaOrigem = contaOrigem;
        this.dataTransacao = LocalDateTime.now();
        this.valor = valor;
    }
}
