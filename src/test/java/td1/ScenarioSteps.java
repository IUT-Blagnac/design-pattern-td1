package td1;

import org.blagnac.cpoa.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class ScenarioSteps {
    
    private Canard canard;
    private String actualAnswer;

    @Given("a new colvert")
    public void a_new_colvert() {
        this.canard = new Colvert();
    }

    @Given("a new mandarin")
    public void a_new_mandarin() {
        this.canard = new Mandarin();
    }

    @Given("a new CanardEnPlastique")
    public void a_new_canardEnPlastique() {
        this.canard = new CanardEnPlastique();
    }

    @When("I am asked to cancaner")
    public void cancaner() {
        this.actualAnswer = this.canard.cancaner();
    }

    @When("I am asked to voler")
    public void i_am_asked_to_voler() {
        this.actualAnswer = this.canard.voler();
    }

    @Then("I should say {string}")
    public void i_should_say(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("a new {string}")
    public void a_new(String string) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class classTemp = Class.forName(string);
        Object obj = classTemp.newInstance();
        this.canard = (Canard)obj;
    }
}