package br.edu.infnet.tp3_dr3_dswtjava.exercicios;

import br.edu.infnet.tp3_dr3_dswtjava.cliente.ClienteHttp;

public class Exercicio12SimpleApi {
    private final ClienteHttp clienteHttp = new ClienteHttp();

    public void executarParteA() {
        String url = "https://apichallenges.eviltester.com/simpleapi/items";

        System.out.println("Buscando todos os itens da Simple API...");
        clienteHttp.executarGet(url);
    }

    public void executarParteB() {
        String url = "https://apichallenges.eviltester.com/simpleapi/randomisbn";

        System.out.println("Gerando ISBN aleatorio...");
        clienteHttp.executarGet(url);
    }

    public void executarParteC() {
        String url = "https://apichallenges.eviltester.com/simpleapi/items";

        String json = """
            {
              "type": "book",
              "isbn13": "223-4-14-457206-1",
              "price": 5.99,
              "numberinstock": 5
            }
            """;

        System.out.println("Criando item na Simple API...");
        clienteHttp.executarPost(url, json);
    }

    public void executarParteD() {
        String url = "https://apichallenges.eviltester.com/simpleapi/items/223-4-14-457206-1";

        String json = """
            {
              "type": "book",
              "isbn13": "223-4-14-457206-1",
              "price": 5.99,
              "numberinstock": 5
            }
            """;

        System.out.println("Atualizando item na Simple API...");
        clienteHttp.executarPut(url, json);
    }

    public void executarParteE() {
        String isbn = "223-4-14-457206-1";
        String url = "https://apichallenges.eviltester.com/simpleapi/items/" + isbn;

        System.out.println("Removendo item da Simple API...");
        clienteHttp.executarDelete(url);
    }
}
