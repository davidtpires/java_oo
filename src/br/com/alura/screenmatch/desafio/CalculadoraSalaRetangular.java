package br.com.alura.screenmatch.desafio;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public double calcularArea(double comprimento, double largura) {
        return comprimento * largura;
    }

    @Override
    public double calcularPerimetro(double comprimento, double largura) {
        return 2 *(comprimento + largura);
    }
}
