package cn.tengchao.codegenerator.core.vo;

import cn.tengchao.codegenerator.core.entity.GlobalConfigEntity;
import cn.tengchao.codegenerator.core.entity.PackageConfigEntity;
import cn.tengchao.codegenerator.core.entity.StrategyConfigEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 汇总配置
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
public class AllConfigVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 配置名
     */
    private String name;
    private GlobalConfigEntity globalConfigEntity;
    private PackageConfigEntity packageConfigEntity;
    private StrategyConfigEntity strategyConfigEntity;

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

    public GlobalConfigEntity getGlobalConfigEntity() {
        return globalConfigEntity;
    }

    public void setGlobalConfigEntity(GlobalConfigEntity globalConfigEntity) {
        this.globalConfigEntity = globalConfigEntity;
    }

    public PackageConfigEntity getPackageConfigEntity() {
        return packageConfigEntity;
    }

    public void setPackageConfigEntity(PackageConfigEntity packageConfigEntity) {
        this.packageConfigEntity = packageConfigEntity;
    }

    public StrategyConfigEntity getStrategyConfigEntity() {
        return strategyConfigEntity;
    }

    public void setStrategyConfigEntity(StrategyConfigEntity strategyConfigEntity) {
        this.strategyConfigEntity = strategyConfigEntity;
    }
}
