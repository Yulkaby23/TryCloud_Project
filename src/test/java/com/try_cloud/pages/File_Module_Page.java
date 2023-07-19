package com.try_cloud.pages;

import com.try_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class File_Module_Page {

    public File_Module_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement filesModule;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement ButtonNew;

    @FindBy(xpath = "//label[@data-action='upload']")
    public WebElement UploadFile;

    @FindBy(xpath = "//a[@data-templatename = 'New folder']")
    public WebElement NewFolder;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement SubmitButton;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement ThreeDotsMenu;

    @FindBy(xpath = "//a[@class='menuitem action action-delete permanent']")
    public WebElement DeleteOption;

    @FindBy(xpath = "//td[@class='filesummary']")
    public WebElement NumberOfFilesAndFolders;


}

