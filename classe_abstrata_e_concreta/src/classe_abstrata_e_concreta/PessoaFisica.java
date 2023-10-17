package classe_abstrata_e_concreta; // Declaração do pacote

public class PessoaFisica extends Pessoa { // Declaração da classe PessoaFisica que estende a classe abstrata Pessoa

    private String cpf; // Declaração do atributo CPF

    public PessoaFisica(String nome, String endereco, String cpf) { // Construtor da classe PessoaFisica que chama o construtor da classe pai
        super(nome, endereco); // Chamada ao construtor da classe pai com os parâmetros fornecidos
        this.cpf = cpf; // Inicialização do atributo CPF
    }

    @Override
    public String getIdentificacao() { // Implementação do método abstrato getIdentificacao da classe pai
        return getCpf(); // Retorna o CPF como identificação
    }

    public String getCpf() { // Definição do método para obter o CPF
        return cpf; // Retorno do CPF
    }
}

//Neste código, a classe PessoaFisica estende a classe abstrata Pessoa, herdando os atributos e métodos. O construtor PessoaFisica chama o construtor da classe Pessoa usando a palavra-chave super, e o método getIdentificacao é implementado para retornar o CPF.
