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

import io.renren.modules.sys.entity.FinaIndicatorEntity;
import io.renren.modules.sys.service.FinaIndicatorService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:48
 */
@RestController
@RequestMapping("sys/finaindicator")
public class FinaIndicatorController {
    @Autowired
    private FinaIndicatorService finaIndicatorService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:finaindicator:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = finaIndicatorService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:finaindicator:info")
    public R info(@PathVariable("id") String id){
        FinaIndicatorEntity finaIndicator = finaIndicatorService.getById(id);

        return R.ok().put("finaIndicator", finaIndicator);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:finaindicator:save")
    public R save(@RequestBody FinaIndicatorEntity finaIndicator){
        finaIndicatorService.save(finaIndicator);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:finaindicator:update")
    public R update(@RequestBody FinaIndicatorEntity finaIndicator){
        ValidatorUtils.validateEntity(finaIndicator);
        finaIndicatorService.updateById(finaIndicator);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:finaindicator:delete")
    public R delete(@RequestBody String[] ids){
        finaIndicatorService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
