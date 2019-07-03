package br.com.leandromachado.displays;

import br.com.leandromachado.factory.FormatterFactory;
import br.com.leandromachado.classesmolde.Calendario;
import br.com.leandromachado.formatters.CalendarioFormatter;

public class CalendarioDisplay extends Display<CalendarioFormatter>	{
    private String calendarioFinal;

    public CalendarioDisplay() {
    }

    public void create(Calendario calendario) {
        this.setCalendarioFinal(calendario);
    }

    @Override
    public void show() {
        System.out.println("Calendário: " + this.getCalendarioFinal());
    }

    public String getCalendarioFinal() {
        return calendarioFinal;
    }

    public void setCalendarioFinal(Calendario calendario) {
        CalendarioFormatter calendarioFormatter = (CalendarioFormatter) FormatterFactory.getFormatter("CALENDARIO");
        this.calendarioFinal = calendarioFormatter.formatter(calendario);
    }
}
