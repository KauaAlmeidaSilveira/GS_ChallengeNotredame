package com.fiap.GSnotredame;

import com.fiap.GSnotredame.entities.Conta;
import com.fiap.GSnotredame.entities.Postagem;
import com.fiap.GSnotredame.entities.Usuario;
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
                System.out.print("Deseja realizar um cadastro ? ");
                String realizarCadastro = sc.nextLine();

                if (realizarCadastro.toUpperCase().charAt(0) == 'S') {
                    cadastrar(repository, sc);
                } else {
                    menu(sc, repository);
                }

                break;

            } else {
                System.out.println("\nDesculpa não entendi.");
                System.out.print("Ja possui uma conta ? (Sim/Não): ");
                temConta = sc.nextLine();
            }
        }

        sc.close();
    }

    private static void menu(Scanner sc, Repository repository) {
        /*while (true) {
            System.out.println("\nMenu:\n" +
                    "1 - Login\n" +
                    "2 - Cadastrar\n\n" +

                    "3 - Realizar uma publicação\n\n" +

                    "4 - Listar todos os usuarios\n" +
                    "5 - Listar todas as contas\n" +
                    "6 - Listar todas as publicações\n\n" +

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
                    login(repository, sc);
                    break;

                case 2:
                    cadastrar(repository, sc);
                    break;

                case 3:
                    realizarPostagem(repository, sc);

                    break;

                case 4:
                    listarUsuarios(repository);
                    break;

                case 5:
                    listarContas(repository);
                    break;

                case 6:
                    listarPostagens(repository);
                    break;

                default:
                    System.out.print("Opção não reconhecida");
            }
        }*/
        System.out.println("MENU SEM CONTA");
    }

    private static void menuConta(Scanner sc, Repository repository, Conta conta) {
        /*while (true) {
                System.out.println("\nMenu:\n" +
                        "1 - Login\n" +
                        "2 - Cadastrar\n\n" +

                        "3 - Realizar uma publicação\n\n" +

                        "4 - Listar todos os usuarios\n" +
                        "5 - Listar todas as contas\n" +
                        "6 - Listar todas as publicações\n\n" +

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
                        login(repository, sc);
                        break;

                    case 2:
                        cadastrar(repository, sc);
                        break;

                    case 3:
                        realizarPostagem(repository, sc);

                        break;

                    case 4:
                        listarUsuarios(repository);
                        break;

                    case 5:
                        listarContas(repository);
                        break;

                    case 6:
                        listarPostagens(repository);
                        break;

                    default:
                        System.out.print("Opção não reconhecida");
                }
        }*/
        System.out.println("MENU COM CONTA SEM ADM");
    }

    private static void menuContaADM(Scanner sc, Repository repository, Conta conta) {
        /*while (true) {
                System.out.println("\nMenu:\n" +
                        "1 - Login\n" +
                        "2 - Cadastrar\n\n" +

                        "3 - Realizar uma publicação\n\n" +

                        "4 - Listar todos os usuarios\n" +
                        "5 - Listar todas as contas\n" +
                        "6 - Listar todas as publicações\n\n" +

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
                        login(repository, sc);
                        break;

                    case 2:
                        cadastrar(repository, sc);
                        break;

                    case 3:
                        realizarPostagem(repository, sc);

                        break;

                    case 4:
                        listarUsuarios(repository);
                        break;

                    case 5:
                        listarContas(repository);
                        break;

                    case 6:
                        listarPostagens(repository);
                        break;

                    default:
                        System.out.print("Opção não reconhecida");
                }
        }*/
        System.out.println("MENU COM CONTA ADM");
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

        Usuario usuario = new Usuario(cpf, nome, genero, convenio);

        System.out.println("\nCerto, vamos criar sua conta !!");

        System.out.print("Digite seu email: ");
        String email = sc.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        Conta conta = new Conta(1L, email, senha, "nao", usuario);

        repository.adicionarUsuario(usuario);
        repository.adicionarConta(conta);

        System.out.println("Cadastro realizado com sucesso !!\n");

        login(repository, sc);

    }

    private static void login(Repository repository, Scanner sc) {
        System.out.println("\n=== Login ===");

        while (true) {

            System.out.print("Digite seu email: ");
            String email = sc.nextLine();

            Conta conta = verificarContaExiste(repository, email);

            if (conta != null) {

                System.out.print("Digite sua senha: ");
                String senha = sc.nextLine();

                if (conta.getSenha().equals(senha)) {
                    System.out.println("\nLogin realizado com sucesso !!");
                    if (conta.getAdministrador().toUpperCase().charAt(0) == 'S') {
                        menuContaADM(sc, repository, conta);
                    } else {
                        menuConta(sc, repository, conta);
                    }
                    break;
                } else {
                    while (true) {
                        System.out.print("Digite sua senha novamente: ");
                        senha = sc.nextLine();

                        if (conta.getSenha().equals(senha)) {
                            System.out.println("\nLogin realizado com sucesso !!");
                            if (conta.getAdministrador().toUpperCase().charAt(0) == 'S') {
                                menuContaADM(sc, repository, conta);
                            } else {
                                menuConta(sc, repository, conta);
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

    public static Conta verificarContaExiste(Repository repository, String email) {
        for (Conta conta : repository.getContas()) {
            if (conta.getEmail().equals(email)) {
                return conta;
            }
        }
        return null;
    }

    private static void listarContas(Repository repository) {
        repository.getContas().forEach(conta -> {
            System.out.println("\n===");
            System.out.println(conta);
            System.out.println("\n===");
        });
    }

    private static void listarUsuarios(Repository repository) {
        repository.getUsuarios().forEach(usuario -> {
            System.out.println("\n===");
            System.out.println(usuario);
            System.out.println("\n===");
        });
    }

    private static void listarPostagens(Repository repository) {
        repository.getPostagens().forEach(postagem -> {
            System.out.println("\n===");
            System.out.println(postagem);
            System.out.println("\n===");
        });
    }

    public static void realizarPostagem(Repository repository, Scanner sc) {

        System.out.print("Digite seu email: ");
        String email = sc.nextLine();

        Conta conta = verificarContaExiste(repository, email);

        if (conta != null) {
            if (conta.getAdministrador().equals("SIM")) {

                System.out.println("Vamos realizar uma publicação !");

                System.out.print("Qual o título da sua postagem ? ");
                String titulo = sc.nextLine();

                System.out.print("Digite a descrição: ");
                String descricao = sc.nextLine();

                System.out.print("Digite o texto da sua postagem: ");
                String texto = sc.nextLine();

                System.out.print("Possui imagem (Sim/Não)? ");
                String imagem = sc.nextLine();

                if (imagem.toUpperCase().charAt(0) == 'S') {
                    System.out.println("Digite o link: ");
                    imagem = sc.nextLine();
                } else {
                    imagem = null;
                }

                System.out.println("Postagem publicada !!");

                Postagem postagem = new Postagem(1L, titulo, descricao, texto, imagem, conta);

                repository.adicionarPostagem(postagem);

            } else {
                System.out.println("Somente administradores, podem realizar postagens !!");
            }
        } else {
            System.out.println("Conta não encontrada !!");
        }

    }

}
