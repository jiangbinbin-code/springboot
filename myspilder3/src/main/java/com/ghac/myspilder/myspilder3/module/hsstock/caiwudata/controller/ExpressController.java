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

import io.renren.modules.sys.entity.ExpressEntity;
import io.renren.modules.sys.service.ExpressService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:54
 */
@RestController
@RequestMapping("sys/express")
public class ExpressController {
    @Autowired
    private ExpressService expressService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:express:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = expressService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:express:info")
    public R info(@PathVariable("id") String id){
        ExpressEntity express = expressService.getById(id);

        return R.ok().put("express", express);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:express:save")
    public R save(@RequestBody ExpressEntity express){
        expressService.save(express);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:express:update")
    public R update(@RequestBody ExpressEntity express){
        ValidatorUtils.validateEntity(express);
        expressService.updateById(express);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:express:delete")
    public R delete(@RequestBody String[] ids){
        expressService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
