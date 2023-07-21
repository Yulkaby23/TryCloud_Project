package com.try_cloud.step_definitions;

import com.try_cloud.pages.File_Module_Page;
import com.try_cloud.pages.LoginPage;
import com.try_cloud.utilities.BrowserUtils;
import com.try_cloud.utilities.ConfigurationReader;
import com.try_cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.handler.codec.http.multipart.FileUpload;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class File_Module_StepDefinitions {

    File_Module_Page fileModulePage = new File_Module_Page();
    @Given("User is on the TryCloud dashboard page")
    public void user_is_on_the_try_cloud_dashboard_page() {
    }

    @When("User click the files module")
    public void user_click_the_files_module() {
        fileModulePage.filesModule.click();
    }

    @When("User click the Add button")
    public void user_click_the_add_button() {
        fileModulePage.buttonNew.click();
    }

    @When("User click on the Upload file button")
    public void user_click_on_the_upload_file_button() {
    }

    @When("User select a file to upload")
    public void user_select_a_file_to_upload() {

        //fileModulePage.UploadFile.click();
        Driver.getDriver().get(ConfigurationReader.getProperty("uploading.file.url"));
        String path = "/Users/daraboldina/Desktop/CYDEO.docx";
        fileModulePage.uploadFile.sendKeys(path);

    }

    @When("User click the Upload button")
    public void user_click_the_upload_button() {

    }

    @Then("User should see uploaded file")
    public void user_should_see_uploaded_file() {
        fileModulePage.newFileName.isDisplayed();
    }

    @And("User click on the New Folder button")
    public void userClickOnTheNewFolderButton() {
        fileModulePage.newFolder.click();
    }

    @And("User enter a folder name NewFolder")
    public void userEnterAFolderNameNewFolder() {
        fileModulePage.newFolderInput.sendKeys("New folder", Keys.ENTER);
        BrowserUtils.sleep(3);
    }
    @And("User click the Create button")
    public void userClickTheCreateButton() {

    }

    @Then("User should see a new folder named {string}")
    public void userShouldSeeANewFolderNamed(String expectedFolderName) {
        String actualFolderName = fileModulePage.newFolderUploaded.getText();

        Assert.assertEquals(actualFolderName,expectedFolderName);

    }

    @Given("User is on the TryCloud files page")
    public void userIsOnTheTryCloudFilesPage() {
    }

    @When("User click the three dots menu of the selected item")
    public void userClickTheThreeDotsMenuOfTheSelectedItem() {
        fileModulePage.threeDotsMenu.click();
    }

    @And("User chooses the Delete option")
    public void userChoosesTheDeleteOption() {
        fileModulePage.deleteOption.click();
    }

    @Then("User should see the selected item should be deleted")
    public void userShouldSeeTheSelectedItemShouldBeDeleted() {

        try {
            Assert.assertFalse(fileModulePage.newFolder.isDisplayed());
        }catch(NoSuchElementException n){
            System.out.println("NoSuchElementException is thrown. It mean that the New file is not on the page.");
            Assert.assertTrue(true);
        }



    }

    @Then("User should see the total number of files and folders under the files list table")
    public void userShouldSeeTheTotalNumberOfFilesAndFoldersUnderTheFilesListTable() {
        fileModulePage.numberOfFiles.isDisplayed();
        fileModulePage.numberOfFolders.isDisplayed();

        System.out.println("Number of Files : " + fileModulePage.numberOfFiles.getText());
        System.out.println("Number of Folders: " + fileModulePage.numberOfFolders.getText());







    }
}




