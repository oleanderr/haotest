package testcase;

import helperpage.HelperDelete;
import helperpage.HelperFaTie;
import helperpage.HelperGuanliPage;
import helperpage.HelperLoginPage;
import org.testng.annotations.Test;
import page.PageLogin;

/**
 * Created by 35870 on 2018/5/7.
 */
public class LoginTest extends BasicTest {



    @Test
        /*
     用户登录       默认板块发帖     默认板块回帖   用户退出
         */
    public void login() throws InterruptedException {

        HelperLoginPage.login(seleniumUtil,"admin","admin");
        Thread.sleep(2000);
        HelperFaTie.tijiao(seleniumUtil,"haotest","haotest","e_iframe");
        HelperFaTie.huifu(seleniumUtil,"test");
        HelperLoginPage.tuichu(seleniumUtil);
    }




}
