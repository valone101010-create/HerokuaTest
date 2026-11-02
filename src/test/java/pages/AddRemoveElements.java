package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElements {
    private WebDriver driver;

    private By addButton = By.xpath("//button[text()='Add Element']");
    private By deleteButton = By.xpath("//button[text()='Delete']");

    public AddRemoveElements(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
    }

    public void clickAddElement() {
        driver.findElement(addButton).click();
    }

    public void clickDeleteElement() {
        driver.findElement(deleteButton).click();
    }

    public int getDeleteButtonsCount() {
        List<WebElement> buttons = driver.findElements(deleteButton);
        return buttons.size();
    }

}
