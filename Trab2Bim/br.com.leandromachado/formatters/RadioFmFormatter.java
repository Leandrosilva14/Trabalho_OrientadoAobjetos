package br.com.leandromachado.formatters;

import br.com.leandromachado.classesmolde.EstacaoRadio;

public class RadioFmFormatter implements Formatter<EstacaoRadio> {
    @Override
    public String formatter(EstacaoRadio estacao) {
        return "FM " + String.format("%.1f", estacao.getSintonia()) + " Mhz";
    }
}
