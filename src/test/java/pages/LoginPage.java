package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.WebDriverManager;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }


        @FindBy(xpath = "//*[text()='Interview App']")
        public WebElement loginPage;

    }
