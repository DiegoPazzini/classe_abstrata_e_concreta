package classe_abstrata_e_concreta; // Declaração do pacote

import java.util.Scanner; // Importação da classe Scanner para entrada de dados

public abstract class Pessoa { // Declaração da classe abstrata Pessoa
    private String nome; // Declaração do atributo nome
    private String endereco; // Declaração do atributo endereço
    private String cpf; // Declaração do atributo CPF

    public Pessoa(String nome, String endereco, String cpf) { // Construtor da classe Pessoa
        this.nome = nome; // Inicialização do atributo nome
        this.endereco = endereco; // Inicialização do atributo endereço
        this.cpf = cpf; // Inicialização do atributo CPF
    }

    public abstract String getIdentificacao(); // Declaração do método abstrato getIdentificacao

    public String getNome() { // Definição do método para obter o nome
        return nome; // Retorno do nome
    }

    public String getEndereco() { // Definição do método para obter o endereço
        return endereco; // Retorno do endereço
    }

    public String getCpf() { // Definição do método para obter o CPF
        return cpf; // Retorno do CPF
    }

    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner para entrada de dados

        System.out.print("Digite o nome: "); // Solicitação para digitar o nome
        String nome = scanner.nextLine(); // Leitura do nome fornecido

        System.out.print("Digite o endereço: "); // Solicitação para digitar o endereço
        String endereco = scanner.nextLine(); // Leitura do endereço fornecido

        System.out.print("Digite o CPF: "); // Solicitação para digitar o CPF
        String cpf = scanner.nextLine(); // Leitura do CPF fornecido

        Pessoa pessoa = new Pessoa(nome, endereco, cpf) { // Criação de um objeto Pessoa com os valores fornecidos
            @Override
            public String getIdentificacao() { // Implementação do método abstrato getIdentificacao
                return getCpf(); // Retorna o CPF
            }
        };

        System.out.println("Nome: " + pessoa.getNome()); // Impressão do nome
        System.out.println("Endereço: " + pessoa.getEndereco()); // Impressão do endereço
        System.out.println("CPF: " + pessoa.getCpf()); // Impressão do CPF

        scanner.close(); // Fechamento do scanner
    }
}

