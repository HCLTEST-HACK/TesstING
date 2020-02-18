@Test1
Feature: API Test

  @LoginTest
  Scenario: Generate the Token for Authentication
    Given Set the Login UserName and Password
    When Send the Post request for generate the token
    Then Save the Token code
    #
   #@CreateOrder
  #Scenario: Create the Order
   #Given Set the URI and param for create order
    #When Send the Post request for create Order
    #Then Validate the order
    #
    #@GetOrder
    #Scenario: Get the created Order
   #Given Set the URI and param for Get Order
    #When Send the get request for create Order
    #Then Validate the order
    #
   #
   

  