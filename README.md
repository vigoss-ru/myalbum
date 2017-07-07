Project has built in Angular 2 + Java + Spring boot + Spring + JPA + MySQL Database

IDE: Intellij, Webstorm, phpmyadmin

How to install:


1. Run MySQL Database on your computer first, create a database myalbum

Check MySQL database connection in file application.properties on project backend. My example below:

spring.datasource.url = jdbc:mysql://localhost:3306/myalbum
spring.datasource.username=root
spring.datasource.password=

2. Import project backend into Intellij, run Backend’s Project with port 8080.

3. Install npm and angular-cli:

https://cli.angular.io/

- Open terminal, cd to path of project /myalbum and type ng serve to run angular project 