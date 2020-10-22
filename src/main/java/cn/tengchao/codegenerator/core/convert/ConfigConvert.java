package cn.tengchao.codegenerator.core.convert;

import cn.tengchao.codegenerator.core.entity.DataSourceConfigEntity;
import cn.tengchao.codegenerator.core.entity.GlobalConfigEntity;
import cn.tengchao.codegenerator.core.entity.PackageConfigEntity;
import cn.tengchao.codegenerator.core.entity.StrategyConfigEntity;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author ZhaoTengchao
 * @since 2020/10/21
 */
@Mapper(componentModel = "spring", uses = {ListStrConvert.class})
public interface ConfigConvert {
    /**
     * entity2GlobalConfig
     * @param entity GlobalConfigEntity
     * @return GlobalConfig
     */
    GlobalConfig entity2GlobalConfig(GlobalConfigEntity entity);

    /**
     * entity2DataSourceConfig
     * @param entity DataSourceConfigEntity
     * @return DataSourceConfig
     */
    @Mapping(target = "typeConvert", ignore = true)
    @Mapping(target = "dbQuery", ignore = true)
    DataSourceConfig entity2DataSourceConfig(DataSourceConfigEntity entity);

    /**
     * entity2PackageConfig
     * @param entity PackageConfigEntity
     * @return PackageConfig
     */
    @Mapping(target = "pathInfo", ignore = true)
    PackageConfig entity2PackageConfig(PackageConfigEntity entity);

    /**
     * entity2StrategyConfig
     * @param entity StrategyConfigEntity
     * @return StrategyConfig
     */
    @Mapping(target = "nameConvert", ignore = true)
    @Mapping(target = "tableFillList", ignore = true)
    @Mapping(target = "likeTable", ignore = true)
    @Mapping(target = "notLikeTable", ignore = true)
    StrategyConfig entity2StrategyConfig(StrategyConfigEntity entity);
}
