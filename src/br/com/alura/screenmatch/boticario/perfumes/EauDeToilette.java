package br.com.alura.screenmatch.boticario.perfumes;

import br.com.alura.screenmatch.boticario.padronizacaodosperfumes.Perfumes;

public class EauDeToilette extends Perfumes {
    public EauDeToilette(String nome, int notaDoPerfume) {
        super(nome, notaDoPerfume);
    }

    int classificacaoDosEauDeToilette;

    @Override
    public int getProjecao() {
        classificacaoDosEauDeToilette = 5;
        System.out.println("Sua classificação de projeção é "+ classificacaoDosEauDeToilette +" pois é \n" +
                "considerado um Eau de Toilette.(Baixa projeção)");
        return 5;
    }

    @Override
    public String toString() {

        return "Eau De Toilette: " + this.getNome()+ " - Nota de avaliação: "+this.getNotaDoPerfume();
        // o retorno no modo Debug será: Cítricos: 'getNome' Nota: 'getNota'


    }

}
