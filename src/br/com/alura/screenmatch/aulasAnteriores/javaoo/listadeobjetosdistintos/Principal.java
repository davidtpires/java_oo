package br.com.alura.screenmatch.aulasAnteriores.javaoo.listadeobjetosdistintos;

import br.com.alura.screenmatch.aulasAnteriores.javaoo.listadeobjetosdistintos.model.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Olá");
        lista.add("Mundo");
        lista.add("Hello");
        lista.add("World");

        for (String texto : lista ){
            System.out.println(texto);
        }

        //Casting
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("O Animal é um cachorro!");
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }

        //Produtos
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Produto p1 = new Produto("Arroz", 30.0);
        Produto p2 = new Produto("Feijão", 7.0);
        Produto p3 = new Produto("Macarrão", 3.0);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        double somaDePrecoDeProdutos = 0;

        for (Produto p : produtos){
            somaDePrecoDeProdutos += p.getPreco();
        }
        double precoMedioDosProdutos = somaDePrecoDeProdutos / produtos.size();
        System.out.println("O preço médio dos produtos é R$" + precoMedioDosProdutos);

        //Calculo de area
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(4);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(quadrado);

        for (Forma forma : formas) {
            if (forma instanceof Circulo){
                System.out.println("A area do circulo é "+ forma.calcularArea());
            } else if (forma instanceof Quadrado) {
                System.out.println("A area do quadrado é "+ forma.calcularArea());
            }
        }

        //Conta Bancaria
        ContaBancaria conta1 = new ContaBancaria(1, 300.0);
        ContaBancaria conta2 = new ContaBancaria(1, 700.0);
        ContaBancaria conta3 = new ContaBancaria(1, 30000.0);
        ContaBancaria conta4 = new ContaBancaria(1, 130000.0);
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);

        ContaBancaria contaMaiorSaldo = contas.get(0);

        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("A conta com maior saldo é: " + contaMaiorSaldo);



    }
}
