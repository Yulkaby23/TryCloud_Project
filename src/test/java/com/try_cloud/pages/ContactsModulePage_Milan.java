package com.try_cloud.pages;

import com.try_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsModulePage_Milan {

    public ContactsModulePage_Milan(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement contactLink;

@FindBy(id = "new-contact-button")
    public WebElement newContact;


@FindBy(id = "contact-fullname")
public WebElement newContactFullName;

@FindBy(xpath = "//span[@title='All contacts']")
public WebElement allContacts;

@FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[1]")
public WebElement digitContactsCount;

@FindBy(xpath = "//div[@class='vue-recycle-scroller__item-wrapper']")
public WebElement contactsColum;

@FindAll({@FindBy(xpath = "//div[@class='vue-recycle-scroller__item-wrapper']/div/div/div[contains(@class, 'line-one')]")})
public List<WebElement> allNamesInColum;

@FindBy(xpath = "(//div[@class='trigger'])[6]")
public WebElement uploadPicture;


@FindBy(xpath = "(//button[@class='action-button focusable'])[6]")
public WebElement chooseFromFile;

@FindBy(xpath = "//button[.='Choose']")
public WebElement chooseButton;

@FindBy(xpath = "(//button[@aria-label='Actions'])[6]")
    public WebElement threeDots;

@FindBy(xpath = "(//span[@class='action-button__text'])[6]")
public WebElement deleteButton;

}
