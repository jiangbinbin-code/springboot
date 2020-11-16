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

import io.renren.modules.sys.entity.FxDailyEntity;
import io.renren.modules.sys.service.FxDailyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:39
 */
@RestController
@RequestMapping("sys/fxdaily")
public class FxDailyController {
    @Autowired
    private FxDailyService fxDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:fxdaily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fxDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:fxdaily:info")
    public R info(@PathVariable("id") String id){
        FxDailyEntity fxDaily = fxDailyService.getById(id);

        return R.ok().put("fxDaily", fxDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:fxdaily:save")
    public R save(@RequestBody FxDailyEntity fxDaily){
        fxDailyService.save(fxDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:fxdaily:update")
    public R update(@RequestBody FxDailyEntity fxDaily){
        ValidatorUtils.validateEntity(fxDaily);
        fxDailyService.updateById(fxDaily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:fxdaily:delete")
    public R delete(@RequestBody String[] ids){
        fxDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
