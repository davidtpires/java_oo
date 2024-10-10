package br.com.alura.screenmatch.aulasAnteriores.listasecolecoes.desafioordenandodados.principal;

import br.com.alura.screenmatch.aulasAnteriores.listasecolecoes.desafioordenandodados.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(5);
        lista.add(7);
        lista.add(11);
        lista.add(4);
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);

        Titulo t1 = new Titulo("Azul");
        Titulo t2 = new Titulo("Vermelho");
        Titulo t3 = new Titulo("Branco");

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(t1);
        titulos.add(t2);
        titulos.add(t3);
        Collections.sort(titulos);
        System.out.println(titulos);

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);


        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);

    }
}
