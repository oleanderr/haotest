package testcase;

import helperpage.HelperLoginPage;
import org.openqa.selenium.WebDriver;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by 35870 on 2018/5/8.
 */
public class ceshi {
    public static void main(String[] args) {
        SeleniumUtil seleniumUtil=new SeleniumUtil();
        LogConfiguration.initLog();
        seleniumUtil=new SeleniumUtil();
        System.setProperty("webdriver.chrome.driver","D:\\学习\\linux  自动化测试\\软件\\chrome&driver\\chromedriver.exe");
        WebDriver driver=seleniumUtil.getDriver("chrome");
        seleniumUtil.url("http://127.0.0.1/Discuz/forum.php");
        HelperLoginPage.login(seleniumUtil,"admin","admin");

    }
}
