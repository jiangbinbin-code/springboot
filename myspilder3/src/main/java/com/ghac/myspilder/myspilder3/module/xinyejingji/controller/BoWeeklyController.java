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

import io.renren.modules.sys.entity.BoWeeklyEntity;
import io.renren.modules.sys.service.BoWeeklyService;
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
@RequestMapping("sys/boweekly")
public class BoWeeklyController {
    @Autowired
    private BoWeeklyService boWeeklyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:boweekly:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = boWeeklyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:boweekly:info")
    public R info(@PathVariable("id") String id){
        BoWeeklyEntity boWeekly = boWeeklyService.getById(id);

        return R.ok().put("boWeekly", boWeekly);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:boweekly:save")
    public R save(@RequestBody BoWeeklyEntity boWeekly){
        boWeeklyService.save(boWeekly);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:boweekly:update")
    public R update(@RequestBody BoWeeklyEntity boWeekly){
        ValidatorUtils.validateEntity(boWeekly);
        boWeeklyService.updateById(boWeekly);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:boweekly:delete")
    public R delete(@RequestBody String[] ids){
        boWeeklyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
