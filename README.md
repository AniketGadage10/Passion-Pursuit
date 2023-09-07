<h1 align="center"> <img src="https://github.com/TheDudeThatCode/TheDudeThatCode/blob/master/Assets/Hi.gif" width="50">
<a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=35&pause=1000&center=true&vCenter=true&width=435&lines=+++'Hello',+I'm+Aniket+Gadage" alt="Typing SVG" /></a>  
</h1>
<b>ReactJS-Spring-Boot-Full-Stack-App</b>

This project consists of two applications: one is a Spring Boot Rest API called spring-backend and another is a ReactJS application called react-frontend.

Service-oriented platform focusing on establishing and maintaining connections between consumers and small businesses in the Arts, Entertainment, and Recreation sector.

<b>Applications</b>


- spring-backend

Spring Boot Web Java backend application that exposes a REST API to manage hobbies. Its secured endpoints can just be accessed if an access token (JWT) is provided.

spring-backend stores its data in a MySql database.

Spring-backend has the following endpoints

-react-frontend

ReactJS frontend application where users can find and save hobbies and businesses can manage offers. In order to access the application, user/business must log in using his/her username and password. All the requests coming from the react-frontend to secured endpoints in the spring-backend have an access token (JWT) that is generated when the user/business logs in.

<b>Prerequisites</b>

-Java 11+

-npm

-JWT

<b>Spring Mail</b>

Make sure to specify a valid spring.mail.username and spring.mail.password in the application.properties file in order to be able to send an Email confirmation for updating user entries.
