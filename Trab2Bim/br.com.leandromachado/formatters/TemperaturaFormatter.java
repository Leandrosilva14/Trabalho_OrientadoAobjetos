package br.com.leandromachado.formatters;

import br.com.leandromachado.classesmolde.Temperatura;

public class TemperaturaFormatter implements Formatter<Temperatura> {

    @Override
    public String formatter(Temperatura temperatura) {
        return String.format("%.1f", temperatura.getGrau()) + " °C";
    }

}
