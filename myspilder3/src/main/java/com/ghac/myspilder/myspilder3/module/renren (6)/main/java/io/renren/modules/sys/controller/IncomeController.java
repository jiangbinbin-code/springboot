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

import io.renren.modules.sys.entity.IncomeEntity;
import io.renren.modules.sys.service.IncomeService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:32
 */
@RestController
@RequestMapping("sys/income")
public class IncomeController {
    @Autowired
    private IncomeService incomeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:income:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = incomeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:income:info")
    public R info(@PathVariable("id") String id){
        IncomeEntity income = incomeService.getById(id);

        return R.ok().put("income", income);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:income:save")
    public R save(@RequestBody IncomeEntity income){
        incomeService.save(income);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:income:update")
    public R update(@RequestBody IncomeEntity income){
        ValidatorUtils.validateEntity(income);
        incomeService.updateById(income);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:income:delete")
    public R delete(@RequestBody String[] ids){
        incomeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
