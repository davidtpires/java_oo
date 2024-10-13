package br.com.alura.screenmatch.aulasAnteriores.desafioutilizandobibliotecaexterna.principal;

import br.com.alura.screenmatch.aulasAnteriores.desafioutilizandobibliotecaexterna.model.Livro;
import br.com.alura.screenmatch.aulasAnteriores.desafioutilizandobibliotecaexterna.model.Pessoa;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
//        1)
//        String jsonPessoa = """
//          {
//            "nome" : "João",
//            "idade" : 30,
//            "cidade" : "Rio Verde"
//          }
//        """;
//
//        System.out.println(jsonPessoa);
//        Gson gson = new Gson();
//        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
//        System.out.println("Objeto Pessoa: " + pessoa);

//        2)

//        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";
//
//        Gson gson = new GsonBuilder().setLenient().create();
//        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
//
//        System.out.println("Objeto Pessoa: " + pessoa);

//        3)
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto Livro: " + livro);
    }



}
