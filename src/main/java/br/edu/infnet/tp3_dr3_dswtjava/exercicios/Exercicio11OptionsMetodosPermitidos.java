package br.edu.infnet.tp3_dr3_dswtjava.exercicios;

import br.edu.infnet.tp3_dr3_dswtjava.cliente.ClienteHttp;

public class Exercicio11OptionsMetodosPermitidos {
    public void executar() {
        String url = "https://apichallenges.eviltester.com/sim/entities";

        ClienteHttp clienteHttp = new ClienteHttp();

        System.out.println("Consultando metodos HTTP permitidos...");
        clienteHttp.executarOptions(url);
    }
}
