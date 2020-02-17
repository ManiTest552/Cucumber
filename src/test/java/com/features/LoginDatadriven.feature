Feature: Checking Login with Data driven appraoch 

	 Scenario: Checkm Login with Dynamic Data 
	
	 	Given When user is at loginpage 
	 	When user entered "demomu@TMobMicrowave.onmicrosoft.com" and "4u2change!" 
	  	Then Verify title 
	 	And close the driver 
	 
	
	
Scenario Outline: Checkm Login with Dynamic Data 

	Given When user is at loginpage 
	When user entered "<username>" and "<password>" 
	Then Verify title 
	And close the driver
	
Examples:	
	
	|username                            |  password|
	|demomu@TMobMicrowave.onmicrosoft.com|4u2change!|
	|demomu@TMobMicrowave.onmicrosoft.com|4u2change!|
	
	
	
	
	
	
	