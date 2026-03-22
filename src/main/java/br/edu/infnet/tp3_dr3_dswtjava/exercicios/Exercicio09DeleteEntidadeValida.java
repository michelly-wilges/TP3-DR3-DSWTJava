package br.edu.infnet.tp3_dr3_dswtjava.exercicios;

import br.edu.infnet.tp3_dr3_dswtjava.cliente.ClienteHttp;

public class Exercicio09DeleteEntidadeValida {
    public void executar() {
        ClienteHttp clienteHttp = new ClienteHttp();
        String url = "https://apichallenges.eviltester.com/sim/entities/9";

        System.out.println("Removendo entidade 9...");
        clienteHttp.executarDelete(url);

        System.out.println("Verificando entidade apos remocao...");
        clienteHttp.executarGet(url);
    }
}
