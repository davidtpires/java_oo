package br.com.alura.screenmatch.aulasAnteriores.listasecolecoes.desafio;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public double celsiusParaFahrenheit(double grausCelsius) {
        return (grausCelsius * ((double) 9 / 5)) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double grausFahrenheit) {
        return (grausFahrenheit - 32) * ((double) 5 / 9);
    }
}
