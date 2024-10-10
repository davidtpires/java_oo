package br.com.alura.screenmatch.aulasAnteriores.listasecolecoes.desafio;

public class ConversorMoeda implements ConversaoFinanceira{
    double umDolarReal = 5.56;

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * umDolarReal;

    }
}
