package testcase;

import helperpage.HelperLoginPage;
import helperpage.HelperSearch;
import org.testng.annotations.Test;

/**
 * Created by 35870 on 2018/5/9.
 */
public class SearchTest extends BasicTest {
    /*用户登录
            进行帖子搜索
    搜索haotest帖子
            进入搜索的帖子
    验证帖子标题和期望的一致
            用户退出*/
    @Test

    public void search() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"mahh","123456");
        HelperSearch.search(seleniumUtil,"haotest");
        HelperSearch.isExcepted(seleniumUtil,"haotest");
        HelperLoginPage.tuichu(seleniumUtil);



    }

}
