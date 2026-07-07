import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class XpathDemo {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/images");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Queen",Keys.ENTER);
        Thread.sleep(2000);

        
        driver.findElement(By.xpath("//a[href='/images']")).click();


        driver.navigate().to("https://www.bing.com/images");

        Thread.sleep(3000);
        driver.quit();

    
    }
}
