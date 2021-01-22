package br.com.alura.loja.designpatterns.chain.desconto.impl;

import br.com.alura.loja.designpatterns.chain.desconto.Desconto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoZero extends Desconto {

    public DescontoZero() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
