package com.fiap.GSnotredame.entities;

public class MarcaParceira {

    private long idMarca;
    private String nome;
    private String statusParceria;
    private String segmento;
    private String link;

    public MarcaParceira() {
    }

    public MarcaParceira(long idMarca, String nome, String segmento, String link) {
        this.idMarca = idMarca;
        this.nome = nome;
        this.statusParceria = "Ativo";
        this.segmento = segmento;
        this.link = link;
    }

    public long getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(long idMarca) {
        this.idMarca = idMarca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatusParceria() {
        return statusParceria;
    }

    public void setStatusParceria(String statusParceria) {
        this.statusParceria = statusParceria;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "MarcasParceiras\n" +
                "ID_Marca: " + idMarca + "\n" +
                "Nome: " + nome + "\n" +
                "StatusParceria: " + statusParceria + "\n" +
                "Segmento: " + segmento + "\n" +
                "Link: " + link;
    }

}