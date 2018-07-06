
import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class FirstTest {

    @Test
    public void openBrowser(){
       /* String exePath = "C:\\workspace\\LearningHTMLUnit\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);*/
        HtmlUnitDriver driver=new HtmlUnitDriver(true);
        driver.get("http://www.google.com");
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
