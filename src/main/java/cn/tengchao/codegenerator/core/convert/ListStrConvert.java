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
import org.springframework.util.StringUtils;

/**
 * @author ZhaoTengchao
 * @since 2020/10/21
 */
@Mapper(componentModel = "spring")
public interface ListStrConvert {
    default String[] toStrArray(String str) {
        if (str != null) {
            return str.split(",");
        }
        return null;
    }

    default String toNull(String str) {
        if (!StringUtils.hasText(str)) {
            return null;
        }
        return str;
    }
}
