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
 * 策略配置项
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@TableName("strategy_config")
@Data
public class StrategyConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 策略配置名
     */
    @TableField("strategyConfigname")
    private String strategyConfigname;

    /**
     * 是否大写命名
     */
    @TableField("isCapitalMode")
    private Boolean capitalMode;

    /**
     * 是否跳过视图
     */
    @TableField("skipView")
    private Boolean skipView;

    /**
     * 名称转换
     */
    private String naming;

    /**
     * 数据库表映射到实体的命名策略，未指定按照 naming 执行
     */
    @TableField("columnNaming")
    private String columnNaming;

    /**
     * 表前缀
     */
    @TableField("tablePrefix")
    private String tablePrefix;

    /**
     * 字段前缀
     */
    @TableField("fieldPrefix")
    private String fieldPrefix;

    /**
     * 自定义继承的Entity类全称，带包名
     */
    @TableField("superEntityClass")
    private String superEntityClass;

    /**
     * 自定义基础的Entity类，公共字段
     */
    @TableField("superEntityColumns")
    private String superEntityColumns;

    /**
     * 自定义继承的Mapper类全称，带包名
     */
    @TableField("superMapperClass")
    private String superMapperClass;

    /**
     * 自定义继承的Service类全称，带包名
     */
    @TableField("superServiceClass")
    private String superServiceClass;

    /**
     * 自定义继承的ServiceImpl类全称，带包名
     */
    @TableField("superServiceImplClass")
    private String superServiceImplClass;

    /**
     * 自定义继承的Controller类全称，带包名
     */
    @TableField("superControllerClass")
    private String superControllerClass;

    /**
     * 需要包含的表名（与exclude二选一配置），@since 3.3.0 正则匹配不再支持,请使用{@link #setLikeTable(LikeTable)}}
     */
    private String include;

    /**
     * 需要排除的表名@since 3.3.0 正则匹配不再支持,请使用{@link #setNotLikeTable(LikeTable)}}
     */
    private String exclude;

    /**
     * 实体是否生成 serialVersionUID
     */
    @TableField("entitySerialVersionUID")
    private Boolean entitySerialVersionUID;

    /**
     * 【实体】是否生成字段常量
     */
    @TableField("entityColumnConstant")
    private Boolean entityColumnConstant;

    /**
     * 【实体】是否为构建者模型
     */
    @TableField("entityBuilderModel")
    private Boolean entityBuilderModel;

    /**
     * 【实体】是否为lombok模型
     */
    @TableField("entityLombokModel")
    private Boolean entityLombokModel;

    /**
     * Boolean类型字段是否移除is前缀
     */
    @TableField("entityBooleanColumnRemoveIsPrefix")
    private Boolean entityBooleanColumnRemoveIsPrefix;

    /**
     * 生成 @RestController
     */
    @TableField("restControllerStyle")
    private Boolean restControllerStyle;

    /**
     * 驼峰转连字符
     */
    @TableField("controllerMappingHyphenStyle")
    private Boolean controllerMappingHyphenStyle;

    /**
     * 是否生成实体时，生成字段注解
     */
    @TableField("entityTableFieldAnnotationEnable")
    private Boolean entityTableFieldAnnotationEnable;

    /**
     * 乐观锁属性名称
     */
    @TableField("versionFieldName")
    private String versionFieldName;

    /**
     * 逻辑删除属性名称
     */
    @TableField("logicDeleteFieldName")
    private String logicDeleteFieldName;

    /**
     * 表填充字段
     */
    @TableField("tableFillList")
    private String tableFillList;

    /**
     * 启用sql过滤
     */
    @TableField("enableSqlFilter")
    private Boolean enableSqlFilter;

    /**
     * 包含表名
     */
    @TableField("likeTable")
    private String likeTable;

    /**
     * 不包含表名
     */
    @TableField("notLikeTable")
    private String notLikeTable;

    /**
     * 大写命名、字段符合大写字母数字下划线命名
     */
    @TableField("isCapitalModeNaming")
    private String isCapitalModeNaming;

    @TableField("createAt")
    private LocalDateTime createAt;

    @TableField("updateAt")
    private LocalDateTime updateAt;

    @Version
    private Integer version;

    @TableField("isDeleted")
    private Boolean deleted;


    public static final String ID = "id";

    public static final String STRATEGYCONFIGNAME = "strategyConfigname";

    public static final String ISCAPITALMODE = "isCapitalMode";

    public static final String SKIPVIEW = "skipView";

    public static final String NAMING = "naming";

    public static final String COLUMNNAMING = "columnNaming";

    public static final String TABLEPREFIX = "tablePrefix";

    public static final String FIELDPREFIX = "fieldPrefix";

    public static final String SUPERENTITYCLASS = "superEntityClass";

    public static final String SUPERENTITYCOLUMNS = "superEntityColumns";

    public static final String SUPERMAPPERCLASS = "superMapperClass";

    public static final String SUPERSERVICECLASS = "superServiceClass";

    public static final String SUPERSERVICEIMPLCLASS = "superServiceImplClass";

    public static final String SUPERCONTROLLERCLASS = "superControllerClass";

    public static final String INCLUDE = "include";

    public static final String EXCLUDE = "exclude";

    public static final String ENTITYSERIALVERSIONUID = "entitySerialVersionUID";

    public static final String ENTITYCOLUMNCONSTANT = "entityColumnConstant";

    public static final String ENTITYBUILDERMODEL = "entityBuilderModel";

    public static final String ENTITYLOMBOKMODEL = "entityLombokModel";

    public static final String ENTITYBOOLEANCOLUMNREMOVEISPREFIX = "entityBooleanColumnRemoveIsPrefix";

    public static final String RESTCONTROLLERSTYLE = "restControllerStyle";

    public static final String CONTROLLERMAPPINGHYPHENSTYLE = "controllerMappingHyphenStyle";

    public static final String ENTITYTABLEFIELDANNOTATIONENABLE = "entityTableFieldAnnotationEnable";

    public static final String VERSIONFIELDNAME = "versionFieldName";

    public static final String LOGICDELETEFIELDNAME = "logicDeleteFieldName";

    public static final String TABLEFILLLIST = "tableFillList";

    public static final String ENABLESQLFILTER = "enableSqlFilter";

    public static final String LIKETABLE = "likeTable";

    public static final String NOTLIKETABLE = "notLikeTable";

    public static final String ISCAPITALMODENAMING = "isCapitalModeNaming";

    public static final String CREATEAT = "createAt";

    public static final String UPDATEAT = "updateAt";

    public static final String VERSION = "version";

    public static final String ISDELETED = "isDeleted";

}
