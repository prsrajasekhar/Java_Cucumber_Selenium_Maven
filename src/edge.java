import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLImageElement;

public class edge {
    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\rajas\\Desktop\\Selenium\\microsoft edge\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com");
        WebElement logo= driver.findElement(By.className("login_logo"));
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(logo));
        WebElement username= driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password_field= driver.findElement(By.xpath("//div[@id='login_button_container']/div/form/div[2]/input"));
        password_field.sendKeys("secret_sauce");
        WebElement login_button= driver.findElement(By.name("login-button"));
        login_button.click();


       // driver.quit();

    }
}
