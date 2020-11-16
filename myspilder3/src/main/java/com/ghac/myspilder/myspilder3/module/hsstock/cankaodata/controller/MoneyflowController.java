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

import io.renren.modules.sys.entity.MoneyflowEntity;
import io.renren.modules.sys.service.MoneyflowService;
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
@RequestMapping("sys/moneyflow")
public class MoneyflowController {
    @Autowired
    private MoneyflowService moneyflowService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:moneyflow:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = moneyflowService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:moneyflow:info")
    public R info(@PathVariable("id") String id){
        MoneyflowEntity moneyflow = moneyflowService.getById(id);

        return R.ok().put("moneyflow", moneyflow);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:moneyflow:save")
    public R save(@RequestBody MoneyflowEntity moneyflow){
        moneyflowService.save(moneyflow);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:moneyflow:update")
    public R update(@RequestBody MoneyflowEntity moneyflow){
        ValidatorUtils.validateEntity(moneyflow);
        moneyflowService.updateById(moneyflow);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:moneyflow:delete")
    public R delete(@RequestBody String[] ids){
        moneyflowService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
