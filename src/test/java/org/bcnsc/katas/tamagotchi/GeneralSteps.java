package org.bcnsc.katas.tamagotchi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.lessThan;

public class GeneralSteps {
    private Tamagotchi tamagotchi;
    private int previousHungriness;
    private int previousTiredness;
    private int previousHappiness;
    private int previousFullness;

    @Given("^I have a Tamagotchi$")
    public void iHaveATamagotchi() throws Throwable {
        tamagotchi = new TamagotchiBuilder().build();
    }

    @Given("^it's full$")
    public void itsFull() throws Throwable {
        tamagotchi = new TamagotchiBuilder().fullyFull().build();
    }

    @Given("^it's fully happy$")
    public void itsFullyHappy() throws Throwable {
        tamagotchi = new TamagotchiBuilder().fullyHappy().build();
    }

    @Given("^it's fully rested$")
    public void itsFullyRested() throws Throwable {
        tamagotchi = new TamagotchiBuilder().fullyRested().build();
    }

    @Given("^it's empty$")
    public void itsEmpty() throws Throwable {
        tamagotchi = new TamagotchiBuilder().empty().build();
    }

    @When("^I put it to bed$")
    public void iPutItToBed() throws Throwable {
        previousTiredness = tamagotchi.getTiredness();

        tamagotchi.rest();
    }

    @When("^I make it poop$")
    public void iMakeItPoop() throws Throwable {
        previousFullness = tamagotchi.getFullness();

        tamagotchi.poop();
    }

    @When("^I play with it$")
    public void iPlayWithIt() throws Throwable {
        previousTiredness = tamagotchi.getTiredness();
        previousHappiness = tamagotchi.getHappiness();

        tamagotchi.play();
    }

    @When("^time passes$")
    public void timePasses() throws Throwable {
        previousTiredness = tamagotchi.getTiredness();
        previousHappiness = tamagotchi.getHappiness();
        previousFullness = tamagotchi.getFullness();
        previousHungriness = tamagotchi.getHungriness();

        tamagotchi.passTime();
    }

    @When("^I feed it$")
    public void iFeedIt() throws Throwable {
        previousHungriness = tamagotchi.getHungriness();
        previousFullness = tamagotchi.getFullness();

        tamagotchi.feed();
    }

    @Then("^it's tiredness is decreased$")
    public void itsTirednessIsDecreased() throws Throwable {
        assertThat("Tiredness has not increased", tamagotchi.getTiredness(), is(lessThan(previousTiredness)));
    }

    @Then("^it's tiredness is minimum$")
    public void itsTirednessIsMinimum() throws Throwable {
        assertThat("Tiredness is not minimum", tamagotchi.getTiredness(), is(TamagotchiConstants.TAMAGOTCHI_MINIMUM));
    }

    @Then("^it's fullness is decreased$")
    public void itsFullnessIsDecreased() throws Throwable {
        assertThat("Fullness has not decreased", tamagotchi.getFullness(), is(lessThan(previousFullness)));
    }

    @Then("^it's fullness is minimum$")
    public void itsFullnessIsMinimum() throws Throwable {
        assertThat("Fullness is not minimum", tamagotchi.getFullness(), is(TamagotchiConstants.TAMAGOTCHI_MINIMUM));
    }

    @Then("^it's happiness is increased$")
    public void itsHappinessIsIncreased() throws Throwable {
        assertThat("Happiness has not increased", tamagotchi.getHappiness(), is(greaterThan(previousHappiness)));
    }

    @Then("^it's tiredness is increased$")
    public void itsTirednessIsIncreased() throws Throwable {
        assertThat("Tiredness has not decreased", tamagotchi.getTiredness(), is(greaterThan(previousTiredness)));
    }

    @Then("^it's happiness is maximum$")
    public void itsHappinessIsMaximum() throws Throwable {
        assertThat("Happiness is not maximum", tamagotchi.getHappiness(), is(TamagotchiConstants.TAMAGOTCHI_MAXIMUM));
    }

    @Then("^it's hungriness is increased$")
    public void itsHungrinessIsIncreased() throws Throwable {
        assertThat("Hungriness has not decreased", tamagotchi.getTiredness(), is(greaterThan(previousHungriness)));
    }

    @Then("^it's happiness is decreased$")
    public void itsHappinessIsDecreased() throws Throwable {
        assertThat("Happiness has not decreased", tamagotchi.getHappiness(), is(lessThan(previousHappiness)));
    }

    @Then("^it's hungriness is decreased$")
    public void itsHungrinessIsDecreased() throws Throwable {
        assertThat("Hungriness has not decreased", tamagotchi.getHungriness(), is(lessThan(previousHungriness)));
    }

    @Then("^it's fullness is increased$")
    public void itsFullnessIsIncreased() throws Throwable {
        assertThat("Fullness has not increased", tamagotchi.getFullness(), is(greaterThan(previousFullness)));
    }

    @Then("^it's hungriness is minimum$")
    public void itsHungrinessIsMinimum() throws Throwable {
        assertThat("Hungriness is not minimum", tamagotchi.getHungriness(), is(TamagotchiConstants.TAMAGOTCHI_MINIMUM));
    }

    @Then("^it's fullness is maximum$")
    public void itsFullnessIsMaximum() throws Throwable {
        assertThat("Fullness is not maximum", tamagotchi.getFullness(), is(TamagotchiConstants.TAMAGOTCHI_MAXIMUM));
    }
}
