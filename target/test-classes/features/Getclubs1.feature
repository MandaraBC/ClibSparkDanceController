Feature: User is able to get all details
@Getall
Scenario: User should be able to get data from database
Given User should be able to get data 
When User should be able to provide by providing URI "http://localhost:8080/danceclubs"
Then User should validate the statusCode 200