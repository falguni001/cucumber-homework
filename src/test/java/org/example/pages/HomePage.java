package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    @FindBy(xpath = "//div[@class='topic-block-title']/h2")
    private WebElement textOnHomePage;

    @FindBy(xpath = "//*[@class='header-menu']/ul[1]/li[5]")
    private WebElement bookMenuButton;

    @FindBy(xpath = "//*[@class='header-menu']/ul[1]/li[6]")
    private WebElement jewelryMenuButton;

    @FindBy(xpath = "//*[@class='header-links']/ul[1]/li[1]")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@class='header-links']/ul[1]/li[2]")
    private WebElement logInButton;


     public String getTextFromHomePage(){

      return   textOnHomePage.getText();

     }

     public void clickOnBooks(){
         waitForElementVisibility(bookMenuButton, 40, "web element is not visible");
         bookMenuButton.click();
     }

    public void clickOnJewelry(){

         jewelryMenuButton.click();
    }

    public void clickOnRegister() {
         registerButton.click();
    }

    public void clickOnLogIn() {
         logInButton.click();
    }
}
