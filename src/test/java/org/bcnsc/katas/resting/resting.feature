Feature: Resting

  As a Tamagotchi owner
  I want to put my Tamagotchi to bed
  So that I can refill it's energy

  Scenario: Normal resting
    Given I have a Tamagotchi
    When I put it to bed
    Then it's tiredness is decreased

  Scenario: Extreme resting
    Given I have a Tamagotchi
    And it's fully rested
    When I put it to bed
    Then it's tiredness is minimum