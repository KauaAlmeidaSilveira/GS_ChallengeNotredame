package com.fiap.GSnotredame.repository;

import com.fiap.GSnotredame.entities.*;
import com.fiap.GSnotredame.entities.associative.GrupoApoio_Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repository {

    private List<Conta> contas = new ArrayList<>();
    private List<MarcaParceira> marcasParceiras = new ArrayList<>();
    private List<GrupoDeApoio> gruposDeApoio = new ArrayList<>();
    private List<Endereco> enderecos = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Postagem> postagens = new ArrayList<>();
    private List<CicloMenstrual> ciclosMenstruais = new ArrayList<>();
    private List<Sintoma> sintomas = new ArrayList<>();
    private List<GrupoApoio_Usuario> grupoApoio_usuarios = new ArrayList<>();

    public Repository() {
        // Endereco padrao
        Endereco endereco = new Endereco(333L, "rua teste", "sp", "4532345", "BR");
        enderecos.add(endereco);

        // User padrao
        Usuario user = new Usuario(16581465168L, "kaua", "masc", "nao", endereco);
        usuarios.add(user);

        // Conta padrao adm
        contas.add(new Conta(111L, "adm@", "2011", "sim", user));

        // Conta padrao sem adm
        contas.add(new Conta(222L, "kaua@", "2011", "nao", user));

        // Grupos de apoio
        GrupoDeApoio gpA_01 = new GrupoDeApoio(111L, "Casa 1", "11 98989-8958",
                "LGBTQIA+",
                "A Casa 1 é uma organização brasileira que oferece suporte para a população LGBTQIA+, incluindo mulheres trans.",
                endereco
        );

        GrupoDeApoio gpA_02 = new GrupoDeApoio(112L, "Transgender Equality", "11 94632-8958",
                "Pessoas Trans",
                "uma organização dos Estados Unidos dedicada a advogar pelos direitos das pessoas trans",
                endereco
        );

        GrupoDeApoio gpA_03 = new GrupoDeApoio(113L, "ILGA World", "11 94632-4685",
                "Lésbicas, Gays, Bissexuais, Trans e Intersex",
                "uma organização global que defende os direitos LGBTQIA+. Eles conectam ativistas em todo o mundo e fornecem recursos, incluindo informações sobre grupos de apoio locais para mulheres trans e outras pessoas LGBTQIA+.",
                endereco
        );

        List<GrupoDeApoio> gpA_All = new ArrayList<>(List.of(gpA_01, gpA_02, gpA_03));
        gruposDeApoio.addAll(gpA_All);


    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<MarcaParceira> getMarcasParceiras() {
        return marcasParceiras;
    }

    public List<GrupoDeApoio> getGruposDeApoio() {
        return gruposDeApoio;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }

    public List<CicloMenstrual> getCiclosMenstruais() {
        return ciclosMenstruais;
    }

    public List<Sintoma> getSintomas() {
        return sintomas;
    }

    public List<GrupoApoio_Usuario> getGrupoApoio_usuarios() {
        return grupoApoio_usuarios;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void adicionarMarcasParceiras(MarcaParceira marca) {
        marcasParceiras.add(marca);
    }

    public void adicionarGrupoDeApoio(GrupoDeApoio grupo) {
        gruposDeApoio.add(grupo);
    }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarPostagem(Postagem postagem) {
        postagens.add(postagem);
    }

    public void adicionarCicloMenstrual(CicloMenstrual ciclo) {
        ciclosMenstruais.add(ciclo);
    }

    public void adicionarSintoma(Sintoma sintoma) {
        sintomas.add(sintoma);
    }

    public void adcionarGrupoApoio_Usuario(GrupoApoio_Usuario grupoApoioUsuario) {
        grupoApoio_usuarios.add(grupoApoioUsuario);
    }

    public static Conta verificarContaExiste(Repository repository, String email) {
        for (Conta conta : repository.getContas()) {
            if (conta.getEmail().equals(email)) {
                return conta;
            }
        }
        return null;
    }

    public static void listarContas(Repository repository) {
        repository.getContas().forEach(conta -> {
            System.out.println("\n===");
            System.out.println(conta);
            System.out.println("\n===");
        });
    }

    public static void listarUsuarios(Repository repository) {
        repository.getUsuarios().forEach(usuario -> {
            System.out.println("\n===");
            System.out.println(usuario);
            System.out.println("\n===");
        });
    }

    public static void listarPostagens(Repository repository) {
        repository.getPostagens().forEach(postagem -> {
            System.out.println("\n===");
            System.out.println(postagem);
            System.out.println("\n===");
        });
    }

    public static void listarMarcasParceiras(Repository repository) {
        repository.getMarcasParceiras().forEach(marcaParceira -> {
            System.out.println("\n===");
            System.out.println(marcaParceira);
            System.out.println("\n===");
        });
    }

    public static void listarGruposDeApoio(Repository repository) {
        repository.getGruposDeApoio().forEach(grupoDeApoio -> {
            System.out.println("\n===");
            System.out.println(grupoDeApoio);
            System.out.println("\n===");
        });
    }

    public static void realizarPostagem(Repository repository, Scanner sc) {

        System.out.print("Digite seu email: ");
        String email = sc.nextLine();

        Conta conta = verificarContaExiste(repository, email);

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


    }

    public static void inserirGrupoDeApoio(Repository repository, Scanner sc) {

        System.out.print("Digite o nome do grupo: ");
        String nome = sc.nextLine();

        System.out.print("Digite o telefone do grupo: ");
        String telefone = sc.nextLine();

        System.out.print("Digite o publico alvo: ");
        String publicoAlvo = sc.nextLine();

        System.out.print("Digite a descrição do grupo: ");
        String descricao = sc.nextLine();

        System.out.println("Sobre o endereço do grupo !!");

        System.out.print("Digite a rua: ");
        String rua = sc.nextLine();

        System.out.print("Digite a cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Digite o CEP: ");
        String cep = sc.nextLine();

        System.out.print("Digite o país: ");
        String pais = sc.nextLine();

        Endereco endereco = new Endereco(323L, rua, cidade, cep, pais);

        GrupoDeApoio grupoDeApoio = new GrupoDeApoio(123L, nome, telefone, publicoAlvo, descricao, endereco);

        repository.adicionarEndereco(endereco);
        repository.adicionarGrupoDeApoio(grupoDeApoio);

        System.out.print("Grupo cadastrado !!");

    }

    public static void registrarParceria(Repository repository, Scanner sc) {

        System.out.print("Digite o nome da marca parceira: ");
        String nome = sc.nextLine();

        System.out.print("Digite o segmento da marca: ");
        String segmento = sc.nextLine();

        System.out.print("Tem o link, do site ou rede social, da marca ? (Sim/Não): ");
        String temLink = sc.nextLine();

        String link = null;
        if (temLink.toUpperCase().charAt(0) == 'S') {
            System.out.println("Link: ");
            link = sc.nextLine();
        }

        MarcaParceira marcaParceira = new MarcaParceira(45L, nome, segmento, link);

        repository.adicionarMarcasParceiras(marcaParceira);

        System.out.println("Marca registrada !!");

    }

    public static void inscreverEmGrupoApoio(Repository repository, Scanner sc) {

    }

}
