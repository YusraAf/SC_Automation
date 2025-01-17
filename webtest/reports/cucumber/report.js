$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/regression/bankTransfer.investment.feature");
formatter.feature({
  "line": 1,
  "name": "Investment with no cash",
  "description": "",
  "id": "investment-with-no-cash",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Investment with minimum 10000 AED",
  "description": "Given: I want to invest 10000 AED in a Property\r\nWhen: I login as Zenubia@yopmail.com and password asdF1234 \r\nThen: I see dashboard\r\nAnd: No money in wallet\r\nThen: I see the dashboard page\r\nAnd: I go to view investment page\r\nThen: I can see the property page\r\nWhen: Property name is Studio One (1 Bed)\r\nWhen: Property is active\r\nThen: I select a property \r\nAnd: I can see property details page\r\nThen: I select Invest Now\r\nAnd: I can see the Investment page\r\nWhen: I put 10000 AED in Amount text box\r\nAnd: I can see share price 0.85\r\nAnd: I can see number of shares 11,700\r\nAnd: I can see Investment Amount 9,945.00\r\nAnd: I can see Purchase Cost 219.38\r\nAnd: I can see Transaction Cost 149.17\r\nAnd: I can see Total Cost 9,963.56\r\nAnd: I can see Transaction Summary\r\nAnd: I can see Investment Amount 9,945.00\r\nAnd: I can see Purchase Cost 219.38\r\nAnd: I can see Trustee fee AED 55.92\r\nAnd: I can see DEWA deposit AED 24.97\r\nAnd: I can see Furniture costs AED 117.00\r\nAnd: I can see DIFC NOC Fee AED 21.48\r\nAnd: I can see Transaction Cost 149.17\r\nAnd: I can see Smart Crowd Structuring fee (1.5 %) AED 149.17\r\nAnd: I can see Total amount 9,963.56\r\nThen: I select Proceed to payment button\r\nAnd: Pop up page will be shown \r\nThen: I select scroll arrow and select I agree button\r\nAnd: I can see the payment page\r\nThen: I select Make the payment\r\nAnd: I can see the two steps verification page\r\nAnd: I can see Property title Studio One (1 Bed)\r\nAnd: I can see Number of shares 11,700\r\nAnd: I can see Investment amount AED 9,945.00\r\nAnd: I can see Property Purchase cost AED 219.38\r\nAnd: I can see Transaction Cost AED 149.17\r\nAnd: I can see Total payable AED 9,963.56\r\nThen: I get OTP value from database\r\nWhen: I use OTP value in the textbox and click confirm \r\nThen: I see confirmation page",
  "id": "investment-with-no-cash;investment-with-minimum-10000-aed",
  "type": "scenario",
  "keyword": "Scenario"
});
});