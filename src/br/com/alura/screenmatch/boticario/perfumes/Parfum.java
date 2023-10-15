package br.com.alura.screenmatch.boticario.perfumes;

import br.com.alura.screenmatch.boticario.padronizacaodosperfumes.Perfumes;

public class Parfum extends Perfumes {
    public Parfum(String nome, int notaDoPerfume) {
        super(nome, notaDoPerfume);
    }

    int classificacaoDosParfum;

    @Override
    public int getProjecao() {
        classificacaoDosParfum = 9;
        System.out.println("Sua classificação de projeção é "+ classificacaoDosParfum +" pois é \n" +
                "considerado um Parfum(Máxima projeção).");
        return 9;
    }

    @Override
    public String toString() {

        return "Parfum: " + this.getNome()+ " - Nota de avaliação: "+this.getNotaDoPerfume();
        // o retorno no modo Debug será: Cítricos: 'getNome' Nota: 'getNota'


    }



}
