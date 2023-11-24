package com.fiap.GSnotredame.entities;

public class Endereco {

    private long idEndereco;
    private String rua;
    private String cidade;
    private String cep;
    private String pais;
    private GrupoDeApoio grupoDeApoio;

    public Endereco() {
    }

    public Endereco(long idEndereco, String rua, String cidade, String cep, String pais, GrupoDeApoio grupoDeApoio) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
        this.pais = pais;
        this.grupoDeApoio = grupoDeApoio;
    }

    public long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public GrupoDeApoio getGrupoDeApoio() {
        return grupoDeApoio;
    }

    public void setGrupoDeApoio(GrupoDeApoio grupoDeApoio) {
        this.grupoDeApoio = grupoDeApoio;
    }

    @Override
    public String toString() {
        return "Endereco\n" +
                "ID_Endereco: " + idEndereco + "\n" +
                "Rua: " + rua + "\n" +
                "Cidade: " + cidade + "\n" +
                "CEP: " + cep + "\n" +
                "País: " + pais + "\n" +
                "Id do grupo que tem esse endereco: " + grupoDeApoio.getIdGrupoDeApoio();
    }
}
