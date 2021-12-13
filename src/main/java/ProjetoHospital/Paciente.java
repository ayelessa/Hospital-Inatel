package ProjetoHospital;

public class Paciente extends Cadastravel{

    private String cpf;
    private String sexo;

    public Paciente(String nome, int idade, String endereco, String telefone, String sexo, String cpf) {
        super(nome, idade, endereco, telefone);
        this.sexo = sexo;
        this.cpf = cpf;
    }


    void mostraInfo(){
        System.out.println("CPF : " + cpf);
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
        System.out.println("ENDEREÇO: " + endereco);
        System.out.println("TELEFONE: " + telefone);
        System.out.println("SEXO: " + sexo);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

}
