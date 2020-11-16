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

import io.renren.modules.sys.entity.MonthlyEntity;
import io.renren.modules.sys.service.MonthlyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:20
 */
@RestController
@RequestMapping("sys/monthly")
public class MonthlyController {
    @Autowired
    private MonthlyService monthlyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:monthly:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = monthlyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:monthly:info")
    public R info(@PathVariable("id") String id){
        MonthlyEntity monthly = monthlyService.getById(id);

        return R.ok().put("monthly", monthly);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:monthly:save")
    public R save(@RequestBody MonthlyEntity monthly){
        monthlyService.save(monthly);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:monthly:update")
    public R update(@RequestBody MonthlyEntity monthly){
        ValidatorUtils.validateEntity(monthly);
        monthlyService.updateById(monthly);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:monthly:delete")
    public R delete(@RequestBody String[] ids){
        monthlyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
