package br.com.alura.screenmatch.aulasAnteriores.javaapi.desafiolidandocomexcecoes;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Informe o primeiro nr:");
//        int n1 = scanner.nextInt();
//        System.out.println("Informe o segundo nr:");
//        int n2 = scanner.nextInt();
//
//        try {
//            double resultado = n1 / n2;
//            System.out.println("A divisão do "+n1+" por "+n2+" é igual a "+ resultado);
//        } catch (ArithmeticException  e) {
//            System.out.println("Erro: Divisão por zero não permitida.");
//        }

//        System.out.println("Digite uma senha:");
//        String senha = scanner.nextLine();
//
//        try {
//            validaSenha(senha);
//            System.out.println("Senha válida. Acesso autorizado!");
//        } catch (SenhaInvalidaException e){
//            System.out.println(e.getMessage());
//        }

        System.out.println("Digite um usuário para consultar o GitHub:");
        String username = scanner.nextLine();

        String endereco = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();
            System.out.println(json);

            // Adicione aqui o código para processar o JSON e exibir as informações desejadas
        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }




    }

    private static void validaSenha(String senha){
        if (senha.length() < 8){
            throw new SenhaInvalidaException("Senha inválida, deve possuir pelo menos 8 caracteres");
        }
    }
}
