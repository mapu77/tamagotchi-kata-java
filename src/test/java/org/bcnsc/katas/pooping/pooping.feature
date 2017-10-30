Feature: Pooping

  As a Tamagotchi owner
  I want to make my Tamagotchi poop
  So that it is more comfortable

  Scenario: Normal pooping
    Given I have a Tamagotchi
    When I make it poop
    Then it's fullness is decreased

  Scenario: Extreme pooping
    Given I have a Tamagotchi
    And it's empty
    When I make it poop
    Then it's fullness is minimum