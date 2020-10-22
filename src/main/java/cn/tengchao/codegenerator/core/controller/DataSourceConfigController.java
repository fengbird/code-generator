package cn.tengchao.codegenerator.core.controller;


import cn.tengchao.codegenerator.core.entity.DataSourceConfigEntity;
import cn.tengchao.codegenerator.core.entity.GlobalConfigEntity;
import cn.tengchao.codegenerator.core.service.DataSourceConfigService;
import cn.tengchao.codegenerator.core.service.GlobalConfigService;
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
 * 数据源配置 前端控制器
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@RestController
@RequestMapping("/core/data-source-config")
@AllArgsConstructor
public class DataSourceConfigController {
    private final DataSourceConfigService dataSourceConfigService;

    @GetMapping
    public List<DataSourceConfigEntity> list() {
        return dataSourceConfigService.list();
    }

    @PostMapping
    public void save(DataSourceConfigEntity entity) {
        dataSourceConfigService.save(entity);
    }

    @PutMapping
    public void update(DataSourceConfigEntity entity) {
        dataSourceConfigService.updateById(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        dataSourceConfigService.removeById(id);
    }

}
