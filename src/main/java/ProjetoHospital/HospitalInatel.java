package ProjetoHospital;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalInatel {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Inicialização do teclado
        boolean estado = true; // Variável estado em true, garantindo loop no programa

        // ArrayList de paciente
        ArrayList<Paciente> paciente = new ArrayList<>();
        // ArrayList do Médico
        ArrayList<Medico> med = new ArrayList<>();
        // ArrayList do Historico
        ArrayList<Historico> historico = new ArrayList<>();
        // ArrayList de Consultas
        ArrayList<Consulta> consulta = new ArrayList<>();

        while (estado) {
            System.out.println("");
            //Menu de opções
            System.out.println("--------- Hospital Instituto Nacional de Telecomunicações ---------");
            System.out.println("------------------------- MENU -------------------------");
            System.out.println("1- Cadastrar Paciente");
            System.out.println("2- Cadastrar médico");
            System.out.println("3- Registrar histórico");
            System.out.println("4- Marcar consulta");
            System.out.println("5- Desmarcar consulta");
            System.out.println("6- Mostrar informações");
            System.out.println("7- Deletar cadastro");
            System.out.println("8- Sair");

            int opcao = teclado.nextInt(); // Opção selecionada pelo usuário

            // Cadastro do paciente
            System.out.println("");
            if (opcao == 1) {
                teclado.nextLine();
                System.out.println("Entre com o CPF do Paciente:");
                String cpf = teclado.nextLine(); //CPF do paciente
                System.out.println("Entre com o nome do Paciente:");
                String nome = teclado.nextLine(); // Nome do ProjetoHospital.Paciente
                System.out.println("Entre com a idade:");
                int idade = teclado.nextInt(); // Idade do ProjetoHospital.Paciente
                teclado.nextLine();
                System.out.println("Entre com o sexo:");
                String sexo = teclado.nextLine(); // Sexo do ProjetoHospital.Paciente
                System.out.println("Entre com o endereço em que o paciente reside:");
                String endereco = teclado.nextLine(); // Endereço do paciente
                System.out.println("Entre com o telefone do paciente:");
                String telefone = teclado.nextLine(); // Telefone do paciente para contato

                Paciente a = new Paciente(nome, idade, endereco, telefone, sexo, cpf); // Criando um paciente e passando as informações para o construtor
                paciente.add(a); // Adicionando o paciente criado no ArrayList
            } // Cadastro do medico
            else if (opcao == 2) {
                teclado.nextLine();
                System.out.println("Entre com o CRM do Médico:");
                String crm = teclado.nextLine();
                System.out.println("Entre com o nome:");
                String nome = teclado.nextLine();
                System.out.println("Entre com a idade:");
                int idade = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Entre com o endereço:");
                String endereco = teclado.nextLine();
                System.out.println("Entre com o telefone:");
                String telefone = teclado.nextLine();
                System.out.println("Entre com o e-mail:");
                String email = teclado.nextLine();
                System.out.println("Entre com a senha:");
                String senha = teclado.nextLine();

                Medico m = new Medico(nome, idade, endereco, telefone, email, crm, senha); // Criando um novo medico e passando as informações para o construtor
                med.add(m); // Adicionando o medico criado no ArrayList
            } // Registrar histórico
            else if (opcao == 3) {

                teclado.nextLine();
                System.out.println("Entre com o CRM do Medico:");
                String crmMedico = teclado.nextLine();
                System.out.println("Entre com o CPF do paciente:");
                String cpf = teclado.nextLine();
                System.out.println("Entre com o peso do paciente:");
                float peso = teclado.nextFloat();
                teclado.nextLine();
                System.out.println("Entre com o tipo sanguíneo:");
                String tipoSanguineo = teclado.nextLine();
                System.out.println("Paciente recebeu a vacina contra a COVID? (Sim - true, Não - false");
                boolean vacinado = teclado.nextBoolean();

                Historico h = new Historico(crmMedico, peso, tipoSanguineo, vacinado, cpf); // Criando um novo historico e passando as informações para o construtor
                historico.add(h); // Adicionando o histórico no ArrayList
            } // Marcar consulta
            else if (opcao == 4) {
                teclado.nextLine();
                System.out.println("Entre com o CRM do ProjetoHospital.Medico:");
                String crmMedico = teclado.nextLine();
                System.out.println("Entre com o CPF do paciente:");
                String cpf = teclado.nextLine();
                System.out.println("Entre com a data da consulta:");
                String data = teclado.nextLine();
                System.out.println("Entre com o horário:");
                String horario = teclado.nextLine();

                Consulta c = new Consulta(crmMedico, cpf, data, horario); // Criando uma nova consulta e passando as informações para o construtor
                consulta.add(c); // Adicionando a consulta no ArrayList
            } // Desmarcar consulta
            else if (opcao == 5) {
                teclado.nextLine();
                System.out.println("Entre com o CRM do medico que atenderá o paciente: ");
                String crmMedico = teclado.nextLine();
                System.out.println("Entre com o CPF do paciente que deseja desmarcar a consulta: ");
                String cpf = teclado.nextLine();

                int j = 0; // Variável contadora para pegar a posição que se encontra a consulta no ArrayList
                int removerConsulta = -100; // Variável para salvar a posição da consulta a ser removido

                // Procura dentre todos os históricos salvos no Array qual o CRM do medico
                // e o CPF do paciente para desmarcar a consulta
                for (Consulta c : consulta) {
                    // Variáveis de comparação
                    String crmComparacao = c.getCrmMedico();
                    String cpfComparacao = c.getCpf();
                    // Se o CPF e o CRMV forem encontrados...
                    if (cpf.equals(cpfComparacao) && crmMedico.equals(crmComparacao)) {
                        // Índice salvo na variável
                        System.out.println("");
                        removerConsulta = j;
                    }
                    j++; // Incremento do j
                }

                // Se a variável 'removerConsulta' tiver sido atualizada
                if (removerConsulta != -100) {
                    // A consulta é desmarcada
                    consulta.remove(removerConsulta);
                    System.out.println("Medico removido!");
                } else {
                    System.out.println("Não encontrado para remoção!");
                }
            } // Mostrar informações
            else if (opcao == 6) {
                System.out.println("Mostrar informações de: ");
                System.out.println("1- Paciente");
                System.out.println("2- Histórico");
                System.out.println("3- Médico");
                System.out.println("4- Consulta");

                int opcaoInfo = teclado.nextInt();

                if (opcaoInfo == 1) {
                    System.out.println("");
                    teclado.nextLine();
                    System.out.println("Entre com o CPF do paciente que você deseja ver as informações: ");
                    String cpf = teclado.nextLine();

                    // Procura entre todos os animais do Array qual o CPF do dono para mostrar as informações do animal
                    for (Paciente a : paciente) {
                        // Variáveis de comparação
                        String cpfComparacao = a.getCpf();
                        // Se o CPF for encontrado...
                        if (cpf.equals(cpfComparacao)) {
                            // As informações do paciente são apresentadas
                            System.out.println("");
                            a.mostraInfo();
                        }
                    }
                } else if (opcaoInfo == 2) {
                    System.out.println("");
                    teclado.nextLine();
                    System.out.println("Entre com o CRM do medico que atendeu o paciente: ");
                    String crmMedico = teclado.nextLine();
                    System.out.println("Entre com o CPF do paciente que você deseja ver as informações: ");
                    String cpf = teclado.nextLine();

                    // Procura dentre todos os históricos salvos no Array qual o CRM do medico
                    // e o CPF do paciente para mostrar as informações do paciente
                    for (Historico h : historico) {
                        // Variáveis de comparação
                        String crmComparacao = h.getCrmMedico();
                        String cpfComparacao = h.getCpf();
                        // Se o CPF e o CRMV forem encontrados...
                        if (cpf.equals(cpfComparacao) && crmMedico.equals(crmComparacao)) {
                            // As informações do histórico são apresentadas
                            System.out.println("");
                            h.mostraInfo();
                        }
                    }
                } else if (opcaoInfo == 3) {
                    System.out.println("");
                    teclado.nextLine();
                    System.out.println("Entre com o CRM do medico que atenderá o paciente: ");
                    String crm = teclado.nextLine();

                    // Procura dentre todos os históricos salvos no Array qual o CRM do medico para mostrar as informaçõe
                    for (Medico m : med) {
                        // Variável de comparacao
                        String crmComparacao = m.getCrm();
                        // Se o CRM for encontrado...
                        if (crm.equals(crmComparacao)) {
                            // As informações do medico são apresentadas
                            System.out.println("");
                            m.mostraInfo();
                        }
                    }
                } else if (opcaoInfo == 4) {
                    System.out.println("");
                    teclado.nextLine();
                    System.out.println("Entre com o CRM do medico que atendeu o paciente: ");
                    String crmMedico = teclado.nextLine();
                    System.out.println("Entre com o CPF do paciente que você deseja ver as informações: ");
                    String cpf = teclado.nextLine();

                    // Procura dentre todos os históricos salvos no Array qual o CRM medico
                    // e o CPF do paciente para visualizar as informações da consulta
                    for (Consulta c : consulta) {
                        // Variáveis de comparação
                        String crmComparacao = c.getCrmMedico();
                        String cpfComparacao = c.getCpf();
                        // Se o CPF e o CRM forem encontrados...
                        if (cpf.equals(cpfComparacao) && crmMedico.equals(crmComparacao)) {
                            // As informações da consulta são apresentadas
                            System.out.println("");
                            c.mostraInfo();
                        }
                    }
                } else {
                    System.out.println("");
                    System.out.println("Opção indisponível!");
                }

            } // Deletar cadastro
            else if (opcao == 7) {
                System.out.println("Deletar cadastro de: ");
                System.out.println("1- Paciente");
                System.out.println("2- Histórico");
                System.out.println("3- Médico");

                int opcaoDeletar = teclado.nextInt();

                if (opcaoDeletar == 1) {
                    System.out.println("");
                    teclado.nextLine();
                    System.out.println("Entre com o CPF do paciente que você deseja remover: ");
                    String cpf = teclado.nextLine();

                    int j = 0; // Variável contadora para pegar a posição que se encontra o paciente no ArrayList
                    int removerPaciente = -100; // Variável para salvar a posição do paciente a ser removido

                    // Procura entre todos os paciente do Array qual o CPF do paciente para remover as informações do animal
                    for (Paciente a : paciente) {
                        // Variáveis de comparação
                        String cpfComparacao = a.getCpf();
                        // Se o CPF for encontrado...
                        if (cpf.equals(cpfComparacao)) {
                            System.out.println("");
                            // Índice salvo na variável
                            removerPaciente = j;
                        }
                        j++; // Incremento do j
                    }

                    // Se a variável 'removerPaciente' tiver sido atualizada
                    if (removerPaciente != -100) {
                        // O paciente é removido
                        paciente.remove(removerPaciente);
                        System.out.println("Paciente removido!");
                    } else {
                        System.out.println("Não encontrado para remoção!");
                    }
                } else if (opcaoDeletar == 2) {
                    System.out.println("");
                    teclado.nextLine();
                    System.out.println("Entre com o CRM do medico que atendeu o paciente: ");
                    String crmMedico = teclado.nextLine();
                    System.out.println("Entre com o CPF do paciente que você deseja remover: ");
                    String cpf = teclado.nextLine();

                    int j = 0; // Variável contadora para pegar a posição que se encontra o historico no ArrayList
                    int removerHistorico = -100; // Variável para salvar a posição do historico a ser removido

                    // Procura dentre todos os históricos salvos no Array qual o CRM do medico
                    // e o CPF do paciente para remover o histórico
                    for (Historico h : historico) {
                        // Variáveis de comparação
                        String crmComparacao = h.getCrmMedico();
                        String cpfComparacao = h.getCpf();
                        // Se o CPF e o CRM forem encontrados...
                        if (cpf.equals(cpfComparacao) && crmMedico.equals(crmComparacao)) {
                            System.out.println("");
                            // Índice salvo na variável
                            removerHistorico = j;
                        }
                        j++; // Incremento do j
                    }

                    // Se a variável 'removerHistorico' tiver sido atualizada
                    if (removerHistorico != -100) {
                        // O paciente é removido
                        historico.remove(removerHistorico);
                        System.out.println("Histórico removido!");
                    } else {
                        System.out.println("Não encontrado para remoção!");
                    }
                } else if (opcaoDeletar == 3) {
                    System.out.println("");
                    teclado.nextLine();
                    System.out.println("Entre com o CRM do medico que você deseja remover: ");
                    String crm = teclado.nextLine();

                    int j = 0; // Variável contadora para pegar a posição que se encontra o medico no ArrayList
                    int removerMed = -100; // Variável para salvar a posição do medico a ser removido

                    // Procura dentre todos os históricos salvos no Array qual o CRM do medico para removê-lo
                    for (Medico m : med) {
                        // Variável de comparacao
                        String crmComparacao = m.getCrm();
                        // Se o CRMV for encontrado...
                        if (crm.equals(crmComparacao)) {
                            System.out.println("");
                            // Índice salvo na variável
                            removerMed = j;
                        }
                        j++; // Incremento do j
                    }

                    // Se a variável 'removerMed' tiver sido atualizada
                    if (removerMed != -100) {
                        // O medico é removido
                        med.remove(removerMed);
                        System.out.println("Medico removido!");
                    } else {
                        System.out.println("Não encontrado para remoção!");
                    }
                } else {
                    System.out.println("");
                    System.out.println("Opção indisponível!");
                }
            } //Encerrar o sistema
            else if (opcao == 8) {
                System.out.println("Desconectando.... Obrigado pela prefeência!");
                estado = false;
            } // Entrada fora dos valores
            else {
                System.out.println("Opção incorreta! Tente novamente!");
            }
        }
    }

}
