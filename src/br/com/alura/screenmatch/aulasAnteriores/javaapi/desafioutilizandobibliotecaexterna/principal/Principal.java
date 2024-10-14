package br.com.alura.screenmatch.aulasAnteriores.javaapi.desafioutilizandobibliotecaexterna.principal;

import br.com.alura.screenmatch.aulasAnteriores.javaapi.desafioutilizandobibliotecaexterna.model.Livro;
import com.google.gson.Gson;

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
