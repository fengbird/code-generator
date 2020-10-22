package cn.tengchao.codegenerator.core.controller;


import cn.tengchao.codegenerator.core.entity.PackageConfigEntity;
import cn.tengchao.codegenerator.core.service.PackageConfigService;
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
 * 跟包相关的配置项 前端控制器
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@RestController
@RequestMapping("/core/package-config-entity")
@AllArgsConstructor
public class PackageConfigController {
    private final PackageConfigService packageConfigService;

    @GetMapping
    public List<PackageConfigEntity> list() {
        return packageConfigService.list();
    }

    @PostMapping
    public void save(PackageConfigEntity entity) {
        packageConfigService.save(entity);
    }

    @PutMapping
    public void update(PackageConfigEntity entity) {
        packageConfigService.updateById(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        packageConfigService.removeById(id);
    }
}
