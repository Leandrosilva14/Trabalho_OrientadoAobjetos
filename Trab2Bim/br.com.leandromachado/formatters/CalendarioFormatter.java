package br.com.leandromachado.formatters;

import br.com.leandromachado.classesmolde.Calendario;

public class CalendarioFormatter implements Formatter<Calendario> {

    @Override
    public String formatter(Calendario calendario) {
        String data = "\n" + "Dia  Mês  Ano \n";

        data += calendario.getDia() + "    " + calendario.getMes() + "   " + calendario.getAno();

        return data;
    }

}
