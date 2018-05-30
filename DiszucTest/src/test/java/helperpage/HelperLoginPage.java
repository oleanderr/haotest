package helperpage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.PageFatie;
import page.PageLogin;
import util.SeleniumUtil;

/**
 * Created by 35870 on 2018/5/7.
 */
public class HelperLoginPage {
   // public static Logger logger=Logger.getLogger(HelperLoginPage.class);
    //用户名输入
    public static void inputusername(SeleniumUtil seleniumUtil,String username){
        seleniumUtil.sendKeys(PageLogin.LOGIN_INPUT_USERNAME,username);
    }
    //密码输入
    public static void inputpassword(SeleniumUtil seleniumUtil,String pwd){
        seleniumUtil.sendKeys(PageLogin.LOGIN_INPUT_PASSWORD,pwd);
    }
    //登录按钮点击
    public static void clicksubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_BUTTON_SUBMIT);
    }
    //登录
    public static void login(SeleniumUtil seleniumUtil,String name,String pwd){
        inputusername(seleniumUtil,name);
        inputpassword(seleniumUtil,pwd);
        clicksubmit(seleniumUtil);
    }

    //退出
    public static void tuichu(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_LINK_TUICHU);
    }
    //点击管理中心
    public static void clickguanli(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_LINK_GUANLI);
    }
    //输密码
    public static void inputpwd(SeleniumUtil seleniumUtil,String pwd){
        seleniumUtil.newwindows();
        seleniumUtil.sendKeys(PageLogin.LOGIN_INPUT_ADMINPWD,pwd);
    }
    //点击确定按钮
    public static void clickbutton(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_BUTTON_ADMINYES);
    }
    //登录管理中心
    public static void adminlogin(SeleniumUtil seleniumUtil,String pwd){
        clickguanli(seleniumUtil);
        inputpwd(seleniumUtil,pwd);
        clickbutton(seleniumUtil);
    }

}
