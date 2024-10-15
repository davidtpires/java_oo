package br.com.alura.screenmatch.aulasAnteriores.javaapi.desafiopesisntindodadosarquivos.modelos;

public class Titulo {

    private String descricao;
    private int anoLancamento;
    private int duracao;

    public Titulo(String descricao, int anoLancamento, int duracao) {
        this.descricao = descricao;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
