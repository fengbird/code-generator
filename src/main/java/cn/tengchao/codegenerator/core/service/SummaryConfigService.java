package cn.tengchao.codegenerator.core.service;

import cn.tengchao.codegenerator.core.entity.SummaryConfigEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 汇总配置 服务类
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
public interface SummaryConfigService extends IService<SummaryConfigEntity> {
    void executeById(Integer id);
}
