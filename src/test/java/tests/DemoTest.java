package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DemoTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com");
    }

    @Test
    public void testFirstTitle() {
        String expectedTitle = "The Internet";
        assertEquals(expectedTitle, driver.getTitle());
    }

    @Test
    public void testSecondTitle() {
        String expectedTitle = "The";
        assertNotEquals(expectedTitle, driver.getTitle());
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}