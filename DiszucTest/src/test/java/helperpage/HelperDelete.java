package helperpage;

import org.apache.log4j.Logger;
import page.DeleteTie;
import util.SeleniumUtil;

/**
 * Created by 35870 on 2018/5/8.
 */
public class HelperDelete {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);

    //随意点击一个链接
    public static void clicka(SeleniumUtil seleniumUtil){
        seleniumUtil.click(DeleteTie.DELETE_LINK_A);
    }
    //点击删除主题
    public static void clickb(SeleniumUtil seleniumUtil){
        seleniumUtil.click(DeleteTie.DELETE_LINK_DELETE);
    }
    //点击确定按钮
    public static void clickye(SeleniumUtil seleniumUtil){
        seleniumUtil.click(DeleteTie.DELETE_BUTTON_DELETE);
    }
    //删除
    public static void delet(SeleniumUtil seleniumUtil) {
        HelperFaTie.clickbankuai(seleniumUtil);
        clicka(seleniumUtil);
        clickb(seleniumUtil);
        clickye(seleniumUtil);
    }
}
