package ProjetoHospital;

public class Historico {

    private String crmMedico;
    private float peso;
    private String tipoSanguineo;
    private boolean vacinado;
    private String cpf;

    public Historico(String crmMedico, float peso, String tipoSanguineo, boolean vacinado, String cpf) {
        this.crmMedico = crmMedico;
        this.peso = peso;
        this.tipoSanguineo = tipoSanguineo;
        this.vacinado = vacinado;
        this.cpf = cpf;
    }

    void mostraInfo() {
        System.out.println("CRM MÉDICO: " + crmMedico);
        System.out.println("CPF DO PACIENTE: " + cpf);
        System.out.println("PESO: " + peso + "KG");
        System.out.println("TIPO SANGUÍNEO: " + tipoSanguineo);
        if (vacinado == true) {
            System.out.println("VACINA CONTRA COVID: Sim");
        } else {
            System.out.println("VACINA CONTRA COVID: Não");
        }
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public float getPeso() {
        return peso;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public String getCpf() {
        return cpf;
    }


}
