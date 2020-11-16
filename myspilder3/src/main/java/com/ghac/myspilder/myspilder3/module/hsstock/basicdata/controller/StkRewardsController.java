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

import io.renren.modules.sys.entity.StkRewardsEntity;
import io.renren.modules.sys.service.StkRewardsService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:05
 */
@RestController
@RequestMapping("sys/stkrewards")
public class StkRewardsController {
    @Autowired
    private StkRewardsService stkRewardsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:stkrewards:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = stkRewardsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:stkrewards:info")
    public R info(@PathVariable("id") String id){
        StkRewardsEntity stkRewards = stkRewardsService.getById(id);

        return R.ok().put("stkRewards", stkRewards);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:stkrewards:save")
    public R save(@RequestBody StkRewardsEntity stkRewards){
        stkRewardsService.save(stkRewards);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:stkrewards:update")
    public R update(@RequestBody StkRewardsEntity stkRewards){
        ValidatorUtils.validateEntity(stkRewards);
        stkRewardsService.updateById(stkRewards);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:stkrewards:delete")
    public R delete(@RequestBody String[] ids){
        stkRewardsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
