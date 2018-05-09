package helperpage;

import org.apache.log4j.Logger;
import page.PageSearch;
import util.SeleniumUtil;

/**
 * Created by 35870 on 2018/5/8.
 */
public class HelperSearch {
    private static Logger logger=Logger.getLogger(HelperSearch.class);
    /*搜索框输入东西*/
    public static void inputsearch(SeleniumUtil seleniumUtil,String search){
        seleniumUtil.sendKeys(PageSearch.SEARCH_INPUT_SEARCH,search);
    }
    /*点击搜索按钮*/
    public static void clicksearch(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSearch.SEARCH_BUTTON_SEC);
        seleniumUtil.newwindows();
    }
    /* 搜索*/
    public static void search(SeleniumUtil seleniumUtil,String search){
        inputsearch(seleniumUtil,search);
        clicksearch(seleniumUtil);
    }
}
