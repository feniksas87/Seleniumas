import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.Thread.sleep;

public class Google {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Java\\Seleniumas\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        sleep(1500);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]")).click();
        sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        WebElement searchbar = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchbar.sendKeys(new String[]{"distrowatch"});
        searchbar.sendKeys(Keys.ENTER);
        sleep(1500);
        driver.findElement(By.linkText("Popular distro")).click();
        sleep(1500);
        WebElement  searchbardistrowatch = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[1]/form/input[1]"));
        searchbardistrowatch.sendKeys(new String[]{"Ubuntu"});
        searchbardistrowatch.sendKeys(Keys.ENTER);
        driver.findElement(By.partialLinkText("https://www.ubuntu.com/")).click();
        sleep(2000);
        driver.findElement(By.xpath("/html/body/dialog/div/div/div/p[4]/button[1]")).click();
        driver.quit();
    }
}
