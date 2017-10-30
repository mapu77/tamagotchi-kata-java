Feature: Feeding

  As a Tamagotchi owner
  I want to feed my Tamagotchi
  So that I can satiate it's hunger

  Scenario: Normal feeding
    Given I have a Tamagotchi
    When I feed it
    Then it's hungriness is decreased
    And it's fullness is increased

  Scenario: Extreme feeding
    Given I have a Tamagotchi
    And it's full
    When I feed it
    Then it's hungriness is minimum
    And it's fullness is maximum