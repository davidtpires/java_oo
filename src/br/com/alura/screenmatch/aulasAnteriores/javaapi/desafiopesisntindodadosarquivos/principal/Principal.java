package br.com.alura.screenmatch.aulasAnteriores.javaapi.desafiopesisntindodadosarquivos.principal;
import br.com.alura.screenmatch.aulasAnteriores.javaapi.desafiopesisntindodadosarquivos.modelos.Veiculo;
import com.google.gson.Gson;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {


// 1)
//        String data = "Conteúdo a ser gravado no arquivo.";
//
//        try (FileWriter writer = new FileWriter("arquivo.txt")) {
//            writer.write(data);
//            System.out.println("Dados gravados com sucesso.");
//        } catch (IOException e){
//            e.printStackTrace();
//        }

//      2) e 3)
//        Gson gson = new GsonBuilder()
//                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
//                .setPrettyPrinting()
//                .create();
//
//        Titulo titulo = new Titulo("matrix", 2000, 160);
//        FileWriter escrita = new FileWriter("filmesDesafio.json");
//        escrita.write(gson.toJson(titulo));
//        escrita.close();
//
//        String json = gson.toJson(titulo);
//        System.out.println(json);

//      4)

        // Crie uma instância do objeto Veiculo
        Veiculo carro = new Veiculo();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAnoFabricacao(2022);
        carro.setPreco(75000.00);

        Gson gson = new Gson();
        String jsonVeiculo = gson.toJson(carro);

        // Imprima o JSON resultante
        System.out.println("Objeto Veiculo serializado para JSON:");
        System.out.println(jsonVeiculo);


    }
}
