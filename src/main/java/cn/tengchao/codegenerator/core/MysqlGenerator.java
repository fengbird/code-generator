package cn.tengchao.codegenerator.core;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.mysql.cj.jdbc.Driver;

/**
 * 代码生成器演示
 *
 */
public class MysqlGenerator {

    /**
     * MySQL 生成演示
     */
    public static void main(String[] args) {
        // 自定义需要填充的字段
//        List<TableFill> tableFillList = new ArrayList<>();
//        tableFillList.add(new TableFill("ASDD_SS", FieldFill.INSERT_UPDATE));

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
                // 全局配置
                new GlobalConfig()
                    .setOutputDir("/Users/zhaotengchao/IdeaProjects/code-generator/mygenerator")//输出目录
                    .setFileOverride(true)// 是否覆盖文件
                    .setActiveRecord(false)// 开启 activeRecord 模式
                    .setEnableCache(false)// XML 二级缓存
                    .setBaseResultMap(true)// XML ResultMap
                    .setBaseColumnList(true)// XML columList
                    .setKotlin(false) //是否生成 kotlin 代码
                    .setAuthor("ZhaoTengchao")
                    // 自定义文件命名，注意 %s 会自动填充表实体属性！
                     .setEntityName("%sEntity")
                     .setMapperName("%sMapper")
                     .setXmlName("%sMapper")
                     .setServiceName("%sService")
                     .setServiceImplName("%sServiceImpl")
                    // .setControllerName("%sAction")
        ).setDataSource(
                // 数据源配置
                new DataSourceConfig()
                        .setDbType(DbType.MYSQL) // 数据库类型
                        /*.setTypeConvert(new MySqlTypeConvert() {
                            // 自定义数据库表字段类型转换【可选】
                            @Override
                            public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                                // System.out.println("转换类型：" + fieldType);
                                // if ( fieldType.toLowerCase().contains( "tinyint" ) ) {
                                //    return DbColumnType.BOOLEAN;
                                // }
                                return super.processTypeConvert(globalConfig, fieldType);
                            }
                        })*/
                        /*.setDbQuery(new MySqlQuery() {

                            *//**
                             * 重写父类预留查询自定义字段<br>
                             * 这里查询的 SQL 对应父类 tableFieldsSql 的查询字段，默认不能满足你的需求请重写它<br>
                             * 模板中调用：  table.fields 获取所有字段信息，
                             * 然后循环字段获取 field.customMap 从 MAP 中获取注入字段如下  NULL 或者 PRIVILEGES
                             *//*
                            @Override
                            public String[] fieldCustom() {
                                return new String[]{"NULL", "PRIVILEGES"};
                            }
                        })*/
                        .setDriverName(Driver.class.getName())
                        .setUsername("root")
                        .setPassword("root")
                        .setUrl("jdbc:mysql://localhost:3306/code_generator?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true")
        ).setStrategy(
                // 策略配置
                new StrategyConfig()
                        // .setCapitalMode(true)// 全局大写命名
                        // .setDbColumnUnderline(true)//全局下划线命名
                        //.setTablePrefix("tbl_")// 此处可以修改为您的表前缀
                        .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
                         .setInclude("summary_config") // 需要生成的表
                        // .setExclude(new String[]{"test"}) // 排除生成的表
                        // 自定义实体父类
                        // .setSuperEntityClass("com.baomidou.demo.TestEntity")
                        // 自定义实体，公共字段
//                        .setSuperEntityColumns("test_id")
//                        .setTableFillList(tableFillList)
                        .setEntityBooleanColumnRemoveIsPrefix(true)
                        // 自定义 mapper 父类
                         // .setSuperMapperClass("cn.codemao.component.mybatisplus.mapper.CodeMaoBaseMapper")
                        // 自定义 service 父类
//                         .setSuperServiceClass("")
                        // 自定义 service 实现类父类
//                         .setSuperServiceImplClass("")
                        // 自定义 controller 父类
                        // .setSuperControllerClass("com.baomidou.demo.TestController")
                        // 【实体】是否生成字段常量（默认 false）
                        // public static final String ID = "test_id";
                         .setEntityColumnConstant(true)
                        // 【实体】是否为构建者模型（默认 false）
                        // public User setName(String name) {this.name = name; return this;}
                        // .setEntityBuilderModel(true)
                        // 【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
                        // .setEntityLombokModel(true)
                        // Boolean类型字段是否移除is前缀处理
                        // .setEntityBooleanColumnRemoveIsPrefix(true)
                         .setRestControllerStyle(true)
                        // .setControllerMappingHyphenStyle(true)
        ).setPackageInfo(
                // 包配置
                new PackageConfig()
                        .setModuleName("core")
                        .setParent("cn.tengchao.codegenerator")// 自定义包路径
//                        .setEntity("infrastructure.repository.model.entity")
//                        .setMapper("infrastructure.repository.mapper")
//                        .setService("service")
//                        .setServiceImpl("service.impl")
//                        .setXml("db.mysql.mapper")
                        //.setController("controller")// 这里是控制器包名，默认 web
        )/*.setCfg(
                // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
                new InjectionConfig() {
                    @Override
                    public void initMap() {
                        Map<String, Object> map = new HashMap<>();
                        map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                        this.setMap(map);
                    }
                }.setFileOutConfigList(Collections.singletonList(new FileOutConfig(
                        "/templates/mapper.xml.ftl") {
                    // 自定义输出文件目录
                    @Override
                    public String outputFile(TableInfo tableInfo) {
                        return "../com/xml/" + tableInfo.getEntityName() + ".xml";
                    }
                }))
        )*/.setTemplate(
                // 关闭默认 xml 生成，调整生成 至 根目录
                new TemplateConfig()
                // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy
                // 至您项目 src/main/resources/template 目录下，模板名称也可自定义如下配置：
//                .setController(null)//关闭controller的生成
//                .setEntity("entity.kt.ftl")
//                .setService("service.java")
//                .setServiceImpl("serviceImpl.java")
//              .setMapper("...");
//              .setXml("...");
        );
        // 执行生成,默认使用freemarker引擎
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

}
