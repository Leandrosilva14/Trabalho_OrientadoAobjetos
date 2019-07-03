package br.com.leandromachado.factory;

import br.com.leandromachado.displays.Display;
import br.com.leandromachado.displays.RadioRelogioDisplay;
import br.com.leandromachado.displays.RadioFmDisplay;
import br.com.leandromachado.displays.TemperaturaDisplay;
import br.com.leandromachado.displays.CalendarioDisplay;

public class DisplayFactory {
    public static Display<?> getDisplay(String display) {
        if (display == null) {
            return null;
        }

        if (display.equalsIgnoreCase("RADIO_RELOGIO")) {
            return new RadioRelogioDisplay();
        } else if (display.equalsIgnoreCase("RADIO_FM")) {
            return new RadioFmDisplay();
        } else if (display.equalsIgnoreCase("TEMPERATURA")) {
            return new TemperaturaDisplay();
        } else if (display.equalsIgnoreCase("CALENDARIO")) {
            return new CalendarioDisplay();
        }

        return null;
    }
}
