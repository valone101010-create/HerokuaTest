package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebDriver;

import java.util.List;

public class DropdownPage {
    private WebDriver driver;

    private final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    public Select getSelect() {
        return new Select(driver.findElement(dropdown));
    }

    public List<WebElement> getOptions() {
        return getSelect().getOptions();
    }

    public void selectByVisibleText(String text) {
        getSelect().selectByVisibleText(text);
    }

    public String getSelectedOptionText() {
        return getSelect().getFirstSelectedOption().getText();
    }

    public void selectOptionByIndex(int i) {
        getSelect().selectByIndex(i);

    }


}







