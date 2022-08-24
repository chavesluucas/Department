## Projeto de Departamento e Colaboradores
>Status: Desenvolvido ✅

### Esse é um projeto basico de um CRUD de Departamento e Colaboradores, desenvolvido para fixar conceitos importantes da programação.

## Tecnologias utilizadas

+ JAVA 11
+ Spring Boot 
+ JPA / Hibernate
+ Maven
+ H2 Database

## Campos das Entidades e Endpoints

### Collaborator
+ Long id 
+ String mame
+ String email 
+ Department department
##### Endpoint
+ Create: POST > [url base]/api/collaborators
+ Read: GET > [url base]/api/collaborators || GET ID > [url base]/api/collaborators/[id]
+ Update: PUT > [url base]/api/collaborators
+ Delete: DELETE > [url base]/api/collaborators/[id]

### Department
+ Long id
+ String name
##### Endpoint
+ Create: POST > [url base]/api/departments
+ Read: GET > [url base]/api/departments || GET ID > [url base]/api/departments/[id]
+ Update: PUT > [url base]/api/departments
+ Delete: DELETE > [url base]/api/departments/[id]

## Como executar o projeto
### Pré requisitos

+ JAVA 17
+ IDE (de sua preferencia)

### Executando

+ Clone esse repósitório do GitHub (comando para utilizar no prompt de comando: ```git clone https://github.com/chavesluucas/GoDev.git```)
+ Crie uma database no banco de dados com o nome "testgodev"
+ Importe o projeto em sua IDE ( file > import > Existing Maven Project)
+ Rode o projeto em sua IDE
+ Para acessar os endpoints, utilize algum sistema como POSTMAN ou INSOMNIA, por exemplo.

## Bonus
Tenho um site pessoal que desenvolvi em ReactJS, caso você queria me conhecer melhor é só <a href="https://lucaschaves.tech" target="_blank">clicar aqui<a>
