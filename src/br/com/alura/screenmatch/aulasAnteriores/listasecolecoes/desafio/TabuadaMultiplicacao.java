package br.com.alura.screenmatch.aulasAnteriores.listasecolecoes.desafio;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Mostrando a tabuada do número "+numero);
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + "*" + i + " = " + resultado);
        }
    }
}
