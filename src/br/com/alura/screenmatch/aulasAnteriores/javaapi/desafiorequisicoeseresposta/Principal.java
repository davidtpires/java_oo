package br.com.alura.screenmatch.aulasAnteriores.javaapi.desafiorequisicoeseresposta;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Principal {
    public void acessaAPI(String endereco) throws IOException, InterruptedException {

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        //API GOOGLE BOOK
        var busca = "matrix";
        var key = "AIzaSyDUKDt_4fEzVz5OUGpWINgcDPtjyKH4Da0";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q="+busca+"&key=" + key;

        //API COINGECKO
        var criptoNome  = "bitcoin";
        endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptoNome + "&vs_currencies=usd";

        //API
        busca = "rice";
        endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + busca;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }



}
