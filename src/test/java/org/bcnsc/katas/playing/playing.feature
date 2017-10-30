Feature: Playing

  As a Tamagotchi owner
  I want to play with my Tamagotchi
  So that I can make it happier

  Scenario: Normal playing
    Given I have a Tamagotchi
    When I play with it
    Then it's happiness is increased
    And it's tiredness is increased

  Scenario: Extreme playing
    Given I have a Tamagotchi
    And it's fully happy
    When I play with it
    Then it's happiness is maximum