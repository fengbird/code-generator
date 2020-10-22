package cn.tengchao.codegenerator.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;

import java.io.Serializable;

/**
 * <p>
 * 汇总配置
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@TableName("summary_config")
public class SummaryConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 配置名
     */
    private String name;

    /**
     * 数据源配置id
     */
    @TableField("dataSourceConfigId")
    private Integer dataSourceConfigId;

    /**
     * 全局配置id
     */
    @TableField("globalConfigId")
    private Integer globalConfigId;

    /**
     * 包配置id
     */
    @TableField("packageConfigId")
    private Integer packageConfigId;

    /**
     * 策略配置id
     */
    @TableField("strategyConfigId")
    private Integer strategyConfigId;

    @TableField("createAt")
    private LocalDateTime createAt;

    @TableField("updateAt")
    private LocalDateTime updateAt;

    @Version
    private Integer version;

    @TableField("isDeleted")
    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getDataSourceConfigId() {
        return dataSourceConfigId;
    }

    public void setDataSourceConfigId(Integer dataSourceConfigId) {
        this.dataSourceConfigId = dataSourceConfigId;
    }
    public Integer getGlobalConfigId() {
        return globalConfigId;
    }

    public void setGlobalConfigId(Integer globalConfigId) {
        this.globalConfigId = globalConfigId;
    }
    public Integer getPackageConfigId() {
        return packageConfigId;
    }

    public void setPackageConfigId(Integer packageConfigId) {
        this.packageConfigId = packageConfigId;
    }
    public Integer getStrategyConfigId() {
        return strategyConfigId;
    }

    public void setStrategyConfigId(Integer strategyConfigId) {
        this.strategyConfigId = strategyConfigId;
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
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String DATASOURCECONFIGID = "dataSourceConfigId";

    public static final String GLOBALCONFIGID = "globalConfigId";

    public static final String PACKAGECONFIGID = "packageConfigId";

    public static final String STRATEGYCONFIGID = "strategyConfigId";

    public static final String CREATEAT = "createAt";

    public static final String UPDATEAT = "updateAt";

    public static final String VERSION = "version";

    public static final String ISDELETED = "isDeleted";

    @Override
    public String toString() {
        return "SummaryConfigEntity{" +
            "id=" + id +
            ", name=" + name +
            ", dataSourceConfigId=" + dataSourceConfigId +
            ", globalConfigId=" + globalConfigId +
            ", packageConfigId=" + packageConfigId +
            ", strategyConfigId=" + strategyConfigId +
            ", createAt=" + createAt +
            ", updateAt=" + updateAt +
            ", version=" + version +
            ", deleted=" + deleted +
        "}";
    }
}
