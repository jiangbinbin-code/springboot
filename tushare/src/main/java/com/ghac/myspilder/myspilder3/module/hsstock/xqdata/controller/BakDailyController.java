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

import io.renren.modules.sys.entity.BakDailyEntity;
import io.renren.modules.sys.service.BakDailyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:05
 */
@RestController
@RequestMapping("sys/bakdaily")
public class BakDailyController {
    @Autowired
    private BakDailyService bakDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:bakdaily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bakDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:bakdaily:info")
    public R info(@PathVariable("id") String id){
        BakDailyEntity bakDaily = bakDailyService.getById(id);

        return R.ok().put("bakDaily", bakDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:bakdaily:save")
    public R save(@RequestBody BakDailyEntity bakDaily){
        bakDailyService.save(bakDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:bakdaily:update")
    public R update(@RequestBody BakDailyEntity bakDaily){
        ValidatorUtils.validateEntity(bakDaily);
        bakDailyService.updateById(bakDaily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:bakdaily:delete")
    public R delete(@RequestBody String[] ids){
        bakDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
