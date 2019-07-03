package br.com.leandromachado.factory;

import br.com.leandromachado.formatters.Formatter;
import br.com.leandromachado.formatters.RadioRelogioFormatter;
import br.com.leandromachado.formatters.RadioFmFormatter;
import br.com.leandromachado.formatters.TemperaturaFormatter;
import br.com.leandromachado.formatters.CalendarioFormatter;

public class FormatterFactory {
    public static Formatter<?> getFormatter(String formatter) {
        if (formatter == null) {
            return null;
        }

        if (formatter.equalsIgnoreCase("RADIO_RELOGIO")) {
            return new RadioRelogioFormatter();
        } else if (formatter.equalsIgnoreCase("RADIO")) {
            return new RadioFmFormatter();
        } else if (formatter.equalsIgnoreCase("TEMPERATURA")) {
            return new TemperaturaFormatter();
        } else if (formatter.equalsIgnoreCase("CALENDARIO")) {
            return new CalendarioFormatter();
        }

        return null;
    }
}
