import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


private WebDriver driver;

private final By checkboxes = By.cssSelector("[type=checkbox]");

public void CheckboxesPage(WebDriver driver) {
    this.driver = driver;
}

public void open() {
    driver.get("https://the-internet.herokuapp.com/checkboxes");
}

public List<WebElement> getCheckboxes() {
    return driver.findElements(checkboxes);
}

public boolean isCheckboxSelected(int index) {
    return getCheckboxes().get(index).isSelected();
}

public void setCheckboxState(int index, boolean state) {
    WebElement cb = getCheckboxes().get(index);
    if (cb.isSelected() != state) {
        cb.click();
    }
}


public static class Checkboxes {


}

void main() {
}
