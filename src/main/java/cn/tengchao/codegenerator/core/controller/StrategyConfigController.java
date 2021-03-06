package cn.tengchao.codegenerator.core.controller;


import cn.tengchao.codegenerator.core.entity.PackageConfigEntity;
import cn.tengchao.codegenerator.core.entity.StrategyConfigEntity;
import cn.tengchao.codegenerator.core.service.PackageConfigService;
import cn.tengchao.codegenerator.core.service.StrategyConfigService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 策略配置项 前端控制器
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@RestController
@RequestMapping("/core/strategy-config")
@AllArgsConstructor
public class StrategyConfigController {
    private final StrategyConfigService strategyConfigService;

    @GetMapping
    public List<StrategyConfigEntity> list() {
        return strategyConfigService.list();
    }

    @PostMapping
    public void save(StrategyConfigEntity entity) {
        strategyConfigService.save(entity);
    }

    @PutMapping
    public void update(StrategyConfigEntity entity) {
        strategyConfigService.updateById(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        strategyConfigService.removeById(id);
    }
}
