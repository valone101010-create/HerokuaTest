package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SortableTablesPage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortableTablesTest extends BaseTest {

    public SortableTablesTest(WebDriver driver) {
        super();
    }

    @Test
    public void testSortByLastName() {
        SortableTablesPage page = new SortableTablesPage(driver);
        page.open();


        page.clickLastNameHeader();

        List<String> actualNames = page.getLastNames();


        List<String> expectedNames = new ArrayList<>(actualNames);
        expectedNames.sort(String.CASE_INSENSITIVE_ORDER);


        Assert.assertEquals(actualNames, expectedNames, "Таблица должна быть отсортирована по фамилии по алфавиту");
    }
}






