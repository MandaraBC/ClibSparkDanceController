Feature: user is able to give the data
##PostClubSpark
Scenario: user able to retrieve data in a database
Given to provide data we use given
When to hit the server and get the response by using API "http://localhost:8080/danceclubs"
Then user is validating the status code is 200
 