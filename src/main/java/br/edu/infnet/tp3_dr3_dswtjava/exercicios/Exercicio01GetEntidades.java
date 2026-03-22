package br.edu.infnet.tp3_dr3_dswtjava.exercicios;

import br.edu.infnet.tp3_dr3_dswtjava.cliente.ClienteHttp;

public class Exercicio01GetEntidades {

    public void executar() {
        String url = "https://apichallenges.eviltester.com/sim/entities";

        ClienteHttp clienteHttp = new ClienteHttp();
        clienteHttp.executarGet(url);
    }
}