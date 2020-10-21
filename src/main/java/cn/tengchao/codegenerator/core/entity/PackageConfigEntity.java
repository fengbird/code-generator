package cn.tengchao.codegenerator.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 跟包相关的配置项
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@TableName("package_config")
public class PackageConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
     */
    private String parent;

    /**
     * 父包模块名
     */
    @TableField("moduleName")
    private String moduleName;

    /**
     * Entity包名
     */
    private String entity;

    /**
     * Service包名
     */
    private String service;

    /**
     * Service Impl包名
     */
    @TableField("serviceImpl")
    private String serviceImpl;

    /**
     * Mapper包名
     */
    private String mapper;

    /**
     * Mapper XML包名
     */
    private String xml;

    /**
     * Controller包名
     */
    private String controller;

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
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    public String getServiceImpl() {
        return serviceImpl;
    }

    public void setServiceImpl(String serviceImpl) {
        this.serviceImpl = serviceImpl;
    }
    public String getMapper() {
        return mapper;
    }

    public void setMapper(String mapper) {
        this.mapper = mapper;
    }
    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }
    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
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

    public static final String PARENT = "parent";

    public static final String MODULENAME = "moduleName";

    public static final String ENTITY = "entity";

    public static final String SERVICE = "service";

    public static final String SERVICEIMPL = "serviceImpl";

    public static final String MAPPER = "mapper";

    public static final String XML = "xml";

    public static final String CONTROLLER = "controller";

    public static final String CREATEAT = "createAt";

    public static final String UPDATEAT = "updateAt";

    public static final String VERSION = "version";

    public static final String ISDELETED = "isDeleted";

    @Override
    public String toString() {
        return "PackageConfigEntity{" +
            "id=" + id +
            ", parent=" + parent +
            ", moduleName=" + moduleName +
            ", entity=" + entity +
            ", service=" + service +
            ", serviceImpl=" + serviceImpl +
            ", mapper=" + mapper +
            ", xml=" + xml +
            ", controller=" + controller +
            ", createAt=" + createAt +
            ", updateAt=" + updateAt +
            ", version=" + version +
            ", isDeleted=" + isDeleted +
        "}";
    }
}
