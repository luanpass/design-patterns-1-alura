package br.com.alura.loja.designpatterns.strategy.imposto;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular (BigDecimal bigDecimal);

}
