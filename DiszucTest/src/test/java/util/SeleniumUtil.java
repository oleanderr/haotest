package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

/**
 * Created by 35870 on 2018/5/7.
 */
public class SeleniumUtil {
    private static Logger logger=Logger.getLogger(SeleniumUtil.class);
    public WebDriver driver=null;

    //获取webdriver
    public WebDriver getDriver(String driverType){
        if(driverType.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();

            logger.info("启动chromedriver");
        }else if(driverType.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
            logger.info("启动firefox");
        }else{
            logger.error("不能识别的浏览器");
        }
        return driver;
    }

    //识别元素
    public WebElement findElement(By by){
        WebElement ele=null;
        try{
            ele = driver.findElement(by);
            logger.info("找到元素:"+getLocatorByElement(ele,">"));
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("元素未找到");
        }
        return ele;
    }

    //打开网址
    public void url(String url){
        driver.get(url);
        logger.info("打开网址:"+url);
    }

    //识别一组元素
    public List<WebElement> findElements(By by){
        logger.info("返回一组元素");

        return driver.findElements(by);
    }

    //清空元素上的内容
//    public void clear(WebElement ele){
//        ele.clear();
//        logger.info("清空元素:"+ele.toString());
//    }
    public void clear(By by){
        WebElement webElement=findElement(by);
        webElement.clear();
        logger.info("清空元素：" +getLocatorByElement(webElement,">"));
    }

    //文本框中输入内容
//    public void sendKeys(String content,WebElement ele){
//        clear(ele);
//        ele.sendKeys(content);
//        logger.info("输入内容:"+content);
//    }
    public void sendKeys(By by, String txt){
        WebElement webElement=findElement(by);
        clear(by);
        webElement.sendKeys(txt);
        logger.info("在元素"+getLocatorByElement(webElement,">")+"上输入内容：" + txt);
    }

    //对元素做点击操作
    public void click(WebElement ele){
        ele.click();
        logger.info("点击元素:"+ele.toString());
    }
    public void click(By by){
        WebElement webElement=findElement(by);
        webElement.click();
        logger.info("对元素：" + getLocatorByElement(webElement, ">") + ":做点击操作");
    }

    //获取元素内容
    public String getText(WebElement ele){
        String con=ele.getText();
        logger.info("获取文本:"+con);
        return con;
    }


    //根据顶部title判断当前页面是否是预期页面
    public void assertPage(String title,WebDriver driver1){
        String title1=driver1.getTitle();
        if(title1.equals(title)){
            logger.info("页面是预期页面");
        }else{
            logger.error("页面不是预期页面");
        }

//        try{
//            Assert.assertEquals(title,title1);
//        }catch (AssertionError e){
//            logger.error(""+title+"但是"+title1);
//        }
//        logger.info("是预期页面");
    }


    //校验元素是否存在
    public Boolean isExist(By ele){
        try{
            driver.findElement(ele);
            logger.info(ele.toString()+"元素存在");
            return true;
        }catch (NoSuchElementException e){
            logger.info("元素不存在");
            return false;
        }


    }

    //检验文本是否与预期一致
    public Boolean assertForText(WebElement ele,String text){
        try{
            Assert.assertEquals(text,ele.getText());
            logger.info("与预期一致");
            return true;
        }catch (AssertionError e){
            logger.error("预期是:"+text+"但是实际是："+ele.getText());
            return false;
        }

    }

    //返回元素的定位值（从你定义的字符返回）
    public String getLocatorByElement(WebElement ele,String Exceptext){
        String text=ele.toString();
        String excel=null;
        try{
            excel=text.substring(text.indexOf(Exceptext)+1,text.length()-1);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("返回失败"+Exceptext);
        }
        return excel;
    }


    /**设置显示等待元素,默认10秒*/
    public void waitForElementLoad(By by){
        waitForElementLoad(by,10);
    }
    //等待页面元素加载
    public void waitForElementLoad(final By by,int timeout){
        logger.info("查找元素："+by);
        try{
            WebDriverWait wait=new WebDriverWait(driver,timeout,1000);
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        }catch (TimeoutException e){
            logger.error("超时！"+timeout+"秒后仍旧没找到元素"+by);

        }
        logger.info("找到了元素："+by);

    }
    //切换浏览器通过ifream id
    public void qiehuanifream(String freamId){

        driver.switchTo().frame(freamId);
    }
    //切换回原来浏览器
    public void qiehuanifream(){

        driver.switchTo().defaultContent();
    }

//    public void alert(){
//        driver.switchTo().alert().accept();
//
//    }
    //切换到新窗口
    public void newwindows(){
        Set<String> windows =driver.getWindowHandles();
        for(String handle:windows){
            driver.switchTo().window(handle);
        }


    }






}
