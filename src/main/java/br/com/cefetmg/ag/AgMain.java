package br.com.cefetmg.ag;

public class AgMain {
    public static void main(String[] args) throws Exception {
        IndNRainhasFactory factory = new IndNRainhasFactory(10);
        Ag algoritmoGenetico = new Ag();
        algoritmoGenetico.executar(factory, 4, 1, 10000);
    }
}
