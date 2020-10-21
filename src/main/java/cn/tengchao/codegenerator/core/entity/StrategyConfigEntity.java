package cn.tengchao.codegenerator.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class StrategyConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 是否大写命名
     */
    @TableField("isCapitalMode")
    private Integer isCapitalMode;

    /**
     * 是否跳过视图
     */
    @TableField("skipView")
    private Integer skipView;

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
    private Integer entitySerialVersionUID;

    /**
     * 【实体】是否生成字段常量
     */
    @TableField("entityColumnConstant")
    private Integer entityColumnConstant;

    /**
     * 【实体】是否为构建者模型
     */
    @TableField("entityBuilderModel")
    private Integer entityBuilderModel;

    /**
     * 【实体】是否为lombok模型
     */
    @TableField("entityLombokModel")
    private Integer entityLombokModel;

    /**
     * Boolean类型字段是否移除is前缀
     */
    @TableField("entityBooleanColumnRemoveIsPrefix")
    private Integer entityBooleanColumnRemoveIsPrefix;

    /**
     * 生成 @RestController
     */
    @TableField("restControllerStyle")
    private Integer restControllerStyle;

    /**
     * 驼峰转连字符
     */
    @TableField("controllerMappingHyphenStyle")
    private Integer controllerMappingHyphenStyle;

    /**
     * 是否生成实体时，生成字段注解
     */
    @TableField("entityTableFieldAnnotationEnable")
    private Integer entityTableFieldAnnotationEnable;

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
    private Integer enableSqlFilter;

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

    private Integer version;

    @TableField("isDeleted")
    private Integer isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getIsCapitalMode() {
        return isCapitalMode;
    }

    public void setIsCapitalMode(Integer isCapitalMode) {
        this.isCapitalMode = isCapitalMode;
    }
    public Integer getSkipView() {
        return skipView;
    }

    public void setSkipView(Integer skipView) {
        this.skipView = skipView;
    }
    public String getNaming() {
        return naming;
    }

    public void setNaming(String naming) {
        this.naming = naming;
    }
    public String getColumnNaming() {
        return columnNaming;
    }

    public void setColumnNaming(String columnNaming) {
        this.columnNaming = columnNaming;
    }
    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }
    public String getFieldPrefix() {
        return fieldPrefix;
    }

    public void setFieldPrefix(String fieldPrefix) {
        this.fieldPrefix = fieldPrefix;
    }
    public String getSuperEntityClass() {
        return superEntityClass;
    }

    public void setSuperEntityClass(String superEntityClass) {
        this.superEntityClass = superEntityClass;
    }
    public String getSuperEntityColumns() {
        return superEntityColumns;
    }

    public void setSuperEntityColumns(String superEntityColumns) {
        this.superEntityColumns = superEntityColumns;
    }
    public String getSuperMapperClass() {
        return superMapperClass;
    }

    public void setSuperMapperClass(String superMapperClass) {
        this.superMapperClass = superMapperClass;
    }
    public String getSuperServiceClass() {
        return superServiceClass;
    }

    public void setSuperServiceClass(String superServiceClass) {
        this.superServiceClass = superServiceClass;
    }
    public String getSuperServiceImplClass() {
        return superServiceImplClass;
    }

    public void setSuperServiceImplClass(String superServiceImplClass) {
        this.superServiceImplClass = superServiceImplClass;
    }
    public String getSuperControllerClass() {
        return superControllerClass;
    }

    public void setSuperControllerClass(String superControllerClass) {
        this.superControllerClass = superControllerClass;
    }
    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }
    public String getExclude() {
        return exclude;
    }

    public void setExclude(String exclude) {
        this.exclude = exclude;
    }
    public Integer getEntitySerialVersionUID() {
        return entitySerialVersionUID;
    }

    public void setEntitySerialVersionUID(Integer entitySerialVersionUID) {
        this.entitySerialVersionUID = entitySerialVersionUID;
    }
    public Integer getEntityColumnConstant() {
        return entityColumnConstant;
    }

    public void setEntityColumnConstant(Integer entityColumnConstant) {
        this.entityColumnConstant = entityColumnConstant;
    }
    public Integer getEntityBuilderModel() {
        return entityBuilderModel;
    }

    public void setEntityBuilderModel(Integer entityBuilderModel) {
        this.entityBuilderModel = entityBuilderModel;
    }
    public Integer getEntityLombokModel() {
        return entityLombokModel;
    }

    public void setEntityLombokModel(Integer entityLombokModel) {
        this.entityLombokModel = entityLombokModel;
    }
    public Integer getEntityBooleanColumnRemoveIsPrefix() {
        return entityBooleanColumnRemoveIsPrefix;
    }

    public void setEntityBooleanColumnRemoveIsPrefix(Integer entityBooleanColumnRemoveIsPrefix) {
        this.entityBooleanColumnRemoveIsPrefix = entityBooleanColumnRemoveIsPrefix;
    }
    public Integer getRestControllerStyle() {
        return restControllerStyle;
    }

    public void setRestControllerStyle(Integer restControllerStyle) {
        this.restControllerStyle = restControllerStyle;
    }
    public Integer getControllerMappingHyphenStyle() {
        return controllerMappingHyphenStyle;
    }

    public void setControllerMappingHyphenStyle(Integer controllerMappingHyphenStyle) {
        this.controllerMappingHyphenStyle = controllerMappingHyphenStyle;
    }
    public Integer getEntityTableFieldAnnotationEnable() {
        return entityTableFieldAnnotationEnable;
    }

    public void setEntityTableFieldAnnotationEnable(Integer entityTableFieldAnnotationEnable) {
        this.entityTableFieldAnnotationEnable = entityTableFieldAnnotationEnable;
    }
    public String getVersionFieldName() {
        return versionFieldName;
    }

    public void setVersionFieldName(String versionFieldName) {
        this.versionFieldName = versionFieldName;
    }
    public String getLogicDeleteFieldName() {
        return logicDeleteFieldName;
    }

    public void setLogicDeleteFieldName(String logicDeleteFieldName) {
        this.logicDeleteFieldName = logicDeleteFieldName;
    }
    public String getTableFillList() {
        return tableFillList;
    }

    public void setTableFillList(String tableFillList) {
        this.tableFillList = tableFillList;
    }
    public Integer getEnableSqlFilter() {
        return enableSqlFilter;
    }

    public void setEnableSqlFilter(Integer enableSqlFilter) {
        this.enableSqlFilter = enableSqlFilter;
    }
    public String getLikeTable() {
        return likeTable;
    }

    public void setLikeTable(String likeTable) {
        this.likeTable = likeTable;
    }
    public String getNotLikeTable() {
        return notLikeTable;
    }

    public void setNotLikeTable(String notLikeTable) {
        this.notLikeTable = notLikeTable;
    }
    public String getIsCapitalModeNaming() {
        return isCapitalModeNaming;
    }

    public void setIsCapitalModeNaming(String isCapitalModeNaming) {
        this.isCapitalModeNaming = isCapitalModeNaming;
    }
    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public static final String ID = "id";

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

    @Override
    public String toString() {
        return "StrategyConfigEntity{" +
            "id=" + id +
            ", isCapitalMode=" + isCapitalMode +
            ", skipView=" + skipView +
            ", naming=" + naming +
            ", columnNaming=" + columnNaming +
            ", tablePrefix=" + tablePrefix +
            ", fieldPrefix=" + fieldPrefix +
            ", superEntityClass=" + superEntityClass +
            ", superEntityColumns=" + superEntityColumns +
            ", superMapperClass=" + superMapperClass +
            ", superServiceClass=" + superServiceClass +
            ", superServiceImplClass=" + superServiceImplClass +
            ", superControllerClass=" + superControllerClass +
            ", include=" + include +
            ", exclude=" + exclude +
            ", entitySerialVersionUID=" + entitySerialVersionUID +
            ", entityColumnConstant=" + entityColumnConstant +
            ", entityBuilderModel=" + entityBuilderModel +
            ", entityLombokModel=" + entityLombokModel +
            ", entityBooleanColumnRemoveIsPrefix=" + entityBooleanColumnRemoveIsPrefix +
            ", restControllerStyle=" + restControllerStyle +
            ", controllerMappingHyphenStyle=" + controllerMappingHyphenStyle +
            ", entityTableFieldAnnotationEnable=" + entityTableFieldAnnotationEnable +
            ", versionFieldName=" + versionFieldName +
            ", logicDeleteFieldName=" + logicDeleteFieldName +
            ", tableFillList=" + tableFillList +
            ", enableSqlFilter=" + enableSqlFilter +
            ", likeTable=" + likeTable +
            ", notLikeTable=" + notLikeTable +
            ", isCapitalModeNaming=" + isCapitalModeNaming +
            ", createAt=" + createAt +
            ", updateAt=" + updateAt +
            ", version=" + version +
            ", isDeleted=" + isDeleted +
        "}";
    }
}
