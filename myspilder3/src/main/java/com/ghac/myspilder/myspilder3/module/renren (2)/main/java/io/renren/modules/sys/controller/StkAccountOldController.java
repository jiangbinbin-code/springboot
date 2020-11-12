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

import io.renren.modules.sys.entity.StkAccountOldEntity;
import io.renren.modules.sys.service.StkAccountOldService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:11
 */
@RestController
@RequestMapping("sys/stkaccountold")
public class StkAccountOldController {
    @Autowired
    private StkAccountOldService stkAccountOldService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:stkaccountold:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = stkAccountOldService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:stkaccountold:info")
    public R info(@PathVariable("id") String id){
        StkAccountOldEntity stkAccountOld = stkAccountOldService.getById(id);

        return R.ok().put("stkAccountOld", stkAccountOld);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:stkaccountold:save")
    public R save(@RequestBody StkAccountOldEntity stkAccountOld){
        stkAccountOldService.save(stkAccountOld);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:stkaccountold:update")
    public R update(@RequestBody StkAccountOldEntity stkAccountOld){
        ValidatorUtils.validateEntity(stkAccountOld);
        stkAccountOldService.updateById(stkAccountOld);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:stkaccountold:delete")
    public R delete(@RequestBody String[] ids){
        stkAccountOldService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
