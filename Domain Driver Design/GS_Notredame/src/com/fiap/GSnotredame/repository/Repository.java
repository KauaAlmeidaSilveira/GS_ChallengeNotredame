package com.fiap.GSnotredame.repository;

import com.fiap.GSnotredame.entities.*;
import com.fiap.GSnotredame.entities.associative.GrupoApoio_Usuario;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private List<Conta> contas = new ArrayList<>();
    private List<MarcaParceira> marcasParceiras = new ArrayList<>();
    private List<GrupoDeApoio> gruposDeApoio = new ArrayList<>();
    private List<Endereco> enderecos = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Postagem> postagens = new ArrayList<>();
    private List<CicloMenstrual> ciclosMenstruais = new ArrayList<>();
    private List<Sintoma> sintomas = new ArrayList<>();
    private List<GrupoApoio_Usuario> grupoApoio_usuarios = new ArrayList<>();

    public Repository() {
        Endereco endereco = new Endereco(333L, "rua teste", "sp", "4532345", "BR");
        enderecos.add(endereco);

        // User padrao
        Usuario user = new Usuario(16581465168L, "kaua", "masc", "nao", endereco);
        usuarios.add(user);

        // Conta padrão adm
        contas.add(new Conta(111L, "adm@", "2011", "sim", user));

        // Conta padrão sem adm
        contas.add(new Conta(222L, "kaua@", "2011", "nao", user));

    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<MarcaParceira> getMarcasParceiras() {
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

    public List<GrupoApoio_Usuario> getGrupoApoio_usuarios() {
        return grupoApoio_usuarios;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void adicionarMarcasParceiras(MarcaParceira marca) {
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

    public void adcionarGrupoApoio_Usuario(GrupoApoio_Usuario grupoApoioUsuario){
        grupoApoio_usuarios.add(grupoApoioUsuario);
    }

}
