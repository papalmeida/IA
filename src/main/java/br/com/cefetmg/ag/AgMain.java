package br.com.cefetmg.ag;

public class AgMain {
    public static void main(String[] args) throws Exception {
        IndNRainhasFactory factory = new IndNRainhasFactory(20);
        Ag algoritmoGenetico = new Ag();
        Individuo melhor = algoritmoGenetico.executar(factory, 30, 6, 3000);
        System.out.println("\nMelhor Individuo da N-Rainhas:\n" + melhor);
    }
}
