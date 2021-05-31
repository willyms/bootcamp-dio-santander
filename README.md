# Santander DEV WEEK
Projeto simple de recriar a tela de cotações do aplicativo do Santander em um website responsivo utilizando JAVA (Spring-Boot) e ANGULAR.

Objetivo será aprimorar os conceitos e tecnicas, sendo elas: 
 - Camada Controller
 - Rest/API/JSON
 - Documentações API's com OPENAPI
 - Camada DAO
 - Hibernete / JPA
 - Banco de dados
 - Camada Service
 - Mapper de conversão
 - Exceptions Handlers
 - GitHub / Versiona codigo fonte
 FrontEnd
 - Componets
 - Modules
 - Routes

## Pré requisito
- Maven
- Java 8
- Lombok
- Node.js
- Angular CLI

## Executando
Com tudo pronto, 

Vamos executar o comando `mvn clean install spring-boot:run` dentro do diretorio `backend` e a aplicação estará rodando na endereço http://localhost:8080/swagger-ui/index.html, por padrão a aplicação esta unsando H2 (bando de dados armazenamento na memória).

O Spring Boot irá selecionar automaticamente o data.sql e executá-lo em nosso banco de dados H2 configurado durante a inicialização do aplicativo. Essa é uma boa maneira de propagar o banco de dados para testes ou outros propósitos.

![image01](https://github.com/willyms/bootcamp-dio-santander/blob/master/swagger-backend.png)

No entanto, podemos alterar esses parâmetros para qualquer bando de dados da sua preferencia dentro do arquivo application.yml.


Dentro do diretorio `frontend` execute o comando `ng serve --watch` e a aplicação estara rodando no endereço `http://localhost:4200/`.

![image02](https://github.com/willyms/bootcamp-dio-santander/blob/master/tela-principal.png)

## Links
- Guia completo do Flexbox - [https://css-tricks.com/snippets/css/a-guide-to-flexbox/](https://css-tricks.com/snippets/css/a-guide-to-flexbox/)
- Flexbox Froggy - [https://flexboxfroggy.com/](https://flexboxfroggy.com/)
- Conceitos básicos de Flexbox - [https://developer.mozilla.org/pt-BR/docs/Web/CSS/CSS_Flexible_Box_Layout/Basic_Concepts_of_Flexbox](https://developer.mozilla.org/pt-BR/docs/Web/CSS/CSS_Flexible_Box_Layout/Basic_Concepts_of_Flexbox)
- Conceitos básicos do CSS Grid - [https://tableless.com.br/um-pouco-sobre-css-grid-layout/](https://tableless.com.br/um-pouco-sobre-css-grid-layout/)
- Guia completo do CSS Grid - [https://css-tricks.com/snippets/css/complete-guide-grid/](https://css-tricks.com/snippets/css/complete-guide-grid/)
- Unidades de medidas relativas - [https://desenvolvimentoparaweb.com/css/unidades-css-rem-vh-vw-vmin-vmax-ex-ch/](https://desenvolvimentoparaweb.com/css/unidades-css-rem-vh-vw-vmin-vmax-ex-ch/)
- angular-cli-ghpages - [https://github.com/angular-schule/angular-cli-ghpages/#readme](https://github.com/angular-schule/angular-cli-ghpages/#readme)