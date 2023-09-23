package testesunitarios01.test;

import testesunitarios01.dominio.Cliente;
import testesunitarios01.service.ClienteService;

// Essa classe NÃO será testada nos testes unitários

public class ClienteTest01 {

    public static void main(String[] args) {

        Cliente joaozinho = Cliente.ClienteBuilder.builder()
                .nome("João")
                .idade(45)
                .transacoesTradicionais(5)
                .transacoesDigitais(120)
                .build();

        ClienteService clienteService = new ClienteService();

        boolean exclDigital = clienteService.isExclDigital(joaozinho);
        System.out.println("este cliente é exclusivamente digital?  " + exclDigital);


    }

}
