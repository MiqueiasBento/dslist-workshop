# Projeto DSList - Intensivão Java Spring

## Modelo de domínio DSList
![Captura de tela de 2024-12-30 22-11-31](https://github.com/user-attachments/assets/30c9a6bf-853a-47a5-807f-0e35d92e8ea3)

## Sobre o projeto
O projeto consiste em uma API REST com entidades ``Games`` e ``Lists``, na qual as listas possuem listas de jogos, o intuito é poder relacionar as duas entidades e por fim mover a posição de uma jogo dentro de uma lista.  

### Como executar o projeto
Há duas alternativas de executar o projeto:  
1. Configurar o projeto para perfil de ``test`` no ``application.properties``, e então acessar no navegador a url: ``http://localhost:8080/swagger-ui/index.html``, ou por ferramentas de teste de API, como **Postman** ou **Insomnia**.
2. Configurar o proejto para pergil de ``dev`` no ``application.properties``, e então executar o comando na pasta no projeto: ``docker compose up --build``, e através de uma ferramenta de teste de API, como **Postman** ou **Insomnia**, acessar as seguintes rotas:
   -   **POST** `dslist-workshop-production.up.railway.app/lists/{listId}/replacement`: Move um game em uma lista.
   -   **GET** `dslist-workshop-production.up.railway.app/lists`: Retorna todas as listas registradas.
   -   **GET** `dslist-workshop-production.up.railway.app/list/{listId}/games`: Retorna todos os games registrados na lista.
   -   **GET** `dslist-workshop-production.up.railway.app/games`: Retorna todos os games registrados.
   -   **GET** `dslist-workshop-production.up.railway.app/games/{id}`: Retorna um game a partir de seu id.

## Rotas da API

-   **POST** `/lists/{listId}/replacement`: Move um game em uma lista.
-   **GET** `/lists`: Retorna todas as listas registradas.
-   **GET** `/list/{listId}/games`: Retorna todos os games registrados na lista.
-   **GET** `/games`: Retorna todos os games registrados.
-   **GET** `/games/{id}`: Retorna um game a partir de seu id.

## Tecnologias Utilizadas  
- Java (17)  
- Spring Boot (3.4.1)  
- PostgreSQL (14)  
- Docker
- Railway
- Swagger

## Créditos
![image](https://github.com/user-attachments/assets/f1199d1f-4eee-41c4-8fa4-667e8c061853)  
O projeto foi desenvolvido junto das vídeo aulas da plataforma de ensino [DevSuperior](https://devsuperior.com.br/), durante um intersivão de Spring Boot, orientado pelo professor [Nélio Alves](https://github.com/acenelio).  
O intuito das aulas foi dar uma visão geral sobre o desenvolvimento com Spring Boot, além de outros pontos como documentação, boas práticas, banco de dados, hospedagem, práticas de versionamento e outros conhecimentos.  
