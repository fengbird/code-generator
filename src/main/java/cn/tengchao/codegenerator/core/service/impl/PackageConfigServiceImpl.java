package cn.tengchao.codegenerator.core.service.impl;

import cn.tengchao.codegenerator.core.entity.PackageConfigEntity;
import cn.tengchao.codegenerator.core.mapper.PackageConfigMapper;
import cn.tengchao.codegenerator.core.service.PackageConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 跟包相关的配置项 服务实现类
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@Service
public class PackageConfigServiceImpl extends ServiceImpl<PackageConfigMapper, PackageConfigEntity> implements PackageConfigService {

}
