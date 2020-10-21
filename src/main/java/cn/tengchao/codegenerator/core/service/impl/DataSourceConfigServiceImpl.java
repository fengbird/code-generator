package cn.tengchao.codegenerator.core.service.impl;

import cn.tengchao.codegenerator.core.entity.DataSourceConfigEntity;
import cn.tengchao.codegenerator.core.mapper.DataSourceConfigMapper;
import cn.tengchao.codegenerator.core.service.DataSourceConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据源配置 服务实现类
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@Service
public class DataSourceConfigServiceImpl extends ServiceImpl<DataSourceConfigMapper, DataSourceConfigEntity> implements DataSourceConfigService {

}
