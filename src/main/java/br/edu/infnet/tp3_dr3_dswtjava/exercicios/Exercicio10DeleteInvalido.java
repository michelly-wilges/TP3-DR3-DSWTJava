package br.edu.infnet.tp3_dr3_dswtjava.exercicios;

import br.edu.infnet.tp3_dr3_dswtjava.cliente.ClienteHttp;

public class Exercicio10DeleteInvalido {
    public void executar() {
        String url = "https://apichallenges.eviltester.com/sim/entities/2";

        ClienteHttp clienteHttp = new ClienteHttp();

        System.out.println("Tentando remover entidade 2...");
        clienteHttp.executarDelete(url);
    }
}
