package com.fiap.GSnotredame.entities;

public class Endereco {

    private long idEndereco;
    private String rua;
    private String cidade;
    private String cep;
    private String pais;


    public Endereco() {
    }

    public Endereco(long idEndereco, String rua, String cidade, String cep, String pais) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
        this.pais = pais;
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

    @Override
    public String toString() {
        return "Endereco\n" +
                "ID_Endereco: " + idEndereco + "\n" +
                "Rua: " + rua + "\n" +
                "Cidade: " + cidade + "\n" +
                "CEP: " + cep + "\n" +
                "País: " + pais;
    }
}
