Feature: delete the data in the database with the name
Scenario: User should be able to delete data
When User gives the path to delete the data "http://localhost:8080//danceclubs/name=tejaclubs"
Then User gets the statusCode 200