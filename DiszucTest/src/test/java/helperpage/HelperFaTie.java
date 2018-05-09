package helperpage;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import page.PageFatie;
import util.SeleniumUtil;

import java.util.List;

/**
 * Created by 35870 on 2018/5/8.
 */
public class HelperFaTie {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);

    //默认板块点击
    public static void clickbankuai(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageFatie.FATIE_LINK_BEGIN);
    }
    //发帖点击
    public static void clickfatie(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageFatie.FATIE_IMG_FABIAO);
    }
    //输标题
    public static void inputtitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendKeys(PageFatie.FATIE_INPUT_TITLE,title);
    }
    //输内容
    public static void inputcontent(SeleniumUtil seleniumUtil, String content,String id){
        seleniumUtil.qiehuanifream(id);
        seleniumUtil.sendKeys(PageFatie.FATIE_INPUT_CONTENT,content);
    }
    //点击提交按钮
    public static void clickpost(SeleniumUtil seleniumUtil){
        seleniumUtil.qiehuanifream();
        seleniumUtil.click(PageFatie.FATIE_BUTTON_POST);
    }
    //发表文章
    public static void tijiao(SeleniumUtil seleniumUtil,String title,String content,String freamid) throws InterruptedException {
        clickbankuai(seleniumUtil);
        clickfatie(seleniumUtil);
        inputtitle(seleniumUtil,title);
        inputcontent(seleniumUtil,content,freamid);
        clickpost(seleniumUtil);
        Thread.sleep(2000);
    }
    public static void tijiao1(SeleniumUtil seleniumUtil,String title,String content,String freamid) throws InterruptedException {
        //clickbankuai(seleniumUtil);
        clickfatie(seleniumUtil);
        inputtitle(seleniumUtil,title);
        inputcontent(seleniumUtil,content,freamid);
        clickpost(seleniumUtil);
        Thread.sleep(2000);
    }
    //回复按钮点击
    public static void clickhuifu(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageFatie.HUIFU_BUTTON_HUIFU);
    }
    //回复输入框输入
    public static void inputhuifu(SeleniumUtil seleniumUtil,String con){
        seleniumUtil.sendKeys(PageFatie.HUIFU_INPUT_HUIFU,con);
    }
    //回复
    public static void huifu(SeleniumUtil seleniumUtil,String con){
        inputhuifu(seleniumUtil,con);
        clickhuifu(seleniumUtil);
    }
    //用数组接收板块,根据索引点击
    public static void clicknew(SeleniumUtil seleniumUtil, int i) throws InterruptedException {
        List<WebElement> list=seleniumUtil.findElements(PageFatie.FATIE_LINK_NEW);
        Thread.sleep(2000);
//        list.get(i);
        seleniumUtil.click(list.get(i));
    }



}
