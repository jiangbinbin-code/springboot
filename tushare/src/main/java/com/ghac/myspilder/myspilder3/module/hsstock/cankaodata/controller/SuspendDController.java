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

import io.renren.modules.sys.entity.SuspendDEntity;
import io.renren.modules.sys.service.SuspendDService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:10
 */
@RestController
@RequestMapping("sys/suspendd")
public class SuspendDController {
    @Autowired
    private SuspendDService suspendDService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:suspendd:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = suspendDService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:suspendd:info")
    public R info(@PathVariable("id") String id){
        SuspendDEntity suspendD = suspendDService.getById(id);

        return R.ok().put("suspendD", suspendD);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:suspendd:save")
    public R save(@RequestBody SuspendDEntity suspendD){
        suspendDService.save(suspendD);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:suspendd:update")
    public R update(@RequestBody SuspendDEntity suspendD){
        ValidatorUtils.validateEntity(suspendD);
        suspendDService.updateById(suspendD);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:suspendd:delete")
    public R delete(@RequestBody String[] ids){
        suspendDService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
