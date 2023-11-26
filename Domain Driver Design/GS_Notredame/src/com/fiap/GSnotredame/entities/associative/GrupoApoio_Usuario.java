package com.fiap.GSnotredame.entities.associative;

import com.fiap.GSnotredame.entities.GrupoDeApoio;
import com.fiap.GSnotredame.entities.Usuario;

public class GrupoApoio_Usuario {

    private Long ID_GrupoApoioUsuario;
    private GrupoDeApoio grupoDeApoio;
    private Usuario usuario;
    private String status;

    public GrupoApoio_Usuario() {
    }

    public GrupoApoio_Usuario(Long ID_GrupoApoioUsuario, GrupoDeApoio grupoDeApoio, Usuario usuario, String status) {
        this.ID_GrupoApoioUsuario = ID_GrupoApoioUsuario;
        this.grupoDeApoio = grupoDeApoio;
        this.usuario = usuario;
        this.status = status;
    }

    public Long getID_GrupoApoioUsuario() {
        return ID_GrupoApoioUsuario;
    }

    public void setID_GrupoApoioUsuario(Long ID_GrupoApoioUsuario) {
        this.ID_GrupoApoioUsuario = ID_GrupoApoioUsuario;
    }

    public GrupoDeApoio getGrupoDeApoio() {
        return grupoDeApoio;
    }

    public void setGrupoDeApoio(GrupoDeApoio grupoDeApoio) {
        this.grupoDeApoio = grupoDeApoio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GrupoApoio_Usuario\n" +
                "ID_GrupoApoioUsuario: " + ID_GrupoApoioUsuario + "\n" +
                "GrupoDeApoio: " + grupoDeApoio.getIdGrupoDeApoio() + "\n" +
                "Usuario:" + usuario.getCpfUsuario() + "\n" +
                "Status: " + status;
    }
}
