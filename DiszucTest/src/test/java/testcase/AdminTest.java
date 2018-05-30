package testcase;

import helperpage.HelperFaTie;
import helperpage.HelperGuanliPage;
import helperpage.HelperLoginPage;
import org.testng.annotations.Test;

/**
 * Created by 35870 on 2018/5/9.
 */
public class AdminTest extends BasicTest {


    @Test
    /* 管理员用户登录 进入默认板块，删除帖子 进入版块管理(管理中心--论坛) 创建新的版块 管理员退出 普通用户登录 在新的版块下发帖 回复帖子
     */
    public void delete() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","admin");
        Thread.sleep(2000);
        // HelperDelete.delet(seleniumUtil);
        HelperLoginPage.adminlogin(seleniumUtil,"admin");
        HelperGuanliPage.addnew(seleniumUtil,"main");
        HelperLoginPage.login(seleniumUtil,"mahh","123456");
        Thread.sleep(2000);
        HelperFaTie.clicknew(seleniumUtil,1);
        HelperFaTie.tijiao1(seleniumUtil,"bbbbbbbbbbbbbb","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb","e_iframe");
        HelperFaTie.huifu(seleniumUtil,"test");


    }
}
