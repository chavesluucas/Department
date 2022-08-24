## Department and Collaborators Project
>Status: Developed ✅

### This is a basic CRUD project.

## Technologies

+ JAVA 11
+ Spring Boot 
+ JPA / Hibernate
+ Maven
+ H2 Database

## Entity Fields | Endpoints

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

## How to run the project
### Requirements

+ JAVA 17
+ IDE (of your choice)

### Run

+ Clone this repository (command to use in cmd: ```git clone https://github.com/chavesluucas/GoDev.git```)
+ Import the project into your IDE ( file > import > Existing Maven Project)
+ Run the project in your IDE
+ To access the endpoints use systems like as postman or insomnia.

## Bonus
I have a personal website that I developed in ReactJS, if you want to know me better, just <a href="https://lucaschaves.tech" target="_blank">click here<a>
