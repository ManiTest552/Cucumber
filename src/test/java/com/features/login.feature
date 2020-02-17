Feature: Microwave login check
Scenario: login to microwave

Given user is already on Login Page
When title of login page is Microwave
Then user enters  username and password 
Then user clicks on login button
Then user is on home page
Then Close the browser