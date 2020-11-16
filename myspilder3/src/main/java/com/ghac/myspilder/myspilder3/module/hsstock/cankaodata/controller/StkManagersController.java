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

import io.renren.modules.sys.entity.StkManagersEntity;
import io.renren.modules.sys.service.StkManagersService;
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
@RequestMapping("sys/stkmanagers")
public class StkManagersController {
    @Autowired
    private StkManagersService stkManagersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:stkmanagers:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = stkManagersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:stkmanagers:info")
    public R info(@PathVariable("id") String id){
        StkManagersEntity stkManagers = stkManagersService.getById(id);

        return R.ok().put("stkManagers", stkManagers);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:stkmanagers:save")
    public R save(@RequestBody StkManagersEntity stkManagers){
        stkManagersService.save(stkManagers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:stkmanagers:update")
    public R update(@RequestBody StkManagersEntity stkManagers){
        ValidatorUtils.validateEntity(stkManagers);
        stkManagersService.updateById(stkManagers);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:stkmanagers:delete")
    public R delete(@RequestBody String[] ids){
        stkManagersService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
