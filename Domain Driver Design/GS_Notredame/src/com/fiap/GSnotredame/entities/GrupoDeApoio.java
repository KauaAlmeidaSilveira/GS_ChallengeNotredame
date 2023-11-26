package com.fiap.GSnotredame.entities;

public class GrupoDeApoio {

    private long idGrupoDeApoio;
    private String nome;
    private String telefone;
    private String publicoAlvo;
    private String descricao;
    private Endereco endereco;

    public GrupoDeApoio() {
    }

    public GrupoDeApoio(long idGrupoDeApoio, String nome, String telefone, String publicoAlvo, String descricao, Endereco endereco) {
        this.idGrupoDeApoio = idGrupoDeApoio;
        this.nome = nome;
        this.telefone = telefone;
        this.publicoAlvo = publicoAlvo;
        this.descricao = descricao;
        this.endereco = endereco;
    }

    public long getIdGrupoDeApoio() {
        return idGrupoDeApoio;
    }

    public void setIdGrupoDeApoio(long idGrupoDeApoio) {
        this.idGrupoDeApoio = idGrupoDeApoio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "GrupoDeApoio\n" +
                "ID_GrupoDeApoio: " + idGrupoDeApoio + "\n" +
                "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "Publico alvo: " + publicoAlvo + "\n" +
                "Descrição: " + descricao + "\n" +
                endereco;
    }
}
