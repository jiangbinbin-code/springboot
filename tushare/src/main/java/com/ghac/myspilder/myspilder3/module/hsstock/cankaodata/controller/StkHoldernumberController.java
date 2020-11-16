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

import io.renren.modules.sys.entity.StkHoldernumberEntity;
import io.renren.modules.sys.service.StkHoldernumberService;
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
@RequestMapping("sys/stkholdernumber")
public class StkHoldernumberController {
    @Autowired
    private StkHoldernumberService stkHoldernumberService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:stkholdernumber:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = stkHoldernumberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:stkholdernumber:info")
    public R info(@PathVariable("id") String id){
        StkHoldernumberEntity stkHoldernumber = stkHoldernumberService.getById(id);

        return R.ok().put("stkHoldernumber", stkHoldernumber);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:stkholdernumber:save")
    public R save(@RequestBody StkHoldernumberEntity stkHoldernumber){
        stkHoldernumberService.save(stkHoldernumber);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:stkholdernumber:update")
    public R update(@RequestBody StkHoldernumberEntity stkHoldernumber){
        ValidatorUtils.validateEntity(stkHoldernumber);
        stkHoldernumberService.updateById(stkHoldernumber);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:stkholdernumber:delete")
    public R delete(@RequestBody String[] ids){
        stkHoldernumberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
