package com.try_cloud.pages;

import com.try_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Dashboard'])[1]")
    public WebElement dashboardModule;


    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesModule;

    @FindBy(xpath = "(//a[@aria-label='Photos'])[1]")
    public WebElement photosModule;

    @FindBy(xpath = "(//a[@aria-label='Activity'])[1]")
    public WebElement activityModule;

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkModule;

    @FindBy(xpath = "(//a[@aria-label='Mail'])[1]")
    public WebElement mailModule;

    @FindBy(xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement contactsModule;

    @FindBy(xpath = "//a[@aria-label='More apps']")
    public WebElement moreModule;

    @FindBy(id="expand")
    public WebElement userButton;

    @FindBy(xpath="//span[@title='Employee12']")
    public WebElement username;

    @FindBy(linkText="Customize")
    public WebElement customizeButton;


    @FindBy(xpath = "//label[normalize-space(text())='Status']")
    public WebElement statusWidget;

    @FindBy(xpath = "//label[normalize-space(text())='Weather']")
    public WebElement weatherWidget;

    @FindBy(xpath = "//label[normalize-space(text())='Important mail']")
    public WebElement importantMailWidget;

    @FindBy(xpath = "//label[normalize-space(text())='Recent statuses']")
    public WebElement recentStatusesWidget;

    @FindBy(xpath = "//label[normalize-space(text())='Upcoming events']")
    public  WebElement upcomingEventsWidget;

    @FindBy(xpath = "//label[normalize-space(text())='Unread Mail']")
    public WebElement unreadMailWidget;

    @FindBy(xpath = "//label[normalize-space(text())='Upcoming cards']")
    public WebElement upcomingCardsWidget;

    @FindBy(xpath = "//label[normalize-space(text())='Recommended files']")
    public WebElement recommendedFilesWidget;

    @FindBy(xpath = "//label[normalize-space(text())='Talk mentions']")
    public WebElement talkMentionsWidget;

    @FindBy(xpath = "//button[@href='#']")
    public WebElement statusButton;

    @FindBy(xpath = "//label[normalize-space(text())='Online']")
    public WebElement onlineButton;

    @FindBy(xpath = "//label[normalize-space(text())='Away']")
    public WebElement awayButton;

    @FindBy(xpath = "//label[normalize-space(text())='Do not disturb']")
    public WebElement dNdButton;

    @FindBy(xpath = "//label[normalize-space(text())='Invisible']")
    public WebElement invisibleButton;







}
