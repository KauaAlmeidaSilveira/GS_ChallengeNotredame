package com.fiap.GSnotredame.entities;

public class Usuario {

    private long cpfUsuario;
    private String nome;
    private String genero;
    private String convenio;

    public Usuario() {
    }

    public Usuario(long cpfUsuario, String nome, String genero, String convenio) {
        this.cpfUsuario = cpfUsuario;
        this.nome = nome;
        this.genero = genero;
        this.convenio = convenio;
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

    @Override
    public String toString() {
        return "Usuario\n" +
                "CPF_Usuario: " + cpfUsuario + "\n" +
                "Nome: " + nome + "\n" +
                "Gênero: " + genero + "\n" +
                "Convênio: " + convenio;
    }
}
