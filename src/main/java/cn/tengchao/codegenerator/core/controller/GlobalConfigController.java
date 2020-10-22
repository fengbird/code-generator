package cn.tengchao.codegenerator.core.controller;


import cn.tengchao.codegenerator.core.entity.GlobalConfigEntity;
import cn.tengchao.codegenerator.core.service.GlobalConfigService;
import com.sun.tools.internal.ws.wsdl.framework.GlobalEntity;
import io.swagger.models.auth.In;
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
 * 全局配置 前端控制器
 * </p>
 *
 * @author ZhaoTengchao
 * @since 2020-10-21
 */
@RestController
@RequestMapping("/core/global-config")
@AllArgsConstructor
public class GlobalConfigController {
    private final GlobalConfigService globalConfigService;

    @GetMapping
    public List<GlobalConfigEntity> list() {
        return globalConfigService.list();
    }

    @PostMapping
    public void save(GlobalConfigEntity entity) {
        globalConfigService.save(entity);
    }

    @PutMapping
    public void update(GlobalConfigEntity entity) {
        globalConfigService.updateById(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        globalConfigService.removeById(id);
    }

}
