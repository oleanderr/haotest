package page;

import org.openqa.selenium.By;

/**
 * Created by 35870 on 2018/5/8.
 */
public class PageGuanli {
    //论坛链接
    public static final By GUANLI_LINK_LUNTAN=By.xpath("//*[@id=\"header_forum\"]");
    //添加新板块链接
    public static final By GUANLI_LINK_ADD=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr/td[2]/div/a");
    //添加新板块提交
    public static final By GUANLI_BUTTON_POST=By.id("submit_editsubmit");
    //管理员退出
    public static final By GUANLI_LINK_EXIT=By.linkText("退出");
}
