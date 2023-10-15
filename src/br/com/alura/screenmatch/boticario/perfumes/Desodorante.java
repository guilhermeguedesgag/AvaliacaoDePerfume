package br.com.alura.screenmatch.boticario.perfumes;

import br.com.alura.screenmatch.boticario.padronizacaodosperfumes.Perfumes;

public class Desodorante extends Perfumes {
    public Desodorante(String nome, int notaDoPerfume) {
        super(nome, notaDoPerfume);
    }

    int classificacaoDosDesodorante;

    @Override
    public int getProjecao() {
        classificacaoDosDesodorante = 0;
        System.out.println("Não há mensuração de projeção é "+ classificacaoDosDesodorante +" " +
                "(Sem mensuração de projeção)");

        return 0;
    }


    @Override
    public String toString() {

        return "Desodorante: " + this.getNome()+ " - Nota de avaliação: "+this.getNotaDoPerfume();
        // o retorno no modo Debug será: Cítricos: 'getNome' Nota: 'getNota'


    }


}
