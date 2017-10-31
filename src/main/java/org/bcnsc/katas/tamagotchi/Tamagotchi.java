package org.bcnsc.katas.tamagotchi;

public class Tamagotchi {
    private int hungriness;
    private int fullness;
    private int happiness;
    private int tiredness;

    public Tamagotchi() {
        this(TamagotchiConstants.INITIAL_VALUE,
                TamagotchiConstants.INITIAL_VALUE,
                TamagotchiConstants.INITIAL_VALUE,
                TamagotchiConstants.INITIAL_VALUE);
    }

    Tamagotchi(int hungriness, int fullness, int happiness, int tiredness) {
        this.hungriness = hungriness;
        this.fullness = fullness;
        this.happiness = happiness;
        this.tiredness = tiredness;
    }

    int getHungriness() {
        return hungriness;
    }

    int getFullness() {
        return fullness;
    }

    int getHappiness() {
        return happiness;
    }

    int getTiredness() {
        return tiredness;
    }

    void feed() {
        decreaseHungriness();
        increaseFullness();
    }

    void play() {
        increaseHappiness();
        increaseTiredness();
    }

    void rest() {
        decreaseTiredness();
    }

    void poop() {
        decreaseFullness();
    }

    void passTime() {
        decreaseFullness();
        increaseHungriness();
        increaseTiredness();
        decreaseHappiness();
    }

    private void increaseFullness() {
        if (fullness < TamagotchiConstants.TAMAGOTCHI_MAXIMUM) fullness += TamagotchiConstants.TAMAGOTCHI_UNIT;
    }

    private void decreaseFullness() {
        if (fullness > TamagotchiConstants.TAMAGOTCHI_MINIMUM) fullness -= TamagotchiConstants.TAMAGOTCHI_UNIT;
    }

    private void increaseTiredness() {
        if (tiredness < TamagotchiConstants.TAMAGOTCHI_MAXIMUM) tiredness += TamagotchiConstants.TAMAGOTCHI_UNIT;
    }

    private void decreaseTiredness() {
        if (tiredness > TamagotchiConstants.TAMAGOTCHI_MINIMUM) tiredness -= TamagotchiConstants.TAMAGOTCHI_UNIT;
    }

    private void increaseHappiness() {
        if (happiness < TamagotchiConstants.TAMAGOTCHI_MAXIMUM) happiness += TamagotchiConstants.TAMAGOTCHI_UNIT;
    }

    private void decreaseHappiness() {
        if (happiness > TamagotchiConstants.TAMAGOTCHI_MINIMUM) happiness -= TamagotchiConstants.TAMAGOTCHI_UNIT;
    }

    private void increaseHungriness() {
        if (hungriness < TamagotchiConstants.TAMAGOTCHI_MAXIMUM) hungriness += TamagotchiConstants.TAMAGOTCHI_UNIT;
    }

    private void decreaseHungriness() {
        if (hungriness > TamagotchiConstants.TAMAGOTCHI_MINIMUM) hungriness -= TamagotchiConstants.TAMAGOTCHI_UNIT;
    }
}
