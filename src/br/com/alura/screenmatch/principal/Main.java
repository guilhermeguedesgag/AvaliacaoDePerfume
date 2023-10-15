package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.boticario.padronizacaodosperfumes.Cremes;
import br.com.alura.screenmatch.boticario.padronizacaodosperfumes.Perfumes;
import br.com.alura.screenmatch.boticario.perfumes.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        //Definições dos atributos 'string' e 'int' da superclasse(classe Mãe)
        Parfum avaliacao1 = new Parfum("One Million(versão 50 ml)", 6);
        EauDeParfum avaliacao2 = new EauDeParfum("Zaad",8);
        EauDeToilette avaliacao3 = new EauDeToilette("Azzaro",6);
        Desodorante avaliacao4 = new Desodorante("Avanço",3);
        CremePele avaliacao5 = new CremePele("Nivea", 5);

        //Lista de perfumes
        List<Perfumes> listaDePerfumes = new LinkedList<>();
        listaDePerfumes.add(avaliacao1);
        listaDePerfumes.add(avaliacao2);
        listaDePerfumes.add(avaliacao3);
        listaDePerfumes.add(avaliacao4);

        Collections.sort(listaDePerfumes);
        //Lista de perfumes ordenados
        System.out.println("A lista de nome ordenados são:"+ listaDePerfumes);

        //Ordenando pela nota do perfume
        listaDePerfumes.sort(Comparator.comparing(Perfumes::getNotaDoPerfume));


        //Lista de cremes
        ArrayList<Cremes> listaDeCremes = new ArrayList<>();
        listaDeCremes.add(avaliacao5);


        //Array que imprimi a lista dos perfumes enquanto ele possui itens na lista
        for (Perfumes itemDoArrayDoPerfume : listaDePerfumes) {

            System.out.println();




            if (itemDoArrayDoPerfume.getProjecao() > 1) {
                // Você pode comparar com o itemDoArrayDoCreme

                System.out.println("Você inseriu a nota de " + itemDoArrayDoPerfume.getNotaDoPerfume() + " para o perfume" +
                        " " + itemDoArrayDoPerfume.getNome() + ".");
                // esse cara irá pegar a classificação somente se ela for maior ou igual a 1.



            } else {
                // se a classificacao não for maior que zero, ele irá imprimir o valor abaixo

                System.out.println("Não há classificacao definida para o : "+itemDoArrayDoPerfume);

            }





        }
        //Array que imprimi a lista dos cremes enquanto ele possui itens na lista
        for (Cremes itensDoArrayDoCreme : listaDeCremes){

            System.out.println();
            int classificacao = itensDoArrayDoCreme.getProjecao();
            //ou você pode definir o itansDoArrayDoCreme em um atributo e chamar ele abaixo


            if ( classificacao > 1) {
                System.out.println("Você inseriu a nota de " + itensDoArrayDoCreme.getNotaDoCreme() + " para o perfume" +
                        " " + itensDoArrayDoCreme.getNomeDoCreme() + ".");




            } else {


                System.out.println("Não há classificacao definida para o : "+ itensDoArrayDoCreme);

            }



        }



    }

}