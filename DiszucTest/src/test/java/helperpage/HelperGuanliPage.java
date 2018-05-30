package helperpage;

import org.apache.log4j.Logger;
import page.PageGuanli;
import util.SeleniumUtil;

/**
 * Created by 35870 on 2018/5/8.
 */
public class HelperGuanliPage {
    //private static Logger logger=Logger.getLogger(HelperGuanliPage.class);
    //点击论坛
    public static void clicklutan(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageGuanli.GUANLI_LINK_LUNTAN);
    }
    //点击添加新板块
    public static void clickadd(SeleniumUtil seleniumUtil, String id){
        seleniumUtil.qiehuanifream(id);
        seleniumUtil.click(PageGuanli.GUANLI_LINK_ADD);
    }
    //点击提交按钮
    public static void clickpost(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageGuanli.GUANLI_BUTTON_POST);
    }
    //管理员退出
    public static void clickexit(SeleniumUtil seleniumUtil){
        seleniumUtil.qiehuanifream();
        seleniumUtil.click(PageGuanli.GUANLI_LINK_EXIT);
    }
    //添加新板块操作
    public static void addnew(SeleniumUtil seleniumUtil,String id) throws InterruptedException {
        clicklutan(seleniumUtil);
        clickadd(seleniumUtil,id);
        clickpost(seleniumUtil);
        clickexit(seleniumUtil);
        HelperLoginPage.tuichu(seleniumUtil);
        Thread.sleep(2000);
    }
}
