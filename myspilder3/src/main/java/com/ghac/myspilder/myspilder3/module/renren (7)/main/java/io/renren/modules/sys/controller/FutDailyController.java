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

import io.renren.modules.sys.entity.FutDailyEntity;
import io.renren.modules.sys.service.FutDailyService;
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
@RequestMapping("sys/futdaily")
public class FutDailyController {
    @Autowired
    private FutDailyService futDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:futdaily:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = futDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:futdaily:info")
    public R info(@PathVariable("id") String id){
        FutDailyEntity futDaily = futDailyService.getById(id);

        return R.ok().put("futDaily", futDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:futdaily:save")
    public R save(@RequestBody FutDailyEntity futDaily){
        futDailyService.save(futDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:futdaily:update")
    public R update(@RequestBody FutDailyEntity futDaily){
        ValidatorUtils.validateEntity(futDaily);
        futDailyService.updateById(futDaily);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:futdaily:delete")
    public R delete(@RequestBody String[] ids){
        futDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
