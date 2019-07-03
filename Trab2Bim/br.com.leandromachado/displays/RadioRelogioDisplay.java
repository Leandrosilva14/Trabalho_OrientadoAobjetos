package br.com.leandromachado.displays;

import br.com.leandromachado.factory.FormatterFactory;
import br.com.leandromachado.classesmolde.Horario;
import br.com.leandromachado.formatters.RadioRelogioFormatter;

public class RadioRelogioDisplay extends Display<RadioRelogioFormatter> {
    private String horarioFinal;

    public RadioRelogioDisplay() {
    }

    public void create(Horario horario) {
        this.setHorarioFinal(horario);
    }

    @Override
    public void show() {
        System.out.println("Rádio Relógio: " + this.getHorarioFinal());
    }

    public String getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(Horario horario) {
        RadioRelogioFormatter radioRelogioFormatter = (RadioRelogioFormatter) FormatterFactory.getFormatter("RADIO_RELOGIO");
        this.horarioFinal = radioRelogioFormatter.formatter(horario);
    }
}
