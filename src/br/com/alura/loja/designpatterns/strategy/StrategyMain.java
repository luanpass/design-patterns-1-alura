package br.com.alura.loja.designpatterns.strategy;

import br.com.alura.loja.designpatterns.strategy.calculadora.CalculadoraDeImpostos;
import br.com.alura.loja.designpatterns.strategy.imposto.impl.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class StrategyMain {

    public static void main(String[] args) {
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        Orcamento orcamento = new Orcamento(new BigDecimal(100),1);

        System.out.println(calculadoraDeImpostos.calculaImposto(orcamento, new ICMS()));
    }

}
