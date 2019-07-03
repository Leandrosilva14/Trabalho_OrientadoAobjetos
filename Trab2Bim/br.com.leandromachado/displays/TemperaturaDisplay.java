package br.com.leandromachado.displays;

import br.com.leandromachado.factory.FormatterFactory;
import br.com.leandromachado.classesmolde.Temperatura;
import br.com.leandromachado.formatters.TemperaturaFormatter;

public class TemperaturaDisplay extends Display<TemperaturaFormatter> {
    private String temperaturaFinal;

    public TemperaturaDisplay() {
    }

    public void create(Temperatura temperatura) {
        this.setTemperaturaFinal(temperatura);
    }

    @Override
    public void show() {
        System.out.println("Temperatura: " + this.getTemperaturaFinal());
    }

    public String getTemperaturaFinal() {
        return temperaturaFinal;
    }

    public void setTemperaturaFinal(Temperatura temperatura) {
        TemperaturaFormatter temperaturaFormatter = (TemperaturaFormatter) FormatterFactory.getFormatter("TEMPERATURA");
        this.temperaturaFinal = temperaturaFormatter.formatter(temperatura);
    }

}
