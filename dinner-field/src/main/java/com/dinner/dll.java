//package com.dinner;
//
//import org.junit.Test;
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//public class dll {
//    @Test
//    public void text() throws Exception {
//        List<String> warnings = new ArrayList();
//        boolean overwrite = true;
//        File configFile = new File("E:\\dll.xml");
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = cp.parseConfiguration(configFile);
//        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//        myBatisGenerator.generate((ProgressCallback)null);
//    }
//}
