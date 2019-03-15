package com.jialong.Mapper;

/**
 * Created by Tjl on 2019/3/15 11:41.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 官网代码见：http://www.mybatis.org/generator/running/runningWithJava.html
 *
 */
public class MybatisGenerator {

    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("C:\\Users\\JiaLong\\Documents\\IdeaProject\\SSM_Framework_Building\\src\\main\\resources\\mybatis-mapper-generator.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("===============生成代码执行完毕=================");
    }

}
