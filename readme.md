# SpringBoot 
A simple Employee REST Api built using SpringBoot

## Tools Required
- Postman (Testing API's)
- IDE - Eclipse / NetBeans/ Inteliji
- SpringToolSuite (Recommended)
- MySql 
- Web Server (Recommended Apache TomCat)

## Steps to be followed are as follows: 
1) Make sure you have installed all the required to run this project in your local machine. 
2) Now clone the repository using the command shown below: 
    ```
    git clone "repository_path"
    ```
3) Now you can open your favourite IDE, to import the cloned project into the IDE. 
4) If you are importing your project into Eclipse, Netbeans, or Inteliji. Make sure you have STS(Spring Tool Suite) extension / plugin to it.
5) Once you have imported your project into your favourite IDE. Now you can start creating a tables and a sperate database  in MySql for this project by running the few commands given below:
   ```
   CREATE database DATABASENAME;
   use DATABASENAME;
   create table TABLE_NAME(
      epid int auto_increment PRIMARY KEY,
      firstname varchar(20),
      lastname varchar(20),
      email varchar(20),
      doj  varchar(20),
      deptname varchar(20), 
	  projname varchar(20),
      location varchar(20) 
      );
   ```
6) Once you have sucessfully created the database for the required project. Now you need to make some changes in the application.properties file which is located inside src/main/resources. 
    
    ```
    spring.datasource.url=jdbc:mysql://localhost:3306/DATABASE_NAME
    spring.datasource.username=USER_NAME
    spring.datasource.password=PASSWORD
    server.servlet.context-path=/REST_APIPATH
    ```
   Replcae the DATABASE_NAME with the database you have created of your choice using MYSQL. Similary you need to mention the USER_NAME and PASSWORD of MySql. 
7) Now you are good to go , to Start the project in your favourite IDE(recommended STS)by running the project as
    -  maven build
    -  run as springboot app
8) Once the project is running successfully now you can test different HTTP method with the help of Postman tool. Few screenshots are attached below for reference. 
![Screenshot (1617)](https://user-images.githubusercontent.com/61947484/150727419-3a8a6c0a-8d27-4600-9554-40afbfcd3380.png)
![Screenshot (1619)](https://user-images.githubusercontent.com/61947484/150727540-79703c48-e534-4116-ac5d-525abbfe2794.png)
