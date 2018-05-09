package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.PageFatie;
import util.SeleniumUtil;

import java.util.List;

/**
 * Created by 35870 on 2018/5/8.
 */
public class jd4 extends BasicTest{
    @Test
    public void clicknew(){
        List<WebElement> list=seleniumUtil.findElements(PageFatie.FATIE_LINK_NEW);

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j).getText());
        }
        list.get(3).click();
    }
}
