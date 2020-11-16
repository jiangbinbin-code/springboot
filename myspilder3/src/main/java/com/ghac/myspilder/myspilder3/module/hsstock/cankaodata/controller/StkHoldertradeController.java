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

import io.renren.modules.sys.entity.StkHoldertradeEntity;
import io.renren.modules.sys.service.StkHoldertradeService;
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
@RequestMapping("sys/stkholdertrade")
public class StkHoldertradeController {
    @Autowired
    private StkHoldertradeService stkHoldertradeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:stkholdertrade:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = stkHoldertradeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:stkholdertrade:info")
    public R info(@PathVariable("id") String id){
        StkHoldertradeEntity stkHoldertrade = stkHoldertradeService.getById(id);

        return R.ok().put("stkHoldertrade", stkHoldertrade);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:stkholdertrade:save")
    public R save(@RequestBody StkHoldertradeEntity stkHoldertrade){
        stkHoldertradeService.save(stkHoldertrade);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:stkholdertrade:update")
    public R update(@RequestBody StkHoldertradeEntity stkHoldertrade){
        ValidatorUtils.validateEntity(stkHoldertrade);
        stkHoldertradeService.updateById(stkHoldertrade);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:stkholdertrade:delete")
    public R delete(@RequestBody String[] ids){
        stkHoldertradeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
