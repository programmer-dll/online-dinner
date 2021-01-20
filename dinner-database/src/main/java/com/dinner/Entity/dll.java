package com.dinner.Entity.Entity;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class dll {
    @Test
    public void text() throws Exception {
        List<String> warnings = new ArrayList();
        boolean overwrite = true;
        File configFile = new File("E:\\dll.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate((ProgressCallback)null);
    }
    @Test
    public void test2() throws Exception {

        String url="jdbc:mysql://118.178.85.163:3306/online-dinnner";
        String user="root";
        String password="123456";
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        Connection connection= DriverManager.getConnection(url,user,password);
        System.out.println("aaaaaaaaaaa");
    }

}
