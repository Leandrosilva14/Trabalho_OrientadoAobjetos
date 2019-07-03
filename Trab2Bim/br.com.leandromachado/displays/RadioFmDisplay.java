package br.com.leandromachado.displays;

import br.com.leandromachado.factory.FormatterFactory;
import br.com.leandromachado.classesmolde.EstacaoRadio;
import br.com.leandromachado.formatters.RadioFmFormatter;

public class RadioFmDisplay extends Display<RadioFmFormatter> {
    private String estacaoFinal;

    public RadioFmDisplay() {
    }

    public void create(EstacaoRadio estacao) {
        this.setEstacaoFinal(estacao);
    }

    @Override
    public void show() {
        System.out.println("Rádio: " + this.getEstacaoFinal());
    }

    public String getEstacaoFinal() {
        return estacaoFinal;
    }

    public void setEstacaoFinal(EstacaoRadio estacao) {
        RadioFmFormatter radioFmFormatter = (RadioFmFormatter) FormatterFactory.getFormatter("RADIO");
        this.estacaoFinal= radioFmFormatter.formatter(estacao);
    }
}
