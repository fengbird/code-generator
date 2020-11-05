package cn.tengchao.codegenerator.core.service;

import cn.tengchao.codegenerator.core.entity.SummaryConfigEntity;
import cn.tengchao.codegenerator.core.vo.AllConfigVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

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
    AllConfigVo getDetailConfigById(Integer id);
}
