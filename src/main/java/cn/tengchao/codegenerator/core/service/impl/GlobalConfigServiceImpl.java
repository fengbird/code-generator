package cn.tengchao.codegenerator.core.service.impl;

import cn.tengchao.codegenerator.core.entity.GlobalConfigEntity;
import cn.tengchao.codegenerator.core.mapper.GlobalConfigMapper;
import cn.tengchao.codegenerator.core.service.GlobalConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 全局配置 服务实现类
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@Service
public class GlobalConfigServiceImpl extends ServiceImpl<GlobalConfigMapper, GlobalConfigEntity> implements GlobalConfigService {

    @Override
    public int deleteById(Integer id) {
        GlobalConfigEntity entity = new GlobalConfigEntity();
        entity.setId(id);
//        return baseMapper.deleteByIdWithFill(entity);
        return baseMapper.deleteById(id);
    }
}
