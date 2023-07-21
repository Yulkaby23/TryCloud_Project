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


    @And("user should see all {string}")
    public void userShouldSeeAll(String expectedNames) {

        List<String> actualNames = BrowserUtils.getElementsText(contactsModule.contactsColum.findElements(By.xpath("//div[@class='vue-recycle-scroller__item-wrapper']")));



    }


    @And("number of contacts should match with digit in All contact tab")
    public void numberOfContactsShouldMatchWithDigitInAllContactTab() {

        System.out.println("contactsModule.digitContactsCount.isDisplayed() = " + contactsModule.digitContactsCount.isDisplayed());
        System.out.println("contactsModule.digitContactsCount.getText() = " + contactsModule.digitContactsCount.getText());
    }


    @Then("user click on upload picture")
    public void user_click_on_upload_picture() {
        contactsModule.uploadPicture.click();
    }

    @And("user click on Choose from Files")
    public void useClickOnUploadANewPicture() {

        String path1 = "C:\\Users\\milan\\Desktop\\CYDEO\\John Wick picture.jpg";
        contactsModule.chooseFromFile.sendKeys(path1);

        WebElement johnWickPicture = Driver.getDriver().findElement(By.xpath("(//div[@class='avatardiv popovermenu-wrapper app-content-list-item-icon'])[1]"));
        BrowserUtils.sleep(2);
        System.out.println("johnWickPicture.isDisplayed() = " + johnWickPicture.isDisplayed());


        WebElement marcoPoloPicture = Driver.getDriver().findElement(By.xpath("(//div[@class='avatardiv popovermenu-wrapper app-content-list-item-icon'])[2]"));
        BrowserUtils.sleep(2);
        System.out.println("marcoPoloPicture.isDisplayed() = " + marcoPoloPicture.isDisplayed());

 }



    @And("user click on choose button")
    public void userClickOnChooseButton() {
        contactsModule.chooseButton.click();
    }


  @And("user click in the first element in the colum")
   public void userClickInTheFirstElementInTheColum() {
       contactsModule.firstElementInColum.click();
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
