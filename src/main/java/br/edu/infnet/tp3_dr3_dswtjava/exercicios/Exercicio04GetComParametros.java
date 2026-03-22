package br.edu.infnet.tp3_dr3_dswtjava.exercicios;

import br.edu.infnet.tp3_dr3_dswtjava.cliente.ClienteHttp;

public class Exercicio04GetComParametros {
    public void executar() {
        String urlBase = "https://apichallenges.eviltester.com/sim/entities";
        String parametros = "?categoria=teste&limite=5";
        String urlFinal = urlBase + parametros;

        System.out.println("URL final montada: " + urlFinal);

        ClienteHttp clienteHttp = new ClienteHttp();
        clienteHttp.executarGet(urlFinal);
    }
}
