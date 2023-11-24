package com.fiap.GSnotredame.repository;

import com.fiap.GSnotredame.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private List<Conta> contas = new ArrayList<>();
    private List<MarcasParceiras> marcasParceiras = new ArrayList<>();
    private List<GrupoDeApoio> gruposDeApoio = new ArrayList<>();
    private List<Endereco> enderecos = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Postagem> postagens = new ArrayList<>();
    private List<CicloMenstrual> ciclosMenstruais = new ArrayList<>();
    private List<Sintoma> sintomas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    public List<MarcasParceiras> getMarcasParceiras() {
        return marcasParceiras;
    }

    public List<GrupoDeApoio> getGruposDeApoio() {
        return gruposDeApoio;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }

    public List<CicloMenstrual> getCiclosMenstruais() {
        return ciclosMenstruais;
    }

    public List<Sintoma> getSintomas() {
        return sintomas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void adicionarMarcasParceiras(MarcasParceiras marca) {
        marcasParceiras.add(marca);
    }

    public void adicionarGrupoDeApoio(GrupoDeApoio grupo) {
        gruposDeApoio.add(grupo);
    }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarPostagem(Postagem postagem) {
        postagens.add(postagem);
    }

    public void adicionarCicloMenstrual(CicloMenstrual ciclo) {
        ciclosMenstruais.add(ciclo);
    }

    public void adicionarSintoma(Sintoma sintoma) {
        sintomas.add(sintoma);
    }

}
