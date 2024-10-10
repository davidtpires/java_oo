package br.com.alura.screenmatch.aulasAnteriores.listasecolecoes.desafio;

public class ProdutoFisico implements Calculavel{
    private String nome;
    private double preco;
    private double desconto;
    private double taxa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - taxa - desconto;
    }
}
