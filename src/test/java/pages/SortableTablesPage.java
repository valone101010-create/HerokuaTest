package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class SortableTablesPage {
    private WebDriver driver;

    public SortableTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("http://the-internet.herokuapp.com/tables");
    }

    public void clickLastNameHeader() {
        driver.findElement(By.xpath("//table[@id='table1']//th/span[text()='Last Name']")).click();
    }

    public List<String> getLastNames() {
        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
        List<String> names = new ArrayList<>();
        for (WebElement element : elements) {
            names.add(element.getText());
        }
        return names;
    }
}