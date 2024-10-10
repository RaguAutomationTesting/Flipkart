Feature: Add to cart functionality

  Scenario: Add to cart and increase product quantity 
  Given user launch flipkart application
  When user search product and add to cart
  And navigates to homepge and again goes to cart increase product quantity 
  Then product quantity should be increased
 
