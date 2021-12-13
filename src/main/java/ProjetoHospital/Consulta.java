package ProjetoHospital;

public class Consulta {

    private String crmMedico;
    private String data;
    private String cpf;
    private String horario;

    public Consulta(String crmMedico, String cpf, String data, String horario) {
        this.crmMedico = crmMedico;
        this.data = data;
        this.cpf = cpf;
        this.horario = horario;
    }

    void mostraInfo() {
        System.out.println("CRM DO MÉDICO: " + crmMedico);
        System.out.println("CPF DO PACIENTE: " + cpf);
        System.out.println("DATA: " + data);
        System.out.println("HORÁRIO: " + horario);
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public String getCpf() {
        return cpf;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

}
