package cn.tengchao.codegenerator.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 全局配置
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@TableName("global_config")
@Data
public class GlobalConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("globalConfigName")
    private String globalConfigName;

    /**
     * 是否覆盖已有文件
     */
    @TableField("fileOverride")
    private Boolean fileOverride;

    /**
     * 是否打开输出目录
     */
    private Boolean open;

    /**
     * 是否在xml中添加二级缓存配置
     */
    @TableField("enableCache")
    private Boolean enableCache;

    /**
     * 开发人员
     */
    private String author;

    /**
     * 开启 Kotlin 模式
     */
    private Boolean kotlin;

    /**
     * 开启 swagger2 模式
     */
    private Boolean swagger2;

    /**
     * 开启 ActiveRecord 模式
     */
    @TableField("activeRecord")
    private Boolean activeRecord;

    /**
     * 开启 BaseResultMap
     */
    @TableField("baseResultMap")
    private Boolean baseResultMap;

    /**
     * 时间类型对应策略, ONLY_DATE: 只使用 java.util.date 代替  SQL_PACK：使用 java.sql 包下的。 TIME_PACK：使用 java.time 包下的java8 新的时间类型
     */
    @TableField("dateType")
    private String dateType;

    /**
     * 开启 baseColumnList
     */
    @TableField("baseColumnList")
    private Boolean baseColumnList;

    /**
     * entity层文件名称方式，例如： %sAction 生成 UserAction
     */
    @TableField("entityName")
    private String entityName;

    /**
     * mapper层文件名称方式，例如： %sAction 生成 UserAction
     */
    @TableField("mapperName")
    private String mapperName;

    /**
     * xml层文件名称方式，例如： %sAction 生成 UserAction
     */
    @TableField("xmlName")
    private String xmlName;

    /**
     * service层文件名称方式，例如： %sAction 生成 UserAction
     */
    @TableField("serviceName")
    private String serviceName;

    /**
     * serviceImpl层文件名称方式，例如： %sAction 生成 UserAction
     */
    @TableField("serviceImplName")
    private String serviceImplName;

    /**
     * controller层文件名称方式，例如： %sAction 生成 UserAction
     */
    @TableField("controllerName")
    private String controllerName;

    /**
     * 指定生成的主键的ID类型,0:数据库ID自增 1: 该类型为未设置主键类型(注解里等于跟随全局,全局里约等于 INPUT) 2: 用户输入ID，该类型可以通过自己注册自动填充插件进行填充。3: 分配ID (主键类型为number或string），默认实现为雪花算法。4: 分配去除-号的UUID
     */
    @TableField("idType")
    private String idType;

    @TableField("createAt")
    private LocalDateTime createAt;

    @TableField("updateAt")
    private LocalDateTime updateAt;

    @Version
    private Integer version;

    @TableField("isDeleted")
    private Boolean deleted;

    public static final String ID = "id";

    public static final String GLOBALCONFIGNAME = "globalConfigName";

    public static final String FILEOVERRIDE = "fileOverride";

    public static final String OPEN = "open";

    public static final String ENABLECACHE = "enableCache";

    public static final String AUTHOR = "author";

    public static final String KOTLIN = "kotlin";

    public static final String SWAGGER2 = "swagger2";

    public static final String ACTIVERECORD = "activeRecord";

    public static final String BASERESULTMAP = "baseResultMap";

    public static final String DATETYPE = "dateType";

    public static final String BASECOLUMNLIST = "baseColumnList";

    public static final String ENTITYNAME = "entityName";

    public static final String MAPPERNAME = "mapperName";

    public static final String XMLNAME = "xmlName";

    public static final String SERVICENAME = "serviceName";

    public static final String SERVICEIMPLNAME = "serviceImplName";

    public static final String CONTROLLERNAME = "controllerName";

    public static final String IDTYPE = "idType";

    public static final String CREATEAT = "createAt";

    public static final String UPDATEAT = "updateAt";

    public static final String VERSION = "version";

    public static final String ISDELETED = "isDeleted";
}
