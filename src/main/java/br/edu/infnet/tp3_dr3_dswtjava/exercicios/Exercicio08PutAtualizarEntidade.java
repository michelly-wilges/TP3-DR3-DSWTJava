package br.edu.infnet.tp3_dr3_dswtjava.exercicios;

import br.edu.infnet.tp3_dr3_dswtjava.cliente.ClienteHttp;

public class Exercicio08PutAtualizarEntidade {
    public void executar() {
        ClienteHttp clienteHttp = new ClienteHttp();

        String url = "https://apichallenges.eviltester.com/sim/entities/10";
        String json = "{ \"name\": \"atualizado\" }";

        System.out.println("Atualizando entidade com PUT...");
        clienteHttp.executarPut(url, json);

        System.out.println("Verificando entidade apos atualizacao...");
        clienteHttp.executarGet(url);
    }
}
