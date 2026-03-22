package br.edu.infnet.tp3_dr3_dswtjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp3Dr3DswtJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp3Dr3DswtJavaApplication.class, args);

		Aplicacao aplicacao = new Aplicacao();
		aplicacao.executar();
	}
}
