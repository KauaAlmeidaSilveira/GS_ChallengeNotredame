package com.fiap.GSnotredame.entities;

public class GrupoDeApoio {

    private long idGrupoDeApoio;
    private String nome;
    private String telefone;
    private String tipoDeApoio;

    public GrupoDeApoio() {
    }

    public GrupoDeApoio(long idGrupoDeApoio, String nome, String telefone, String tipoDeApoio) {
        this.idGrupoDeApoio = idGrupoDeApoio;
        this.nome = nome;
        this.telefone = telefone;
        this.tipoDeApoio = tipoDeApoio;
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

    public String getTipoDeApoio() {
        return tipoDeApoio;
    }

    public void setTipoDeApoio(String tipoDeApoio) {
        this.tipoDeApoio = tipoDeApoio;
    }

    @Override
    public String toString() {
        return "GrupoDeApoio\n" +
                "ID_GrupoDeApoio: " + idGrupoDeApoio + "\n" +
                "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "TipoDeApoio: " + tipoDeApoio;
    }
}
