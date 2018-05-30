package page;

import org.openqa.selenium.By;

/**
 * Created by 35870 on 2018/5/8.
 */
public class PageFatie {
    //默认板块链接
    public static final By FATIE_LINK_BEGIN=By.xpath("//td//h2/a");
    //发帖按钮
    public static final By FATIE_IMG_FABIAO=By.xpath("//*[@id=\"newspecial\"]/img");
    //标题
    public static final By FATIE_INPUT_TITLE=By.xpath("//*[@id=\"subject\"]");//*[@id="subject"]
    //内容
    public static final By FATIE_INPUT_CONTENT=By.xpath("/html/body");
    //提交按钮
    public static final By FATIE_BUTTON_POST=By.xpath("//*[@id=\"postsubmit\"]");
    //回复按钮
    public static final By HUIFU_BUTTON_HUIFU=By.xpath("//*[@id=\"fastpostsubmit\"]");
    //回复内容输入框
    public static final By HUIFU_INPUT_HUIFU=By.xpath("//*[@id=\"fastpostmessage\"]");
    //点击新板块
    public static final By FATIE_LINK_NEW=By.xpath("//td/h2/a");
    //点击投票按钮
    public static final By FATIE_BUTTON_VOTE= By.xpath("//*[@id=\"editorbox\"]/ul/li[2]/a");
    //第一个投票的选项框
    public static final By FATIE_INPUT_VOTEA=By.xpath("//*[@id=\"pollm_c_1\"]/p[1]/input");
    //第二个投票的选项框
    public static final By FATIE_INPUT_VOTEB=By.xpath("//*[@id=\"pollm_c_1\"]/p[2]/input");
    //第三个投票框
    public static final By FATIE_INPUT_VOTEC=By.xpath("//*[@id=\"pollm_c_1\"]/p[3]/input");
    //点击投票单选

}
