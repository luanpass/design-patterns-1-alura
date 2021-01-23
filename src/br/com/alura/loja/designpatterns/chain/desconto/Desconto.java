package br.com.alura.loja.designpatterns.chain.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calculo(Orcamento orcamento) {
        if (verificaDesconto(orcamento)) {
            return calcular(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    public abstract BigDecimal calcular(Orcamento orcamento);

    public abstract boolean verificaDesconto(Orcamento orcamento);
}
