# Main

``` java
package br.com.leandromachado.Main;

import br.com.leandromachado.displays.RadioRelogioDisplay;
import br.com.leandromachado.displays.RadioFmDisplay;
import br.com.leandromachado.displays.TemperaturaDisplay;
import br.com.leandromachado.displays.CalendarioDisplay;
import br.com.leandromachado.factory.DisplayFactory;
import br.com.leandromachado.classesmolde.Horario;
import br.com.leandromachado.classesmolde.EstacaoRadio;
import br.com.leandromachado.classesmolde.Temperatura;
import br.com.leandromachado.classesmolde.Calendario;

public class Main {
    public static void main(String[] args) {
        RadioRelogioDisplay radioRelogioDisplay = (RadioRelogioDisplay) DisplayFactory.getDisplay("RADIO_RELOGIO");
        radioRelogioDisplay.create(new Horario(14 , 30));
        radioRelogioDisplay.show();

        RadioFmDisplay radioFmDisplay = (RadioFmDisplay) DisplayFactory.getDisplay("RADIO_FM");
        radioFmDisplay.create(new EstacaoRadio(91.1));
        radioFmDisplay.show();

        TemperaturaDisplay temperaturaDisplay = (TemperaturaDisplay) DisplayFactory.getDisplay("TEMPERATURA");
        temperaturaDisplay.create(new Temperatura(19.0));
        temperaturaDisplay.show();

        CalendarioDisplay calendarioDisplay = (CalendarioDisplay) DisplayFactory.getDisplay("CALENDARIO");
        calendarioDisplay.create(new Calendario(10, 1, 2020));
        calendarioDisplay.show();
    }
}
```
