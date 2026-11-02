package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElements;


public class AddRemoveElementsTest extends BaseTest{


    @Test
    public void testAddTwoRemoveOneAndVerifyCount(){
        AddRemoveElements page = new AddRemoveElements(driver);
        page.open();

        page.clickAddElement();
        page.clickAddElement();

        Assert.assertEquals(page.getDeleteButtonsCount(),2);

        page.clickAddElement();

        Assert.assertEquals(page.getDeleteButtonsCount(),1);
    }
}

