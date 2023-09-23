package testesunitarios01.service;

import org.junit.jupiter.api.Test;
import testesunitarios01.dominio.Cliente;

import static org.junit.jupiter.api.Assertions.*;

class ClienteServiceTest {

    @Test
    void isExclDigital_ReturnTrue_WhenDigitalIsAboveOrEquals95Percent() {

        Cliente cliente = Cliente.ClienteBuilder.builder()
                .transacoesDigitais(120)
                .transacoesTradicionais(5)
                .build();

        ClienteService clienteService = new ClienteService();

        // é esperado que o resultado seja TRUE se passarmos o cliente cujo numero de transacoes
        // digitais seja 120 e tradicionais sejam 5
        assertEquals(true, clienteService.isExclDigital(cliente));

    }


    @Test
    void isExclDigital_ReturnFalse_WhenDigitalIsBelow95Percent() {

        Cliente cliente = Cliente.ClienteBuilder.builder()
                .transacoesDigitais(120)
                .transacoesTradicionais(10)
                .build();

        ClienteService clienteService = new ClienteService();

        assertEquals(false, clienteService.isExclDigital(cliente));

    }


    @Test
    void isExclDigital_ThrowException_WhenClienteIsNull() {

        ClienteService clienteService = new ClienteService();

        // testando se dispara NullPointerException
        assertThrows(NullPointerException.class, () -> clienteService.isExclDigital(null));

    }


}

