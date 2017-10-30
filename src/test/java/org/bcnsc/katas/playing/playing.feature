Feature: Playing

  As a Tamagotchi owner
  I want to play with my Tamagotchi
  So that I can make it happier

  Scenario:
    Given I have a Tamagotchi
    When I play with it
    Then it's happiness is increased
    And it's tiredness is increased