package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.LoginPage;
import utils.WebDriverManager;

import java.util.Map;

public class LoginSteps implements CommonPage {
    LoginPage loginPage;

    public LoginSteps(){
        loginPage = new LoginPage();
    }

    @Then("Verifies title of the page is {string}")
    public void verifies_title_of_the_page_is(String string) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, string))));
        Assert.assertEquals("Interview App", WebDriverManager.getDriver().getTitle());
    }


    @When("User will enters credentials:")
    public void userWillEntersCredentials(Map<String, String> credentials) {
        for(String key: credentials.keySet()){
            WebDriverManager.sendKeys(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, key)),credentials.get(key));
        }
    }



    @And("User clicks on {string} button")
    public void userClicksOnButton(String logBtn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, logBtn))).click();

    }

    @And("Verify Title {string} is displayed")
    public void verifyTitleIsDisplayed(String titleInterviewPage) {
        Assert.assertEquals(titleInterviewPage, WebDriverManager.getDriver().getTitle());
    }


    @Then("Verify {string} Button is displayed")
    public void verifyButtonIsDisplayed(String signOutBtn) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, signOutBtn))));

    }

    @And("User should not access {string} Button")
    public void userShouldNotAccessButton(String manageAccessBtn) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT,manageAccessBtn))));
    }
}
