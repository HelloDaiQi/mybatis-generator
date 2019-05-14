package com.daiqi.generator;

import org.apache.ibatis.io.Resources;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Author：Created by DaiQi
 * Date：Created in 2019/4/30 13:44
 * Description：Mybatis逆向工程主类
 */
public class MybatisGeneratorTool {

    public static void main(String[] args) throws Exception {
        MybatisGeneratorTool generatorSqlmap = new MybatisGeneratorTool();
        generatorSqlmap.generator();
    }

    private void generator() throws Exception{
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        InputStream is =  Resources.getResourceAsStream("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
