package br.com.alura.screenmatch.boticario.padronizacaodosperfumes;

import br.com.alura.screenmatch.regrapadrao.Projecao;

public class Cremes implements Projecao {


    // o intuito é deixar tudo no perfume

    String nomeDoCreme;
    int notaDoCreme;



    public Cremes(String nomeDoCreme, int notaDoCreme) {
        this.nomeDoCreme = nomeDoCreme;
        this.notaDoCreme = notaDoCreme;

    }

    public String getNomeDoCreme() {
        return nomeDoCreme;
    }

    public int getNotaDoCreme() {
        return notaDoCreme;
    }



    @Override
    public int getProjecao() {

        return getProjecao();
    }



}
