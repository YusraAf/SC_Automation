Feature: Investment with no cash

Scenario: Investment with minimum 10000 AED
Given: I want to invest 10000 AED in a Property
When: I login as Zenubia@yopmail.com and password asdF1234 
Then: I see dashboard
And: No money in wallet
Then: I see the dashboard page
And: I go to view investment page
Then: I can see the property page
When: Property name is Studio One (1 Bed)
When: Property is active
Then: I select a property 
And: I can see property details page
Then: I select Invest Now
And: I can see the Investment page
When: I put 10000 AED in Amount text box
And: I can see share price 0.85
And: I can see number of shares 11,700
And: I can see Investment Amount 9,945.00
And: I can see Purchase Cost 219.38
And: I can see Transaction Cost 149.17
And: I can see Total Cost 9,963.56
And: I can see Transaction Summary
And: I can see Investment Amount 9,945.00
And: I can see Purchase Cost 219.38
And: I can see Trustee fee AED 55.92
And: I can see DEWA deposit AED 24.97
And: I can see Furniture costs AED 117.00
And: I can see DIFC NOC Fee AED 21.48
And: I can see Transaction Cost 149.17
And: I can see Smart Crowd Structuring fee (1.5 %) AED 149.17
And: I can see Total amount 9,963.56
Then: I select Proceed to payment button
And: Pop up page will be shown 
Then: I select scroll arrow and select I agree button
And: I can see the payment page
Then: I select Make the payment
And: I can see the two steps verification page
And: I can see Property title Studio One (1 Bed)
And: I can see Number of shares 11,700
And: I can see Investment amount AED 9,945.00
And: I can see Property Purchase cost AED 219.38
And: I can see Transaction Cost AED 149.17
And: I can see Total payable AED 9,963.56
Then: I get OTP value from database
When: I use OTP value in the textbox and click confirm 
Then: I see confirmation page
