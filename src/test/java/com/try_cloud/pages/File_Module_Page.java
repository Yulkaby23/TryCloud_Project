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
    public WebElement buttonNew;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFile;




    @FindBy(xpath = "//a[@data-templatename = 'New folder']")
    public WebElement newFolder;

    @FindBy(id = "view13-input-folder")
    public WebElement newFolderInput;

    @FindBy(xpath = "//span[@class='nametext']")
    public WebElement newFolderUploaded;



    @FindBy(xpath = "//input[@type='submit']")
    public WebElement SubmitButton;

    @FindBy(xpath = "//span[@class='nametext']")
    public WebElement newFileName;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement threeDotsMenu;

    @FindBy(xpath = "//a[@class='menuitem action action-delete permanent']")
    public WebElement deleteOption;

    @FindBy(xpath = "//span[@class='dirinfo']")
    public WebElement numberOfFiles;

    @FindBy(xpath = "//span[@class='fileinfo']")
    public WebElement numberOfFolders;







}

