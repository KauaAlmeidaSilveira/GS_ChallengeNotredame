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

    private Conta contaAtual = null;

    public Repository() {
        // Endereco padrao
        Endereco endereco = new Endereco(333L, "rua teste", "sp", "4532345", "BR");
        enderecos.add(endereco);

        Usuario user01 = new Usuario(16581465168L, "kaua", "masc", "nao", endereco);
        Usuario user02 = new Usuario(35468541863L, "nary", "femi", "nao", endereco);
        usuarios.addAll(List.of(user01, user02));

        // Conta padrao adm
        contas.add(new Conta(111L, "adm@", "2011", "sim", user01));

        // Conta padrao sem adm
        contas.add(new Conta(222L, "nary@", "1807", "nao", user02));

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

    public Conta getContaAtual() {
        return contaAtual;
    }

    public void setContaAtual(Conta contaAtual) {
        this.contaAtual = contaAtual;
    }

    // METODOS CONTA

    public void inscreverEmGrupoApoio(Repository repository, Scanner sc) {

        System.out.println("Grupos de apoio: ");

        listarGruposDeApoio(repository);

        System.out.print("Em qual deles deseja fazer parte ? (Digite somente o nome do grupo): ");
        String nomeGrupo = sc.nextLine();

        GrupoDeApoio grupoDeApoio = null;

        for (GrupoDeApoio gpApoio : repository.getGruposDeApoio()) {
            if (gpApoio.getNome().toUpperCase().trim().equals(nomeGrupo.toUpperCase().trim())) {
                grupoDeApoio = gpApoio;
            }
        }

        if (grupoDeApoio != null) {
            if (contaAtual != null) {
                GrupoApoio_Usuario grupoApoio_usuario = new GrupoApoio_Usuario(123L, grupoDeApoio, contaAtual.getUsuario());
                repository.getGrupoApoio_usuarios().add(grupoApoio_usuario);

                System.out.println("Agora você faz parte do grupo " + grupoDeApoio.getNome() + " !!");
            } else {
                System.out.println("Conta não encontrada !!");
            }

        } else {

            System.out.println("Grupo não encontrado !!");

        }

    }

    public void listarGruposApoioUsuario(Repository repository) {

        repository.getGrupoApoio_usuarios().forEach(associacaoGpApoioUsuario -> {
            if (associacaoGpApoioUsuario.getUsuario() == contaAtual.getUsuario()) {
                System.out.println(associacaoGpApoioUsuario);
            }
        });

    }

    public void listarCiclosMentruaisConta(Repository repository) {
        repository.getCiclosMenstruais().forEach(cicloMenstrual -> {
            if (cicloMenstrual.getConta() == contaAtual) {
                System.out.println("\n===");
                System.out.println(cicloMenstrual);
                System.out.println("\n===");
            }
        });

        repository.getSintomas().forEach(sintoma -> {
            if(sintoma.getCicloMenstrual().getConta() == contaAtual){
                System.out.println("\n===");
                System.out.println(sintoma);
                System.out.println("\n===");
            }
        });
    }

    public void adicionarCicloMenstrual(Repository repository, Scanner sc) {

        System.out.print("Digite a fase no ciclo: ");
        String fase = sc.nextLine();

        System.out.print("Digite sobre sua atividade sexual: ");
        String atividadeSexual = sc.nextLine();

        System.out.print("Utiliza algum metodo contraceptivo ? (Sim/Não): ");
        String metodoContraceptivo = sc.nextLine();

        if (metodoContraceptivo.toUpperCase().charAt(0) == 'S'){
            System.out.print("Qual metodo: ");
            metodoContraceptivo = sc.nextLine();
        }

        CicloMenstrual cicloMenstrual = new CicloMenstrual(212L, fase, atividadeSexual, metodoContraceptivo, contaAtual);
        repository.getCiclosMenstruais().add(cicloMenstrual);

        System.out.print("Sente algum sintoma ? (Sim/Não): ");
        String descricaoSintoma = sc.nextLine();

        if (descricaoSintoma.toUpperCase().charAt(0) == 'S'){
            Sintoma sintoma = new Sintoma();

            System.out.print("Descreva o(s) sintoma: ");
            sintoma.setDescricao(sc.nextLine());

            System.out.print("Qual a frequência ? ");
            sintoma.setFrequencia(sc.nextLine());

            System.out.print("Qual a intensidade ? ");
            sintoma.setIntensidade(sc.nextLine());

            sintoma.setCicloMenstrual(cicloMenstrual);

            repository.getSintomas().add(sintoma);

            System.out.println("Ciclo cadastrado com sucesso !!");
        }

    }

    // METODOS CONTA ADM

    public Conta verificarContaExiste(Repository repository, String email) {
        for (Conta conta : repository.getContas()) {
            if (conta.getEmail().equals(email)) {
                return conta;
            }
        }
        return null;
    }

    public void listarContas(Repository repository) {
        repository.getContas().forEach(conta -> {
            System.out.println("\n===");
            System.out.println(conta);
            System.out.println("\n===");
        });
    }

    public void listarContasAdminstrativas(Repository repository) {
        repository.getContas().forEach(conta -> {
            if (conta.getAdministrador() == "sim") {
                System.out.println("\n===");
                System.out.println(conta);
                System.out.println("\n===");
            }
        });
    }

    public void listarUsuarios(Repository repository) {
        repository.getUsuarios().forEach(usuario -> {
            System.out.println("\n===");
            System.out.println(usuario);
            System.out.println("\n===");
        });
    }

    public void listarPostagens(Repository repository) {
        repository.getPostagens().forEach(postagem -> {
            System.out.println("\n===");
            System.out.println(postagem);
            System.out.println("\n===");
        });
    }

    public void listarMarcasParceiras(Repository repository) {
        repository.getMarcasParceiras().forEach(marcaParceira -> {
            System.out.println("\n===");
            System.out.println(marcaParceira);
            System.out.println("\n===");
        });
    }

    public void listarGruposDeApoio(Repository repository) {
        repository.getGruposDeApoio().forEach(grupoDeApoio -> {
            System.out.println("\n===");
            System.out.println(grupoDeApoio);
            System.out.println("\n===");
        });
    }

    public void listarCiclosMentruais(Repository repository) {
        repository.getCiclosMenstruais().forEach(cicloMenstrual -> {
            System.out.println("\n===");
            System.out.println(cicloMenstrual);
            System.out.println("\n===");
        });
    }

    public void realizarPostagem(Repository repository, Scanner sc) {

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

        Postagem postagem = new Postagem(1L, titulo, descricao, texto, imagem, this.contaAtual);

        repository.getPostagens().add(postagem);


    }

    public void inserirGrupoDeApoio(Repository repository, Scanner sc) {

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

        repository.getEnderecos().add(endereco);
        repository.getGruposDeApoio().add(grupoDeApoio);

        System.out.println("Grupo cadastrado !!");

    }

    public void registrarParceria(Repository repository, Scanner sc) {

        System.out.print("Digite o nome da marca parceira: ");
        String nome = sc.nextLine();

        System.out.print("Digite o segmento da marca: ");
        String segmento = sc.nextLine();

        System.out.print("Tem o link, do site ou rede social, da marca ? (Sim/Não): ");
        String temLink = sc.nextLine();

        String link = null;
        if (temLink.toUpperCase().charAt(0) == 'S') {
            System.out.print("Link: ");
            link = sc.nextLine();
        }

        MarcaParceira marcaParceira = new MarcaParceira(45L, nome, segmento, link);

        repository.getMarcasParceiras().add(marcaParceira);

        System.out.println("Marca registrada !!");

    }

}
