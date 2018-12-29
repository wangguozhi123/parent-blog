package com.seven.articleblog.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @描述 : 测试生成代码
 * @作者 : 王杰
 * @时间 : 2018年08月14日  10:37
 */
public class NewMpGenerator {

    //类型转换
    private static Map<String, String> typeConversion;

    /**
     * 配置类型转换、目前已经遇到Blob类型启动项目报错。
     */
    static {
        typeConversion = new HashMap<>();
        typeConversion.put("longblob", "String");
    }

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Veloctiy
        // mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("汪国志");
        gc.setFileOverride(true);
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        // .setKotlin(true) 是否生成 kotlin 代码
        //生成完成后是否打开窗口
        gc.setOpen(false);
        //获取当前路径
        String file_url = ClassLoader.getSystemResource("").getFile();
        String url = getParentUrl(getParentUrl(getParentUrl(file_url))) + "\\cache-blog\\src\\main\\java";
        gc.setOutputDir(url);
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // gc.setMapperName("%sDao");
        // gc.setXmlName("%sDao");
        // gc.setServiceName("MP%sService");
        // gc.setServiceImplName("%sServiceDiy");
        // gc.setControllerName("%sAction");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert(){
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
                String newFieldType = fieldType;
                if (typeConversion.get(fieldType) != null) {
                    newFieldType = typeConversion.get(fieldType);
                }
//                System.out.println("转换前类型:" + fieldType + "---->转换后类型:" + newFieldType);
                return super.processTypeConvert(newFieldType);
            }
        });
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://39.107.121.98/multipls");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        strategy.setTablePrefix(new String[] { "nh_ri_"});// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(new String[]{ "nh_ri_education_info"}); // 需要生成的表
        //是否使用lombok
        strategy.setEntityLombokModel(true);
        //设置逻辑删除字段
//        strategy.setLogicDeleteFieldName();
        strategy.setEntityColumnConstant(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.seven.articleblog.cache");
        //配置控制层的名字
        pc.setController("controller");
        //配置实体类的名字
        pc.setEntity("bean");
        //配置业务层的名字
        pc.setService("service");
        //设置xml 和mapper同级
        pc.setXml("mapper");
//        pc.setModuleName("test");
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
                map.put("isMp", true);
                this.setMap(map);
            }
        };
        mpg.setCfg(cfg);
        // 关闭默认 xml 生成，调整生成 至 根目录
        TemplateConfig tc = new TemplateConfig();
//        tc.setController("/templates/javatemplate/controller.java.vm");
        tc.setController(null);
//        tc.setService("/templates/javatemplate/service.java.vm");
//        tc.setServiceImpl("/templates/javatemplate/serviceImpl.java.vm");
        tc.setService(null);
        tc.setServiceImpl(null);
        tc.setEntity("/templates/javatemplate/entity.java.vm");
        tc.setMapper("/templates/javatemplate/mapper.java.vm");
        tc.setXml("/templates/javatemplate/mapper.xml.vm");
        mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();
        // 打印注入设置【可无】
        System.err.println("okkkkkkkk");
    }

    private static String getParentUrl(String oldFile) {
        File file = new File(oldFile);
        return file.getParent();
    }
}
