package br.com.alura.loja.designpatterns.chain.calculadora;

import br.com.alura.loja.designpatterns.chain.desconto.Desconto;
import br.com.alura.loja.designpatterns.chain.desconto.impl.DescontoCincoItens;
import br.com.alura.loja.designpatterns.chain.desconto.impl.DescontoQuinheitosValor;
import br.com.alura.loja.designpatterns.chain.desconto.impl.DescontoZero;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calculaDesconto(Orcamento orcamento) {
        Desconto desconto = new DescontoCincoItens(new DescontoQuinheitosValor(new DescontoZero()));

        return desconto.calculo(orcamento);
    }
}
