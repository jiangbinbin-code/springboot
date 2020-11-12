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

import io.renren.modules.sys.entity.DailyEntity;
import io.renren.modules.sys.service.DailyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:54
 */
@RestController
@RequestMapping("sys/daily")
public class DailyController {
    @Autowired
    private DailyService dailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:daily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = dailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:daily:info")
    public R info(@PathVariable("id") String id){
        DailyEntity daily = dailyService.getById(id);

        return R.ok().put("daily", daily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:daily:save")
    public R save(@RequestBody DailyEntity daily){
        dailyService.save(daily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:daily:update")
    public R update(@RequestBody DailyEntity daily){
        ValidatorUtils.validateEntity(daily);
        dailyService.updateById(daily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:daily:delete")
    public R delete(@RequestBody String[] ids){
        dailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
