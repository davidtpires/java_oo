package br.com.alura.screenmatch.aulasAnteriores.listasecolecoes.desafioconstruindoobjetos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("Arroz", 35.0, 5);
        Produto produto2 = new Produto("Feijão", 7.0, 5);
        Produto produto3 = new Produto("Oleo", 5.0, 5);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("O tamanho do array produto é de " + produtos.size());
        System.out.println("O primeiro produto é " + produtos.get(0));

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 5.0, 10,"10/11/2024");
        System.out.println(produtoPerecivel);

    }
}
