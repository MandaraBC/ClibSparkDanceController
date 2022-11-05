Feature: User is able to get the name by giving name
##Getbyname
Scenario: User should be able to get name from database
When User should be able to perform get action using the api "http://localhost:8080/danceclubs/?name=tejaclubs"
Then Validate the statusCode 200