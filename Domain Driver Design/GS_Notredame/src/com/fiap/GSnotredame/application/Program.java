package com.fiap.GSnotredame.application;

import com.fiap.GSnotredame.entities.*;
import com.fiap.GSnotredame.repository.Repository;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Repository repository = new Repository();

        System.out.println("Bem vindo, somos a CareCicle !!");
        System.out.print("Ja possui uma conta ? (Sim/Não): ");
        String temConta = sc.nextLine();

        while (true) {

            if (temConta.toUpperCase().charAt(0) == 'S') {
                login(repository, sc);
                break;

            } else if (temConta.toUpperCase().charAt(0) == 'N') {
                cadastrar(repository, sc);
                break;

            } else {
                System.out.println("\nDesculpa não entendi.");
                System.out.print("Ja possui uma conta ? (Sim/Não): ");
                temConta = sc.nextLine();
            }
        }

        sc.close();
    }

    private static void menuConta(Scanner sc, Repository repository) {
        while (true) {
            System.out.println("\nMenu:\n" +
                    "1 - Adicionar um ciclo menstrual\n" +
                    "2 - Mostrar os grupos de apoio\n" +
                    "3 - Participar de um grupo de apoio\n" +
                    "4 - Listar grupos de apoio que faço parte\n" +
                    "5 - Meus ciclos\n" +
                    "6 - Hospital mais perto de mim\n" +
                    "7 - Sair");

            System.out.print("Informe o que deseja fazer de acordo com o número das opções: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 7) {
                System.out.print("\nTudo bem, até a próxima! Bye");
                break;
            }

            switch (opcao) {
                case 1:
                    repository.adicionarCicloMenstrual(repository, sc);
                    break;

                case 2:
                    repository.listarGruposDeApoio(repository);
                    break;

                case 3:
                    repository.inscreverEmGrupoApoio(repository, sc);
                    break;

                case 4:
                    repository.listarGruposApoioUsuario(repository);
                    break;

                case 5:
                    repository.listarCiclosMentruaisConta(repository);
                    break;

                case 6:
                    hospitalMaisPerto(repository);
                    break;

                default:
                    System.out.print("Opção não reconhecida");
            }
        }
    }

    private static void menuContaADM(Scanner sc, Repository repository) {
        while (true) {
            System.out.println("\nMenu:\n" +
                    "1 - Realizar uma publicação\n" +
                    "2 - Inserir um novo grupo de apoio\n" +
                    "3 - Registrar nova marca parceira\n" +
                    "4 - Listar todas os postagens\n" +
                    "5 - Listar todos os grupos de apoio\n" +
                    "6 - Listar todas as marcas parceiras\n" +
                    "7 - Inserir um novo grupo de apoio\n\n" +

                    "8 - Listar todos os usuarios\n" +
                    "9 - Listar todas as contas\n" +
                    "10 - Listar todas as contas administrativas\n" +

                    "11 - Sair");
            System.out.print("Informe o que deseja fazer de acordo com o número das opções: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 11) {
                System.out.print("\nTudo bem, até a próxima! Bye");
                break;
            }

            switch (opcao) {
                case 1:
                    repository.realizarPostagem(repository, sc);
                    break;

                case 2:
                    repository.inserirGrupoDeApoio(repository, sc);
                    break;

                case 3:
                    repository.registrarParceria(repository, sc);
                    break;

                case 4:
                    repository.listarPostagens(repository);
                    break;

                case 5:
                    repository.listarGruposDeApoio(repository);
                    break;

                case 6:
                    repository.listarMarcasParceiras(repository);
                    break;

                case 7:
                    repository.listarCiclosMentruais(repository);
                    break;

                case 8:
                    repository.listarUsuarios(repository);
                    break;

                case 9:
                    repository.listarContas(repository);
                    break;

                case 10:
                    repository.listarContasAdminstrativas(repository);
                    break;

                default:
                    System.out.print("Opção não reconhecida");
            }
        }
    }

    private static void login(Repository repository, Scanner sc) {


        System.out.println("\n=== Login ===");

        while (true) {

            System.out.print("Digite seu email: ");
            String email = sc.nextLine();

            Conta conta = repository.verificarContaExiste(repository, email);

            if (conta != null) {

                System.out.print("Digite sua senha: ");
                String senha = sc.nextLine();

                if (conta.getSenha().equals(senha)) {
                    repository.setContaAtual(conta);
                    System.out.println("\nLogin realizado com sucesso !!");
                    if (conta.getAdministrador().toUpperCase().charAt(0) == 'S') {
                        menuContaADM(sc, repository);
                    } else {
                        menuConta(sc, repository);
                    }
                    break;
                } else {
                    while (true) {
                        System.out.print("Digite sua senha novamente: ");
                        senha = sc.nextLine();

                        if (conta.getSenha().equals(senha)) {
                            System.out.println("\nLogin realizado com sucesso !!");
                            if (conta.getAdministrador().toUpperCase().charAt(0) == 'S') {
                                menuContaADM(sc, repository);
                            } else {
                                menuConta(sc, repository);
                            }
                            break;
                        }
                    }
                    break;
                }

            } else {
                System.out.println("\nCadastro não encontrado. Tente novamente !");
            }
        }
    }

    private static void cadastrar(Repository repository, Scanner sc) {

        System.out.println("\nCerto, vou te fazer algumas perguntas sobre seus dados !!");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu cpf: ");
        long cpf = sc.nextLong();

        sc.nextLine();
        System.out.print("Digite seu gênero: ");
        String genero = sc.nextLine();

        System.out.print("Tem um convenio (sim/não) ? ");
        String convenio = sc.nextLine();

        if (convenio.toUpperCase().charAt(0) == 'S') {
            System.out.print("Qual o nome? ");
            convenio = sc.nextLine();
        }

        System.out.print("Digite o nome da sua rua: ");
        String rua = sc.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Digite seu CEP: ");
        String cep = sc.nextLine();

        System.out.print("Digite seu país: ");
        String pais = sc.nextLine();

        Usuario usuario = new Usuario(cpf, nome, genero, convenio, new Endereco(1L, rua, cidade, cep, pais));

        System.out.println("\nCerto, vamos criar sua conta !!");

        System.out.print("Digite seu email: ");
        String email = sc.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        Conta conta = new Conta(1L, email, senha, "nao", usuario);

        repository.getUsuarios().add(usuario);
        repository.getContas().add(conta);

        System.out.println("Cadastro realizado com sucesso !!\n");

        login(repository, sc);

    }

    private static void hospitalMaisPerto(Repository repository){

        Endereco endereco = new Endereco(456L, "Rua Pedro Souza Alves 92", "São Paulo", "53394-083", "BR");

        System.out.println("A partir do seu endereço, " + repository.getContaAtual().getUsuario().getEndereco().getRua() +
                ", encontramos o hospital Ventura localizado no endereço, " + endereco.getRua());

    }

}