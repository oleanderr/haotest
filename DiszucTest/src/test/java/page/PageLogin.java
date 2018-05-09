package page;

import org.openqa.selenium.By;

/**
 * Created by 35870 on 2018/5/7.
 */
public class PageLogin {
    //用户名
    public static final By LOGIN_INPUT_USERNAME=By.id("ls_username");
    //密码
    public static final By LOGIN_INPUT_PASSWORD=By.id("ls_password");
    //登录按钮
    public static final By LOGIN_BUTTON_SUBMIT=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
    //退出
    public static final By LOGIN_LINK_TUICHU=By.linkText("退出");
    //点击管理中心链接
    public static final By LOGIN_LINK_GUANLI=By.linkText("管理中心");
    //登录管理中心的密码
    public static final By LOGIN_INPUT_ADMINPWD=By.xpath("//*[@id=\"loginform\"]/p[4]/input");
    //登录管理中心按钮
    public static final By LOGIN_BUTTON_ADMINYES=By.xpath("//*[@id=\"loginform\"]/p[9]/input");






}
