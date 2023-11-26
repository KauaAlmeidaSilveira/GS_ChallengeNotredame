package com.fiap.GSnotredame.entities;

public class Usuario {

    private long cpfUsuario;
    private String nome;
    private String genero;
    private String convenio;
    private Endereco endereco;

    public Usuario() {
    }

    public Usuario(long cpfUsuario, String nome, String genero, String convenio, Endereco endereco) {
        this.cpfUsuario = cpfUsuario;
        this.nome = nome;
        this.genero = genero;
        this.convenio = convenio;
        this.endereco = endereco;
    }

    public long getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(long cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario\n" +
                "CPF_Usuario: " + cpfUsuario + "\n" +
                "Nome: " + nome + "\n" +
                "Gênero: " + genero + "\n" +
                "Convênio: " + convenio + "\n" +
                endereco;
    }
}
