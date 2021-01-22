package br.com.alura.loja.designpatterns.strategy.calculadora;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.designpatterns.strategy.imposto.Imposto;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calculaImposto(Orcamento valor, Imposto imposto) {
        return imposto.calcular(valor.getValor());
    }
}
