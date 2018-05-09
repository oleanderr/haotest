package util;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by 35870 on 2018/5/8.
 */
public class BrowserUtil {
    private static Logger logger=Logger.getLogger(SeleniumUtil.class);
    private static Properties p=null;

    //读文件
    public static void read(String filepath){
        try{
        InputStream ips=new FileInputStream(filepath);
            p=new Properties();
        p.load(ips);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    //浏览器的读取
    public static String browser() {
       read("./Browser.properties");
        String browsername=p.getProperty("browserName");
        logger.info("浏览器为："+browsername);
        return browsername;

    }
    //驱动读取
    public static String qudong() throws IOException {
        read("./Browser.properties");
        String browsertype=p.getProperty("property");
        logger.info("property："+browsertype);
        return browsertype;
    }
    //驱动地址
    public static String dizhi() throws IOException {
        read("./Browser.properties");
        String browserdizhi=p.getProperty("dizhi");
        logger.info("驱动地址为："+browserdizhi);
        return browserdizhi;
    }
}
