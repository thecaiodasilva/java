package br.com.alura.TabelaFipe.service;

public interface IConcerteDados {
    <T> T obterDados(String json, Class<T> classe);
}
