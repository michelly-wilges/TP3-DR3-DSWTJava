package br.edu.infnet.tp3_dr3_dswtjava.exercicios;

import br.edu.infnet.tp3_dr3_dswtjava.cliente.ClienteHttp;

public class Exercicio05PostCriarEntidade {

    public void executar() {
        String url = "https://apichallenges.eviltester.com/sim/entities";
        String json = "{ \"name\": \"aluno\" }";

        ClienteHttp clienteHttp = new ClienteHttp();
        clienteHttp.executarPost(url, json);
    }
}
