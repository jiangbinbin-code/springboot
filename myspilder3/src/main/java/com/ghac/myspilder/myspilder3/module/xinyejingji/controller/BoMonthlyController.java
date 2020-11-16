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

import io.renren.modules.sys.entity.BoMonthlyEntity;
import io.renren.modules.sys.service.BoMonthlyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:00
 */
@RestController
@RequestMapping("sys/bomonthly")
public class BoMonthlyController {
    @Autowired
    private BoMonthlyService boMonthlyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:bomonthly:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = boMonthlyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:bomonthly:info")
    public R info(@PathVariable("id") String id){
        BoMonthlyEntity boMonthly = boMonthlyService.getById(id);

        return R.ok().put("boMonthly", boMonthly);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:bomonthly:save")
    public R save(@RequestBody BoMonthlyEntity boMonthly){
        boMonthlyService.save(boMonthly);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:bomonthly:update")
    public R update(@RequestBody BoMonthlyEntity boMonthly){
        ValidatorUtils.validateEntity(boMonthly);
        boMonthlyService.updateById(boMonthly);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:bomonthly:delete")
    public R delete(@RequestBody String[] ids){
        boMonthlyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
