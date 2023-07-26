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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class US003_ContactsModuleDef {

    ContactsModulePage_Milan contactsModule = new ContactsModulePage_Milan();

    @Then("user is on dashborad of app")
    public void userIsOnDashboradOfApp() {

    }

    @When("user click on Contacts module")
    public void user_click_on_contacts_module() {
        contactsModule.contactLink.click();
    }

    @When("user should see New contact and click on it")
    public void user_should_see_new_contact_and_click_on_it() {
        contactsModule.newContact.click();
    }

    @And("user click on New contact full name filed")
    public void userClickOnNewContactFullNameFiled() {
        contactsModule.newContactFullName.click();
    }

    @Then("user enter {string} in New contact field")
    public void userEnterInNewContactField(String fullName) {
        contactsModule.newContactFullName.sendKeys(fullName);
    }

    @When("user click on All contacts")
    public void userClickOnAllContacts() {
        contactsModule.allContacts.click();
    }


    @And("user should see all entered names")
    public void userShouldSeeAll() {

       // Assert.assertTrue(contactsModule.allNamesInColum.);


    }


    @And("number of contacts should match with digit in All contact tab")
    public void numberOfContactsShouldMatchWithDigitInAllContactTab() {

        String actualNames = contactsModule.contactsColum.getText();

        Assert.assertEquals(contactsModule.digitContactsCount.getText(), contactsModule.allNamesInColum.size()+"");
    }


    @Then("user click on upload picture")
    public void user_click_on_upload_picture() {
        contactsModule.uploadPicture.click();
    }

    @And("user click on Choose from Files")
    public void useClickOnUploadANewPicture() {

        String path = "C:\\Users\\milan\\Desktop\\CYDEO\\John Wick picture.jpg";
        contactsModule.chooseFromFile.sendKeys(path);


    }

    @And("user click on choose button")
    public void userClickOnChooseButton() {
        contactsModule.chooseButton.click();
    }


    @And("user click in the first element in the colum")
    public void userClickInTheFirstElementInTheColum() {
        contactsModule.allNamesInColum.get(0).click();
    }

    @And("user click on three dots")
    public void userClickOnThreeDots() {
        contactsModule.threeDots.click();
    }

    @Then("user delete contact by clicking on Delete button")
    public void userDeleteContactByClickingOnDeleteButton() {
        contactsModule.deleteButton.click();
    }


}
