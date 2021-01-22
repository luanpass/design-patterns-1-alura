package br.com.alura.loja.designpatterns.chain;

import br.com.alura.loja.designpatterns.chain.calculadora.CalculadoraDesconto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        Orcamento orcamento1 = new Orcamento(new BigDecimal(1000),6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal(1000),1);

        System.out.println(calculadoraDesconto.calculaDesconto(orcamento1));
        System.out.println(calculadoraDesconto.calculaDesconto(orcamento2));

    }
}
