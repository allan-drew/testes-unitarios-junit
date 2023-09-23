package testesunitarios01.service;

import testesunitarios01.dominio.Cliente;
import java.util.Objects;


// Essa classe SERÁ TESTADA nos testes unitários (src -> test -> java)

public class ClienteService {

    // Regra de negócio para o cliente ser considerado um cliente exclusivamente digital
    public boolean isExclDigital (Cliente cliente) {

        // o requireNonNull dispara um NullPointerException se for nulo
        Objects.requireNonNull(cliente, "O cliente não pode ser null!");
//        if (cliente == null) {
//            throw new IllegalArgumentException();
//        }


        // pela regra de negócio definida, caso o cliente tenha 95% ou mais de transacoes digitais
        // então ele será considerado um "cliente exclusivo digital"
        return cliente.getTransacoesDigitais() / (double)(cliente.getTransacoesTradicionais() + cliente.getTransacoesDigitais()) >= 0.95 ? true: false;

    }


}



