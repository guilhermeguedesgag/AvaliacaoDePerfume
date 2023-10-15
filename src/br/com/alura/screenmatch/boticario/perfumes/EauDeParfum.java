package br.com.alura.screenmatch.boticario.perfumes;

import br.com.alura.screenmatch.boticario.padronizacaodosperfumes.Perfumes;

public class EauDeParfum extends Perfumes {


    public EauDeParfum(String nome, int notaDoPerfume) {
        super(nome, notaDoPerfume);
    }

    int classificacaoDosEauDeParfum;


    @Override
    public int getProjecao() {
        classificacaoDosEauDeParfum = 9;
        System.out.println("Sua classificação de projeção é "+ classificacaoDosEauDeParfum +" pois é \n" +
                "considerado um Eau de Parfum.(Alta projeção)");
        return 9;
    }



    // Para que no modo Debug saia certinho o nome, é só reescrever o toString(opcional)
    // dentro da classe que você deseja reescever.
    @Override
    public String toString() {

        return "Eau de Parfum: "+this.getNome() + "- Nota de avaliação: "+getNotaDoPerfume();
        // o retorno no modo Debug será: Cítricos: 'getNome' Nota: 'getNota'


    }


}
