# Assignment

# Server
Tomcat 8

#JDK
JDK 8

#App URL
http://localhost:8080/Backbase

#Endpoints

● Transactions list

/transactions

● Transaction filter based on transaction type

/transactions/{type}

● Total amount for transaction type

/transactions/{type}/total

#The application is proteceted using spring security by Http Basic
User: backbase
Password: 123

#Call example
http://localhost:8080/Backbase/transactions/sandbox-payment

#Deploy
Just build the project with maven and deploy it to the server.
