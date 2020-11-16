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

import io.renren.modules.sys.entity.SuspendEntity;
import io.renren.modules.sys.service.SuspendService;
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
@RequestMapping("sys/suspend")
public class SuspendController {
    @Autowired
    private SuspendService suspendService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:suspend:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = suspendService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:suspend:info")
    public R info(@PathVariable("id") String id){
        SuspendEntity suspend = suspendService.getById(id);

        return R.ok().put("suspend", suspend);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:suspend:save")
    public R save(@RequestBody SuspendEntity suspend){
        suspendService.save(suspend);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:suspend:update")
    public R update(@RequestBody SuspendEntity suspend){
        ValidatorUtils.validateEntity(suspend);
        suspendService.updateById(suspend);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:suspend:delete")
    public R delete(@RequestBody String[] ids){
        suspendService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
