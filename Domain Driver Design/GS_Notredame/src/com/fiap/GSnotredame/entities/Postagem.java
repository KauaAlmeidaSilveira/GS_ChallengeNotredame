package com.fiap.GSnotredame.entities;

public class Postagem {

    private long idPostagem;
    private String titulo;
    private String descricao;
    private String texto;
    private String imagem;
    private Conta conta;

    public Postagem() {
    }

    public Postagem(long idPostagem, String titulo, String descricao, String texto, String imagem, Conta conta) {
        this.idPostagem = idPostagem;
        this.titulo = titulo;
        this.descricao = descricao;
        this.texto = texto;
        this.imagem = imagem;
        this.conta = conta;
    }

    public long getIdPostagem() {
        return idPostagem;
    }

    public void setIdPostagem(long idPostagem) {
        this.idPostagem = idPostagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Postagem\n" +
                "ID_Postagem: " + idPostagem + "\n" +
                "Título: " + titulo + "\n" +
                "Descrição: " + descricao + "\n" +
                "Texto: " + texto + "\n" +
                "Imagem: " + imagem + "\n" +
                "Id da conta: " + conta.getIdConta();
    }
}
