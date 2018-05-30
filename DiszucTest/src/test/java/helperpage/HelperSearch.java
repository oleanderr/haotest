package helperpage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import page.PageSearch;
import util.SeleniumUtil;

import java.util.List;

/**
 * Created by 35870 on 2018/5/8.
 */
public class HelperSearch {

    //private static Logger logger=Logger.getLogger(HelperSearch.class);
    /*搜索框输入东西*/
    public static void inputsearch(SeleniumUtil seleniumUtil,String search) throws InterruptedException {
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageSearch.SEARCH_INPUT_SEARCH,search);
    }
    /*点击搜索按钮*/
    public static void clicksearch(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSearch.SEARCH_BUTTON_SEC);
        seleniumUtil.newwindows();
    }

    /*点击搜索 */
    public static void clicksearchtitle(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSearch.SEARCH_LINK_TITLE);
    }
    /* 搜索*/
    public static void search(SeleniumUtil seleniumUtil,String search) throws InterruptedException {
        inputsearch(seleniumUtil,search);
        clicksearch(seleniumUtil);
        clicksearchtitle(seleniumUtil);
        seleniumUtil.newwindows();
    }
    /*搜索结果与期望值比对 */
    public static void isExcepted(SeleniumUtil seleniumUtil, String exceptedContent){
        List<WebElement> elements = seleniumUtil.findElements(PageSearch.SEARCH_LINK_TITLE);
        for (WebElement element:elements) {
            seleniumUtil.assertForText(element,exceptedContent);
        }
    }



}
