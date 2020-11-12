package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.entity.FinaAuditEntity;
import io.renren.modules.sys.service.FinaAuditService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:48
 */
@RestController
@RequestMapping("sys/finaaudit")
public class FinaAuditController {
    @Autowired
    private FinaAuditService finaAuditService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:finaaudit:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = finaAuditService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:finaaudit:info")
    public R info(@PathVariable("id") String id){
        FinaAuditEntity finaAudit = finaAuditService.getById(id);

        return R.ok().put("finaAudit", finaAudit);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:finaaudit:save")
    public R save(@RequestBody FinaAuditEntity finaAudit){
        finaAuditService.save(finaAudit);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:finaaudit:update")
    public R update(@RequestBody FinaAuditEntity finaAudit){
        ValidatorUtils.validateEntity(finaAudit);
        finaAuditService.updateById(finaAudit);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:finaaudit:delete")
    public R delete(@RequestBody String[] ids){
        finaAuditService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
