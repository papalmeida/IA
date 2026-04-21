package br.com.cefetmg.ag;

import java.util.ArrayList;
import java.util.List;

public class IndNRainhas implements Individuo {
    private double txMutacao = 0.3;
    private int[] genes;
    private int qtdGenes;
    private boolean maximizacao = false;

    public IndNRainhas(int qtdGenes) {
        this.qtdGenes = qtdGenes;
        this.genes = new int[qtdGenes];
    }

    public IndNRainhas(int qtdGenes, int[] genes) {
        this.qtdGenes = qtdGenes;
        this.genes = genes.clone();
    }

    @Override
    public List<Individuo> recombinar(Individuo outro) {
        return new ArrayList<>(2);
    }

    @Override
    public Individuo mutar() {
        return new IndNRainhas(qtdGenes, genes);
    }

    @Override
    public double getAvaliacao() {
        return 0.0;
    }

    @Override
    public boolean isMaximizacao() {
        return maximizacao;
    }

    @Override
    public int[] getGenes() {
        return genes.clone();
    }
}
