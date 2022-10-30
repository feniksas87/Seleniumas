import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import static java.lang.Thread.sleep;

public class First {
    public static void main(String[] args) throws InterruptedException {
        //String var = " ";
        System.setProperty("webdriver.chrome.driver","C:\\Java\\Seleniumas\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        sleep(500);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]")).click();
        sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        WebElement searchbar = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchbar.sendKeys(new String[]{"selenium java"});
        searchbar.sendKeys(Keys.ENTER);
        sleep(1500);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[1]/a/img")).click();
        sleep(1500);
        WebElement searchbar2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchbar2.sendKeys(new String[]{"Nul"});
        searchbar2.sendKeys(Keys.ENTER);
        sleep(1500);
        driver.quit();
    }
}
