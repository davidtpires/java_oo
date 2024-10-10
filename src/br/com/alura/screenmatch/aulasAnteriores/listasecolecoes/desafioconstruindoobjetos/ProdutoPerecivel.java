package br.com.alura.screenmatch.aulasAnteriores.listasecolecoes.desafioconstruindoobjetos;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, double quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
