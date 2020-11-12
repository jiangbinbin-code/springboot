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

import io.renren.modules.sys.entity.FutMappingEntity;
import io.renren.modules.sys.service.FutMappingService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:39
 */
@RestController
@RequestMapping("sys/futmapping")
public class FutMappingController {
    @Autowired
    private FutMappingService futMappingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:futmapping:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = futMappingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:futmapping:info")
    public R info(@PathVariable("id") String id){
        FutMappingEntity futMapping = futMappingService.getById(id);

        return R.ok().put("futMapping", futMapping);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:futmapping:save")
    public R save(@RequestBody FutMappingEntity futMapping){
        futMappingService.save(futMapping);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:futmapping:update")
    public R update(@RequestBody FutMappingEntity futMapping){
        ValidatorUtils.validateEntity(futMapping);
        futMappingService.updateById(futMapping);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:futmapping:delete")
    public R delete(@RequestBody String[] ids){
        futMappingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
