package cn.tengchao.codegenerator.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 数据源配置
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@TableName("data_source_config")
public class DataSourceConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 数据库类型
     */
    @TableField("dbType")
    private String dbType;

    /**
     * PostgreSQL schemaName
     */
    @TableField("schemaName")
    private String schemaName;

    /**
     * 驱动连接的URL
     */
    private String url;

    /**
     * 驱动名称
     */
    @TableField("driverName")
    private String driverName;

    /**
     * 数据库连接用户名
     */
    private String username;

    /**
     * 数据库连接密码
     */
    private String password;

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
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public static final String DBTYPE = "dbType";

    public static final String SCHEMANAME = "schemaName";

    public static final String URL = "url";

    public static final String DRIVERNAME = "driverName";

    public static final String USERNAME = "username";

    public static final String PASSWORD = "password";

    public static final String CREATEAT = "createAt";

    public static final String UPDATEAT = "updateAt";

    public static final String VERSION = "version";

    public static final String ISDELETED = "isDeleted";

    @Override
    public String toString() {
        return "DataSourceConfigEntity{" +
            "id=" + id +
            ", dbType=" + dbType +
            ", schemaName=" + schemaName +
            ", url=" + url +
            ", driverName=" + driverName +
            ", username=" + username +
            ", password=" + password +
            ", createAt=" + createAt +
            ", updateAt=" + updateAt +
            ", version=" + version +
            ", isDeleted=" + isDeleted +
        "}";
    }
}
