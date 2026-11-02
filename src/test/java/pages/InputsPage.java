package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputsPage {
    private WebDriver driver;

    private By inputField = By.tagName("input");

    public InputsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/inputs");
    }

    public WebElement getInput() {

        return driver.findElement(inputField);
    }

    public void pressKey(CharSequence...keys) {
        WebElement input = getInput();
        input.click();
        input.sendKeys(keys);
    }

    public String getInputValue() {
        return getInput().getAttribute("value");
    }

    public void enterText(String text) {
        WebElement input =getInput();
        input.clear();
        input.sendKeys(text);
    }
}

