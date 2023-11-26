package com.fiap.GSnotredame;

import com.fiap.GSnotredame.entities.*;
import com.fiap.GSnotredame.repository.Repository;

import java.util.List;

public class InstancesEntities {
    public static void main(String[] args) {

        /*
            === SCRIPT PARA POVOAR AS ENTIDADES ===
        *//*

        Repository repositorio = new Repository();

        Usuario usuario1 = new Usuario(1L, "Usuario1", "Feminino", "Convenio1");
        Usuario usuario2 = new Usuario(2L, "Usuario2", "Masculino", "Convenio2");

        Conta conta1 = new Conta(1L, "exemplo1@email.com", "senha123", "sim", usuario1);
        Conta conta2 = new Conta(2L, "exemplo2@email.com", "senha456", "não", usuario2);

        repositorio.adicionarConta(conta1);
        repositorio.adicionarConta(conta2);

        MarcaParceira marca1 = new MarcaParceira(1L, "Marca1", "ativo", "segmento1", "link1");
        MarcaParceira marca2 = new MarcaParceira(2L, "Marca2", "inativo", "segmento2", "link2");

        repositorio.adicionarMarcasParceiras(marca1);
        repositorio.adicionarMarcasParceiras(marca2);

        GrupoDeApoio grupo1 = new GrupoDeApoio(1L, "Grupo1", "123456789", "Apoio emocional");
        GrupoDeApoio grupo2 = new GrupoDeApoio(2L, "Grupo2", "987654321", "Apoio prático");

        repositorio.adicionarGrupoDeApoio(grupo1);
        repositorio.adicionarGrupoDeApoio(grupo2);

        Endereco endereco1 = new Endereco(1L, "Rua 1", "Cidade1", "12345-678", "Pais1", grupo1);
        Endereco endereco2 = new Endereco(2L, "Rua 2", "Cidade2", "98765-432", "Pais2", grupo2);

        repositorio.adicionarEndereco(endereco1);
        repositorio.adicionarEndereco(endereco2);

        repositorio.adicionarUsuario(usuario1);
        repositorio.adicionarUsuario(usuario2);

        Postagem postagem1 = new Postagem(1L, "Título1", "Descrição1", "Texto1", "Imagem1", conta1);
        Postagem postagem2 = new Postagem(2L, "Título2", "Descrição2", "Texto2", "Imagem2", conta2);

        repositorio.adicionarPostagem(postagem1);
        repositorio.adicionarPostagem(postagem2);

        CicloMenstrual ciclo1 = new CicloMenstrual(1L, "Fase1", "Sim", "Método1", conta1);
        CicloMenstrual ciclo2 = new CicloMenstrual(2L, "Fase2", "Não", "Método2", conta2);

        repositorio.adicionarCicloMenstrual(ciclo1);
        repositorio.adicionarCicloMenstrual(ciclo2);

        Sintoma sintoma1 = new Sintoma(1L, "Dor de cabeça", "Frequente", "Moderada", "Ativo", ciclo1);
        Sintoma sintoma2 = new Sintoma(2L, "Náuseas", "Ocasional", "Leve", "Inativo", ciclo2);

        repositorio.adicionarSintoma(sintoma1);
        repositorio.adicionarSintoma(sintoma2);

        System.out.println("Contas:");
        List<Conta> contas = repositorio.getContas();
        for (Conta conta : contas) {
            System.out.println(conta.toString()+"\n");
        }

        System.out.println("\nMarcas Parceiras:");
        List<MarcaParceira> marcasParceiras = repositorio.getMarcasParceiras();
        for (MarcaParceira marca : marcasParceiras) {
            System.out.println(marca.toString()+"\n");
        }

        System.out.println("\nGrupos de Apoio:");
        List<GrupoDeApoio> gruposDeApoio = repositorio.getGruposDeApoio();
        for (GrupoDeApoio grupo : gruposDeApoio) {
            System.out.println(grupo.toString()+"\n");
        }

        System.out.println("\nEndereços:");
        List<Endereco> enderecos = repositorio.getEnderecos();
        for (Endereco endereco : enderecos) {
            System.out.println(endereco.toString()+"\n");
        }

        System.out.println("\nUsuários:");
        List<Usuario> usuarios = repositorio.getUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString()+"\n");
        }

        System.out.println("\nPostagens:");
        List<Postagem> postagens = repositorio.getPostagens();
        for (Postagem postagem : postagens) {
            System.out.println(postagem.toString()+"\n");
        }

        System.out.println("\nCiclos Menstruais:");
        List<CicloMenstrual> ciclosMenstruais = repositorio.getCiclosMenstruais();
        for (CicloMenstrual ciclo : ciclosMenstruais) {
            System.out.println(ciclo.toString()+"\n");
        }

        System.out.println("\nSintomas:");
        List<Sintoma> sintomas = repositorio.getSintomas();
        for (Sintoma sintoma : sintomas) {
            System.out.println(sintoma.toString()+"\n");
        }
*/

    }
}




