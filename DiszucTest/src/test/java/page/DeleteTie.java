package page;

import org.openqa.selenium.By;

/**
 * Created by 35870 on 2018/5/8.
 */
public class DeleteTie {
    //删除帖子-先点一个链接
    public static final By DELETE_LINK_A=By.xpath("//th/a[@class=\"s xst\"]");//*[@id="normalthread_9"]/tr/th/a[2]
    //删除a链接
    public static final By DELETE_LINK_DELETE=By.xpath("//*[@id=\"modmenu\"]/a[1]");
    //删除确定按钮
    public static final By DELETE_BUTTON_DELETE=By.xpath("//*[@id=\"modsubmit\"]");


}
