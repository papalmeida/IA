package br.com.cefetmg.ag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IndNRainhas implements Individuo {
    private double txMutacao = 0.3;
    private int[] genes;
    private int qtdGenes;
    private boolean maximizacao = false;
    private static final Random rd = new Random();

    public IndNRainhas(int qtdGenes) {
        this.genes = new int[qtdGenes];
        for(int i =0; i < qtdGenes; i++) {
            genes[i] = rd.nextInt(0,qtdGenes);
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
        IndNRainhas mutante = new IndNRainhas(qtdGenes, genes);

        for (int i = 0; i < genes.length; i++) {
            if (rd.nextDouble() < txMutacao) {
                mutante.genes[i] = rd.nextInt(0, qtdGenes);
            }
        }
        
        return mutante;
    }

    @Override
    public double getAvaliacao() {
        int colisoes = 0;

        for (int i = 0; i < genes.length; i++) {
            for (int j = i + 1; j < genes.length; j++) {
                if (genes[i] == genes[j]) {
                    colisoes++;
                } else if (Math.abs(genes[i] - genes[j]) == Math.abs(i - j)) {
                    colisoes++;
                }
            }
        }
        
        return colisoes;
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
