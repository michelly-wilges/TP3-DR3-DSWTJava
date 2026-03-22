package br.edu.infnet.tp3_dr3_dswtjava.exercicios;

import br.edu.infnet.tp3_dr3_dswtjava.cliente.ClienteHttp;

public class Exercicio02GetEntidadeEspecifica {
    public void executar() {
        ClienteHttp clienteHttp = new ClienteHttp();

        int idEntidade = 1;
        String url = "https://apichallenges.eviltester.com/sim/entities/" + idEntidade;

        clienteHttp.executarGet(url);
    }

}