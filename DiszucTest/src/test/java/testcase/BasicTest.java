package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.BrowserUtil;
import util.LogConfiguration;
import util.SeleniumUtil;

import java.io.IOException;

/**
 * Created by 35870 on 2018/5/7.
 */
public class BasicTest {
    public WebDriver driver=null;
    public SeleniumUtil seleniumUtil=null;
    @BeforeMethod
    public void setup() throws IOException {
        LogConfiguration.initLog();
        seleniumUtil=new SeleniumUtil();
        //System.setProperty("webdriver.chrome.driver","D:\\学习\\linux  自动化测试\\软件\\chrome&driver\\chromedriver.exe");
        String qudong=BrowserUtil.qudong();
        String dizhi=BrowserUtil.dizhi();
        System.setProperty(qudong,dizhi);
        String browser=BrowserUtil.browser();
        driver=seleniumUtil.getDriver(browser);
        seleniumUtil.url("http://127.0.0.1/Discuz/forum.php");



    }

    @AfterMethod
    public void teardown(){
//        if(driver!=null){
//            driver.quit();
//        }
    }
}
