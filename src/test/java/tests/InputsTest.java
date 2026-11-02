package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;
import org.openqa.selenium.Keys;


public class InputsTest extends BaseTest {

    @Test
    public void testInputs() {
        InputsPage page = new InputsPage(driver);
        page.open();


        page.enterText("100");
        Assert.assertEquals(page.getInputValue(), "100", "Поле должно содержать 100");


        page.pressKey(Keys.ARROW_UP);
        Assert.assertEquals(page.getInputValue(), "101", "Значение должно увеличиться до 101");


        page.pressKey(Keys.ARROW_DOWN);
        Assert.assertEquals(page.getInputValue(), "100", "Значение должно уменьшиться до 100");

        page.enterText("abc");

        Assert.assertEquals(page.getInputValue(), "", "Буквы не должны вводиться в поле number");
    }
}



