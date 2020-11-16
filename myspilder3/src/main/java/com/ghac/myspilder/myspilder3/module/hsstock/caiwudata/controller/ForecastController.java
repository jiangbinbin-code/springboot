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

import io.renren.modules.sys.entity.ForecastEntity;
import io.renren.modules.sys.service.ForecastService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:44
 */
@RestController
@RequestMapping("sys/forecast")
public class ForecastController {
    @Autowired
    private ForecastService forecastService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:forecast:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = forecastService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:forecast:info")
    public R info(@PathVariable("id") String id){
        ForecastEntity forecast = forecastService.getById(id);

        return R.ok().put("forecast", forecast);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:forecast:save")
    public R save(@RequestBody ForecastEntity forecast){
        forecastService.save(forecast);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:forecast:update")
    public R update(@RequestBody ForecastEntity forecast){
        ValidatorUtils.validateEntity(forecast);
        forecastService.updateById(forecast);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:forecast:delete")
    public R delete(@RequestBody String[] ids){
        forecastService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
