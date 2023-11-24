package com.fiap.GSnotredame.entities;

public class Conta {

    private long idConta;
    private String email;
    private String senha;
    private String administrador;
    private Usuario usuario;

    public Conta() {
    }

    public Conta(long idConta, String email, String senha, String administrador, Usuario usuario) {
        this.idConta = idConta;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
        this.usuario = usuario;
    }

    public long getIdConta() {
        return idConta;
    }

    public void setIdConta(long idConta) {
        this.idConta = idConta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    @Override
    public String toString() {
        return "Conta\n" +
                "ID_Conta: " + idConta + "\n" +
                "Email: " + email + "\n" +
                "Senha: " + senha + "\n" +
                "Administrador: " + administrador + "\n" +
                "Id do usuario: " + usuario.getCpfUsuario();
    }

}