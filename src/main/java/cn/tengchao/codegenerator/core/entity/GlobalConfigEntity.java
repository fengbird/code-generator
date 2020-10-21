package cn.tengchao.codegenerator.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class GlobalConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 生成文件的输出目录【默认 D 盘根目录】
     */
    @TableField("outputDir")
    private String outputDir;

    /**
     * 是否覆盖已有文件
     */
    @TableField("fileOverride")
    private Integer fileOverride;

    /**
     * 是否打开输出目录
     */
    private Integer open;

    /**
     * 是否在xml中添加二级缓存配置
     */
    @TableField("enableCache")
    private Integer enableCache;

    /**
     * 开发人员
     */
    private String author;

    /**
     * 开启 Kotlin 模式
     */
    private Integer kotlin;

    /**
     * 开启 swagger2 模式
     */
    private Integer swagger2;

    /**
     * 开启 ActiveRecord 模式
     */
    @TableField("activeRecord")
    private Integer activeRecord;

    /**
     * 开启 BaseResultMap
     */
    @TableField("baseResultMap")
    private Integer baseResultMap;

    /**
     * 时间类型对应策略, ONLY_DATE: 只使用 java.util.date 代替  SQL_PACK：使用 java.sql 包下的。 TIME_PACK：使用 java.time 包下的java8 新的时间类型
     */
    @TableField("dateType")
    private String dateType;

    /**
     * 开启 baseColumnList
     */
    @TableField("baseColumnList")
    private Integer baseColumnList;

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
    private Integer idType;

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
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }
    public Integer getFileOverride() {
        return fileOverride;
    }

    public void setFileOverride(Integer fileOverride) {
        this.fileOverride = fileOverride;
    }
    public Integer getOpen() {
        return open;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }
    public Integer getEnableCache() {
        return enableCache;
    }

    public void setEnableCache(Integer enableCache) {
        this.enableCache = enableCache;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public Integer getKotlin() {
        return kotlin;
    }

    public void setKotlin(Integer kotlin) {
        this.kotlin = kotlin;
    }
    public Integer getSwagger2() {
        return swagger2;
    }

    public void setSwagger2(Integer swagger2) {
        this.swagger2 = swagger2;
    }
    public Integer getActiveRecord() {
        return activeRecord;
    }

    public void setActiveRecord(Integer activeRecord) {
        this.activeRecord = activeRecord;
    }
    public Integer getBaseResultMap() {
        return baseResultMap;
    }

    public void setBaseResultMap(Integer baseResultMap) {
        this.baseResultMap = baseResultMap;
    }
    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }
    public Integer getBaseColumnList() {
        return baseColumnList;
    }

    public void setBaseColumnList(Integer baseColumnList) {
        this.baseColumnList = baseColumnList;
    }
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
    public String getMapperName() {
        return mapperName;
    }

    public void setMapperName(String mapperName) {
        this.mapperName = mapperName;
    }
    public String getXmlName() {
        return xmlName;
    }

    public void setXmlName(String xmlName) {
        this.xmlName = xmlName;
    }
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getServiceImplName() {
        return serviceImplName;
    }

    public void setServiceImplName(String serviceImplName) {
        this.serviceImplName = serviceImplName;
    }
    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }
    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
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

    public static final String OUTPUTDIR = "outputDir";

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

    @Override
    public String toString() {
        return "GlobalConfigEntity{" +
            "id=" + id +
            ", outputDir=" + outputDir +
            ", fileOverride=" + fileOverride +
            ", open=" + open +
            ", enableCache=" + enableCache +
            ", author=" + author +
            ", kotlin=" + kotlin +
            ", swagger2=" + swagger2 +
            ", activeRecord=" + activeRecord +
            ", baseResultMap=" + baseResultMap +
            ", dateType=" + dateType +
            ", baseColumnList=" + baseColumnList +
            ", entityName=" + entityName +
            ", mapperName=" + mapperName +
            ", xmlName=" + xmlName +
            ", serviceName=" + serviceName +
            ", serviceImplName=" + serviceImplName +
            ", controllerName=" + controllerName +
            ", idType=" + idType +
            ", createAt=" + createAt +
            ", updateAt=" + updateAt +
            ", version=" + version +
            ", isDeleted=" + isDeleted +
        "}";
    }
}
