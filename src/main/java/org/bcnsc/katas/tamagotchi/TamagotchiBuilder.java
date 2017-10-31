package org.bcnsc.katas.tamagotchi;

import java.util.Random;

class TamagotchiBuilder {

    private Integer fullness;
    private Integer hungriness;
    private Integer happiness;
    private Integer tiredness;

    private Random random;

    Tamagotchi build() {
        return new Tamagotchi(
                hungriness == null ? randomInt() : hungriness,
                fullness == null ? randomInt() : fullness,
                happiness == null ? randomInt() : happiness,
                tiredness == null ? randomInt() : tiredness
        );
    }

    TamagotchiBuilder fullyHappy() {
        happiness = TamagotchiConstants.TAMAGOTCHI_MAXIMUM;
        return this;
    }

    TamagotchiBuilder fullyRested() {
        tiredness = TamagotchiConstants.TAMAGOTCHI_MINIMUM;
        return this;
    }

    TamagotchiBuilder fullyFull() {
        fullness = TamagotchiConstants.TAMAGOTCHI_MAXIMUM;
        hungriness = TamagotchiConstants.TAMAGOTCHI_MINIMUM;
        return this;
    }

    TamagotchiBuilder empty() {
        fullness = TamagotchiConstants.TAMAGOTCHI_MINIMUM;
        return this;
    }

    private int randomInt() {
        if (random == null) random = new Random(System.currentTimeMillis());
        return random.nextInt(TamagotchiConstants.TAMAGOTCHI_MAXIMUM);
    }
}
