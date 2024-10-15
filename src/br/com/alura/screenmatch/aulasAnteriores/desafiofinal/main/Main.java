package br.com.alura.screenmatch.aulasAnteriores.desafiofinal.main;

import br.com.alura.screenmatch.aulasAnteriores.desafiofinal.model.ConsultaCep;
import br.com.alura.screenmatch.aulasAnteriores.desafiofinal.model.Endereco;
import br.com.alura.screenmatch.aulasAnteriores.desafiofinal.model.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Bem-vindo ao busca CEP!");
        System.out.println("Digite um CEP para busca: (somente numeros)");
        var cep = scanner.nextLine();

        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}
