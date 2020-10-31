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

    @When("I am asked to cancaner")
    public void cancaner() {
        this.actualAnswer = this.canard.cancaner();
    }

    @Then("I should say Je cancane!")
    public void i_should_say() {
        assertEquals("Je cancane!", this.actualAnswer);
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
        //this.canard = new Canard(classTemp.newInstance();
        // this.canard = new classTemp();
    }
}