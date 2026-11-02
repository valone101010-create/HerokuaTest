package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;
import org.openqa.selenium.WebDriver;


import java.util.List;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdown() {
        DropdownPage page = new DropdownPage(driver);
        page.open();


        List<WebElement> options = page.getOptions();

        Assert.assertEquals(options.size(), 3);


        page.selectOptionByIndex(1);
        Assert.assertEquals(page.getSelectedOptionText(), "Option1");


        page.selectOptionByIndex(2);
        Assert.assertEquals(page.getSelectedOptionText(), "Option 2");
    }
}






