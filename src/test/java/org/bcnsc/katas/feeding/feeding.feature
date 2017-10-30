Feature: Feeding

  As a Tamagotchi owner
  I want to feed my Tamagotchi
  So that I can satiate it's hunger

  Scenario:
    Given I have a Tamagotchi
    When I feed it
    Then it's hungriness is decreased
    And it's fullness is increased