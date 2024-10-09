package br.com.alura.screenmatch.desafio;

public class Principal {
    public static void main(String[] args) {

        System.out.println("------Conversão de dolar para real------");
        double dolarParaConversao = 500;
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        double dolarConvertido = conversorMoeda.converterDolarParaReal(dolarParaConversao);
        System.out.println("O valor convertido de $"+dolarParaConversao+" é R$"+dolarConvertido);

        System.out.println("\n------Calculo de área e perimetro------");
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        double area = calculadoraSalaRetangular.calcularArea(250,100);
        double perimetro = calculadoraSalaRetangular.calcularPerimetro(250,100);
        System.out.println("O calculo da sala retangular 250x100 é "+area+"m² de área e "+perimetro+"m de perimetro.");

        System.out.println("\n------Tabuada------");
        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(5);

        System.out.println("\n------Conversor de Temperatura------");
        double temperaturaCelsius = 22;
        double temperaturaFahrenheit = 77;
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();

        double celsiusParaFahrenheit = conversorTemperaturaPadrao.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println("A temperatura "+temperaturaCelsius+"ºC convertida é "+celsiusParaFahrenheit+"ºF");

        double fahrenheitParaCelsius = conversorTemperaturaPadrao.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println("A temperatura "+temperaturaFahrenheit+"ºF convertida é "+fahrenheitParaCelsius+"ºC");

        System.out.println("\n------Calculavel------");
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setNome("Harry Potter DVD");
        produtoFisico.setPreco(100);
        produtoFisico.setDesconto(10);
        produtoFisico.setTaxa(5);
        System.out.println("O preço final do produto "+ produtoFisico.getNome()+" é R$"+produtoFisico.calcularPrecoFinal());

        Livro livro = new Livro();
        livro.setNome("Harry Potter book");
        livro.setPreco(50);
        livro.setDesconto(5);
        livro.setTaxa(1);
        System.out.println("O preço final do produto "+ livro.getNome()+" é R$"+livro.calcularPrecoFinal());

        System.out.println("\n------Produto / Serviço------");
        Produto produto = new Produto();
        produto.setNome("Chuveiro");
        produto.setPreco(100.0);
        produto.setDesconto(3);
        produto.setQuantidade(2);
        System.out.println("O valor total do produto: "+produto.getNome()+" é de R$"+ produto.calculaPrecoTotal(produto));

        Servico servico = new Servico();
        servico.setNome("Instalação chuveiro");
        servico.setPreco(200.0);
        servico.setDesconto(5);
        servico.setQuantidade(2);
        System.out.println("O valor total do servico: "+servico.getNome()+" é de R$"+ servico.calculaPrecoTotal(servico));


    }


}
