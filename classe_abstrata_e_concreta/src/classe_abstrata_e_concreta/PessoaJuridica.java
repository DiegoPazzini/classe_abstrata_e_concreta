package classe_abstrata_e_concreta; // Declaração do pacote

public class PessoaJuridica extends Pessoa { // Declaração da classe PessoaJuridica que estende a classe abstrata Pessoa
    private String cnpj; // Declaração do atributo CNPJ

    public PessoaJuridica(String nome, String endereco, String cpf, String cnpj) { // Construtor da classe PessoaJuridica que chama o construtor da classe pai
        super(nome, endereco); // Chamada ao construtor da classe pai com os parâmetros fornecidos
        this.cnpj = cnpj; // Inicialização do atributo CNPJ
    }

    @Override
    public String getIdentificacao() { // Implementação do método abstrato getIdentificacao da classe pai
        return cnpj; // Retorna o CNPJ como identificação
    }
}

//Na estrutura de herança em Java, a classe pai é aquela da qual uma classe derivada herda atributos e métodos. No contexto do código fornecido, a classe pai é a classe abstrata Pessoa. A classe PessoaJuridica estende a classe Pessoa, o que significa que ela herda os métodos e atributos definidos na classe Pessoa. Ao estender a classe Pessoa, a classe PessoaJuridica herda os métodos como getNome(), getEndereco(), getTelefone() e o método abstrato getIdentificacao(), que precisa ser implementado pela classe filha. A classe Pessoa é a classe base da qual outras classes, como PessoaFisica e PessoaJuridica, podem derivar.
