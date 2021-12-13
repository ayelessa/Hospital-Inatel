package ProjetoHospital;

public class Medico extends Cadastravel{

    private String crm;
    private String email;
    private String senha;

    public Medico(String nome, int idade, String endereco, String telefone, String email, String crm, String senha) {
        super(nome, idade, endereco, telefone);
        this.crm = crm;
        this.email = email;
        this.senha = senha;
    }


    void mostraInfo() {
        System.out.println("CRM: " + crm);
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
        System.out.println("ENDEREÇO: " + endereco);
        System.out.println("TELEFONE: " + telefone);
        System.out.println("E-MAIL: " + email);
    }

    public String getCrm() {
        return crm;
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

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }


}
