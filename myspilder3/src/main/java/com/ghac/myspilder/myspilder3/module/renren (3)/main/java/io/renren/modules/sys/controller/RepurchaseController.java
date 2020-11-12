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

import io.renren.modules.sys.entity.RepurchaseEntity;
import io.renren.modules.sys.service.RepurchaseService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:15
 */
@RestController
@RequestMapping("sys/repurchase")
public class RepurchaseController {
    @Autowired
    private RepurchaseService repurchaseService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:repurchase:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = repurchaseService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:repurchase:info")
    public R info(@PathVariable("id") String id){
        RepurchaseEntity repurchase = repurchaseService.getById(id);

        return R.ok().put("repurchase", repurchase);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:repurchase:save")
    public R save(@RequestBody RepurchaseEntity repurchase){
        repurchaseService.save(repurchase);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:repurchase:update")
    public R update(@RequestBody RepurchaseEntity repurchase){
        ValidatorUtils.validateEntity(repurchase);
        repurchaseService.updateById(repurchase);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:repurchase:delete")
    public R delete(@RequestBody String[] ids){
        repurchaseService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
