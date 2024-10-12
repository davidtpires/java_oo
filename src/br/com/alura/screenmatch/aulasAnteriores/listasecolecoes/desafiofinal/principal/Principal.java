package br.com.alura.screenmatch.aulasAnteriores.listasecolecoes.desafiofinal.principal;

import br.com.alura.screenmatch.aulasAnteriores.listasecolecoes.desafiofinal.modelo.CartaoDeCredito;
import br.com.alura.screenmatch.aulasAnteriores.listasecolecoes.desafiofinal.modelo.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        System.out.println("Digite o limite do cartão:");
        double limite = scanner.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        System.out.println("Limite do cartão:" + cartao.getLimite());

        while (opcao != 0){
            System.out.println("Digite a descrição da compra:");
            scanner.nextLine();
            String descricao = scanner.nextLine();
            System.out.println("Digite o valor da compra:");
            double valor = scanner.nextDouble();
            Compra compra = new Compra(descricao,valor);
            if (cartao.lancaCompras(compra)){
                System.out.println("Compra efetuada com sucesso!");
            } else {
                System.out.println("Erro na compra Saldo insuficiente!");
            }
            System.out.println("Seu saldo atual é de R$"+cartao.getSaldo());

            System.out.println("Digite 0 para sair ou 1 para continuar");
            opcao = scanner.nextInt();
        }

        Collections.sort(cartao.getCompras());
        System.out.println("***************************");
        System.out.println("COMPRAS REALIZADAS:");
        for (Compra compra : cartao.getCompras()){
            System.out.println(compra.getDescricao() + " - " + compra.getValor());
        }
        System.out.println("***************************");
    }

}
