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

import io.renren.modules.sys.entity.MoneyflowHsgtEntity;
import io.renren.modules.sys.service.MoneyflowHsgtService;
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
@RequestMapping("sys/moneyflowhsgt")
public class MoneyflowHsgtController {
    @Autowired
    private MoneyflowHsgtService moneyflowHsgtService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:moneyflowhsgt:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = moneyflowHsgtService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:moneyflowhsgt:info")
    public R info(@PathVariable("id") String id){
        MoneyflowHsgtEntity moneyflowHsgt = moneyflowHsgtService.getById(id);

        return R.ok().put("moneyflowHsgt", moneyflowHsgt);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:moneyflowhsgt:save")
    public R save(@RequestBody MoneyflowHsgtEntity moneyflowHsgt){
        moneyflowHsgtService.save(moneyflowHsgt);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:moneyflowhsgt:update")
    public R update(@RequestBody MoneyflowHsgtEntity moneyflowHsgt){
        ValidatorUtils.validateEntity(moneyflowHsgt);
        moneyflowHsgtService.updateById(moneyflowHsgt);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:moneyflowhsgt:delete")
    public R delete(@RequestBody String[] ids){
        moneyflowHsgtService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
