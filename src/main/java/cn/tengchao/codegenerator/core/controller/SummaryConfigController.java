package cn.tengchao.codegenerator.core.controller;


import cn.tengchao.codegenerator.core.entity.StrategyConfigEntity;
import cn.tengchao.codegenerator.core.entity.SummaryConfigEntity;
import cn.tengchao.codegenerator.core.service.StrategyConfigService;
import cn.tengchao.codegenerator.core.service.SummaryConfigService;
import cn.tengchao.codegenerator.core.vo.AllConfigVo;
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
 * 汇总配置 前端控制器
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@RestController
@RequestMapping("/core/summary-config")
@AllArgsConstructor
public class SummaryConfigController {
    private final SummaryConfigService summaryConfigService;

    @GetMapping
    public List<SummaryConfigEntity> list() {
        return summaryConfigService.list();
    }

    @PostMapping
    public void save(SummaryConfigEntity entity) {
        summaryConfigService.save(entity);
    }

    @PutMapping
    public void update(SummaryConfigEntity entity) {
        summaryConfigService.updateById(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        summaryConfigService.removeById(id);
    }

    @GetMapping("/execute/{id}")
    public void execute(@PathVariable("id") Integer id) {
        summaryConfigService.executeById(id);
    }

    @GetMapping("/get/all/{id}")
    public AllConfigVo getDetailConfigById(@PathVariable("id") Integer id) {
        return summaryConfigService.getDetailConfigById(id);
    }
}
