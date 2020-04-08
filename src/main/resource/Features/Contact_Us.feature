Feature: Check Contact Us functionality

  @SystemTest
  Scenario Outline: Veirify Phone Number error messages
    Given I am on the contact page
    When I enter valid full name "<Full Name>" and invalid phone entry "<Phone Entry>" and email "<Email Address>" and message "<Message>"
    Then the correct "<Error Message>" is displayed

    Examples: 
      | Full Name    | Phone Entry | Email Address        | Message      | Error Message                    |
      | Andy Andrews | xx          | tony.ogara@email.com | Some message | The telephone number is invalid. |
      | Bob Brown    |             | Bob.Brown@email.com  | Some message | The field is required.           |
