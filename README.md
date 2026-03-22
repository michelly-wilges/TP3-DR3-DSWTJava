# TP3_DR3_DSWTJava
### TP3 — Integração com Serviços HTTP e REST em Java

Este projeto reúne exercícios práticos desenvolvidos em Java para praticar consumo de APIs HTTP utilizando `HttpURLConnection`.

---

## 📋 Exercícios incluídos

1. **GET simples de todas as entidades**
2. **GET de entidade específica**
3. **GET de entidade inexistente**
4. **GET com parâmetros na URL**
5. **POST criando uma nova entidade**
6. **GET da entidade criada**
7. **POST para atualizar uma entidade**
8. **PUT para atualizar entidade**
9. **DELETE de entidade válida**
10. **DELETE inválido**
11. **OPTIONS com verificação de métodos**
12. **Experimentos com a Simple API**
   - GET de todos os itens
   - Geração de ISBN aleatório
   - POST para criação de item
   - PUT para tentativa de atualização
   - DELETE para tentativa de remoção

---

## ▶️ Como executar o projeto

1. **Abra o projeto no IntelliJ IDEA**
2. Aguarde o carregamento das dependências do Maven
3. Verifique se a classe principal está configurada corretamente:
   - `Tp3Dr3DswtJavaApplication`
4. No arquivo `Aplicacao`, escolha qual exercício deseja executar
5. Execute a aplicação pelo IntelliJ usando o botão de execução ou `Shift + F10`
6. Os resultados serão exibidos no console com:
   - código de status HTTP
   - detalhes da resposta da API
   - mensagens de erro, quando houver

---

## 🛠️ Ambiente de desenvolvimento

- **Linguagem:** Java
- **Biblioteca principal para HTTP:** `HttpURLConnection`
- **Leitura de resposta:** `BufferedReader`
- **Envio de dados:** `DataOutputStream`
- **Gerenciador de dependências:** Maven
- **IDE recomendada:** IntelliJ IDEA

---

## 📦 Estrutura do projeto

```
tp3_dr3_dswtjava/
├── Aplicacao.java
├── Tp3Dr3DswtJavaApplication.java
│   ├── cliente/
│   │   └── ClienteHttp.java
│   ├── exercicios/
│   │   ├── Exercicio01GetEntidades.java
│   │   ├── Exercicio02GetEntidadeEspecifica.java
│   │   ├── Exercicio03GetEntidadeInexistente.java
│   │   ├── Exercicio04GetComParametros.java
│   │   ├── Exercicio05PostCriarEntidade.java
│   │   ├── Exercicio06GetEntidadeCriada.java
│   │   ├── Exercicio07PostAtualizarEntidade.java
│   │   ├── Exercicio08PutAtualizarEntidade.java
│   │   ├── Exercicio09DeleteEntidadeValida.java
│   │   ├── Exercicio10DeleteInvalido.java
│   │   ├── Exercicio11OptionsMetodosPermitidos.java
│   │   └── Exercicio12SimpleApi.java
│   └── util/
|       └── UtilHttp.java
└── README.md
```
---

## 🌐 APIs utilizadas
**API de Entidades:**
https://apichallenges.eviltester.com/sim/entities

**Simple API:**
https://apichallenges.eviltester.com/simpleapi/items

**Gerador de ISBN aleatório:**
https://apichallenges.eviltester.com/simpleapi/randomisbn

---

## 🧠 Observações sobre o projeto
As requisições foram implementadas em Java com HttpURLConnection, conforme solicitado no enunciado.
O projeto imprime no console o código de status HTTP e o conteúdo retornado pela API.
Alguns exercícios da Simple API retornaram comportamentos específicos da própria API, como 400, 404 e 405, o que também faz parte da análise prática de consumo de serviços REST.
A classe Aplicacao foi utilizada para separar a execução dos exercícios da classe principal do projeto.

---

## 👩‍💻 Autor
Michelly — Disciplina Desenvolvimento de Serviços Web e Testes com Java.

---

## 📄 Licença
Este projeto foi desenvolvido para fins educacionais.
