package br.com.leandromachado.formatters;

public interface Formatter<T> {
    String formatter(T value);
}
