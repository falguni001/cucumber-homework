@contact
Feature:contactus
  As a customer,
  I want to contact them
  so that I can contcat them with submit the form


  Scenario: contactus
    Given I am on the home page
    When  I click on the contactus on footer
    Then I should see "contact us " text on contactus"  page
    And the url should contain with "/contactus"

  Scenario: validate contactus page with Valid Name ,Email and Enquiry
    Given I am on the home page
    When I click on the contactus on footer
    And I enter name "falguni",Email "Megs@gmail.com"and Enquiry"About Product"
    And i click on submit on contact us page
    Then I should see "Your enquiry has been successfully sent to store owner "message
