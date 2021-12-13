package ProjetoHospital;
public abstract class Cadastravel {


    protected String nome;
    protected int idade;
    protected String endereco;
    protected String telefone;
    protected String email;

    public Cadastravel(String nome, int idade, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;

    }
}