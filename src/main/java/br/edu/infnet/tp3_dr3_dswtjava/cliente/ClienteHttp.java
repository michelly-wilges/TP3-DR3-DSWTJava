package br.edu.infnet.tp3_dr3_dswtjava.cliente;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClienteHttp {

    public void executarGet(String enderecoUrl) {
        HttpURLConnection conexao = null;

        try {
            URL url = new URL(enderecoUrl);
            conexao = (HttpURLConnection) url.openConnection();

            conexao.setRequestMethod("GET");
            conexao.setRequestProperty("Accept", "application/json");

            int codigoResposta = conexao.getResponseCode();
            System.out.println("Codigo de status HTTP: " + codigoResposta);

            BufferedReader leitor;

            if (codigoResposta >= 200 && codigoResposta < 300) {
                leitor = new BufferedReader(
                        new InputStreamReader(conexao.getInputStream())
                );
            } else {
                leitor = new BufferedReader(
                        new InputStreamReader(conexao.getErrorStream())
                );
            }

            String linha;
            StringBuilder resposta = new StringBuilder();

            while ((linha = leitor.readLine()) != null) {
                resposta.append(linha);
            }

            leitor.close();

            if (codigoResposta == 404) {
                System.out.println("Mensagem: Entidade não encontrada.");
            }

            System.out.println("Detalhes:");
            System.out.println(resposta);

        } catch (Exception e) {
            System.out.println("Erro ao executar requisicao GET: " + e.getMessage());
        } finally {
            if (conexao != null) {
                conexao.disconnect();
            }
        }
    }

    public void executarPost(String enderecoUrl, String json) {
        HttpURLConnection conexao = null;

        try {
            URL url = new URL(enderecoUrl);
            conexao = (HttpURLConnection) url.openConnection();

            conexao.setRequestMethod("POST");
            conexao.setRequestProperty("Content-Type", "application/json");
            conexao.setRequestProperty("Accept", "application/json");
            conexao.setDoOutput(true);

            DataOutputStream saida = new DataOutputStream(conexao.getOutputStream());
            saida.writeBytes(json);
            saida.flush();
            saida.close();

            int codigoResposta = conexao.getResponseCode();
            System.out.println("Codigo de status HTTP: " + codigoResposta);

            BufferedReader leitor;

            if (codigoResposta >= 200 && codigoResposta < 300) {
                leitor = new BufferedReader(
                        new InputStreamReader(conexao.getInputStream())
                );
            } else {
                leitor = new BufferedReader(
                        new InputStreamReader(conexao.getErrorStream())
                );
            }

            String linha;
            StringBuilder resposta = new StringBuilder();

            while ((linha = leitor.readLine()) != null) {
                resposta.append(linha);
            }

            leitor.close();

            System.out.println("Detalhes:");
            System.out.println(resposta);

        } catch (Exception e) {
            System.out.println("Erro ao executar requisicao POST: " + e.getMessage());
        } finally {
            if (conexao != null) {
                conexao.disconnect();
            }
        }
    }

    public void executarPut(String enderecoUrl, String json) {
        HttpURLConnection conexao = null;

        try {
            URL url = new URL(enderecoUrl);
            conexao = (HttpURLConnection) url.openConnection();

            conexao.setRequestMethod("PUT");
            conexao.setRequestProperty("Content-Type", "application/json");
            conexao.setRequestProperty("Accept", "application/json");
            conexao.setDoOutput(true);

            DataOutputStream saida = new DataOutputStream(conexao.getOutputStream());
            saida.writeBytes(json);
            saida.flush();
            saida.close();

            int codigoResposta = conexao.getResponseCode();
            System.out.println("Codigo de status HTTP: " + codigoResposta);

            BufferedReader leitor;

            if (codigoResposta >= 200 && codigoResposta < 300) {
                leitor = new BufferedReader(
                        new InputStreamReader(conexao.getInputStream())
                );
            } else {
                leitor = new BufferedReader(
                        new InputStreamReader(conexao.getErrorStream())
                );
            }

            String linha;
            StringBuilder resposta = new StringBuilder();

            while ((linha = leitor.readLine()) != null) {
                resposta.append(linha);
            }

            leitor.close();

            System.out.println("Detalhes:");
            System.out.println(resposta);

        } catch (Exception e) {
            System.out.println("Erro ao executar requisicao PUT: " + e.getMessage());
        } finally {
            if (conexao != null) {
                conexao.disconnect();
            }
        }
    }

    public void executarDelete(String enderecoUrl) {
        HttpURLConnection conexao = null;

        try {
            URL url = new URL(enderecoUrl);
            conexao = (HttpURLConnection) url.openConnection();

            conexao.setRequestMethod("DELETE");
            conexao.setRequestProperty("Accept", "application/json");

            int codigoResposta = conexao.getResponseCode();
            System.out.println("Codigo de status HTTP: " + codigoResposta);

            BufferedReader leitor;

            if (codigoResposta >= 200 && codigoResposta < 300) {
                leitor = new BufferedReader(
                        new InputStreamReader(conexao.getInputStream())
                );
            } else {
                leitor = new BufferedReader(
                        new InputStreamReader(conexao.getErrorStream())
                );
            }

            String linha;
            StringBuilder resposta = new StringBuilder();

            while ((linha = leitor.readLine()) != null) {
                resposta.append(linha);
            }

            leitor.close();

            System.out.println("Detalhes:");
            System.out.println(resposta);

        } catch (Exception e) {
            System.out.println("Erro ao executar requisicao DELETE: " + e.getMessage());
        } finally {
            if (conexao != null) {
                conexao.disconnect();
            }
        }
    }

    public void executarOptions(String enderecoUrl) {
        HttpURLConnection conexao = null;

        try {
            URL url = new URL(enderecoUrl);
            conexao = (HttpURLConnection) url.openConnection();

            conexao.setRequestMethod("OPTIONS");
            conexao.setRequestProperty("Accept", "application/json");

            int codigoResposta = conexao.getResponseCode();
            System.out.println("Codigo de status HTTP: " + codigoResposta);

            String metodosPermitidos = conexao.getHeaderField("Allow");
            System.out.println("Metodos permitidos: " + metodosPermitidos);

            BufferedReader leitor;

            if (codigoResposta >= 200 && codigoResposta < 300) {
                if (conexao.getInputStream() != null) {
                    leitor = new BufferedReader(
                            new InputStreamReader(conexao.getInputStream())
                    );

                    String linha;
                    StringBuilder resposta = new StringBuilder();

                    while ((linha = leitor.readLine()) != null) {
                        resposta.append(linha);
                    }

                    leitor.close();

                    if (!resposta.toString().isEmpty()) {
                        System.out.println("Detalhes:");
                        System.out.println(resposta);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao executar requisicao OPTIONS: " + e.getMessage());
        } finally {
            if (conexao != null) {
                conexao.disconnect();
            }
        }
    }
}