
Feature: Amazon ecom site product display testing
  I want to use this template for my feature file
Background:
Given user launch the browser and implements implicit wait

  @datatc01
  Scenario: To check the product and price display in Amazon ecom site
    When user clicks mobiles and user moves the mouse to mobiles and accessories
    And user moves to powerbank and clicks
    When user rightclicks the link and clicks to open in new tab
    And user prints the price and product name
   

  