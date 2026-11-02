package pages;

import org.openqa.selenium.WebDriver;


public class CheckboxesPage {
    private WebDriver driver;

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

        public void open (){
        driver.get("https://the-internet.herokuapp.com/checkboxes");

}
}
