package br.com.alura.screenmatch.aulas.calculos;

import br.com.alura.screenmatch.aulas.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
