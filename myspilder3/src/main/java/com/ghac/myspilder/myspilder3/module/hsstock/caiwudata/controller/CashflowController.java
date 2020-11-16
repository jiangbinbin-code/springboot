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

import io.renren.modules.sys.entity.CashflowEntity;
import io.renren.modules.sys.service.CashflowService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:59
 */
@RestController
@RequestMapping("sys/cashflow")
public class CashflowController {
    @Autowired
    private CashflowService cashflowService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cashflow:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cashflowService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:cashflow:info")
    public R info(@PathVariable("id") String id){
        CashflowEntity cashflow = cashflowService.getById(id);

        return R.ok().put("cashflow", cashflow);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cashflow:save")
    public R save(@RequestBody CashflowEntity cashflow){
        cashflowService.save(cashflow);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cashflow:update")
    public R update(@RequestBody CashflowEntity cashflow){
        ValidatorUtils.validateEntity(cashflow);
        cashflowService.updateById(cashflow);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cashflow:delete")
    public R delete(@RequestBody String[] ids){
        cashflowService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
