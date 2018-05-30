package testcase;

import helperpage.HelperFaTie;
import helperpage.HelperLoginPage;
import org.testng.annotations.Test;

/**
 * Created by 35870 on 2018/5/9.
 */
public class VoteTest extends BasicTest {
    /*
    发表投票帖子
            进行投票
    取出投票各个选项的名称以及投票比例
            取出投票的主题名称
            */
    @Test
    public void vote() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","admin");
        Thread.sleep(2000);
        HelperFaTie.vote(seleniumUtil,"aaaaaaaaa","aaaaaaaaaa","bbbbbbbbb");


    }

}
