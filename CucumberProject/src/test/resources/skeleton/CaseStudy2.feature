Feature: AddCart feature
Scenario: The one where the user added atleast one product to the cart
    When Larry added headphone to the cart 
    And  checkout for the payment
    And  fills transaction details
    Then The product is succesfully added