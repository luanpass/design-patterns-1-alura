package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer itens;

    public Orcamento(BigDecimal valor, Integer itens) {
        this.valor = valor;
        this.itens = itens;
    }

    public Integer getItens() {
        return itens;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
