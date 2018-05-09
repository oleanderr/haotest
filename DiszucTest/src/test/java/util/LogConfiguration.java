package util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by 35870 on 2018/5/7.
 */
public class LogConfiguration {
    public static void initLog() {
        SimpleDateFormat dataForm=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        String data=dataForm.format(new Date());
        final String LogFilePath="./log/"+data+".log";
        Properties prop=new Properties();
        prop.setProperty("log4j.rootLogger","info,toConsole,toFile");
        //console
        prop.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        prop.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        prop.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        //file
        prop.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        prop.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        prop.setProperty("log4j.appender.5toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        prop.setProperty("log4j.appender.toFile.file",LogFilePath);
        PropertyConfigurator.configure(prop);

    }
}
