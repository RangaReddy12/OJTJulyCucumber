Feature: OrangeHRM
@loginwithsingledata
Scenario: Validate Login 
When I launch url in a browser
And i enter username and i enter password
When I click Login Button
Then I Should see dashboard in url
When i close browser
Then i wnat 
  @scenariowithDatatable
  Scenario Outline: Login Functionality Validation
  When I open OrangeHRMS URL on "<Browser>"
  And Enter "<Username>" in username textbox
  And Enter "<Password>" in password text box
  When clicking Login Button
  Then I Should see dashboard text in url
  When Closingbrowser
  Examples:
  |Browser|Username|Password|
  |chrome|Admin|Qedge123!@#|
  |firefox|Admin|Qedge123!@#|
  |chrome|Admin1|Qedge123!@#|
  |firefox|Admin|Qedge123!@#4|
  |chrome|Admin|Qedge123!@#|
  |firefox|Admin|Qedge123!@#|
  |chrome|Admin5|Qedge123!@#|
  |firefox|Admin|Qedge123!@#3|
  
  