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

import io.renren.modules.sys.entity.BalancesheetEntity;
import io.renren.modules.sys.service.BalancesheetService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:00
 */
@RestController
@RequestMapping("sys/balancesheet")
public class BalancesheetController {
    @Autowired
    private BalancesheetService balancesheetService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:balancesheet:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = balancesheetService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:balancesheet:info")
    public R info(@PathVariable("id") String id){
        BalancesheetEntity balancesheet = balancesheetService.getById(id);

        return R.ok().put("balancesheet", balancesheet);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:balancesheet:save")
    public R save(@RequestBody BalancesheetEntity balancesheet){
        balancesheetService.save(balancesheet);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:balancesheet:update")
    public R update(@RequestBody BalancesheetEntity balancesheet){
        ValidatorUtils.validateEntity(balancesheet);
        balancesheetService.updateById(balancesheet);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:balancesheet:delete")
    public R delete(@RequestBody String[] ids){
        balancesheetService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
