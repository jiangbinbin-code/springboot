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

import io.renren.modules.sys.entity.BoDailyEntity;
import io.renren.modules.sys.service.BoDailyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:04
 */
@RestController
@RequestMapping("sys/bodaily")
public class BoDailyController {
    @Autowired
    private BoDailyService boDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:bodaily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = boDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:bodaily:info")
    public R info(@PathVariable("id") String id){
        BoDailyEntity boDaily = boDailyService.getById(id);

        return R.ok().put("boDaily", boDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:bodaily:save")
    public R save(@RequestBody BoDailyEntity boDaily){
        boDailyService.save(boDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:bodaily:update")
    public R update(@RequestBody BoDailyEntity boDaily){
        ValidatorUtils.validateEntity(boDaily);
        boDailyService.updateById(boDaily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:bodaily:delete")
    public R delete(@RequestBody String[] ids){
        boDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
