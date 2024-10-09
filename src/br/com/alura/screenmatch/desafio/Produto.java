package br.com.alura.screenmatch.desafio;

public class Produto extends Item implements Vendavel{

    @Override
    public double calculaPrecoTotal(Item item) {
        return (item.getPreco() - item.getDesconto()) * item.getQuantidade();
    }
}