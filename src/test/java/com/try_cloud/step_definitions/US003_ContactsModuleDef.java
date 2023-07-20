package com.try_cloud.step_definitions;

import com.try_cloud.pages.ContactsModulePage_Milan;
import com.try_cloud.utilities.BrowserUtils;
import com.try_cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class US003_ContactsModuleDef {

    ContactsModulePage_Milan contactsModule = new ContactsModulePage_Milan();


    @When("user click on Contacts module")
    public void user_click_on_contacts_module() {
        contactsModule.contactLink.click();
    }

    @When("user should see New contact and click on it")
    public void user_should_see_new_contact_and_click_on_it() {
        contactsModule.newContact.click();
    }

    @Then("user enter {string} in New contact field")
    public void userEnterInNewContactField(String fullName) {
        contactsModule.newContactFullName.sendKeys(fullName);
    }


    @When("user click on All contacts")
    public void userClickOnAllContacts() {
        contactsModule.allContacts.click();
    }

    @And("user should see all created contacts")
    public void userShouldSeeAllCreatedContacts(String expectedName) {

        String actualName = contactsModule.contactsColum.getText();

        BrowserUtils.getElementsText(contactsModule.contactsColum.findElements(By.xpath("//div[@class='vue-recycle-scroller__item-wrapper']")));

        Assert.assertEquals(actualName,expectedName);
    }

    @Then("number of contacts should much with digit in All contact tab")
    public void numberOfContactsShouldMuchWithDigitInAllContactTab() {
        int expectedNum = 4;

        Assert.assertEquals(contactsModule.digitContactsCount.getText(), expectedNum);
    }


}
