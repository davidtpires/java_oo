package br.com.alura.screenmatch.aulasAnteriores.desafioconstruindoobjetos;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, double quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
