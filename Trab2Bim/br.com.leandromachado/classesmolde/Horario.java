package br.com.leandromachado.classesmolde;

public class Horario {
    private int hora;
    private int minuto;

    public Horario() {}

    public Horario(int hora, int minuto) {
            this.setHora(hora);
            this.setMinuto(minuto);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
