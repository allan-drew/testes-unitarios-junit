package testesunitarios01.dominio;

import java.util.Objects;

// Essa classe NÃO será testada nos testes unitários

public class Cliente {

    private String nome;
    private int idade;
    private int transacoesTradicionais; // numero de transacoes tradicionais
    private int transacoesDigitais; // numero de transacoes digitais


    public static final class ClienteBuilder {
        private String nome;
        private int idade;
        private int transacoesTradicionais;
        private int transacoesDigitais;

        private ClienteBuilder() {
        }

        public static ClienteBuilder builder() {
            return new ClienteBuilder();
        }

        public ClienteBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public ClienteBuilder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public ClienteBuilder transacoesTradicionais(int transacoesTradicionais) {
            this.transacoesTradicionais = transacoesTradicionais;
            return this;
        }

        public ClienteBuilder transacoesDigitais(int transacoesDigitais) {
            this.transacoesDigitais = transacoesDigitais;
            return this;
        }

        public Cliente build() {
            Cliente cliente = new Cliente();
            cliente.nome = this.nome;
            cliente.idade = this.idade;
            cliente.transacoesTradicionais = this.transacoesTradicionais;
            cliente.transacoesDigitais = this.transacoesDigitais;
            return cliente;
        }
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getTransacoesTradicionais() {
        return transacoesTradicionais;
    }

    public int getTransacoesDigitais() {
        return transacoesDigitais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idade == cliente.idade && Objects.equals(nome, cliente.nome) && Objects.equals(transacoesTradicionais, cliente.transacoesTradicionais) && Objects.equals(transacoesDigitais, cliente.transacoesDigitais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, transacoesTradicionais, transacoesDigitais);
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", transacoesTradicionais=" + transacoesTradicionais +
                ", transacoesDigitais=" + transacoesDigitais +
                '}';
    }



}

