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

import io.renren.modules.sys.entity.StkLimitEntity;
import io.renren.modules.sys.service.StkLimitService;
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
@RequestMapping("sys/stklimit")
public class StkLimitController {
    @Autowired
    private StkLimitService stkLimitService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:stklimit:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = stkLimitService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:stklimit:info")
    public R info(@PathVariable("id") String id){
        StkLimitEntity stkLimit = stkLimitService.getById(id);

        return R.ok().put("stkLimit", stkLimit);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:stklimit:save")
    public R save(@RequestBody StkLimitEntity stkLimit){
        stkLimitService.save(stkLimit);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:stklimit:update")
    public R update(@RequestBody StkLimitEntity stkLimit){
        ValidatorUtils.validateEntity(stkLimit);
        stkLimitService.updateById(stkLimit);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:stklimit:delete")
    public R delete(@RequestBody String[] ids){
        stkLimitService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
