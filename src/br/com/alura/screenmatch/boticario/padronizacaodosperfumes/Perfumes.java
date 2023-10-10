package br.com.alura.screenmatch.boticario.padronizacaodosperfumes;

import br.com.alura.screenmatch.regrapadrao.Classificacao;

public class Perfumes implements Classificacao,  Comparable<Perfumes>{


    // o intuito é deixar tudo no perfume

    String nome;
    int notaDoPerfume;



    public Perfumes(String nome, int notaDoPerfume) {
        this.nome = nome;
        this.notaDoPerfume = notaDoPerfume;

    }

    public String getNome() {
        return nome;
    }

    public int getNotaDoPerfume() {
        return notaDoPerfume;
    }



    @Override
    public int getClassificacao() {

        return getClassificacao();
    }


    @Override
    public int compareTo(Perfumes listaDeComparacoes) {
        return this.getNome().compareTo(listaDeComparacoes.getNome());
        // pegue o getNome e Compare(compareTo()) com as comparacoes do nome
        //ele irá ordenar pelo getNome

    }






}
