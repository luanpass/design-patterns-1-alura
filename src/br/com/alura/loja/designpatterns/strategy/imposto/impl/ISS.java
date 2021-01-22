package br.com.alura.loja.designpatterns.strategy.imposto.impl;

import br.com.alura.loja.designpatterns.strategy.imposto.Imposto;

import java.math.BigDecimal;

public class ISS implements Imposto {

    @Override
    public BigDecimal calcular(BigDecimal bigDecimal) {
        return bigDecimal.multiply(new BigDecimal("0.06"));
    }
}
