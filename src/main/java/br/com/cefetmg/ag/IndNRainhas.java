package br.com.cefetmg.ag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IndNRainhas implements Individuo {
    private double txMutacao = 0.3;
    private int[] genes;
    private int qtdGenes;
    private boolean maximizacao = false;
    private static Random linhaRainha;

    public IndNRainhas(int qtdGenes) {
        this.genes = new int[qtdGenes];
        linhaRainha = new Random();
        for(int i =0; i < qtdGenes; i++) {
            genes[i] = linhaRainha.nextInt(0,qtdGenes);
        }
        this.qtdGenes = qtdGenes;
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
