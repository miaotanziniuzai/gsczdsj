package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;



/**
 * 启动程序
 * 
 * @author ruoyi
 */
/*@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication extends SpringBootServletInitializer
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  若依启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");
    }

    *//**
     * 外部 Tomcat 部署时调用此方法
     *//*
    @Override
    protected org.springframework.boot.builder.SpringApplicationBuilder configure(org.springframework.boot.builder.SpringApplicationBuilder application) {
        return application.sources(RuoYiApplication.class);
    }
}*/

/**
 * RuoYi 启动程序
 */

@SpringBootApplication
public class RuoYiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RuoYiApplication.class, args);
    }

    /**
     * 外部 Tomcat 容器部署入口
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

//        System.out.println("(♥◠‿◠)ﾉﾞ  若依启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
//                " .-------.       ____     __        \n" +
//                " |  _ _   \\      \\   \\   /  /    \n" +
//                " | ( ' )  |       \\  _. /  '       \n" +
//                " |(_ o _) /        _( )_ .'         \n" +
//                " | (_,_).' __  ___(_ o _)'          \n" +
//                " |  |\\ \\  |  ||   |(_,_)'         \n" +
//                " |  | \\ `'   /|   `-'  /           \n" +
//                " |  |  \\    /  \\      /           \n" +
//                " ''-'   `'-'    `-..-'              ");
//                System.out.println("Test Config: " + test);

        return application.sources(RuoYiApplication.class);

    }



}

