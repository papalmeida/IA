package br.com.cefetmg.ag;

import java.util.ArrayList;
import java.util.List;

public class Ag {
    public Individuo executar(Factory factory, int numPopulacao, int numElite, int qtdGeracoes) {
        List<Individuo> populacaoInicial = new ArrayList<>(numPopulacao);
        for (int i = 0; i < numPopulacao; i++) {
            populacaoInicial.add(factory.getInstance());
        }

        return populacaoInicial.isEmpty() ? null : populacaoInicial.get(0);
    }
}
