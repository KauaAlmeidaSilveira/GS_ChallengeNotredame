package com.fiap.GSnotredame.entities;

public class Sintoma {

    private long idSintoma;
    private String descricao;
    private String frequencia;
    private String intensidade;
    private String status;
    private CicloMenstrual cicloMenstrual;

    public Sintoma() {
        this.setIdSintoma(1L);
        this.status = "Presente";
    }

    public Sintoma(long idSintoma, String descricao, String frequencia, String intensidade, String status, CicloMenstrual cicloMenstrual) {
        this.idSintoma = idSintoma;
        this.descricao = descricao;
        this.frequencia = frequencia;
        this.intensidade = intensidade;
        this.status = "Presente";
        this.cicloMenstrual = cicloMenstrual;
    }

    public long getIdSintoma() {
        return idSintoma;
    }

    public void setIdSintoma(long idSintoma) {
        this.idSintoma = idSintoma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(String intensidade) {
        this.intensidade = intensidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CicloMenstrual getCicloMenstrual() {
        return cicloMenstrual;
    }

    public void setCicloMenstrual(CicloMenstrual cicloMenstrual) {
        this.cicloMenstrual = cicloMenstrual;
    }

    @Override
    public String toString() {
        return "Sintoma\n" +
                "ID_Sintoma: " + idSintoma + "\n" +
                "Descrição: " + descricao + "\n" +
                "Frequência: " + frequencia + "\n" +
                "Intensidade: " + intensidade + "\n" +
                "Status: " + status + "\n" +
                "Id do ciclo menstrual: " + cicloMenstrual.getIdCiclo();
    }
}
