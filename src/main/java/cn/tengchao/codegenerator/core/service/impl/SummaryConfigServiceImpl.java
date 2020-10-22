package cn.tengchao.codegenerator.core.service.impl;

import cn.hutool.core.util.ZipUtil;
import cn.tengchao.codegenerator.core.convert.ConfigConvert;
import cn.tengchao.codegenerator.core.entity.DataSourceConfigEntity;
import cn.tengchao.codegenerator.core.entity.GlobalConfigEntity;
import cn.tengchao.codegenerator.core.entity.PackageConfigEntity;
import cn.tengchao.codegenerator.core.entity.StrategyConfigEntity;
import cn.tengchao.codegenerator.core.entity.SummaryConfigEntity;
import cn.tengchao.codegenerator.core.mapper.DataSourceConfigMapper;
import cn.tengchao.codegenerator.core.mapper.GlobalConfigMapper;
import cn.tengchao.codegenerator.core.mapper.PackageConfigMapper;
import cn.tengchao.codegenerator.core.mapper.StrategyConfigMapper;
import cn.tengchao.codegenerator.core.mapper.SummaryConfigMapper;
import cn.tengchao.codegenerator.core.service.SummaryConfigService;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.charset.Charset;

/**
 * <p>
 * 汇总配置 服务实现类
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@Service
@AllArgsConstructor
public class SummaryConfigServiceImpl extends ServiceImpl<SummaryConfigMapper, SummaryConfigEntity> implements SummaryConfigService {
    private final GlobalConfigMapper globalConfigMapper;
    private final DataSourceConfigMapper dataSourceConfigMapper;
    private final PackageConfigMapper packageConfigMapper;
    private final StrategyConfigMapper strategyConfigMapper;
    private final ConfigConvert configConvert;

    @Override
    public void executeById(Integer id) {
        SummaryConfigEntity summaryConfigEntity = baseMapper.selectById(id);
        if (summaryConfigEntity == null) {
            return;
        }
        GlobalConfigEntity globalConfigEntity = globalConfigMapper.selectById(summaryConfigEntity.getGlobalConfigId());
        if (globalConfigEntity == null) {
            throw new RuntimeException("未找到对应的全局配置！全局配置id为：" + summaryConfigEntity.getGlobalConfigId());
        }
        DataSourceConfigEntity dataSourceConfigEntity = dataSourceConfigMapper.selectById(summaryConfigEntity.getDataSourceConfigId());
        if (dataSourceConfigEntity == null) {
            throw new RuntimeException("未找到对应的数据源配置！数据源配置id为：" + summaryConfigEntity.getDataSourceConfigId());
        }
        PackageConfigEntity packageConfigEntity = packageConfigMapper.selectById(summaryConfigEntity.getPackageConfigId());
        if (packageConfigEntity == null) {
            throw new RuntimeException("未找到对应的包配置！包配置id为：" + summaryConfigEntity.getPackageConfigId());
        }
        StrategyConfigEntity strategyConfigEntity = strategyConfigMapper.selectById(summaryConfigEntity.getStrategyConfigId());
        if (strategyConfigEntity == null) {
            throw new RuntimeException("未找到对应的策略配置！策略配置id为：" + summaryConfigEntity.getStrategyConfigId());
        }
        StrategyConfig strategyConfig = configConvert.entity2StrategyConfig(strategyConfigEntity);
        GlobalConfig globalConfig = configConvert.entity2GlobalConfig(globalConfigEntity);
        AutoGenerator autoGenerator = new AutoGenerator()
            .setGlobalConfig(globalConfig)
            .setDataSource(configConvert.entity2DataSourceConfig(dataSourceConfigEntity))
            .setPackageInfo(configConvert.entity2PackageConfig(packageConfigEntity))
            .setStrategy(strategyConfig);
        // 执行生成,默认使用freemarker引擎
        autoGenerator.setTemplateEngine(new FreemarkerTemplateEngine());
        autoGenerator.execute();
    }
}
