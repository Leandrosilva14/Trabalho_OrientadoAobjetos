package br.com.leandromachado.formatters;

import br.com.leandromachado.classesmolde.Horario;

public class RadioRelogioFormatter implements Formatter<Horario> {
    @Override
    public String formatter(Horario horario) {
        return String.format("%02d", horario.getHora()) + ":" + String.format("%02d", horario.getMinuto());
    }
}
