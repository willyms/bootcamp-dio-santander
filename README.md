# Bootcamp Santander: Java + Angular
Projeto simple de recriar a tela de cotações do aplicativo do Santander em um website responsivo utilizando Angular e Spring-Boot.

Nesse projeto foi feito 3 contêineres Docker separados que contém:
- PostgreSQL database
- Java backend (Spring Boot)
- Angular frontend

## Pré requisito
- Maven
- Java 8
- Lombok
- Node.js
- Angular CLI

Para executar este aplicativo, você precisa instalar duas ferramentas: Docker e Docker Compose.

Instruções de como instalar o Docker no [Ubuntu](https://docs.docker.com/engine/install/ubuntu/), [Windows](https://docs.docker.com/docker-for-windows/install/), [Mac](https://docs.docker.com/docker-for-mac/install/).

Docker Compose já está incluído nos pacotes de instalação para Windows e Mac, portanto, apenas usuários do Ubuntu precisam seguir estas [instruções](https://docs.docker.com/compose/install/).


## Executando
Pode ser executado com um único comando em um terminal:
~~~
$ docker-compose up -d
~~~
Se você quiser pará-lo, execute o seguinte comando:
~~~
$ docker-compose down
~~~
### **backend-app (REST API)**

Este é um aplicativo baseado em Spring Boot (Java) que se conecta a um banco de dados que expõe os endpoints REST que podem ser consumidos pelo front-end. Ele suporta vários métodos HTTP REST como GET, POST, PUT e DELETE

A lista completa de endpoints REST disponíveis pode ser encontrada na IU Swagger, que pode ser chamada usando o link: http://localhost:8080/api/swagger-ui.html

Este aplicativo também é colocado no contêiner do Docker e sua definição pode ser encontrada em um arquivo `backend/Dockerfile`.

![image01](https://github.com/willyms/bootcamp-dio-santander/blob/master/swagger-backend.png)


### **frontend-app (Frontend)**

Este é um endpoint real para um usuário onde ele pode visualizar as cotacoes diarias. Ele consome os endpoints da API REST fornecidos pelo backend-app.

A aplicação estará rodando no link: http://localhost:4200/.

Este aplicativo também é colocado no contêiner do Docker e sua definição pode ser encontrada em um arquivo `frontend/Dockerfile`.


![image02](https://github.com/willyms/bootcamp-dio-santander/blob/master/tela-principal.png)

## Links
- Guia completo do Flexbox - [https://css-tricks.com/snippets/css/a-guide-to-flexbox/](https://css-tricks.com/snippets/css/a-guide-to-flexbox/)
- Flexbox Froggy - [https://flexboxfroggy.com/](https://flexboxfroggy.com/)
- Conceitos básicos de Flexbox - [https://developer.mozilla.org/pt-BR/docs/Web/CSS/CSS_Flexible_Box_Layout/Basic_Concepts_of_Flexbox](https://developer.mozilla.org/pt-BR/docs/Web/CSS/CSS_Flexible_Box_Layout/Basic_Concepts_of_Flexbox)
- Conceitos básicos do CSS Grid - [https://tableless.com.br/um-pouco-sobre-css-grid-layout/](https://tableless.com.br/um-pouco-sobre-css-grid-layout/)
- Guia completo do CSS Grid - [https://css-tricks.com/snippets/css/complete-guide-grid/](https://css-tricks.com/snippets/css/complete-guide-grid/)
- Unidades de medidas relativas - [https://desenvolvimentoparaweb.com/css/unidades-css-rem-vh-vw-vmin-vmax-ex-ch/](https://desenvolvimentoparaweb.com/css/unidades-css-rem-vh-vw-vmin-vmax-ex-ch/)
- angular-cli-ghpages - [https://github.com/angular-schule/angular-cli-ghpages/#readme](https://github.com/angular-schule/angular-cli-ghpages/#readme)
