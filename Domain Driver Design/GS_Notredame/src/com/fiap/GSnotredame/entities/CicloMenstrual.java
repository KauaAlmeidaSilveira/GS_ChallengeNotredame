package com.fiap.GSnotredame.entities;

public class CicloMenstrual {


    private long idCiclo;
    private String fase;
    private String atividadeSexual;
    private String metodoContraceptivo;
    private Conta conta;

    public CicloMenstrual() {
    }

    public CicloMenstrual(long idCiclo, String fase, String atividadeSexual, String metodoContraceptivo, Conta conta) {
        this.idCiclo = idCiclo;
        this.fase = fase;
        this.atividadeSexual = atividadeSexual;
        this.metodoContraceptivo = metodoContraceptivo;
        this.conta = conta;
    }

    public long getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(long idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getAtividadeSexual() {
        return atividadeSexual;
    }

    public void setAtividadeSexual(String atividadeSexual) {
        this.atividadeSexual = atividadeSexual;
    }

    public String getMetodoContraceptivo() {
        return metodoContraceptivo;
    }

    public void setMetodoContraceptivo(String metodoContraceptivo) {
        this.metodoContraceptivo = metodoContraceptivo;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }


    @Override
    public String toString() {
        return "CicloMenstrual: " + conta.getUsuario().getNome() + "\n" +
                "ID_Ciclo: " + idCiclo + "\n" +
                "Fase: " + fase + "\n" +
                "Atividade Sexual: " + atividadeSexual + "\n" +
                "Método Contraceptivo: " + metodoContraceptivo + "\n" +
                "Id da conta: " + conta.getIdConta();
    }
}
