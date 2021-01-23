package br.com.alura.loja.designpatterns.chain.desconto.impl;

import br.com.alura.loja.designpatterns.chain.desconto.Desconto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoCincoItens extends Desconto {


    public DescontoCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean verificaDesconto(Orcamento orcamento) {
        return orcamento.getItens() > 5;
    }
}
