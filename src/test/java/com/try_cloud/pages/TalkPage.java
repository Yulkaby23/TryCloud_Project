package com.try_cloud.pages;

import com.try_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPage extends BasePage {

    public TalkPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@aria-label='Create a new group conversation']")
    public WebElement newConversationButton;

    @FindBy(xpath = "//label[@class='conversation-type__label']")
    public WebElement allowGuestsCheckBox;

    @FindBy(xpath = "//input[@placeholder='Conversation name']")
    public WebElement conversationNameInput;

    @FindBy(xpath = "(//div[@class='participant-row__user-descriptor'])[2]")
    public  WebElement participantEmployee1;

    @FindBy(xpath = "//button[normalize-space(text())='Add participants']")
    public WebElement addParticipantsButton;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement closeButton;


    @FindBy(xpath = "//div[@class='participants-search-results scrollable']")
    public WebElement participantsList;

    @FindBy(xpath = "//button[normalize-space(text())='Create conversation']")
    public WebElement createConversationButton;

    @FindBy(xpath = "//button[@class='top-bar__button top-bar__button primary']")
    public WebElement startCallBtn;

    @FindBy(xpath = "//button[@class='top-bar__button top-bar__button primary']")
    public WebElement leaveCallBtn;


    @FindBy(xpath = "(//button[@aria-label='Conversation settings'])[1]")
    public WebElement dropdownConversationSetting;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[7]")
    public WebElement deleteConversationBtn;










}
