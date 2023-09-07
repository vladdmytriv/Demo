DEMO FOR NERDZLAB
In this demo framework you can find the test for verifying error message on Login page.

Test:
  Name: verifyErrorMessage.
  Location: src/test/uiTests/LoginPageTests.
  Verifies: Message is shown and equal to expected.
  Technologies: Java 11, Junit, Selenide, Serenity.
  
  Steps: 1. Open Login page 
         2. Set username
         3. Set password
         4. Select location
         5. Click Log In button
         
  Description:
            Created separate Header class to have ability to work with it from different pages. 
            Created LoginPage class with methods to work with Login page. Extended by Header.
            Created PageUtil class to show how we should work with custom methods.
            Created JsHelper class to provide specified methods using JavaScript realisation.
            Created PropertyHelper class to configure browser correctly.
            Created ConstantValues class to remove hardcode from test.
            Created TestRunner class to configure browser before test and close after.
            Created LoginPageTests class to have different tests for Login page.
            
            Also test is parameterized, so it verifies error message for each location that can be selected.
  
  
  
  
  
  
