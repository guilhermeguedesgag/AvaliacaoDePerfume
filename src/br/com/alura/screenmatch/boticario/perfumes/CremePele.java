package br.com.alura.screenmatch.boticario.perfumes;

import br.com.alura.screenmatch.boticario.padronizacaodosperfumes.Cremes;

public class CremePele extends Cremes {
    public CremePele(String nomeDoCreme, int notaDoCreme) {
        super(nomeDoCreme, notaDoCreme);
    }

    int classificacaoDosCremes;

    @Override
    public int getProjecao() {
        classificacaoDosCremes = 1;
        System.out.println("Sua classificação de projeção é "+ classificacaoDosCremes +" (Sem mensuração de projeção)");
        return 1;
    }

    @Override
    public String toString() {

        return "Creme de Pele: " + this.getNomeDoCreme()+ " - Nota de avaliação: "+this.getNotaDoCreme();
        // o retorno no modo Debug será: Cítricos: 'getNome' Nota: 'getNota'


    }

}
