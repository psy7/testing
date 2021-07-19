Feature: Login

  In order to login in TestMeApp
  As a user
  I need to register first

  Business Rules:
   - Only the registered user can do login


  Questions:
   - Can a guest user do the transactions


  @new @smoke
  Scenario: The one where user can do login successfully
    Given Abhishek is a registered user on TestMeApp
    When  Abhishek enter correct credentials
    Then  TestMe renders to user home page