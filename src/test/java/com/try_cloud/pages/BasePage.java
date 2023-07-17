package com.try_cloud.pages;




import com.try_cloud.utilities.BrowserUtils;
import com.try_cloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {



    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




    /**
     * This method needs to be finished!!!
     * @param text
     */
    public void clickMenuByText(String text){
        String locator = "(//a[contains(.,'" +text+"')])[1]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        //then we need to move to the element and click it
    }







}
