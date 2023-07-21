package com.try_cloud.step_definitions;

import com.try_cloud.pages.BasePage;
import com.try_cloud.pages.LoginPage;
import com.try_cloud.pages.TalkPage;
import com.try_cloud.utilities.BrowserUtils;
import com.try_cloud.utilities.ConfigurationReader;
import com.try_cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Talk_StepsDefinitions {

    LoginPage BasePage = new LoginPage();
    TalkPage TalkBasePage = new TalkPage();



    @Given("user is already on the home page")
    public void userIsAlreadyOnTheHomePage() {
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/login");
        BasePage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));

    }


    @When("user clicks on {string} module")
    public void user_clicks_on_module(String string) {
        TalkBasePage.talkButton.click();
        BrowserUtils.sleep(1);
    }


    @And("user clicks on {string} plus button")
    public void userClicksOnPlusButton(String arg0) {

        TalkBasePage.newConversationButton.click();
        BrowserUtils.sleep(2);
    }



    @Then("user names the conversation created")
    public void userNamesTheConversationCreated() {

        TalkBasePage.conversationNameInput.sendKeys("My conversation");
    }


    @And("user check the box {string}")
    public void userCheckTheBox(String arg0) {
        TalkBasePage.allowGuestsCheckBox.click();
    }


    @Then("user clicks on {string}")
    public void user_clicks_on(String string) {

        TalkBasePage.addParticipantsButton.click();

    }

    @Then("user select participants")
    public void user_select_participants() {

       /* List<WebElement> radioButtons = (List<WebElement>) TalkBasePage.participantsList;

        for (WebElement each : radioButtons) {
            String eachParticipant = each.getAttribute("class");
            System.out.println("eachParticipant = " + eachParticipant);

            if (eachParticipant.contains("participant-row")){
                each.click();
                System.out.println(eachParticipant + " is selected " + each.isSelected());
                break;
            }

        }*/

        TalkBasePage.participantEmployee1.click();

    }

    @Then("user clicks on {string} button")
    public void userClicksOnButton(String arg0) {
        TalkBasePage.createConversationButton.click();
    }

    @Then("user clicks on the button {string}")
    public void userClicksOnTheButton(String arg0) {
        TalkBasePage.closeButton.click();
    }




    @And("user clicks on start call")
    public void userClicksOnStartCall() {
        TalkBasePage.startCallBtn.click();
    }

    @Then("user clicks on leave call")
    public void userClicksOnLeaveCall() {
        TalkBasePage.leaveCallBtn.click();
    }


    @Then("user clicks on the {string}")
    public void userClicksOnThe(String arg0) {
        TalkBasePage.dropdownConversationSetting.click();
    }


    @Then("user clicks on the  {string}")
    public void user_clicks_on_the(String string) {
        TalkBasePage.deleteConversationBtn.click();
    }



}
